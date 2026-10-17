package ste;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f265566a;

    public l(boolean z) {
        this.f265566a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f265566a == ((l) obj2).f265566a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f265566a);
    }
}
