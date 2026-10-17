package qe8;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f245095a;

    public c(int i) {
        this.f245095a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f245095a == ((c) obj2).f245095a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f245095a);
    }
}
