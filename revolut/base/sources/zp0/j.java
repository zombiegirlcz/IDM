package zp0;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f324122a;

    public j(int i) {
        this.f324122a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f324122a == ((j) obj2).f324122a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f324122a);
    }
}
