package defpackage;

import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.Tools;
import com.youTransactor.uCube.mdm.BinaryUpdate;
import com.youTransactor.uCube.rpc.DeviceInfos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import tmm.c;

/* JADX INFO: loaded from: classes15.dex */
public final class v extends p {
    public final byte[] J;
    public final BinaryUpdate K;
    public List L;

    public v(DeviceInfos deviceInfos, BinaryUpdate binaryUpdate, byte[] bArr) {
        super(deviceInfos);
        this.K = binaryUpdate;
        this.J = bArr;
    }

    public final boolean b(InputStream inputStream) {
        byte[] bArr;
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        HashMap map = new HashMap();
        try {
            bArr = new byte[1024];
        } catch (IOException e) {
            e.printStackTrace();
            map = null;
        }
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                break;
            }
            v1.a("Zip Entry : " + nextEntry.getName());
            File fileCreateTempFile = File.createTempFile("file", "x");
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            while (true) {
                int i = zipInputStream.read(bArr);
                if (i > 0) {
                    fileOutputStream.write(bArr, 0, i);
                }
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            map.put(nextEntry.getName(), c.c(new FileInputStream(fileCreateTempFile)));
            zipInputStream.closeEntry();
            if (map == null && !map.isEmpty()) {
                BinaryUpdate binaryUpdate = this.K;
                List<BinaryUpdate> listFromZip = BinaryUpdate.fromZip(binaryUpdate.getCfg(), binaryUpdate.isMandatory(), map);
                this.L = listFromZip;
                return listFromZip != null;
            }
        }
        zipInputStream.close();
        return map == null ? false : false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean c(byte[] bArr) {
        int iMakeShort;
        int iMakeShort2;
        if (bArr.length < 2 || bArr.length < (iMakeShort2 = (iMakeShort = Tools.makeShort(bArr[0], bArr[1])) + 2)) {
            return false;
        }
        byte[] bArr2 = new byte[iMakeShort];
        System.arraycopy(bArr, 2, bArr2, 0, iMakeShort);
        BinaryUpdate binaryUpdate = this.K;
        binaryUpdate.setSignature(bArr2);
        if (binaryUpdate.getCfg().isCiphered()) {
            int i = iMakeShort + 3;
            int i2 = iMakeShort + 4;
            int iMakeShort3 = Tools.makeShort(bArr[iMakeShort2], bArr[i]);
            int i3 = i2 + iMakeShort3;
            if (bArr.length < i3) {
                return false;
            }
            byte[] bArr3 = new byte[iMakeShort3];
            System.arraycopy(bArr, i2, bArr3, 0, iMakeShort3);
            binaryUpdate.setKey(bArr3);
            iMakeShort2 = i3;
        }
        ArrayList arrayList = new ArrayList();
        while (iMakeShort2 < bArr.length) {
            int i5 = iMakeShort2 + 2;
            if (bArr.length < i5) {
                return false;
            }
            int iMakeShort4 = Tools.makeShort(bArr[iMakeShort2], bArr[iMakeShort2 + 1]);
            if (iMakeShort4 == 0) {
                break;
            }
            int i6 = i5 + iMakeShort4;
            if (bArr.length < i6) {
                return false;
            }
            byte[] bArr4 = new byte[iMakeShort4];
            System.arraycopy(bArr, i5, bArr4, 0, iMakeShort4);
            arrayList.add(bArr4);
            iMakeShort2 = i6;
        }
        binaryUpdate.setBinaryBlock(arrayList);
        return true;
    }

    @Override // com.youTransactor.uCube.AbstractTask
    public final void start() {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                String str = "/v3/dongle/binary/" + this.K.getCfg().getType();
                n nVar = n.e;
                HttpURLConnection httpURLConnectionA = nVar.a("private-api.", str, "POST");
                String serial = this.H.getSerial();
                int i = t.f266831a[nVar.f210814a.ordinal()];
                if (i == 1) {
                    serial = this.H.getPartNumber();
                } else if (i == 2 || i == 3) {
                    serial = this.H.getSerial();
                }
                v1.a("device : " + serial + " with terminal id type : " + nVar.f210814a);
                httpURLConnectionA.setRequestProperty("Content-Type", "application/octet-stream");
                httpURLConnectionA.setRequestProperty("x-device-id", serial);
                httpURLConnectionA.setRequestProperty("x-id-type", nVar.f210814a.getName());
                httpURLConnectionA.getOutputStream().write(this.J);
                this.I = httpURLConnectionA.getResponseCode();
                String headerField = httpURLConnectionA.getHeaderField("Content-Type");
                v1.a("content type: " + headerField);
                if (this.I != 200 || headerField == null) {
                    v1.b("config WS error: " + this.I, new Exception[0]);
                    notifyMonitor(TaskEvent.FAILED, this);
                } else if ("application/octet-stream".equals(headerField)) {
                    if (c(c.c(httpURLConnectionA.getInputStream()))) {
                        notifyMonitor(TaskEvent.SUCCESS, new Object[0]);
                    } else {
                        notifyMonitor(TaskEvent.FAILED, this);
                    }
                } else if ("application/zip".equals(headerField)) {
                    if (b(httpURLConnectionA.getInputStream())) {
                        notifyMonitor(TaskEvent.SUCCESS, this.L);
                    } else {
                        notifyMonitor(TaskEvent.FAILED, this);
                    }
                }
                httpURLConnectionA.disconnect();
            } catch (Exception e) {
                v1.b("config WS error", e);
                notifyMonitor(TaskEvent.FAILED, this);
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
            }
        } catch (Throwable th10) {
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th10;
        }
    }
}
