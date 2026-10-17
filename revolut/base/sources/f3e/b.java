package f3e;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends lk0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f131960a;

    public b(int i) {
        this.f131960a = i;
    }

    @Override // lk0.f
    public final int a() {
        return 12;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f131960a == ((b) obj2).f131960a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f131960a) + (Integer.hashCode(12) * 31);
    }
}
