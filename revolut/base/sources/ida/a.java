package ida;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f160452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f160453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f160454c;

    public a(boolean z, boolean z3, boolean z4) {
        this.f160452a = z;
        this.f160453b = z3;
        this.f160454c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f160452a == aVar.f160452a && this.f160453b == aVar.f160453b && this.f160454c == aVar.f160454c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f160454c) + j6.a.c(Boolean.hashCode(this.f160452a) * 31, 31, this.f160453b);
    }
}
