package org.jmrtd.lds.icao;

import a0.d;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.tlv.TLVInputStream;
import net.sf.scuba.tlv.TLVOutputStream;
import net.sf.scuba.tlv.TLVUtil;
import net.sf.scuba.util.Hex;
import org.jmrtd.lds.DataGroup;

/* JADX INFO: loaded from: classes14.dex */
abstract class AdditionalDetailDataGroup extends DataGroup {
    public static final int CONTENT_SPECIFIC_CONSTRUCTED_TAG = 160;
    public static final int COUNT_TAG = 2;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    public static final int TAG_LIST_TAG = 92;
    private static final long serialVersionUID = 8566312538928662931L;

    public AdditionalDetailDataGroup(int i) {
        super(107);
    }

    public static byte[] readBytes(TLVInputStream tLVInputStream) throws IOException {
        return tLVInputStream.readValue();
    }

    public static List<String> readContentSpecificFieldsList(TLVInputStream tLVInputStream) throws IOException {
        int tag2 = tLVInputStream.readTag();
        if (tag2 != 2) {
            throw new IllegalArgumentException("Expected " + Integer.toHexString(2) + ", found " + Integer.toHexString(tag2));
        }
        int length = tLVInputStream.readLength();
        if (length != 1) {
            throw new IllegalArgumentException(d.n("Expected length 1 count length, found ", length));
        }
        byte[] value = tLVInputStream.readValue();
        if (value == null || value.length != 1) {
            throw new IllegalArgumentException("Number of content specific fields should be encoded in single byte, found " + Arrays.toString(value));
        }
        int i = value[0] & UnsignedBytes.MAX_VALUE;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            tLVInputStream.readTag();
            tLVInputStream.readLength();
            arrayList.add(readString(tLVInputStream));
        }
        return arrayList;
    }

    public static String readFullDate(TLVInputStream tLVInputStream) throws IOException {
        byte[] value = tLVInputStream.readValue();
        if (value.length == 4) {
            return Hex.bytesToHexString(value);
        }
        String str = new String(value);
        try {
            return new String(value, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e);
            return str;
        }
    }

    public static String readFullDateTime(TLVInputStream tLVInputStream) throws IOException {
        byte[] value = tLVInputStream.readValue();
        if (value.length == 7) {
            return Hex.bytesToHexString(value);
        }
        String str = new String(value);
        try {
            return new String(value, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e);
            return str;
        }
    }

    public static List<String> readList(TLVInputStream tLVInputStream) throws IOException {
        String string = readString(tLVInputStream);
        ArrayList arrayList = new ArrayList();
        for (String str : string.split("<", -1)) {
            arrayList.add(str.trim());
        }
        return arrayList;
    }

    public static String readString(TLVInputStream tLVInputStream) throws IOException {
        byte[] value = tLVInputStream.readValue();
        try {
            return new String(value, "UTF-8").trim();
        } catch (UnsupportedEncodingException e) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e);
            return new String(value).trim();
        }
    }

    public static List<Integer> readTagList(TLVInputStream tLVInputStream) throws IOException {
        if (tLVInputStream.readTag() != 92) {
            throw new IllegalArgumentException("Expected tag list in DG11");
        }
        int length = tLVInputStream.readLength();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(tLVInputStream.readValue());
        try {
            ArrayList arrayList = new ArrayList();
            int tagLength = 0;
            while (tagLength < length) {
                int tag2 = new TLVInputStream(byteArrayInputStream).readTag();
                tagLength += TLVUtil.getTagLength(tag2);
                arrayList.add(Integer.valueOf(tag2));
            }
            return arrayList;
        } finally {
            byteArrayInputStream.close();
        }
    }

    public static void writeBytes(int i, byte[] bArr, TLVOutputStream tLVOutputStream) throws IOException {
        tLVOutputStream.writeTag(i);
        if (bArr == null) {
            tLVOutputStream.writeValue(new byte[0]);
        } else {
            tLVOutputStream.writeValue(bArr);
        }
    }

    public static void writeContentSpecificFieldsList(int i, List<String> list, TLVOutputStream tLVOutputStream) throws IOException {
        tLVOutputStream.writeTag(160);
        tLVOutputStream.writeTag(2);
        tLVOutputStream.write(list.size());
        tLVOutputStream.writeValueEnd();
        for (String str : list) {
            tLVOutputStream.writeTag(i);
            tLVOutputStream.writeValue(str.trim().getBytes("UTF-8"));
        }
        tLVOutputStream.writeValueEnd();
    }

    public static void writeList(int i, List<String> list, TLVOutputStream tLVOutputStream) throws IOException {
        tLVOutputStream.writeTag(i);
        if (list.isEmpty()) {
            tLVOutputStream.writeValue(new byte[0]);
            return;
        }
        StringBuilder sb6 = new StringBuilder();
        Iterator<String> it8 = list.iterator();
        boolean z = true;
        while (it8.hasNext()) {
            String next = it8.next();
            if (z) {
                z = false;
            } else {
                sb6.append('<');
            }
            sb6.append(next == null ? "" : next.trim());
        }
        tLVOutputStream.writeValue(sb6.toString().getBytes("UTF-8"));
    }

    public static void writeString(int i, String str, TLVOutputStream tLVOutputStream) throws IOException {
        writeBytes(i, str == null ? null : str.trim().getBytes("UTF-8"), tLVOutputStream);
    }

    public static void writeTagList(List<Integer> list, TLVOutputStream tLVOutputStream) throws IOException {
        tLVOutputStream.writeTag(92);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator<Integer> it8 = list.iterator();
        while (it8.hasNext()) {
            new TLVOutputStream(byteArrayOutputStream).writeTag(it8.next().intValue());
        }
        tLVOutputStream.writeValue(byteArrayOutputStream.toByteArray());
        tLVOutputStream.writeValueEnd();
    }

    public abstract List<Integer> getTagPresenceList();

    @Override // org.jmrtd.lds.AbstractTaggedLDSFile
    public void readContent(InputStream inputStream) throws IOException {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        Iterator<Integer> it8 = readTagList(tLVInputStream).iterator();
        while (it8.hasNext()) {
            readField(it8.next().intValue(), tLVInputStream);
        }
    }

    public abstract void readField(int i, TLVInputStream tLVInputStream) throws IOException;

    @Override // org.jmrtd.lds.AbstractTaggedLDSFile
    public void writeContent(OutputStream outputStream) throws IOException {
        TLVOutputStream tLVOutputStream = outputStream instanceof TLVOutputStream ? (TLVOutputStream) outputStream : new TLVOutputStream(outputStream);
        List<Integer> tagPresenceList = getTagPresenceList();
        writeTagList(tagPresenceList, tLVOutputStream);
        Iterator<Integer> it8 = tagPresenceList.iterator();
        while (it8.hasNext()) {
            writeField(it8.next().intValue(), tLVOutputStream);
        }
    }

    public abstract void writeField(int i, TLVOutputStream tLVOutputStream) throws IOException;

    public AdditionalDetailDataGroup(int i, InputStream inputStream) throws IOException {
        super(i, inputStream);
    }
}
