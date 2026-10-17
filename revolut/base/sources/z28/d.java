package z28;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f319010a;

    public d(boolean z) {
        this.f319010a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f319010a == ((d) obj2).f319010a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f319010a);
    }
}
