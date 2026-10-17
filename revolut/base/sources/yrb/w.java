package yrb;

/* JADX INFO: loaded from: classes6.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f316249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f316250b;

    public w(int i, boolean z) {
        this.f316249a = i;
        this.f316250b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f316249a == wVar.f316249a && this.f316250b == wVar.f316250b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f316250b) + (Integer.hashCode(this.f316249a) * 31);
    }
}
