package hr6;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154773c;
    public final xi0.b d;

    public b(String id10, String name, String imageId, xi0.b currency) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f154771a = id10;
        this.f154772b = name;
        this.f154773c = imageId;
        this.d = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f154771a, bVar.f154771a) && Intrinsics.f(this.f154772b, bVar.f154772b) && Intrinsics.f(this.f154773c, bVar.f154773c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f154771a.hashCode() * 31, 31, this.f154772b), 31, this.f154773c);
    }
}
