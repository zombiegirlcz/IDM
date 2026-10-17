package mg;

import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes.dex */
public final class e1 implements kg.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f205067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f205068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kg.l0 f205069c;

    public e1(Class cls, Class cls2, kg.l0 l0Var) {
        this.f205067a = cls;
        this.f205068b = cls2;
        this.f205069c = l0Var;
    }

    @Override // kg.m0
    public final kg.l0 a(kg.o oVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (rawType == this.f205067a || rawType == this.f205068b) {
            return this.f205069c;
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Factory[type=");
        a0.d.A(this.f205068b, sb6, "+");
        a0.d.A(this.f205067a, sb6, ",adapter=");
        sb6.append(this.f205069c);
        sb6.append("]");
        return sb6.toString();
    }
}
