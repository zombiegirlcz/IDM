package jvc;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f178846a;

    public s(boolean z) {
        this.f178846a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && this.f178846a == ((s) obj2).f178846a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f178846a);
    }
}
