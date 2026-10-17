package eu4;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f129507a;

    public h(boolean z) {
        this.f129507a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f129507a == ((h) obj2).f129507a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f129507a);
    }
}
