package org.jmrtd.lds;

import j6.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import net.sf.scuba.tlv.TLVInputStream;
import net.sf.scuba.tlv.TLVOutputStream;
import net.sf.scuba.tlv.TLVUtil;

/* JADX INFO: loaded from: classes14.dex */
public class DisplayedImageInfo extends AbstractImageInfo {
    public static final int DISPLAYED_PORTRAIT_TAG = 24384;
    public static final int DISPLAYED_SIGNATURE_OR_MARK_TAG = 24387;
    private static final long serialVersionUID = 3801320585294302721L;
    private int displayedImageTag;

    public DisplayedImageInfo(int i, byte[] bArr) {
        super(i, getMimeTypeFromType(i));
        this.displayedImageTag = getDisplayedImageTagFromType(i);
        setImageBytes(bArr);
    }

    private static int getDisplayedImageTagFromType(int i) {
        if (i == 0) {
            return DISPLAYED_PORTRAIT_TAG;
        }
        if (i == 1) {
            return DISPLAYED_SIGNATURE_OR_MARK_TAG;
        }
        throw new NumberFormatException(a.n(i, new StringBuilder("Unknown type: ")));
    }

    private static String getMimeTypeFromType(int i) {
        if (i == 0 || i == 1) {
            return "image/jpeg";
        }
        if (i == 2) {
            return "image/x-wsq";
        }
        throw new NumberFormatException(a.n(i, new StringBuilder("Unknown type: ")));
    }

    private static int getTypeFromDisplayedImageTag(int i) {
        if (i == 24384) {
            return 0;
        }
        if (i == 24387) {
            return 1;
        }
        throw new NumberFormatException(a.n(i, new StringBuilder("Unknown tag: ")));
    }

    @Override // org.jmrtd.lds.AbstractImageInfo
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return super.equals(obj2) && getClass() == obj2.getClass() && this.displayedImageTag == ((DisplayedImageInfo) obj2).displayedImageTag;
    }

    public int getDisplayedImageTag() {
        return this.displayedImageTag;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public long getRecordLength() {
        int imageLength = getImageLength();
        return ((long) TLVUtil.getTagLength(getDisplayedImageTagFromType(getType()))) + ((long) TLVUtil.getLengthLength(imageLength)) + ((long) imageLength);
    }

    @Override // org.jmrtd.lds.AbstractImageInfo
    public int hashCode() {
        return (super.hashCode() * 31) + this.displayedImageTag;
    }

    @Override // org.jmrtd.lds.AbstractImageInfo
    public void readObject(InputStream inputStream) throws IOException {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        int tag2 = tLVInputStream.readTag();
        this.displayedImageTag = tag2;
        if (tag2 != 24384 && tag2 != 24387) {
            throw new IllegalArgumentException(a.n(this.displayedImageTag, new StringBuilder("Expected tag 0x5F40 or 0x5F43, found ")));
        }
        int typeFromDisplayedImageTag = getTypeFromDisplayedImageTag(tag2);
        setType(typeFromDisplayedImageTag);
        setMimeType(getMimeTypeFromType(typeFromDisplayedImageTag));
        readImage(tLVInputStream, tLVInputStream.readLength());
    }

    @Override // org.jmrtd.lds.AbstractImageInfo
    public void writeObject(OutputStream outputStream) throws IOException {
        TLVOutputStream tLVOutputStream = outputStream instanceof TLVOutputStream ? (TLVOutputStream) outputStream : new TLVOutputStream(outputStream);
        tLVOutputStream.writeTag(getDisplayedImageTagFromType(getType()));
        writeImage(tLVOutputStream);
        tLVOutputStream.writeValueEnd();
    }

    public DisplayedImageInfo(InputStream inputStream) throws IOException {
        readObject(inputStream);
    }
}
