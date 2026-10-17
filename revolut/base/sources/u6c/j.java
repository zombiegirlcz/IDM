package u6c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f277562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f277563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f277564c;
    public final boolean d;

    public j(String bin, String str, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(bin, "bin");
        this.f277562a = bin;
        this.f277563b = str;
        this.f277564c = z;
        this.d = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f277562a, jVar.f277562a) && Intrinsics.f(this.f277563b, jVar.f277563b) && this.f277564c == jVar.f277564c && this.d == jVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f277562a.hashCode() * 31;
        String str = this.f277563b;
        return Boolean.hashCode(this.d) + j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f277564c);
    }
}
