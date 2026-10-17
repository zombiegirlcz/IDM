package ecm;

import com.google.common.base.Charsets;
import com.youTransactor.uCube.rpc.Constants;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import net.sf.scuba.smartcards.ISO7816;
import org.jmrtd.lds.CVCAFile;

/* JADX INFO: loaded from: classes13.dex */
public final class f2 implements l1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f124801b = {ISO7816.INS_DECREASE, Constants.INQUIRY, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55, 56, 57, 65, CVCAFile.CAR_TAG, 67, ISO7816.INS_REHABILITATE_CHV, 69, 70};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124802a;

    public /* synthetic */ f2(int i) {
        this.f124802a = i;
    }

    @Override // ecm.l1
    public final byte[] a(Object obj2) {
        switch (this.f124802a) {
            case 0:
                byte[] bytes = ((String) obj2).getBytes(Charsets.UTF_8);
                int i = 0;
                while (i < bytes.length) {
                    byte b4 = bytes[i];
                    if (b4 < 32 || b4 >= 126 || b4 == 37) {
                        byte[] bArr = new byte[v0.a.a(bytes.length, i, 3, i)];
                        if (i != 0) {
                            System.arraycopy(bytes, 0, bArr, 0, i);
                        }
                        int i2 = i;
                        while (i < bytes.length) {
                            byte b5 = bytes[i];
                            if (b5 < 32 || b5 >= 126 || b5 == 37) {
                                bArr[i2] = 37;
                                byte[] bArr2 = f124801b;
                                bArr[i2 + 1] = bArr2[(b5 >> 4) & 15];
                                bArr[i2 + 2] = bArr2[b5 & 15];
                                i2 += 3;
                            } else {
                                bArr[i2] = b5;
                                i2++;
                            }
                            i++;
                        }
                        return Arrays.copyOf(bArr, i2);
                    }
                    i++;
                }
                return bytes;
            default:
                return e2.a(((g2) obj2).f124809a);
        }
    }

    @Override // ecm.l1
    public final Object b(byte[] bArr) {
        int i;
        byte b4;
        switch (this.f124802a) {
            case 0:
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    byte b5 = bArr[i2];
                    if (b5 < 32 || b5 >= 126 || (b5 == 37 && i2 + 2 < bArr.length)) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
                        int i3 = 0;
                        while (i3 < bArr.length) {
                            if (bArr[i3] == 37 && i3 + 2 < bArr.length) {
                                try {
                                    byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i3 + 1, 2, Charsets.US_ASCII), 16));
                                    i3 += 3;
                                } catch (NumberFormatException unused) {
                                    byteBufferAllocate.put(bArr[i3]);
                                    i3++;
                                }
                            }
                            byteBufferAllocate.put(bArr[i3]);
                            i3++;
                        }
                        return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), Charsets.UTF_8);
                    }
                }
                return new String(bArr, 0);
            default:
                char c2 = 0;
                if (bArr.length == 1 && bArr[0] == 48) {
                    return g2.e;
                }
                int length = bArr.length;
                if (length != 1) {
                    if (length == 2 && (b4 = bArr[0]) >= 48 && b4 <= 57) {
                        i = (b4 - ISO7816.INS_DECREASE) * 10;
                        c2 = 1;
                    }
                    return g2.f124803g.g("Unknown code ".concat(new String(bArr, Charsets.US_ASCII)));
                }
                i = 0;
                byte b7 = bArr[c2];
                if (b7 >= 48 && b7 <= 57) {
                    int i5 = (b7 - ISO7816.INS_DECREASE) + i;
                    List list = g2.d;
                    if (i5 < list.size()) {
                        return (g2) list.get(i5);
                    }
                }
                return g2.f124803g.g("Unknown code ".concat(new String(bArr, Charsets.US_ASCII)));
        }
    }
}
