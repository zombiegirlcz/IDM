package eqh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zel.f f128462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f128463b;

    public g(zel.f instrumentGroup, List filters) {
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f128462a = instrumentGroup;
        this.f128463b = filters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f128462a == gVar.f128462a && Intrinsics.f(this.f128463b, gVar.f128463b);
    }

    public final int hashCode() {
        return this.f128463b.hashCode() + (this.f128462a.hashCode() * 31);
    }
}
