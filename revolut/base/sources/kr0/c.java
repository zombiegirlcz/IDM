package kr0;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f188628b;

    public c(int i, boolean z) {
        this.f188627a = i;
        this.f188628b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f188627a == cVar.f188627a && this.f188628b == cVar.f188628b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f188628b) + (Integer.hashCode(this.f188627a) * 31);
    }
}
