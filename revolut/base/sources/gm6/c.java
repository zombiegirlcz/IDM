package gm6;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f144770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f144771b;

    public c(int i, int i2) {
        this.f144770a = i;
        this.f144771b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f144770a == cVar.f144770a && this.f144771b == cVar.f144771b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f144771b) + (Integer.hashCode(this.f144770a) * 31);
    }
}
