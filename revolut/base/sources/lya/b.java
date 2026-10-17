package lya;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f200768a;

    public b(int i) {
        this.f200768a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f200768a == ((b) obj2).f200768a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f200768a);
    }
}
