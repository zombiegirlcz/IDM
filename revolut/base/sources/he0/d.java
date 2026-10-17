package he0;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import kg.l0;
import kg.m0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d implements m0 {
    @Override // kg.m0
    public final l0 a(kg.o gson, TypeToken type) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(type, "type");
        Object obj2 = null;
        if (!type.getRawType().isEnum()) {
            return null;
        }
        Class rawType = type.getRawType();
        Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(...)");
        Field[] declaredFields = rawType.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
        int length = declaredFields.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Field field = declaredFields[i2];
            if (field.isAnnotationPresent(b.class)) {
                Object[] enumConstants = rawType.getEnumConstants();
                if (enumConstants != null) {
                    int length2 = enumConstants.length;
                    while (true) {
                        if (i >= length2) {
                            break;
                        }
                        Object obj3 = enumConstants[i];
                        String name = field.getName();
                        Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.Enum<*>");
                        if (Intrinsics.f(name, ((Enum) obj3).name())) {
                            obj2 = obj3;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                i2++;
            }
        }
        l0 l0VarI = gson.i(this, type);
        Intrinsics.checkNotNullExpressionValue(l0VarI, "getDelegateAdapter(...)");
        return new c(l0VarI, obj2);
    }
}
