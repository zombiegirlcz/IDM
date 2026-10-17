package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class cf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163730a;

    public cf0(boolean z) {
        this.f163730a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof cf0) && this.f163730a == ((cf0) obj2).f163730a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163730a);
    }
}
