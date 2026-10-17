package ba7;

import com.revolut.data.model.Data;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f13973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f13974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f13975c;
    public final Data d;

    public g(xi0.b currency, xi0.b baseCurrency, Data rate, Data plot) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(plot, "plot");
        this.f13973a = currency;
        this.f13974b = baseCurrency;
        this.f13975c = rate;
        this.d = plot;
    }

    public static g a(g gVar, Data rate, Data plot, int i) {
        xi0.b currency = gVar.f13973a;
        xi0.b baseCurrency = gVar.f13974b;
        if ((i & 4) != 0) {
            rate = gVar.f13975c;
        }
        if ((i & 8) != 0) {
            plot = gVar.d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(plot, "plot");
        return new g(currency, baseCurrency, rate, plot);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f13973a, gVar.f13973a) && Intrinsics.f(this.f13974b, gVar.f13974b) && Intrinsics.f(this.f13975c, gVar.f13975c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f13975c, l.j(this.f13974b, this.f13973a.hashCode() * 31, 31), 31);
    }
}
