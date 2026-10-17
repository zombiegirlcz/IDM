package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ib {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164668c;

    public ib(boolean z, boolean z3, boolean z4) {
        this.f164666a = z;
        this.f164667b = z3;
        this.f164668c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ib)) {
            return false;
        }
        ib ibVar = (ib) obj2;
        return this.f164666a == ibVar.f164666a && this.f164667b == ibVar.f164667b && this.f164668c == ibVar.f164668c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164668c) + j6.a.c(Boolean.hashCode(this.f164666a) * 31, 31, this.f164667b);
    }
}
