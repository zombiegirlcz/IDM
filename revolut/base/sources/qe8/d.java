package qe8;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f245096a;

    public d(int i) {
        this.f245096a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f245096a == ((d) obj2).f245096a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f245096a);
    }
}
