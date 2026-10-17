package hr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f154775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154776c;

    public c(String name, String imageId, xi0.b currency) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        this.f154774a = name;
        this.f154775b = currency;
        this.f154776c = imageId;
    }

    public final xi0.b b() {
        return this.f154775b;
    }

    public final String c() {
        return this.f154776c;
    }

    public final String d() {
        return this.f154774a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f154774a, cVar.f154774a) && Intrinsics.f(this.f154775b, cVar.f154775b) && Intrinsics.f(this.f154776c, cVar.f154776c);
    }

    public final int hashCode() {
        return this.f154776c.hashCode() + h30.l.j(this.f154775b, this.f154774a.hashCode() * 31, 31);
    }
}
