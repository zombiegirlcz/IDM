package cab;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f22581c;
    public final boolean d;

    public f(String id10, String name, xi0.b targetCurrency, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        this.f22579a = id10;
        this.f22580b = name;
        this.f22581c = targetCurrency;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f22579a, fVar.f22579a) && Intrinsics.f(this.f22580b, fVar.f22580b) && Intrinsics.f(this.f22581c, fVar.f22581c) && this.d == fVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + h30.l.j(this.f22581c, p.a.c(this.f22579a.hashCode() * 31, 31, this.f22580b), 31);
    }
}
