package gcc;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f142398a;

    public e(boolean z) {
        this.f142398a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f142398a == ((e) obj2).f142398a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f142398a) + (Integer.hashCode(9) * 31);
    }
}
