package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class js {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164905c;
    public final boolean d;

    public js(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f164903a = z;
        this.f164904b = z3;
        this.f164905c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof js)) {
            return false;
        }
        js jsVar = (js) obj2;
        return this.f164903a == jsVar.f164903a && this.f164904b == jsVar.f164904b && this.f164905c == jsVar.f164905c && this.d == jsVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f164903a) * 31, 31, this.f164904b), 31, this.f164905c);
    }
}
