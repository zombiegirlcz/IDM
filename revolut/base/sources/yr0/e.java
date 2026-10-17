package yr0;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f316060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f316061b;

    public e(boolean z, boolean z3) {
        this.f316060a = z;
        this.f316061b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f316060a == eVar.f316060a && this.f316061b == eVar.f316061b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f316061b) + (Boolean.hashCode(this.f316060a) * 31);
    }
}
