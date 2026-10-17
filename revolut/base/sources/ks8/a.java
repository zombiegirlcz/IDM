package ks8;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f189302a;

    public a(int i) {
        this.f189302a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f189302a == ((a) obj2).f189302a;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Integer.hashCode(this.f189302a) * 31);
    }
}
