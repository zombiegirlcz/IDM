package androidx.glance.appwidget.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
abstract class UnknownFieldSchema<T, B> {
    public abstract void addFixed32(B b4, int i, int i2);

    public abstract void addFixed64(B b4, int i, long j2);

    public abstract void addGroup(B b4, int i, T t2);

    public abstract void addLengthDelimited(B b4, int i, ByteString byteString);

    public abstract void addVarint(B b4, int i, long j2);

    public abstract B getBuilderFromMessage(Object obj2);

    public abstract T getFromMessage(Object obj2);

    public abstract int getSerializedSize(T t2);

    public abstract int getSerializedSizeAsMessageSet(T t2);

    public abstract void makeImmutable(Object obj2);

    public abstract T merge(T t2, T t3);

    public final void mergeFrom(B b4, Reader reader) throws IOException {
        while (reader.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(b4, reader)) {
        }
    }

    public final boolean mergeOneFieldFrom(B b4, Reader reader) throws IOException {
        int tag2 = reader.getTag();
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag2);
        int tagWireType = WireFormat.getTagWireType(tag2);
        if (tagWireType == 0) {
            addVarint(b4, tagFieldNumber, reader.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            addFixed64(b4, tagFieldNumber, reader.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            addLengthDelimited(b4, tagFieldNumber, reader.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            addFixed32(b4, tagFieldNumber, reader.readFixed32());
            return true;
        }
        B bNewBuilder = newBuilder();
        int iMakeTag = WireFormat.makeTag(tagFieldNumber, 4);
        mergeFrom(bNewBuilder, reader);
        if (iMakeTag != reader.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        addGroup(b4, tagFieldNumber, toImmutable(bNewBuilder));
        return true;
    }

    public abstract B newBuilder();

    public abstract void setBuilderToMessage(Object obj2, B b4);

    public abstract void setToMessage(Object obj2, T t2);

    public abstract boolean shouldDiscardUnknownFields(Reader reader);

    public abstract T toImmutable(B b4);

    public abstract void writeAsMessageSetTo(T t2, Writer writer) throws IOException;

    public abstract void writeTo(T t2, Writer writer) throws IOException;
}
