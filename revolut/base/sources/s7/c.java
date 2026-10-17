package s7;

import d7.n0;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f260495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f260496b;

    public c() {
        this.f260495a = new b();
        this.f260496b = null;
    }

    public Object a(b bVar) {
        return this.f260496b;
    }

    public final Object b(float f, float f4, Object obj2, Object obj3, float f5, float f6, float f32) {
        b bVar = this.f260495a;
        bVar.f260491a = f;
        bVar.f260492b = f4;
        bVar.f260493c = obj2;
        bVar.d = obj3;
        bVar.e = f5;
        bVar.f = f6;
        bVar.f260494g = f32;
        return a(bVar);
    }

    public c(n0 n0Var) {
        this.f260495a = new b();
        this.f260496b = n0Var;
    }
}
