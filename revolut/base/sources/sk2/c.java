package sk2;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f263757a;

    public c(boolean z) {
        this.f263757a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f263757a == ((c) obj2).f263757a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f263757a);
    }
}
