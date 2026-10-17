package jvc;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f178840a;

    public m(boolean z) {
        this.f178840a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f178840a == ((m) obj2).f178840a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f178840a);
    }
}
