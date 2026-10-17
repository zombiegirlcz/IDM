package ncj;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f214226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f214227b;

    public e(float f, float f4) {
        this.f214226a = f;
        this.f214227b = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Float.compare(this.f214226a, eVar.f214226a) == 0 && Float.compare(this.f214227b, eVar.f214227b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f214227b) + (Float.hashCode(this.f214226a) * 31);
    }
}
