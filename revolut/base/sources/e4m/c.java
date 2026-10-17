package e4m;

import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements e, d4m.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f122676a;

    public c(Object obj2) {
        this.f122676a = obj2;
    }

    public static c a(Object obj2) {
        s.i(obj2, "instance cannot be null");
        return new c(obj2);
    }

    @Override // phm.a
    public final Object get() {
        return this.f122676a;
    }
}
