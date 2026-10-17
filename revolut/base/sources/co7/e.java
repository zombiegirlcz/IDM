package co7;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25493a;

    public e(boolean z) {
        this.f25493a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f25493a == ((e) obj2).f25493a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25493a);
    }
}
