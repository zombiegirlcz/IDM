package androidx.datastore.preferences.protobuf;

import a0.d;
import androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class FieldSet<T extends FieldDescriptorLite<T>> {
    private static final FieldSet<?> DEFAULT_INSTANCE = new FieldSet<>(true);
    private final SmallSortedMap<T, Object> fields;
    private boolean hasLazyField;
    private boolean isImmutable;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.FieldSet$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        WireFormat.FieldType getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    private FieldSet() {
        this.fields = SmallSortedMap.newFieldMap();
    }

    public static int computeElementSize(WireFormat.FieldType fieldType, int i, Object obj2) {
        int iComputeTagSize = CodedOutputStream.computeTagSize(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iComputeTagSize *= 2;
        }
        return iComputeTagSize + computeElementSizeNoTag(fieldType, obj2);
    }

    public static int computeElementSizeNoTag(WireFormat.FieldType fieldType, Object obj2) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj2).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj2).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj2).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj2).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj2).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj2).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj2).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj2).booleanValue());
            case 9:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj2);
            case 10:
                return CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj2);
            case 11:
                return obj2 instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj2) : CodedOutputStream.computeStringSizeNoTag((String) obj2);
            case 12:
                return obj2 instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj2) : CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj2);
            case 13:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj2).intValue());
            case 14:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj2).intValue());
            case 15:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj2).longValue());
            case 16:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj2).intValue());
            case 17:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj2).longValue());
            case 18:
                return CodedOutputStream.computeEnumSizeNoTag(((Integer) obj2).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int computeFieldSize(FieldDescriptorLite<?> fieldDescriptorLite, Object obj2) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (!fieldDescriptorLite.isRepeated()) {
            return computeElementSize(liteType, number, obj2);
        }
        List list = (List) obj2;
        int size = list.size();
        int i = 0;
        if (!fieldDescriptorLite.isPacked()) {
            int iComputeElementSize = 0;
            while (i < size) {
                iComputeElementSize += computeElementSize(liteType, number, list.get(i));
                i++;
            }
            return iComputeElementSize;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iComputeElementSizeNoTag = 0;
        while (i < size) {
            iComputeElementSizeNoTag += computeElementSizeNoTag(liteType, list.get(i));
            i++;
        }
        return CodedOutputStream.computeUInt32SizeNoTag(iComputeElementSizeNoTag) + CodedOutputStream.computeTagSize(number) + iComputeElementSizeNoTag;
    }

    public static int getWireFormatForFieldType(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    private static boolean isValidType(WireFormat.FieldType fieldType, Object obj2) {
        Internal.checkNotNull(obj2);
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType[fieldType.getJavaType().ordinal()]) {
            case 7:
                if ((obj2 instanceof ByteString) || (obj2 instanceof byte[])) {
                }
                break;
            case 8:
                if (!(obj2 instanceof Integer)) {
                }
                break;
            case 9:
                if (!(obj2 instanceof MessageLite)) {
                }
                break;
        }
        return false;
    }

    private void mergeFromField(Map.Entry<T, Object> entry) {
        d.B(entry.getKey());
        entry.getValue();
        throw null;
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> newFieldSet() {
        return new FieldSet<>();
    }

    private void verifyType(T t2, Object obj2) {
        if (!isValidType(t2.getLiteType(), obj2)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t2.getNumber()), t2.getLiteType().getJavaType(), obj2.getClass().getName()));
        }
    }

    public static void writeElement(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj2) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i, (MessageLite) obj2);
        } else {
            codedOutputStream.writeTag(i, getWireFormatForFieldType(fieldType, false));
            writeElementNoTag(codedOutputStream, fieldType, obj2);
        }
    }

    public static void writeElementNoTag(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj2) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((Double) obj2).doubleValue());
                break;
            case 2:
                codedOutputStream.writeFloatNoTag(((Float) obj2).floatValue());
                break;
            case 3:
                codedOutputStream.writeInt64NoTag(((Long) obj2).longValue());
                break;
            case 4:
                codedOutputStream.writeUInt64NoTag(((Long) obj2).longValue());
                break;
            case 5:
                codedOutputStream.writeInt32NoTag(((Integer) obj2).intValue());
                break;
            case 6:
                codedOutputStream.writeFixed64NoTag(((Long) obj2).longValue());
                break;
            case 7:
                codedOutputStream.writeFixed32NoTag(((Integer) obj2).intValue());
                break;
            case 8:
                codedOutputStream.writeBoolNoTag(((Boolean) obj2).booleanValue());
                break;
            case 9:
                codedOutputStream.writeGroupNoTag((MessageLite) obj2);
                break;
            case 10:
                codedOutputStream.writeMessageNoTag((MessageLite) obj2);
                break;
            case 11:
                if (!(obj2 instanceof ByteString)) {
                    codedOutputStream.writeStringNoTag((String) obj2);
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj2);
                }
                break;
            case 12:
                if (!(obj2 instanceof ByteString)) {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj2);
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj2);
                }
                break;
            case 13:
                codedOutputStream.writeUInt32NoTag(((Integer) obj2).intValue());
                break;
            case 14:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj2).intValue());
                break;
            case 15:
                codedOutputStream.writeSFixed64NoTag(((Long) obj2).longValue());
                break;
            case 16:
                codedOutputStream.writeSInt32NoTag(((Integer) obj2).intValue());
                break;
            case 17:
                codedOutputStream.writeSInt64NoTag(((Long) obj2).longValue());
                break;
            case 18:
                codedOutputStream.writeEnumNoTag(((Integer) obj2).intValue());
                break;
        }
    }

    public Iterator<Map.Entry<T, Object>> descendingIterator() {
        return isEmpty() ? Collections.emptyIterator() : this.hasLazyField ? new LazyField$LazyIterator(this.fields.descendingEntrySet().iterator()) : this.fields.descendingEntrySet().iterator();
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof FieldSet) {
            return this.fields.equals(((FieldSet) obj2).fields);
        }
        return false;
    }

    public int getMessageSetSerializedSize() {
        int numArrayEntries = this.fields.getNumArrayEntries();
        int messageSetSerializedSize = 0;
        for (int i = 0; i < numArrayEntries; i++) {
            messageSetSerializedSize += getMessageSetSerializedSize(this.fields.getArrayEntryAt(i));
        }
        Iterator it8 = this.fields.getOverflowEntries().iterator();
        while (it8.hasNext()) {
            messageSetSerializedSize += getMessageSetSerializedSize((Map.Entry) it8.next());
        }
        return messageSetSerializedSize;
    }

    public int getSerializedSize() {
        int numArrayEntries = this.fields.getNumArrayEntries();
        int iComputeFieldSize = 0;
        for (int i = 0; i < numArrayEntries; i++) {
            Map.Entry<K, Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            d.B(arrayEntryAt.getKey());
            iComputeFieldSize += computeFieldSize(null, arrayEntryAt.getValue());
        }
        Iterator it8 = this.fields.getOverflowEntries().iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            d.B(entry.getKey());
            iComputeFieldSize += computeFieldSize(null, entry.getValue());
        }
        return iComputeFieldSize;
    }

    public int hashCode() {
        return this.fields.hashCode();
    }

    public boolean isEmpty() {
        return this.fields.isEmpty();
    }

    public boolean isInitialized() {
        int numArrayEntries = this.fields.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            if (!isInitialized(this.fields.getArrayEntryAt(i))) {
                return false;
            }
        }
        Iterator it8 = this.fields.getOverflowEntries().iterator();
        while (it8.hasNext()) {
            if (!isInitialized((Map.Entry) it8.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> iterator() {
        return isEmpty() ? Collections.emptyIterator() : this.hasLazyField ? new LazyField$LazyIterator(this.fields.entrySet().iterator()) : this.fields.entrySet().iterator();
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        int numArrayEntries = this.fields.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            Map.Entry<K, Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            if (arrayEntryAt.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) arrayEntryAt.getValue()).makeImmutable();
            }
        }
        this.fields.makeImmutable();
        this.isImmutable = true;
    }

    public void mergeFrom(FieldSet<T> fieldSet) {
        int numArrayEntries = fieldSet.fields.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            mergeFromField(fieldSet.fields.getArrayEntryAt(i));
        }
        Iterator it8 = fieldSet.fields.getOverflowEntries().iterator();
        while (it8.hasNext()) {
            mergeFromField((Map.Entry) it8.next());
        }
    }

    public void setField(T t2, Object obj2) {
        if (!t2.isRepeated()) {
            verifyType(t2, obj2);
        } else {
            if (!(obj2 instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj2);
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                verifyType(t2, it8.next());
            }
            obj2 = arrayList;
        }
        this.fields.put(t2, obj2);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public FieldSet<T> m3472clone() {
        FieldSet<T> fieldSetNewFieldSet = newFieldSet();
        int numArrayEntries = this.fields.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            Map.Entry<K, Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            d.B(arrayEntryAt.getKey());
            fieldSetNewFieldSet.setField(null, arrayEntryAt.getValue());
        }
        Iterator it8 = this.fields.getOverflowEntries().iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            d.B(entry.getKey());
            fieldSetNewFieldSet.setField(null, entry.getValue());
        }
        fieldSetNewFieldSet.hasLazyField = this.hasLazyField;
        return fieldSetNewFieldSet;
    }

    private FieldSet(boolean z) {
        this(SmallSortedMap.newFieldMap());
        makeImmutable();
    }

    private FieldSet(SmallSortedMap<T, Object> smallSortedMap) {
        this.fields = smallSortedMap;
        makeImmutable();
    }

    private int getMessageSetSerializedSize(Map.Entry<T, Object> entry) {
        d.B(entry.getKey());
        entry.getValue();
        throw null;
    }

    private static <T extends FieldDescriptorLite<T>> boolean isInitialized(Map.Entry<T, Object> entry) {
        d.B(entry.getKey());
        throw null;
    }
}
