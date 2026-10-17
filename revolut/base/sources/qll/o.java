package qll;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f247594a;

    public o(boolean z) {
        this.f247594a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f247594a == ((o) obj2).f247594a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f247594a);
    }
}
