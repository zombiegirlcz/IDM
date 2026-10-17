package androidx.datastore.preferences.protobuf;

import a0.d;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import com.google.android.gms.internal.mlkit_vision_face.a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class MessageSchema<T> implements Schema<T> {
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final ProtoSyntax syntax;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;

    private MessageSchema(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, ProtoSyntax protoSyntax, boolean z, int[] iArr2, int i3, int i5, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i;
        this.maxFieldNumber = i2;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.syntax = protoSyntax;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(messageLite);
        this.useCachedSizeField = z;
        this.intArray = iArr2;
        this.checkInitializedCount = i3;
        this.repeatedFieldOffsetStart = i5;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    private boolean arePresentForEquals(T t2, T t3, int i) {
        return isFieldPresent(t2, i) == isFieldPresent(t3, i);
    }

    private static <T> boolean booleanAt(T t2, long j2) {
        return UnsafeUtil.getBoolean(t2, j2);
    }

    private static void checkMutable(Object obj2) {
        if (!isMutable(obj2)) {
            throw new IllegalArgumentException(d.m(obj2, "Mutating immutable message: "));
        }
    }

    private static <T> double doubleAt(T t2, long j2) {
        return UnsafeUtil.getDouble(t2, j2);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj2, int i, UB ub4, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj3) {
        numberAt(i);
        if (UnsafeUtil.getObject(obj2, offset(typeAndOffsetAt(i))) == null) {
            return ub4;
        }
        getEnumFieldVerifier(i);
        return ub4;
    }

    private static <T> float floatAt(T t2, long j2) {
        return UnsafeUtil.getFloat(t2, j2);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i) {
        if (this.objects[d.b(i, 3, 2, 1)] == null) {
            return null;
        }
        throw new ClassCastException();
    }

    private Object getMapFieldDefaultEntry(int i) {
        return this.objects[(i / 3) * 2];
    }

    private Schema getMessageFieldSchema(int i) {
        int i2 = (i / 3) * 2;
        Schema schema = (Schema) this.objects[i2];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaSchemaFor = Protobuf.getInstance().schemaFor((Class) this.objects[i2 + 1]);
        this.objects[i2] = schemaSchemaFor;
        return schemaSchemaFor;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t2) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(t2));
    }

    private static <T> int intAt(T t2, long j2) {
        return UnsafeUtil.getInt(t2, j2);
    }

    private static boolean isEnforceUtf8(int i) {
        return (i & PKIFailureInfo.duplicateCertReq) != 0;
    }

    private boolean isFieldPresent(T t2, int i, int i2, int i3, int i5) {
        return i2 == 1048575 ? isFieldPresent(t2, i) : (i3 & i5) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj2, int i, int i2) {
        List list = (List) UnsafeUtil.getObject(obj2, offset(i));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!messageFieldSchema.isInitialized(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.datastore.preferences.protobuf.Schema] */
    private boolean isMapInitialized(T t2, int i, int i2) {
        Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(t2, offset(i)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? SchemaFor = 0;
        for (Object obj2 : mapForMapData.values()) {
            SchemaFor = SchemaFor;
            if (SchemaFor == 0) {
                SchemaFor = Protobuf.getInstance().schemaFor((Class) obj2.getClass());
            }
            if (!SchemaFor.isInitialized(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj2) {
        if (obj2 == null) {
            return false;
        }
        if (obj2 instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj2).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(T t2, T t3, int i) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i) & 1048575;
        return UnsafeUtil.getInt(t2, jPresenceMaskAndOffsetAt) == UnsafeUtil.getInt(t3, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T t2, int i, int i2) {
        return UnsafeUtil.getInt(t2, (long) (presenceMaskAndOffsetAt(i2) & 1048575)) == i;
    }

    private static boolean isRequired(int i) {
        return (i & 268435456) != 0;
    }

    private static <T> long longAt(T t2, long j2) {
        return UnsafeUtil.getLong(t2, j2);
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> r18, androidx.datastore.preferences.protobuf.ExtensionSchema<ET> r19, T r20, androidx.datastore.preferences.protobuf.Reader r21, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.mergeFromHelper(androidx.datastore.preferences.protobuf.UnknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema, java.lang.Object, androidx.datastore.preferences.protobuf.Reader, androidx.datastore.preferences.protobuf.ExtensionRegistryLite):void");
    }

    private final <K, V> void mergeMap(Object obj2, int i, Object obj3, ExtensionRegistryLite extensionRegistryLite, Reader reader) throws IOException {
        long jOffset = offset(typeAndOffsetAt(i));
        Object object = UnsafeUtil.getObject(obj2, jOffset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj3);
            UnsafeUtil.putObject(obj2, jOffset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(obj3);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            UnsafeUtil.putObject(obj2, jOffset, objNewMapField);
            object = objNewMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj3), extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T t2, T t3, int i) {
        if (isFieldPresent(t3, i)) {
            long jOffset = offset(typeAndOffsetAt(i));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t3, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + t3);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i);
            if (!isFieldPresent(t2, i)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t2, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t2, jOffset, object);
                }
                setFieldPresent(t2, i);
                return;
            }
            Object object2 = unsafe.getObject(t2, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t2, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T t2, T t3, int i) {
        int iNumberAt = numberAt(i);
        if (isOneofPresent(t3, iNumberAt, i)) {
            long jOffset = offset(typeAndOffsetAt(i));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t3, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + t3);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i);
            if (!isOneofPresent(t2, iNumberAt, i)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t2, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t2, jOffset, object);
                }
                setOneofPresent(t2, iNumberAt, i);
                return;
            }
            Object object2 = unsafe.getObject(t2, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t2, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeSingleField(T t2, T t3, int i) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(i);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t3, i)) {
                    UnsafeUtil.putDouble(t2, jOffset, UnsafeUtil.getDouble(t3, jOffset));
                    setFieldPresent(t2, i);
                }
                break;
            case 1:
                if (isFieldPresent(t3, i)) {
                    UnsafeUtil.putFloat(t2, jOffset, UnsafeUtil.getFloat(t3, jOffset));
                    setFieldPresent(t2, i);
                }
                break;
            case 2:
                if (isFieldPresent(t3, i)) {
                    UnsafeUtil.putLong(t2, jOffset, UnsafeUtil.getLong(t3, jOffset));
                    setFieldPresent(t2, i);
                }
                break;
            case 3:
                if (isFieldPresent(t3, i)) {
                    UnsafeUtil.putLong(t2, jOffset, UnsafeUtil.getLong(t3, jOffset));
                    setFieldPresent(t2, i);
                }
                break;
            case 4:
                if (isFieldPresent(t3, i)) {
                    UnsafeUtil.putInt(t2, jOffset, UnsafeUtil.getInt(t3, jOffset));
                    setFieldPresent(t2, i);
                }
                break;
            case 5:
                if (isFieldPresent(t3, i)) {
                    UnsafeUtil.putLong(t2, jOffset, UnsafeUtil.getLong(t3, jOffset));
                    setFieldPresent(t2, i);
                }
                break;
            case 6:
                if (isFieldPresent(t3, i)) {
                    UnsafeUtil.putInt(t2, jOffset, UnsafeUtil.getInt(t3, jOffset));
                    setFieldPresent(t2, i);
                }
                break;
            case 7:
                if (isFieldPresent(t3, i)) {
                    UnsafeUtil.putBoolean(t2, jOffset, UnsafeUtil.getBoolean(t3, jOffset));
                    setFieldPresent(t2, i);
                }
                break;
            case 8:
                if (isFieldPresent(t3, i)) {
                    UnsafeUtil.putObject(t2, jOffset, UnsafeUtil.getObject(t3, jOffset));
                    setFieldPresent(t2, i);
                }
                break;
            case 9:
                mergeMessage(t2, t3, i);
                break;
            case 10:
                if (isFieldPresent(t3, i)) {
                    UnsafeUtil.putObject(t2, jOffset, UnsafeUtil.getObject(t3, jOffset));
                    setFieldPresent(t2, i);
                }
                break;
            case 11:
                if (isFieldPresent(t3, i)) {
                    UnsafeUtil.putInt(t2, jOffset, UnsafeUtil.getInt(t3, jOffset));
                    setFieldPresent(t2, i);
                }
                break;
            case 12:
                if (isFieldPresent(t3, i)) {
                    UnsafeUtil.putInt(t2, jOffset, UnsafeUtil.getInt(t3, jOffset));
                    setFieldPresent(t2, i);
                }
                break;
            case 13:
                if (isFieldPresent(t3, i)) {
                    UnsafeUtil.putInt(t2, jOffset, UnsafeUtil.getInt(t3, jOffset));
                    setFieldPresent(t2, i);
                }
                break;
            case 14:
                if (isFieldPresent(t3, i)) {
                    UnsafeUtil.putLong(t2, jOffset, UnsafeUtil.getLong(t3, jOffset));
                    setFieldPresent(t2, i);
                }
                break;
            case 15:
                if (isFieldPresent(t3, i)) {
                    UnsafeUtil.putInt(t2, jOffset, UnsafeUtil.getInt(t3, jOffset));
                    setFieldPresent(t2, i);
                }
                break;
            case 16:
                if (isFieldPresent(t3, i)) {
                    UnsafeUtil.putLong(t2, jOffset, UnsafeUtil.getLong(t3, jOffset));
                    setFieldPresent(t2, i);
                }
                break;
            case 17:
                mergeMessage(t2, t3, i);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(t2, t3, jOffset);
                break;
            case 50:
                SchemaUtil.mergeMap(this.mapFieldSchema, t2, t3, jOffset);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(t3, iNumberAt, i)) {
                    UnsafeUtil.putObject(t2, jOffset, UnsafeUtil.getObject(t3, jOffset));
                    setOneofPresent(t2, iNumberAt, i);
                }
                break;
            case 60:
                mergeOneofMessage(t2, t3, i);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(t3, iNumberAt, i)) {
                    UnsafeUtil.putObject(t2, jOffset, UnsafeUtil.getObject(t3, jOffset));
                    setOneofPresent(t2, iNumberAt, i);
                }
                break;
            case 68:
                mergeOneofMessage(t2, t3, i);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T t2, int i) {
        Schema messageFieldSchema = getMessageFieldSchema(i);
        long jOffset = offset(typeAndOffsetAt(i));
        if (!isFieldPresent(t2, i)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t2, jOffset);
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableOneofMessageFieldForMerge(T t2, int i, int i2) {
        Schema messageFieldSchema = getMessageFieldSchema(i2);
        if (!isOneofPresent(t2, i, i2)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t2, offset(typeAndOffsetAt(i2)));
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public static <T> MessageSchema<T> newSchema(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        if (messageInfo instanceof RawMessageInfo) {
            return newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
        }
        if (messageInfo == null) {
            return newSchemaForMessageInfo(null, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
        }
        throw new ClassCastException();
    }

    public static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> androidx.datastore.preferences.protobuf.MessageSchema<T> newSchemaForRawMessageInfo(androidx.datastore.preferences.protobuf.RawMessageInfo r34, androidx.datastore.preferences.protobuf.NewInstanceSchema r35, androidx.datastore.preferences.protobuf.ListFieldSchema r36, androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r37, androidx.datastore.preferences.protobuf.ExtensionSchema<?> r38, androidx.datastore.preferences.protobuf.MapFieldSchema r39) {
        /*
            Method dump skipped, instruction units count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.newSchemaForRawMessageInfo(androidx.datastore.preferences.protobuf.RawMessageInfo, androidx.datastore.preferences.protobuf.NewInstanceSchema, androidx.datastore.preferences.protobuf.ListFieldSchema, androidx.datastore.preferences.protobuf.UnknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema, androidx.datastore.preferences.protobuf.MapFieldSchema):androidx.datastore.preferences.protobuf.MessageSchema");
    }

    private int numberAt(int i) {
        return this.buffer[i];
    }

    private static long offset(int i) {
        return i & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t2, long j2) {
        return ((Boolean) UnsafeUtil.getObject(t2, j2)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t2, long j2) {
        return ((Double) UnsafeUtil.getObject(t2, j2)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t2, long j2) {
        return ((Float) UnsafeUtil.getObject(t2, j2)).floatValue();
    }

    private static <T> int oneofIntAt(T t2, long j2) {
        return ((Integer) UnsafeUtil.getObject(t2, j2)).intValue();
    }

    private static <T> long oneofLongAt(T t2, long j2) {
        return ((Long) UnsafeUtil.getObject(t2, j2)).longValue();
    }

    private int positionForFieldNumber(int i) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, 0);
    }

    private int presenceMaskAndOffsetAt(int i) {
        return this.buffer[i + 2];
    }

    private <E> void readGroupList(Object obj2, long j2, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj2, j2), schema, extensionRegistryLite);
    }

    private <E> void readMessageList(Object obj2, int i, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj2, offset(i)), schema, extensionRegistryLite);
    }

    private void readString(Object obj2, int i, Reader reader) throws IOException {
        if (isEnforceUtf8(i)) {
            UnsafeUtil.putObject(obj2, offset(i), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj2, offset(i), reader.readString());
        } else {
            UnsafeUtil.putObject(obj2, offset(i), reader.readBytes());
        }
    }

    private void readStringList(Object obj2, int i, Reader reader) throws IOException {
        if (isEnforceUtf8(i)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj2, offset(i)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(obj2, offset(i)));
        }
    }

    private static Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbX = a.x("Field ", str, " for ");
            d.A(cls, sbX, " not found. Known fields are ");
            sbX.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbX.toString());
        }
    }

    private void setFieldPresent(T t2, int i) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j2 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j2 == 1048575) {
            return;
        }
        UnsafeUtil.putInt(t2, j2, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.getInt(t2, j2));
    }

    private void setOneofPresent(T t2, int i, int i2) {
        UnsafeUtil.putInt(t2, presenceMaskAndOffsetAt(i2) & 1048575, i);
    }

    private int slowPositionForFieldNumber(int i, int i2) {
        int length = (this.buffer.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i5 = i3 * 3;
            int iNumberAt = numberAt(i5);
            if (i == iNumberAt) {
                return i5;
            }
            if (i < iNumberAt) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private void storeMessageField(T t2, int i, Object obj2) {
        UNSAFE.putObject(t2, offset(typeAndOffsetAt(i)), obj2);
        setFieldPresent(t2, i);
    }

    private void storeOneofMessageField(T t2, int i, int i2, Object obj2) {
        UNSAFE.putObject(t2, offset(typeAndOffsetAt(i2)), obj2);
        setOneofPresent(t2, i, i2);
    }

    private static int type(int i) {
        return (i & 267386880) >>> 20;
    }

    private int typeAndOffsetAt(int i) {
        return this.buffer[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeFieldsInAscendingOrder(T r19, androidx.datastore.preferences.protobuf.Writer r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.writeFieldsInAscendingOrder(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeFieldsInDescendingOrder(T r11, androidx.datastore.preferences.protobuf.Writer r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.writeFieldsInDescendingOrder(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    private <K, V> void writeMapHelper(Writer writer, int i, Object obj2, int i2) throws IOException {
        if (obj2 != null) {
            writer.writeMap(i, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)), this.mapFieldSchema.forMapData(obj2));
        }
    }

    private void writeString(int i, Object obj2, Writer writer) throws IOException {
        if (obj2 instanceof String) {
            writer.writeString(i, (String) obj2);
        } else {
            writer.writeBytes(i, (ByteString) obj2);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t2, Writer writer) throws IOException {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(t2), writer);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public boolean equals(T t2, T t3) {
        int length = this.buffer.length;
        for (int i = 0; i < length; i += 3) {
            if (!equals(t2, t3, i)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(t2).equals(this.unknownFieldSchema.getFromMessage(t3))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t2).equals(this.extensionSchema.getExtensions(t3));
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0559 A[PHI: r0 r1
      0x0559: PHI (r0v2 androidx.datastore.preferences.protobuf.MessageSchema<T>) = 
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v26 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v32 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
      (r0v1 androidx.datastore.preferences.protobuf.MessageSchema<T>)
     binds: [B:22:0x005b, B:249:0x054f, B:218:0x04b0, B:204:0x0467, B:196:0x0440, B:189:0x0419, B:166:0x0330, B:160:0x0312, B:154:0x02f4, B:148:0x02d6, B:142:0x02b8, B:136:0x029a, B:130:0x027c, B:124:0x025e, B:118:0x0240, B:112:0x0223, B:106:0x0206, B:100:0x01e9, B:94:0x01cc, B:87:0x01aa, B:82:0x0176, B:79:0x016a, B:76:0x015a, B:73:0x014a, B:70:0x013a, B:67:0x012e, B:64:0x0122, B:61:0x0115, B:54:0x00f5, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0559: PHI (r1v4 T) = 
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v5 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
     binds: [B:22:0x005b, B:249:0x054f, B:218:0x04b0, B:204:0x0467, B:196:0x0440, B:189:0x0419, B:166:0x0330, B:160:0x0312, B:154:0x02f4, B:148:0x02d6, B:142:0x02b8, B:136:0x029a, B:130:0x027c, B:124:0x025e, B:118:0x0240, B:112:0x0223, B:106:0x0206, B:100:0x01e9, B:94:0x01cc, B:87:0x01aa, B:82:0x0176, B:79:0x016a, B:76:0x015a, B:73:0x014a, B:70:0x013a, B:67:0x012e, B:64:0x0122, B:61:0x0115, B:54:0x00f5, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getSerializedSize(T r18) {
        /*
            Method dump skipped, instruction units count: 1546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.getSerializedSize(java.lang.Object):int");
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int hashCode(T t2) {
        int i;
        int iHashLong;
        int i2;
        int iOneofIntAt;
        int length = this.buffer.length;
        int i3 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i5);
            int iNumberAt = numberAt(i5);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i = i3 * 53;
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(t2, jOffset)));
                    i3 = iHashLong + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iHashLong = Float.floatToIntBits(UnsafeUtil.getFloat(t2, jOffset));
                    i3 = iHashLong + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t2, jOffset));
                    i3 = iHashLong + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t2, jOffset));
                    i3 = iHashLong + i;
                    break;
                case 4:
                    i2 = i3 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t2, jOffset);
                    i3 = i2 + iOneofIntAt;
                    break;
                case 5:
                    i = i3 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t2, jOffset));
                    i3 = iHashLong + i;
                    break;
                case 6:
                    i2 = i3 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t2, jOffset);
                    i3 = i2 + iOneofIntAt;
                    break;
                case 7:
                    i = i3 * 53;
                    iHashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(t2, jOffset));
                    i3 = iHashLong + i;
                    break;
                case 8:
                    i = i3 * 53;
                    iHashLong = ((String) UnsafeUtil.getObject(t2, jOffset)).hashCode();
                    i3 = iHashLong + i;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(t2, jOffset);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iHashLong = UnsafeUtil.getObject(t2, jOffset).hashCode();
                    i3 = iHashLong + i;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t2, jOffset);
                    i3 = i2 + iOneofIntAt;
                    break;
                case 12:
                    i2 = i3 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t2, jOffset);
                    i3 = i2 + iOneofIntAt;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t2, jOffset);
                    i3 = i2 + iOneofIntAt;
                    break;
                case 14:
                    i = i3 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t2, jOffset));
                    i3 = iHashLong + i;
                    break;
                case 15:
                    i2 = i3 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t2, jOffset);
                    i3 = i2 + iOneofIntAt;
                    break;
                case 16:
                    i = i3 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t2, jOffset));
                    i3 = iHashLong + i;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(t2, jOffset);
                    if (object2 != null) {
                        iHashCode = object2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    iHashLong = UnsafeUtil.getObject(t2, jOffset).hashCode();
                    i3 = iHashLong + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iHashLong = UnsafeUtil.getObject(t2, jOffset).hashCode();
                    i3 = iHashLong + i;
                    break;
                case 51:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        i = i3 * 53;
                        iHashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(t2, jOffset)));
                        i3 = iHashLong + i;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        i = i3 * 53;
                        iHashLong = Float.floatToIntBits(oneofFloatAt(t2, jOffset));
                        i3 = iHashLong + i;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        i = i3 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t2, jOffset));
                        i3 = iHashLong + i;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        i = i3 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t2, jOffset));
                        i3 = iHashLong + i;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        i2 = i3 * 53;
                        iOneofIntAt = oneofIntAt(t2, jOffset);
                        i3 = i2 + iOneofIntAt;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        i = i3 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t2, jOffset));
                        i3 = iHashLong + i;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        i2 = i3 * 53;
                        iOneofIntAt = oneofIntAt(t2, jOffset);
                        i3 = i2 + iOneofIntAt;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        i = i3 * 53;
                        iHashLong = Internal.hashBoolean(oneofBooleanAt(t2, jOffset));
                        i3 = iHashLong + i;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        i = i3 * 53;
                        iHashLong = ((String) UnsafeUtil.getObject(t2, jOffset)).hashCode();
                        i3 = iHashLong + i;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        i = i3 * 53;
                        iHashLong = UnsafeUtil.getObject(t2, jOffset).hashCode();
                        i3 = iHashLong + i;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        i = i3 * 53;
                        iHashLong = UnsafeUtil.getObject(t2, jOffset).hashCode();
                        i3 = iHashLong + i;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        i2 = i3 * 53;
                        iOneofIntAt = oneofIntAt(t2, jOffset);
                        i3 = i2 + iOneofIntAt;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        i2 = i3 * 53;
                        iOneofIntAt = oneofIntAt(t2, jOffset);
                        i3 = i2 + iOneofIntAt;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        i2 = i3 * 53;
                        iOneofIntAt = oneofIntAt(t2, jOffset);
                        i3 = i2 + iOneofIntAt;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        i = i3 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t2, jOffset));
                        i3 = iHashLong + i;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        i2 = i3 * 53;
                        iOneofIntAt = oneofIntAt(t2, jOffset);
                        i3 = i2 + iOneofIntAt;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        i = i3 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t2, jOffset));
                        i3 = iHashLong + i;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t2, iNumberAt, i5)) {
                        i = i3 * 53;
                        iHashLong = UnsafeUtil.getObject(t2, jOffset).hashCode();
                        i3 = iHashLong + i;
                    }
                    break;
            }
        }
        int iHashCode2 = this.unknownFieldSchema.getFromMessage(t2).hashCode() + (i3 * 53);
        return this.hasExtensions ? (iHashCode2 * 53) + this.extensionSchema.getExtensions(t2).hashCode() : iHashCode2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    @Override // androidx.datastore.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isInitialized(T r15) {
        /*
            r14 = this;
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 0
            r3 = r0
            r2 = r1
            r4 = r2
        L7:
            int r5 = r14.checkInitializedCount
            r6 = 1
            if (r2 >= r5) goto L9b
            int[] r5 = r14.intArray
            r9 = r5[r2]
            int r5 = r14.numberAt(r9)
            int r13 = r14.typeAndOffsetAt(r9)
            int[] r7 = r14.buffer
            int r8 = r9 + 2
            r7 = r7[r8]
            r8 = r7 & r0
            int r7 = r7 >>> 20
            int r12 = r6 << r7
            if (r8 == r3) goto L32
            if (r8 == r0) goto L2f
            sun.misc.Unsafe r3 = androidx.datastore.preferences.protobuf.MessageSchema.UNSAFE
            long r6 = (long) r8
            int r4 = r3.getInt(r15, r6)
        L2f:
            r11 = r4
            r10 = r8
            goto L34
        L32:
            r10 = r3
            r11 = r4
        L34:
            boolean r3 = isRequired(r13)
            r7 = r14
            r8 = r15
            if (r3 == 0) goto L43
            boolean r15 = r7.isFieldPresent(r8, r9, r10, r11, r12)
            if (r15 != 0) goto L43
            return r1
        L43:
            int r15 = type(r13)
            r3 = 9
            if (r15 == r3) goto L83
            r3 = 17
            if (r15 == r3) goto L83
            r3 = 27
            if (r15 == r3) goto L7c
            r3 = 60
            if (r15 == r3) goto L6b
            r3 = 68
            if (r15 == r3) goto L6b
            r3 = 49
            if (r15 == r3) goto L7c
            r3 = 50
            if (r15 == r3) goto L64
            goto L94
        L64:
            boolean r15 = r14.isMapInitialized(r8, r13, r9)
            if (r15 != 0) goto L94
            return r1
        L6b:
            boolean r15 = r14.isOneofPresent(r8, r5, r9)
            if (r15 == 0) goto L94
            androidx.datastore.preferences.protobuf.Schema r15 = r14.getMessageFieldSchema(r9)
            boolean r15 = isInitialized(r8, r13, r15)
            if (r15 != 0) goto L94
            return r1
        L7c:
            boolean r15 = r14.isListInitialized(r8, r13, r9)
            if (r15 != 0) goto L94
            return r1
        L83:
            boolean r15 = r7.isFieldPresent(r8, r9, r10, r11, r12)
            if (r15 == 0) goto L94
            androidx.datastore.preferences.protobuf.Schema r15 = r14.getMessageFieldSchema(r9)
            boolean r15 = isInitialized(r8, r13, r15)
            if (r15 != 0) goto L94
            return r1
        L94:
            int r2 = r2 + 1
            r15 = r8
            r3 = r10
            r4 = r11
            goto L7
        L9b:
            r7 = r14
            r8 = r15
            boolean r15 = r7.hasExtensions
            if (r15 == 0) goto Lae
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r15 = r7.extensionSchema
            androidx.datastore.preferences.protobuf.FieldSet r15 = r15.getExtensions(r8)
            boolean r15 = r15.isInitialized()
            if (r15 != 0) goto Lae
            return r1
        Lae:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.isInitialized(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    @Override // androidx.datastore.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void makeImmutable(T r8) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.makeImmutable(java.lang.Object):void");
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T t2, T t3) {
        checkMutable(t2);
        t3.getClass();
        for (int i = 0; i < this.buffer.length; i += 3) {
            mergeSingleField(t2, t3, i);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t2, t3);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t2, t3);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void writeTo(T t2, Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t2, writer);
        } else {
            writeFieldsInAscendingOrder(t2, writer);
        }
    }

    private boolean isFieldPresent(T t2, int i) {
        boolean zEquals;
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j2 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j2 != 1048575) {
            return (UnsafeUtil.getInt(t2, j2) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(UnsafeUtil.getDouble(t2, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(UnsafeUtil.getFloat(t2, jOffset)) != 0;
            case 2:
                return UnsafeUtil.getLong(t2, jOffset) != 0;
            case 3:
                return UnsafeUtil.getLong(t2, jOffset) != 0;
            case 4:
                return UnsafeUtil.getInt(t2, jOffset) != 0;
            case 5:
                return UnsafeUtil.getLong(t2, jOffset) != 0;
            case 6:
                return UnsafeUtil.getInt(t2, jOffset) != 0;
            case 7:
                return UnsafeUtil.getBoolean(t2, jOffset);
            case 8:
                Object object = UnsafeUtil.getObject(t2, jOffset);
                if (object instanceof String) {
                    zEquals = ((String) object).isEmpty();
                } else {
                    if (!(object instanceof ByteString)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = ByteString.EMPTY.equals(object);
                }
                break;
            case 9:
                return UnsafeUtil.getObject(t2, jOffset) != null;
            case 10:
                zEquals = ByteString.EMPTY.equals(UnsafeUtil.getObject(t2, jOffset));
                break;
            case 11:
                return UnsafeUtil.getInt(t2, jOffset) != 0;
            case 12:
                return UnsafeUtil.getInt(t2, jOffset) != 0;
            case 13:
                return UnsafeUtil.getInt(t2, jOffset) != 0;
            case 14:
                return UnsafeUtil.getLong(t2, jOffset) != 0;
            case 15:
                return UnsafeUtil.getInt(t2, jOffset) != 0;
            case 16:
                return UnsafeUtil.getLong(t2, jOffset) != 0;
            case 17:
                return UnsafeUtil.getObject(t2, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T t2, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        extensionRegistryLite.getClass();
        checkMutable(t2);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t2, reader, extensionRegistryLite);
    }

    private boolean equals(T t2, T t3, int i) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (!arePresentForEquals(t2, t3, i) || Double.doubleToLongBits(UnsafeUtil.getDouble(t2, jOffset)) != Double.doubleToLongBits(UnsafeUtil.getDouble(t3, jOffset))) {
                }
                break;
            case 1:
                if (!arePresentForEquals(t2, t3, i) || Float.floatToIntBits(UnsafeUtil.getFloat(t2, jOffset)) != Float.floatToIntBits(UnsafeUtil.getFloat(t3, jOffset))) {
                }
                break;
            case 2:
                if (!arePresentForEquals(t2, t3, i) || UnsafeUtil.getLong(t2, jOffset) != UnsafeUtil.getLong(t3, jOffset)) {
                }
                break;
            case 3:
                if (!arePresentForEquals(t2, t3, i) || UnsafeUtil.getLong(t2, jOffset) != UnsafeUtil.getLong(t3, jOffset)) {
                }
                break;
            case 4:
                if (!arePresentForEquals(t2, t3, i) || UnsafeUtil.getInt(t2, jOffset) != UnsafeUtil.getInt(t3, jOffset)) {
                }
                break;
            case 5:
                if (!arePresentForEquals(t2, t3, i) || UnsafeUtil.getLong(t2, jOffset) != UnsafeUtil.getLong(t3, jOffset)) {
                }
                break;
            case 6:
                if (!arePresentForEquals(t2, t3, i) || UnsafeUtil.getInt(t2, jOffset) != UnsafeUtil.getInt(t3, jOffset)) {
                }
                break;
            case 7:
                if (!arePresentForEquals(t2, t3, i) || UnsafeUtil.getBoolean(t2, jOffset) != UnsafeUtil.getBoolean(t3, jOffset)) {
                }
                break;
            case 8:
                if (!arePresentForEquals(t2, t3, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t2, jOffset), UnsafeUtil.getObject(t3, jOffset))) {
                }
                break;
            case 9:
                if (!arePresentForEquals(t2, t3, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t2, jOffset), UnsafeUtil.getObject(t3, jOffset))) {
                }
                break;
            case 10:
                if (!arePresentForEquals(t2, t3, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t2, jOffset), UnsafeUtil.getObject(t3, jOffset))) {
                }
                break;
            case 11:
                if (!arePresentForEquals(t2, t3, i) || UnsafeUtil.getInt(t2, jOffset) != UnsafeUtil.getInt(t3, jOffset)) {
                }
                break;
            case 12:
                if (!arePresentForEquals(t2, t3, i) || UnsafeUtil.getInt(t2, jOffset) != UnsafeUtil.getInt(t3, jOffset)) {
                }
                break;
            case 13:
                if (!arePresentForEquals(t2, t3, i) || UnsafeUtil.getInt(t2, jOffset) != UnsafeUtil.getInt(t3, jOffset)) {
                }
                break;
            case 14:
                if (!arePresentForEquals(t2, t3, i) || UnsafeUtil.getLong(t2, jOffset) != UnsafeUtil.getLong(t3, jOffset)) {
                }
                break;
            case 15:
                if (!arePresentForEquals(t2, t3, i) || UnsafeUtil.getInt(t2, jOffset) != UnsafeUtil.getInt(t3, jOffset)) {
                }
                break;
            case 16:
                if (!arePresentForEquals(t2, t3, i) || UnsafeUtil.getLong(t2, jOffset) != UnsafeUtil.getLong(t3, jOffset)) {
                }
                break;
            case 17:
                if (!arePresentForEquals(t2, t3, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t2, jOffset), UnsafeUtil.getObject(t3, jOffset))) {
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!isOneofCaseEqual(t2, t3, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t2, jOffset), UnsafeUtil.getObject(t3, jOffset))) {
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj2, int i, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj2, offset(i)));
    }
}
