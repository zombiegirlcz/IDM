package wnc;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements jki.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f298814a;

    public v(boolean z) {
        this.f298814a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && this.f298814a == ((v) obj2).f298814a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f298814a);
    }
}
