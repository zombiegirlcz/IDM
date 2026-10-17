package ml;

/* JADX INFO: loaded from: classes17.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f206540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f206541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f206542c;

    public p(boolean z, boolean z3, boolean z4) {
        this.f206540a = z;
        this.f206541b = z3;
        this.f206542c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f206540a == pVar.f206540a && this.f206541b == pVar.f206541b && this.f206542c == pVar.f206542c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f206542c) + j6.a.c(Boolean.hashCode(this.f206540a) * 31, 31, this.f206541b);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("ToolbarState(showBackButton=");
        sb6.append(this.f206540a);
        sb6.append(", showExitButton=");
        sb6.append(this.f206541b);
        sb6.append(", useWebToolbar=");
        return com.google.android.gms.internal.mlkit_vision_face.a.t(sb6, this.f206542c, ")");
    }
}
