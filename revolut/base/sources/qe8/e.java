package qe8;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f245097a;

    public e(int i) {
        this.f245097a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f245097a == ((e) obj2).f245097a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f245097a);
    }
}
