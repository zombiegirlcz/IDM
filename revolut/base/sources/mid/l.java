package mid;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends lk0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f205723a;

    public l(int i) {
        this.f205723a = i;
    }

    @Override // lk0.f
    public final int a() {
        return 12;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f205723a == ((l) obj2).f205723a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f205723a) + (Integer.hashCode(12) * 31);
    }
}
