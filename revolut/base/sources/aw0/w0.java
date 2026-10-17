package aw0;

/* JADX INFO: loaded from: classes19.dex */
public final class w0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10582a;

    public w0(int i) {
        this.f10582a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w0) && this.f10582a == ((w0) obj2).f10582a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10582a);
    }
}
