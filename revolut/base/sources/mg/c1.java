package mg;

import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes.dex */
public final class c1 implements kg.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f205058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kg.l0 f205059c;

    public /* synthetic */ c1(Object obj2, kg.l0 l0Var, int i) {
        this.f205057a = i;
        this.f205058b = obj2;
        this.f205059c = l0Var;
    }

    @Override // kg.m0
    public final kg.l0 a(kg.o oVar, TypeToken typeToken) {
        switch (this.f205057a) {
            case 0:
                if (typeToken.getRawType() == ((Class) this.f205058b)) {
                    return this.f205059c;
                }
                return null;
            case 1:
                Class<?> rawType = typeToken.getRawType();
                if (((Class) this.f205058b).isAssignableFrom(rawType)) {
                    return new he0.c(this, rawType);
                }
                return null;
            default:
                if (typeToken.equals((TypeToken) this.f205058b)) {
                    return this.f205059c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f205057a) {
            case 0:
                StringBuilder sb6 = new StringBuilder("Factory[type=");
                a0.d.A((Class) this.f205058b, sb6, ",adapter=");
                sb6.append(this.f205059c);
                sb6.append("]");
                return sb6.toString();
            case 1:
                StringBuilder sb9 = new StringBuilder("Factory[typeHierarchy=");
                a0.d.A((Class) this.f205058b, sb9, ",adapter=");
                sb9.append(this.f205059c);
                sb9.append("]");
                return sb9.toString();
            default:
                return super.toString();
        }
    }
}
