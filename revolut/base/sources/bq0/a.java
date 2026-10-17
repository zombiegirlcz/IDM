package bq0;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f17661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f17662c;
    public final float d;

    public a(float f, float f4, float f5, float f6) {
        this.f17660a = f;
        this.f17661b = f4;
        this.f17662c = f5;
        this.d = f6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Float.compare(this.f17660a, aVar.f17660a) == 0 && Float.compare(this.f17661b, aVar.f17661b) == 0 && Float.compare(this.f17662c, aVar.f17662c) == 0 && Float.compare(this.d, aVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f17662c, m72.b.b(this.f17661b, Float.hashCode(this.f17660a) * 31, 31), 31);
    }
}
