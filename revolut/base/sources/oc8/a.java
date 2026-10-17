package oc8;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f224107a;

    public a(boolean z) {
        this.f224107a = z;
    }

    @Override // oc8.c
    public final boolean a() {
        return this.f224107a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f224107a == ((a) obj2).f224107a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f224107a);
    }
}
