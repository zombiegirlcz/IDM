package e10;

/* JADX INFO: loaded from: classes16.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f121812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f121813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f121814c;

    public i(float f, float f4, float f5) {
        this.f121812a = f;
        this.f121813b = f4;
        this.f121814c = f5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Float.compare(this.f121812a, iVar.f121812a) == 0 && Float.compare(this.f121813b, iVar.f121813b) == 0 && Float.compare(this.f121814c, iVar.f121814c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f121814c) + m72.b.b(this.f121813b, Float.hashCode(this.f121812a) * 31, 31);
    }
}
