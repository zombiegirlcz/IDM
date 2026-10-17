package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* JADX INFO: loaded from: classes13.dex */
public final class c {
    public static final c d = new c(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f187519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f187520c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vjm.e f187518a = new vjm.e(16);

    public c() {
    }

    public static int c(WireFormat.FieldType fieldType, Object obj2) {
        switch (b.f187517b[fieldType.ordinal()]) {
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
                return CodedOutputStream.computeStringSizeNoTag((String) obj2);
            case 10:
                return obj2 instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj2) : CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj2);
            case 11:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj2).intValue());
            case 12:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj2).intValue());
            case 13:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj2).longValue());
            case 14:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj2).intValue());
            case 15:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj2).longValue());
            case 16:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj2);
            case 17:
                return obj2 instanceof LazyField ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyField) obj2) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj2);
            case 18:
                return obj2 instanceof Internal.EnumLite ? CodedOutputStream.computeEnumSizeNoTag(((Internal.EnumLite) obj2).getNumber()) : CodedOutputStream.computeEnumSizeNoTag(((Integer) obj2).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj2) {
        int iComputeTagSize;
        int iC;
        WireFormat.FieldType liteType = fieldSet$FieldDescriptorLite.getLiteType();
        int number = fieldSet$FieldDescriptorLite.getNumber();
        if (fieldSet$FieldDescriptorLite.isRepeated()) {
            int iC2 = 0;
            if (!fieldSet$FieldDescriptorLite.isPacked()) {
                for (Object obj3 : (List) obj2) {
                    int iComputeTagSize2 = CodedOutputStream.computeTagSize(number);
                    if (liteType == WireFormat.FieldType.GROUP) {
                        iComputeTagSize2 *= 2;
                    }
                    iC2 += c(liteType, obj3) + iComputeTagSize2;
                }
                return iC2;
            }
            Iterator it8 = ((List) obj2).iterator();
            while (it8.hasNext()) {
                iC2 += c(liteType, it8.next());
            }
            iComputeTagSize = CodedOutputStream.computeTagSize(number) + iC2;
            iC = CodedOutputStream.computeRawVarint32Size(iC2);
        } else {
            iComputeTagSize = CodedOutputStream.computeTagSize(number);
            if (liteType == WireFormat.FieldType.GROUP) {
                iComputeTagSize *= 2;
            }
            iC = c(liteType, obj2);
        }
        return iC + iComputeTagSize;
    }

    public static boolean g(Map.Entry entry) {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        if (fieldSet$FieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        if (fieldSet$FieldDescriptorLite.isRepeated()) {
            Iterator it8 = ((List) entry.getValue()).iterator();
            while (it8.hasNext()) {
                if (!((MessageLite) it8.next()).isInitialized()) {
                    return false;
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (value instanceof MessageLite) {
            return ((MessageLite) value).isInitialized();
        }
        if (value instanceof LazyField) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static Object j(CodedInputStream codedInputStream, WireFormat.FieldType fieldType) {
        switch (b.f187517b[fieldType.ordinal()]) {
            case 1:
                return Double.valueOf(codedInputStream.readDouble());
            case 2:
                return Float.valueOf(codedInputStream.readFloat());
            case 3:
                return Long.valueOf(codedInputStream.readInt64());
            case 4:
                return Long.valueOf(codedInputStream.readUInt64());
            case 5:
                return Integer.valueOf(codedInputStream.readInt32());
            case 6:
                return Long.valueOf(codedInputStream.readFixed64());
            case 7:
                return Integer.valueOf(codedInputStream.readFixed32());
            case 8:
                return Boolean.valueOf(codedInputStream.readBool());
            case 9:
                return codedInputStream.readString();
            case 10:
                return codedInputStream.readBytes();
            case 11:
                return Integer.valueOf(codedInputStream.readUInt32());
            case 12:
                return Integer.valueOf(codedInputStream.readSFixed32());
            case 13:
                return Long.valueOf(codedInputStream.readSFixed64());
            case 14:
                return Integer.valueOf(codedInputStream.readSInt32());
            case 15:
                return Long.valueOf(codedInputStream.readSInt64());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType r2, java.lang.Object r3) {
        /*
            r3.getClass()
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.b.f187516a
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r2 = r2.getJavaType()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L42;
                case 2: goto L3f;
                case 3: goto L3c;
                case 4: goto L39;
                case 5: goto L36;
                case 6: goto L33;
                case 7: goto L2a;
                case 8: goto L21;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            if (r2 != 0) goto L1f
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField
            if (r2 == 0) goto L1e
            goto L1f
        L1e:
            r0 = r1
        L1f:
            r1 = r0
            goto L44
        L21:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L1f
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            if (r2 == 0) goto L1e
            goto L1f
        L2a:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.ByteString
            if (r2 != 0) goto L1f
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L1e
            goto L1f
        L33:
            boolean r1 = r3 instanceof java.lang.String
            goto L44
        L36:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L44
        L39:
            boolean r1 = r3 instanceof java.lang.Double
            goto L44
        L3c:
            boolean r1 = r3 instanceof java.lang.Float
            goto L44
        L3f:
            boolean r1 = r3 instanceof java.lang.Long
            goto L44
        L42:
            boolean r1 = r3 instanceof java.lang.Integer
        L44:
            if (r1 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.c.l(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType, java.lang.Object):void");
    }

    public static void m(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj2) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i, (MessageLite) obj2);
        } else {
            codedOutputStream.writeTag(i, fieldType.getWireType());
            n(codedOutputStream, fieldType, obj2);
        }
    }

    public static void n(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj2) throws IOException {
        switch (b.f187517b[fieldType.ordinal()]) {
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
                codedOutputStream.writeStringNoTag((String) obj2);
                break;
            case 10:
                if (!(obj2 instanceof ByteString)) {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj2);
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj2);
                }
                break;
            case 11:
                codedOutputStream.writeUInt32NoTag(((Integer) obj2).intValue());
                break;
            case 12:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj2).intValue());
                break;
            case 13:
                codedOutputStream.writeSFixed64NoTag(((Long) obj2).longValue());
                break;
            case 14:
                codedOutputStream.writeSInt32NoTag(((Integer) obj2).intValue());
                break;
            case 15:
                codedOutputStream.writeSInt64NoTag(((Long) obj2).longValue());
                break;
            case 16:
                codedOutputStream.writeGroupNoTag((MessageLite) obj2);
                break;
            case 17:
                codedOutputStream.writeMessageNoTag((MessageLite) obj2);
                break;
            case 18:
                if (!(obj2 instanceof Internal.EnumLite)) {
                    codedOutputStream.writeEnumNoTag(((Integer) obj2).intValue());
                } else {
                    codedOutputStream.writeEnumNoTag(((Internal.EnumLite) obj2).getNumber());
                }
                break;
        }
    }

    public final void a(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj2) {
        List arrayList;
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        l(fieldSet$FieldDescriptorLite.getLiteType(), obj2);
        Object objE = e(fieldSet$FieldDescriptorLite);
        if (objE == null) {
            arrayList = new ArrayList();
            this.f187518a.put(fieldSet$FieldDescriptorLite, arrayList);
        } else {
            arrayList = (List) objE;
        }
        arrayList.add(obj2);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c clone() {
        vjm.e eVar;
        c cVar = new c();
        int i = 0;
        while (true) {
            eVar = this.f187518a;
            if (i >= eVar.f289833b.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar.f289833b.get(i);
            cVar.k((FieldSet$FieldDescriptorLite) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : eVar.c()) {
            cVar.k((FieldSet$FieldDescriptorLite) entry2.getKey(), entry2.getValue());
        }
        cVar.f187520c = this.f187520c;
        return cVar;
    }

    public final Object e(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite) {
        Object obj2 = this.f187518a.get(fieldSet$FieldDescriptorLite);
        return obj2 instanceof LazyField ? ((LazyField) obj2).getValue() : obj2;
    }

    public final boolean f() {
        int i = 0;
        while (true) {
            vjm.e eVar = this.f187518a;
            if (i >= eVar.f289833b.size()) {
                Iterator it8 = eVar.c().iterator();
                while (it8.hasNext()) {
                    if (!g((Map.Entry) it8.next())) {
                    }
                }
                return true;
            }
            if (!g((Map.Entry) eVar.f289833b.get(i))) {
                break;
            }
            i++;
        }
        return false;
    }

    public final void h() {
        if (this.f187519b) {
            return;
        }
        vjm.e eVar = this.f187518a;
        if (!eVar.d) {
            for (int i = 0; i < eVar.f289833b.size(); i++) {
                Map.Entry entry = (Map.Entry) eVar.f289833b.get(i);
                if (((FieldSet$FieldDescriptorLite) entry.getKey()).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : eVar.c()) {
                if (((FieldSet$FieldDescriptorLite) entry2.getKey()).isRepeated()) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!eVar.d) {
            eVar.f289834c = eVar.f289834c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(eVar.f289834c);
            eVar.d = true;
        }
        this.f187519b = true;
    }

    public final void i(Map.Entry entry) {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        boolean zIsRepeated = fieldSet$FieldDescriptorLite.isRepeated();
        vjm.e eVar = this.f187518a;
        if (zIsRepeated) {
            Object objE = e(fieldSet$FieldDescriptorLite);
            if (objE == null) {
                objE = new ArrayList();
            }
            for (Object obj2 : (List) value) {
                List list = (List) objE;
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj2 = bArr2;
                }
                list.add(obj2);
            }
            eVar.put(fieldSet$FieldDescriptorLite, objE);
            return;
        }
        if (fieldSet$FieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            eVar.put(fieldSet$FieldDescriptorLite, value);
            return;
        }
        Object objE2 = e(fieldSet$FieldDescriptorLite);
        if (objE2 != null) {
            eVar.put(fieldSet$FieldDescriptorLite, fieldSet$FieldDescriptorLite.internalMergeFrom(((MessageLite) objE2).toBuilder(), (MessageLite) value).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        eVar.put(fieldSet$FieldDescriptorLite, value);
    }

    public final void k(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj2) {
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            l(fieldSet$FieldDescriptorLite.getLiteType(), obj2);
        } else {
            if (!(obj2 instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj2);
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                l(fieldSet$FieldDescriptorLite.getLiteType(), it8.next());
            }
            obj2 = arrayList;
        }
        if (obj2 instanceof LazyField) {
            this.f187520c = true;
        }
        this.f187518a.put(fieldSet$FieldDescriptorLite, obj2);
    }

    public c(int i) {
        h();
    }
}
