package mg;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public class a implements kg.m0 {
    @Override // kg.m0
    public final kg.l0 a(kg.o oVar, TypeToken typeToken) {
        Type type = typeToken.getType();
        if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type typeH = com.google.gson.internal.j.h(type);
        return new b(oVar, oVar.g(TypeToken.get(typeH)), com.google.gson.internal.j.l(typeH));
    }
}
