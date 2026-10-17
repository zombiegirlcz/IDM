package lg5;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f195068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f195069b;

    public e() {
        this(false, false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f195068a == eVar.f195068a && this.f195069b == eVar.f195069b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f195069b) + (Boolean.hashCode(this.f195068a) * 31);
    }

    public e(boolean z, boolean z3) {
        this.f195068a = z;
        this.f195069b = z3;
    }
}
