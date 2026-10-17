package rw8;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f257849a;

    public e(int i) {
        this.f257849a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f257849a == ((e) obj2).f257849a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f257849a);
    }
}
