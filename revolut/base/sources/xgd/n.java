package xgd;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f305686a;

    public n(boolean z) {
        this.f305686a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f305686a == ((n) obj2).f305686a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f305686a);
    }
}
