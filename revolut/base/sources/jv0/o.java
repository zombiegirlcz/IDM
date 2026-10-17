package jv0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f178755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f178756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f178757c;

    public o(boolean z, long j2, long j3) {
        this.f178755a = z;
        this.f178756b = j2;
        this.f178757c = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f178755a == oVar.f178755a && this.f178756b == oVar.f178756b && this.f178757c == oVar.f178757c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f178757c) + a0.d.c(Boolean.hashCode(this.f178755a) * 31, 31, this.f178756b);
    }
}
