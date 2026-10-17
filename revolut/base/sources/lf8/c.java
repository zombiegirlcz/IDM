package lf8;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f194666a;

    public c(boolean z) {
        this.f194666a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f194666a == ((c) obj2).f194666a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f194666a);
    }
}
