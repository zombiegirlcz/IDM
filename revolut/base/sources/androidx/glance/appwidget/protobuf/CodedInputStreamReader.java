package androidx.glance.appwidget.protobuf;

import androidx.glance.appwidget.protobuf.MapEntryLite;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
final class CodedInputStreamReader implements Reader {
    private int endGroupTag;
    private final CodedInputStream input;
    private int nextTag = 0;

    /* JADX INFO: renamed from: tag, reason: collision with root package name */
    private int f7434tag;

    private CodedInputStreamReader(CodedInputStream codedInputStream) {
        CodedInputStream codedInputStream2 = (CodedInputStream) Internal.checkNotNull(codedInputStream, "input");
        this.input = codedInputStream2;
        codedInputStream2.wrapper = this;
    }

    public static CodedInputStreamReader forCodedInput(CodedInputStream codedInputStream) {
        CodedInputStreamReader codedInputStreamReader = codedInputStream.wrapper;
        return codedInputStreamReader != null ? codedInputStreamReader : new CodedInputStreamReader(codedInputStream);
    }

    private <T> void mergeGroupFieldInternal(T t2, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i = this.endGroupTag;
        this.endGroupTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(this.f7434tag), 4);
        try {
            schema.mergeFrom(t2, this, extensionRegistryLite);
            if (this.f7434tag == this.endGroupTag) {
            } else {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } finally {
            this.endGroupTag = i;
        }
    }

