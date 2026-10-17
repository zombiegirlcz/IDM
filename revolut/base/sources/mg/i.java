package mg;

import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes17.dex */
public class i implements kg.m0 {
    @Override // kg.m0
    public final kg.l0 a(kg.o oVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
            return null;
        }
        if (!rawType.isEnum()) {
            rawType = rawType.getSuperclass();
        }
        return new j(rawType);
    }
}
