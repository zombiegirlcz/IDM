package vuf;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f292376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f292377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f292378c;

    public l(int i, long j2, long j3) {
        this.f292376a = i;
        this.f292377b = j2;
        this.f292378c = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f292376a == lVar.f292376a && this.f292377b == lVar.f292377b && this.f292378c == lVar.f292378c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f292378c) + a0.d.c(Integer.hashCode(this.f292376a) * 31, 31, this.f292377b);
    }
}
