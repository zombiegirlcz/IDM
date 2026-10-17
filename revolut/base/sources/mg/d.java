package mg;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d implements kg.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r8.q f205061b;

    public /* synthetic */ d(r8.q qVar, int i) {
        this.f205060a = i;
        this.f205061b = qVar;
    }

    @Override // kg.m0
    public final kg.l0 a(kg.o oVar, TypeToken typeToken) {
        switch (this.f205060a) {
            case 0:
                Type type = typeToken.getType();
                Class rawType = typeToken.getRawType();
                if (!Collection.class.isAssignableFrom(rawType)) {
                    return null;
                }
                Type typeI = com.google.gson.internal.j.i(type, rawType);
                return new c(new t(oVar, oVar.g(TypeToken.get(typeI)), typeI), this.f205061b.c(typeToken, false));
            default:
                Type type2 = typeToken.getType();
                Class rawType2 = typeToken.getRawType();
                if (!Map.class.isAssignableFrom(rawType2)) {
                    return null;
                }
                Type[] typeArrK = com.google.gson.internal.j.k(type2, rawType2);
                Type type3 = typeArrK[0];
                Type type4 = typeArrK[1];
                return new t(this, new t(oVar, (type3 == Boolean.TYPE || type3 == Boolean.class) ? n1.f205097c : oVar.g(TypeToken.get(type3)), type3), new t(oVar, oVar.g(TypeToken.get(type4)), type4), this.f205061b.c(typeToken, false));
        }
    }
}
