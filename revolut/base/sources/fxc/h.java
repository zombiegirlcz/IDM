package fxc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f138791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f138792b;

    public h(List externalCards, wi0.b country) {
        Intrinsics.checkNotNullParameter(externalCards, "externalCards");
        Intrinsics.checkNotNullParameter(country, "country");
        this.f138791a = externalCards;
        this.f138792b = country;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f138791a, hVar.f138791a) && Intrinsics.f(this.f138792b, hVar.f138792b);
    }

    public final int hashCode() {
        return this.f138792b.f297794a.hashCode() + (this.f138791a.hashCode() * 31);
    }
}
