package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import yrb.n;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes14.dex */
public final class ConstantValueFactory {

    @NotNull
    public static final ConstantValueFactory INSTANCE = new ConstantValueFactory();

    public static /* synthetic */ ConstantValue createConstantValue$default(ConstantValueFactory constantValueFactory, Object obj2, ModuleDescriptor moduleDescriptor, int i, Object obj3) {
        if ((i & 2) != 0) {
            moduleDescriptor = null;
        }
        return constantValueFactory.createConstantValue(obj2, moduleDescriptor);
    }

    public final ArrayValue a(List list, ModuleDescriptor moduleDescriptor, PrimitiveType primitiveType) {
        List listD1 = d0.d1(list);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = listD1.iterator();
        while (it8.hasNext()) {
            ConstantValue constantValueCreateConstantValue$default = createConstantValue$default(this, it8.next(), null, 2, null);
            if (constantValueCreateConstantValue$default != null) {
                arrayList.add(constantValueCreateConstantValue$default);
            }
        }
        if (moduleDescriptor == null) {
            return new ArrayValue(arrayList, new n(primitiveType, 4));
        }
        SimpleType primitiveArrayKotlinType = moduleDescriptor.getBuiltIns().getPrimitiveArrayKotlinType(primitiveType);
        Intrinsics.checkNotNullExpressionValue(primitiveArrayKotlinType, "getPrimitiveArrayKotlinType(...)");
        return new TypedArrayValue(arrayList, primitiveArrayKotlinType);
    }

    @NotNull
    public final ArrayValue createArrayValue(@NotNull List<? extends ConstantValue<?>> value, @NotNull KotlinType type) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        return new TypedArrayValue(value, type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v28, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory] */
    public final ConstantValue<?> createConstantValue(Object obj2, ModuleDescriptor moduleDescriptor) {
        ?? C;
        ?? C2;
        if (obj2 instanceof Byte) {
            return new ByteValue(((Number) obj2).byteValue());
        }
        if (obj2 instanceof Short) {
            return new ShortValue(((Number) obj2).shortValue());
        }
        if (obj2 instanceof Integer) {
            return new IntValue(((Number) obj2).intValue());
        }
        if (obj2 instanceof Long) {
            return new LongValue(((Number) obj2).longValue());
        }
        if (obj2 instanceof Character) {
            return new CharValue(((Character) obj2).charValue());
        }
        if (obj2 instanceof Float) {
            return new FloatValue(((Number) obj2).floatValue());
        }
        if (obj2 instanceof Double) {
            return new DoubleValue(((Number) obj2).doubleValue());
        }
        if (obj2 instanceof Boolean) {
            return new BooleanValue(((Boolean) obj2).booleanValue());
        }
        if (obj2 instanceof String) {
            return new StringValue((String) obj2);
        }
        if (obj2 instanceof byte[]) {
            return a(d.q0((byte[]) obj2), moduleDescriptor, PrimitiveType.BYTE);
        }
        int i = 0;
        if (obj2 instanceof short[]) {
            short[] sArr = (short[]) obj2;
            Intrinsics.checkNotNullParameter(sArr, "<this>");
            int length = sArr.length;
            if (length == 0) {
                C2 = f0.f322471a;
            } else if (length != 1) {
                Intrinsics.checkNotNullParameter(sArr, "<this>");
                C2 = new ArrayList(sArr.length);
                int length2 = sArr.length;
                while (i < length2) {
                    C2.add(Short.valueOf(sArr[i]));
                    i++;
                }
            } else {
                C2 = u.c(Short.valueOf(sArr[0]));
            }
            return a(C2, moduleDescriptor, PrimitiveType.SHORT);
        }
        if (obj2 instanceof int[]) {
            return a(d.t0((int[]) obj2), moduleDescriptor, PrimitiveType.INT);
        }
        if (obj2 instanceof long[]) {
            return a(d.u0((long[]) obj2), moduleDescriptor, PrimitiveType.LONG);
        }
        if (!(obj2 instanceof char[])) {
            if (obj2 instanceof float[]) {
                return a(d.s0((float[]) obj2), moduleDescriptor, PrimitiveType.FLOAT);
            }
            if (obj2 instanceof double[]) {
                return a(d.r0((double[]) obj2), moduleDescriptor, PrimitiveType.DOUBLE);
            }
            if (obj2 instanceof boolean[]) {
                return a(d.w0((boolean[]) obj2), moduleDescriptor, PrimitiveType.BOOLEAN);
            }
            if (obj2 == null) {
                return new NullValue();
            }
            return null;
        }
        char[] cArr = (char[]) obj2;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length3 = cArr.length;
        if (length3 == 0) {
            C = f0.f322471a;
        } else if (length3 != 1) {
            Intrinsics.checkNotNullParameter(cArr, "<this>");
            C = new ArrayList(cArr.length);
            int length4 = cArr.length;
            while (i < length4) {
                C.add(Character.valueOf(cArr[i]));
                i++;
            }
        } else {
            C = u.c(Character.valueOf(cArr[0]));
        }
        return a(C, moduleDescriptor, PrimitiveType.CHAR);
    }
}
