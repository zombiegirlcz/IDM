package e4m;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f122680c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile e f122681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f122682b;

    public static e a(e eVar) {
        if ((eVar instanceof g) || (eVar instanceof b)) {
            return eVar;
        }
        g gVar = new g();
        gVar.f122682b = f122680c;
        gVar.f122681a = eVar;
        return gVar;
    }

    @Override // phm.a
    public final Object get() {
        Object obj2 = this.f122682b;
        if (obj2 != f122680c) {
            return obj2;
        }
        e eVar = this.f122681a;
        if (eVar == null) {
            return this.f122682b;
        }
        Object obj3 = eVar.get();
        this.f122682b = obj3;
        this.f122681a = null;
        return obj3;
    }
}
