package s6h;

import cli.q;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f260347a;

    public e(boolean z) {
        this.f260347a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f260347a == ((e) obj2).f260347a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f260347a);
    }
}
