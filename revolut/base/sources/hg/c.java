package hg;

/* JADX INFO: loaded from: classes17.dex */
public final class c implements b, gg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f152040a;

    public c(Object obj2) {
        this.f152040a = obj2;
    }

    public static c a(Object obj2) {
        if (obj2 != null) {
            return new c(obj2);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // phm.a
    public final Object get() {
        return this.f152040a;
    }
}