    private <T> void mergeMessageFieldInternal(T t2, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int uInt32 = this.input.readUInt32();
        CodedInputStream codedInputStream = this.input;
        if (codedInputStream.recursionDepth >= codedInputStream.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iPushLimit = codedInputStream.pushLimit(uInt32);
        this.input.recursionDepth++;
        schema.mergeFrom(t2, this, extensionRegistryLite);
        this.input.checkLastTagWas(0);
        r5.recursionDepth--;
        this.input.popLimit(iPushLimit);
    }

    private <T> T readGroup(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        T tNewInstance = schema.newInstance();
        mergeGroupFieldInternal(tNewInstance, schema, extensionRegistryLite);
        schema.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    private <T> T readMessage(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        T tNewInstance = schema.newInstance();
        mergeMessageFieldInternal(tNewInstance, schema, extensionRegistryLite);
        schema.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    private void requirePosition(int i) throws IOException {
        if (this.input.getTotalBytesRead() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private void requireWireType(int i) throws IOException {
        if (WireFormat.getTagWireType(this.f7434tag) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    private void verifyPackedFixed32Length(int i) throws IOException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    private void verifyPackedFixed64Length(int i) throws IOException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public int getFieldNumber() throws IOException {
        int i = this.nextTag;
        if (i != 0) {
            this.f7434tag = i;
            this.nextTag = 0;
        } else {
            this.f7434tag = this.input.readTag();
        }
        int i2 = this.f7434tag;
        if (i2 == 0 || i2 == this.endGroupTag) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.getTagFieldNumber(i2);
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public int getTag() {
        return this.f7434tag;
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public <T> void mergeGroupField(T t2, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        requireWireType(3);
        mergeGroupFieldInternal(t2, schema, extensionRegistryLite);
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public <T> void mergeMessageField(T t2, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        requireWireType(2);
        mergeMessageFieldInternal(t2, schema, extensionRegistryLite);
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public boolean readBool() throws IOException {
        requireWireType(0);
        return this.input.readBool();
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public void readBoolList(List<Boolean> list) throws IOException {
        int tag2;
        if (list instanceof BooleanArrayList) {
            throw new ClassCastException();
        }
        int tagWireType = WireFormat.getTagWireType(this.f7434tag);
        if (tagWireType == 0) {
            do {
                list.add(Boolean.valueOf(this.input.readBool()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.f7434tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            list.add(Boolean.valueOf(this.input.readBool()));
        } while (this.input.getTotalBytesRead() < totalBytesRead);
        requirePosition(totalBytesRead);
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public ByteString readBytes() throws IOException {
        requireWireType(2);
        return this.input.readBytes();
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public void readBytesList(List<ByteString> list) throws IOException {
        int tag2;
        if (WireFormat.getTagWireType(this.f7434tag) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(readBytes());
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag2 = this.input.readTag();
            }
        } while (tag2 == this.f7434tag);
        this.nextTag = tag2;
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public double readDouble() throws IOException {
        requireWireType(1);
        return this.input.readDouble();
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public void readDoubleList(List<Double> list) throws IOException {
        int tag2;
        if (list instanceof DoubleArrayList) {
            throw new ClassCastException();
        }
        int tagWireType = WireFormat.getTagWireType(this.f7434tag);
        if (tagWireType == 1) {
            do {
                list.add(Double.valueOf(this.input.readDouble()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.f7434tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int uInt32 = this.input.readUInt32();
        verifyPackedFixed64Length(uInt32);
        int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
        do {
            list.add(Double.valueOf(this.input.readDouble()));
        } while (this.input.getTotalBytesRead() < totalBytesRead);
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public int readEnum() throws IOException {
        requireWireType(0);
        return this.input.readEnum();
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public void readEnumList(List<Integer> list) throws IOException {
        int tag2;
        if (list instanceof IntArrayList) {
            throw new ClassCastException();
        }
        int tagWireType = WireFormat.getTagWireType(this.f7434tag);
        if (tagWireType == 0) {
            do {
                list.add(Integer.valueOf(this.input.readEnum()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.f7434tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            list.add(Integer.valueOf(this.input.readEnum()));
        } while (this.input.getTotalBytesRead() < totalBytesRead);
        requirePosition(totalBytesRead);
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public int readFixed32() throws IOException {
        requireWireType(5);
        return this.input.readFixed32();
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public void readFixed32List(List<Integer> list) throws IOException {
        int tag2;
        if (list instanceof IntArrayList) {
            throw new ClassCastException();
        }
        int tagWireType = WireFormat.getTagWireType(this.f7434tag);
        if (tagWireType == 2) {
            int uInt32 = this.input.readUInt32();
            verifyPackedFixed32Length(uInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
            do {
                list.add(Integer.valueOf(this.input.readFixed32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.input.readFixed32()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag2 = this.input.readTag();
            }
        } while (tag2 == this.f7434tag);
        this.nextTag = tag2;
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public long readFixed64() throws IOException {
        requireWireType(1);
        return this.input.readFixed64();
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public void readFixed64List(List<Long> list) throws IOException {
        int tag2;
        if (list instanceof LongArrayList) {
            throw new ClassCastException();
        }
        int tagWireType = WireFormat.getTagWireType(this.f7434tag);
        if (tagWireType == 1) {
            do {
                list.add(Long.valueOf(this.input.readFixed64()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.f7434tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int uInt32 = this.input.readUInt32();
        verifyPackedFixed64Length(uInt32);
        int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
        do {
            list.add(Long.valueOf(this.input.readFixed64()));
        } while (this.input.getTotalBytesRead() < totalBytesRead);
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public float readFloat() throws IOException {
        requireWireType(5);
        return this.input.readFloat();
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public void readFloatList(List<Float> list) throws IOException {
        int tag2;
        if (list instanceof FloatArrayList) {
            throw new ClassCastException();
        }
        int tagWireType = WireFormat.getTagWireType(this.f7434tag);
        if (tagWireType == 2) {
            int uInt32 = this.input.readUInt32();
            verifyPackedFixed32Length(uInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
            do {
                list.add(Float.valueOf(this.input.readFloat()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Float.valueOf(this.input.readFloat()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag2 = this.input.readTag();
            }
        } while (tag2 == this.f7434tag);
        this.nextTag = tag2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.glance.appwidget.protobuf.Reader
    @Deprecated
    public <T> void readGroupList(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int tag2;
        if (WireFormat.getTagWireType(this.f7434tag) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.f7434tag;
        do {
            list.add(readGroup(schema, extensionRegistryLite));
            if (this.input.isAtEnd() || this.nextTag != 0) {
                return;
            } else {
                tag2 = this.input.readTag();
            }
        } while (tag2 == i);
        this.nextTag = tag2;
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public int readInt32() throws IOException {
        requireWireType(0);
        return this.input.readInt32();
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public void readInt32List(List<Integer> list) throws IOException {
        int tag2;
        if (list instanceof IntArrayList) {
            throw new ClassCastException();
        }
        int tagWireType = WireFormat.getTagWireType(this.f7434tag);
        if (tagWireType == 0) {
            do {
                list.add(Integer.valueOf(this.input.readInt32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.f7434tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            list.add(Integer.valueOf(this.input.readInt32()));
        } while (this.input.getTotalBytesRead() < totalBytesRead);
        requirePosition(totalBytesRead);
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public long readInt64() throws IOException {
        requireWireType(0);
        return this.input.readInt64();
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public void readInt64List(List<Long> list) throws IOException {
        int tag2;
        if (list instanceof LongArrayList) {
            throw new ClassCastException();
        }
        int tagWireType = WireFormat.getTagWireType(this.f7434tag);
        if (tagWireType == 0) {
            do {
                list.add(Long.valueOf(this.input.readInt64()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.f7434tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            list.add(Long.valueOf(this.input.readInt64()));
        } while (this.input.getTotalBytesRead() < totalBytesRead);
        requirePosition(totalBytesRead);
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public <K, V> void readMap(Map<K, V> map, MapEntryLite.Metadata<K, V> metadata, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        requireWireType(2);
        this.input.pushLimit(this.input.readUInt32());
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.glance.appwidget.protobuf.Reader
    public <T> void readMessageList(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int tag2;
        if (WireFormat.getTagWireType(this.f7434tag) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.f7434tag;
        do {
            list.add(readMessage(schema, extensionRegistryLite));
            if (this.input.isAtEnd() || this.nextTag != 0) {
                return;
            } else {
                tag2 = this.input.readTag();
            }
        } while (tag2 == i);
        this.nextTag = tag2;
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public int readSFixed32() throws IOException {
        requireWireType(5);
        return this.input.readSFixed32();
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public void readSFixed32List(List<Integer> list) throws IOException {
        int tag2;
        if (list instanceof IntArrayList) {
            throw new ClassCastException();
        }
        int tagWireType = WireFormat.getTagWireType(this.f7434tag);
        if (tagWireType == 2) {
            int uInt32 = this.input.readUInt32();
            verifyPackedFixed32Length(uInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
            do {
                list.add(Integer.valueOf(this.input.readSFixed32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.input.readSFixed32()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag2 = this.input.readTag();
            }
        } while (tag2 == this.f7434tag);
        this.nextTag = tag2;
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public long readSFixed64() throws IOException {
        requireWireType(1);
        return this.input.readSFixed64();
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public void readSFixed64List(List<Long> list) throws IOException {
        int tag2;
        if (list instanceof LongArrayList) {
            throw new ClassCastException();
        }
        int tagWireType = WireFormat.getTagWireType(this.f7434tag);
        if (tagWireType == 1) {
            do {
                list.add(Long.valueOf(this.input.readSFixed64()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.f7434tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int uInt32 = this.input.readUInt32();
        verifyPackedFixed64Length(uInt32);
        int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
        do {
            list.add(Long.valueOf(this.input.readSFixed64()));
        } while (this.input.getTotalBytesRead() < totalBytesRead);
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public int readSInt32() throws IOException {
        requireWireType(0);
        return this.input.readSInt32();
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public void readSInt32List(List<Integer> list) throws IOException {
        int tag2;
        if (list instanceof IntArrayList) {
            throw new ClassCastException();
        }
        int tagWireType = WireFormat.getTagWireType(this.f7434tag);
        if (tagWireType == 0) {
            do {
                list.add(Integer.valueOf(this.input.readSInt32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.f7434tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            list.add(Integer.valueOf(this.input.readSInt32()));
        } while (this.input.getTotalBytesRead() < totalBytesRead);
        requirePosition(totalBytesRead);
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public long readSInt64() throws IOException {
        requireWireType(0);
        return this.input.readSInt64();
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public void readSInt64List(List<Long> list) throws IOException {
        int tag2;
        if (list instanceof LongArrayList) {
            throw new ClassCastException();
        }
        int tagWireType = WireFormat.getTagWireType(this.f7434tag);
        if (tagWireType == 0) {
            do {
                list.add(Long.valueOf(this.input.readSInt64()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.f7434tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            list.add(Long.valueOf(this.input.readSInt64()));
        } while (this.input.getTotalBytesRead() < totalBytesRead);
        requirePosition(totalBytesRead);
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public String readString() throws IOException {
        requireWireType(2);
        return this.input.readString();
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public void readStringList(List<String> list) throws IOException {
        readStringListInternal(list, false);
    }

    public void readStringListInternal(List<String> list, boolean z) throws IOException {
        int tag2;
        int tag3;
        if (WireFormat.getTagWireType(this.f7434tag) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        if (!(list instanceof LazyStringList) || z) {
            do {
                list.add(z ? readStringRequireUtf8() : readString());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.f7434tag);
            this.nextTag = tag2;
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        do {
            lazyStringList.add(readBytes());
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag3 = this.input.readTag();
            }
        } while (tag3 == this.f7434tag);
        this.nextTag = tag3;
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public void readStringListRequireUtf8(List<String> list) throws IOException {
        readStringListInternal(list, true);
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public String readStringRequireUtf8() throws IOException {
        requireWireType(2);
        return this.input.readStringRequireUtf8();
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public int readUInt32() throws IOException {
        requireWireType(0);
        return this.input.readUInt32();
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public void readUInt32List(List<Integer> list) throws IOException {
        int tag2;
        if (list instanceof IntArrayList) {
            throw new ClassCastException();
        }
        int tagWireType = WireFormat.getTagWireType(this.f7434tag);
        if (tagWireType == 0) {
            do {
                list.add(Integer.valueOf(this.input.readUInt32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.f7434tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            list.add(Integer.valueOf(this.input.readUInt32()));
        } while (this.input.getTotalBytesRead() < totalBytesRead);
        requirePosition(totalBytesRead);
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public long readUInt64() throws IOException {
        requireWireType(0);
        return this.input.readUInt64();
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public void readUInt64List(List<Long> list) throws IOException {
        int tag2;
        if (list instanceof LongArrayList) {
            throw new ClassCastException();
        }
        int tagWireType = WireFormat.getTagWireType(this.f7434tag);
        if (tagWireType == 0) {
            do {
                list.add(Long.valueOf(this.input.readUInt64()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.f7434tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            list.add(Long.valueOf(this.input.readUInt64()));
        } while (this.input.getTotalBytesRead() < totalBytesRead);
        requirePosition(totalBytesRead);
    }

    @Override // androidx.glance.appwidget.protobuf.Reader
    public boolean skipField() throws IOException {
        int i;
        if (this.input.isAtEnd() || (i = this.f7434tag) == this.endGroupTag) {
            return false;
        }
        return this.input.skipField(i);
    }
}
