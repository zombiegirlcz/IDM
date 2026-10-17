package h86;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f149946a;

    public e(boolean z) {
        this.f149946a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f149946a == ((e) obj2).f149946a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149946a);
    }
}
