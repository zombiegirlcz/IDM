package vzi;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f293540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f293541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f293542c;

    public g(xi0.b currency, Map attributes, Boolean bool) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f293540a = currency;
        this.f293541b = attributes;
        this.f293542c = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f293540a, gVar.f293540a) && Intrinsics.f(this.f293541b, gVar.f293541b) && Intrinsics.f(this.f293542c, gVar.f293542c);
    }

    public final int hashCode() {
        int iE = p.a.e(this.f293540a.hashCode() * 31, 31, this.f293541b);
        Boolean bool = this.f293542c;
        return iE + (bool == null ? 0 : bool.hashCode());
    }
}
