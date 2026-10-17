package iel;

/* JADX INFO: loaded from: classes12.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f160821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f160822b;

    public w(int i, int i2) {
        this.f160821a = i;
        this.f160822b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f160821a == wVar.f160821a && this.f160822b == wVar.f160822b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f160822b) + (Integer.hashCode(this.f160821a) * 31);
    }
}
