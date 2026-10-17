package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227462a;

    public w0(boolean z) {
        this.f227462a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w0) && this.f227462a == ((w0) obj2).f227462a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227462a);
    }
}
