package i8;

/* JADX INFO: loaded from: classes16.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159388a;

    public n(String str) {
        this.f159388a = str;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof n) {
            return this.f159388a.equals(((n) obj2).f159388a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f159388a.hashCode();
    }

    public final String toString() {
        return v0.a.i(new StringBuilder("StringHeaderFactory{value='"), this.f159388a, "'}");
    }
}
