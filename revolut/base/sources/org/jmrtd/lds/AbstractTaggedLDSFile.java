package org.jmrtd.lds;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.tlv.TLVInputStream;
import net.sf.scuba.tlv.TLVOutputStream;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractTaggedLDSFile extends AbstractLDSFile {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -4761360877353069639L;
    private int length;

    /* JADX INFO: renamed from: tag, reason: collision with root package name */
    private int f228965tag;

    public AbstractTaggedLDSFile(int i) {
        this.f228965tag = i;
    }

    private byte[] getContent() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                writeContent(byteArrayOutputStream);
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    return byteArray;
                } catch (IOException e) {
                    return byteArray;
                }
            } catch (IOException e2) {
                throw new IllegalStateException("Could not get DG content", e2);
            }
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e4) {
                LOGGER.log(Level.FINE, "Error closing stream", (Throwable) e4);
            }
        }
    }

    @Override // org.jmrtd.lds.AbstractLDSFile, org.jmrtd.lds.LDSElement
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    @Override // org.jmrtd.lds.LDSFile
    public int getLength() {
        if (this.length <= 0) {
            this.length = getContent().length;
        }
        return this.length;
    }

    public int getTag() {
        return this.f228965tag;
    }

    public abstract void readContent(InputStream inputStream) throws IOException;

    @Override // org.jmrtd.lds.AbstractLDSFile
    public void readObject(InputStream inputStream) throws IOException {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        int tag2 = tLVInputStream.readTag();
        if (tag2 == this.f228965tag) {
            this.length = tLVInputStream.readLength();
            readContent(tLVInputStream);
        } else {
            throw new IllegalArgumentException("Was expecting tag " + Integer.toHexString(this.f228965tag) + ", found " + Integer.toHexString(tag2));
        }
    }

    public String toString() {
        return "TaggedLDSFile [" + Integer.toHexString(getTag()) + " (" + getLength() + ")]";
    }

    public abstract void writeContent(OutputStream outputStream) throws IOException;

    @Override // org.jmrtd.lds.AbstractLDSFile
    public void writeObject(OutputStream outputStream) throws IOException {
        TLVOutputStream tLVOutputStream = outputStream instanceof TLVOutputStream ? (TLVOutputStream) outputStream : new TLVOutputStream(outputStream);
        int tag2 = getTag();
        if (this.f228965tag != tag2) {
            this.f228965tag = tag2;
        }
        tLVOutputStream.writeTag(tag2);
        byte[] content = getContent();
        int length = content == null ? 0 : content.length;
        if (this.length != length) {
            this.length = length;
        }
        tLVOutputStream.writeValue(content);
    }

    public AbstractTaggedLDSFile(int i, InputStream inputStream) throws IOException {
        this.f228965tag = i;
        readObject(inputStream);
    }
}
