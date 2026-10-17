package hp5;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f154469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f154470b;

    public e(boolean z, boolean z3) {
        this.f154469a = z;
        this.f154470b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f154469a == eVar.f154469a && this.f154470b == eVar.f154470b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f154470b) + (Boolean.hashCode(this.f154469a) * 31);
    }
}
