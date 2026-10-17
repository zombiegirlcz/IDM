package efm;

/* JADX INFO: loaded from: classes22.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f125386b = new p(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f125387a;

    public p(Object obj2) {
        this.f125387a = obj2;
    }

    public static p a(Throwable th10) {
        mfm.f.b(th10, "error is null");
        return new p(new zfm.k(th10));
    }

    public static p b(Object obj2) {
        mfm.f.b(obj2, "value is null");
        return new p(obj2);
    }

    public final Throwable c() {
        Object obj2 = this.f125387a;
        if (obj2 instanceof zfm.k) {
            return ((zfm.k) obj2).f322037a;
        }
        return null;
    }

    public final boolean d() {
        Object obj2 = this.f125387a;
        return (obj2 == null || (obj2 instanceof zfm.k)) ? false : true;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof p) {
            return mfm.f.a(this.f125387a, ((p) obj2).f125387a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj2 = this.f125387a;
        if (obj2 != null) {
            return obj2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj2 = this.f125387a;
        if (obj2 == null) {
            return "OnCompleteNotification";
        }
        if (!(obj2 instanceof zfm.k)) {
            return v0.a.h(obj2, "OnNextNotification[", "]");
        }
        return "OnErrorNotification[" + ((zfm.k) obj2).f322037a + "]";
    }
}
