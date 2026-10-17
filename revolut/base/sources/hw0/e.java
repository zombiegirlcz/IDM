package hw0;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f155996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f155997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f155998c;

    public e(float f, float f4, float f5) {
        this.f155996a = f;
        this.f155997b = f4;
        this.f155998c = f5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Float.compare(this.f155996a, eVar.f155996a) == 0 && Float.compare(this.f155997b, eVar.f155997b) == 0 && Float.compare(this.f155998c, eVar.f155998c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f155998c) + m72.b.b(this.f155997b, Float.hashCode(this.f155996a) * 31, 31);
    }
}
