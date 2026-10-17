package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class oz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165739b;

    public oz(boolean z, boolean z3) {
        this.f165738a = z;
        this.f165739b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof oz)) {
            return false;
        }
        oz ozVar = (oz) obj2;
        return this.f165738a == ozVar.f165738a && this.f165739b == ozVar.f165739b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165739b) + (Boolean.hashCode(this.f165738a) * 31);
    }
}
