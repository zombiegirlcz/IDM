package oq;

/* JADX INFO: loaded from: classes17.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227695a;

    public c(boolean z) {
        this.f227695a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f227695a == ((c) obj2).f227695a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227695a);
    }
}
