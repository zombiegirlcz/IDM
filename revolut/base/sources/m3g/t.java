package m3g;

/* JADX INFO: loaded from: classes9.dex */
public final class t implements jki.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f202552a;

    public t(boolean z) {
        this.f202552a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && this.f202552a == ((t) obj2).f202552a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f202552a);
    }
}
