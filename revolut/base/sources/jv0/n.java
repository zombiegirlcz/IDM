package jv0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f178754a;

    public n(boolean z) {
        this.f178754a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f178754a == ((n) obj2).f178754a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f178754a);
    }
}
