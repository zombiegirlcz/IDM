package omd;

import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig;
import com.revolut.feature.spending_analytics.api.models.NetWorthAccount;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import q06.h;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements bmd.e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f226817a;

    public g(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f226817a = navigator;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static amd.a b(jf0.c cVar) {
        String str = (String) cVar.d.get("timeframe");
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -720111923:
                if (str.equals("semiannual")) {
                    return amd.a.SIX_MONTHS;
                }
                return null;
            case 107876:
                if (str.equals("max")) {
                    return amd.a.MAX;
                }
                return null;
            case 3645428:
                if (str.equals("week")) {
                    return amd.a.WEEK;
                }
                return null;
            case 3704893:
                if (str.equals("year")) {
                    return amd.a.YEAR;
                }
                return null;
            case 104080000:
                if (str.equals("month")) {
                    return amd.a.MONTH;
                }
                return null;
            default:
                return null;
        }
    }

    public static f c(amd.b bVar) {
        return new f(bVar.b(), bVar);
    }

    public static f d(String str) {
        m70.a.c(t0.f186434a);
        if (Intrinsics.f(str, "") || Intrinsics.f(str, "assets")) {
            f.Companion.getClass();
            return f.f226814c;
        }
        if (Intrinsics.f(str, "liabilities")) {
            return new f(yld.g.LIABILITY, null);
        }
        if (Intrinsics.f(str, "cash")) {
            return c(amd.b.CASH);
        }
        if (Intrinsics.f(str, "savings")) {
            return c(amd.b.SAVINGS);
        }
        if (Intrinsics.f(str, "invest")) {
            return c(amd.b.INVEST);
        }
        if (Intrinsics.f(str, "crypto")) {
            return c(amd.b.CRYPTO);
        }
        if (Intrinsics.f(str, "linked-assets")) {
            return c(amd.b.LINKED);
        }
        if (Intrinsics.f(str, "pockets")) {
            return c(amd.b.POCKETS);
        }
        if (Intrinsics.f(str, "custom-assets")) {
            return c(amd.b.OTHER_ASSETS);
        }
        if (Intrinsics.f(str, "credit")) {
            return c(amd.b.CREDIT);
        }
        if (Intrinsics.f(str, "credit-card")) {
            return c(amd.b.CREDIT_CARDS);
        }
        if (Intrinsics.f(str, "pay-later")) {
            return c(amd.b.PAY_LATER);
        }
        if (Intrinsics.f(str, "loan")) {
            return c(amd.b.LOANS);
        }
        if (Intrinsics.f(str, "linked-liabilities")) {
            return c(amd.b.LINKED_CREDIT_CARDS);
        }
        return null;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "total-wealth");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        String strE = cVar.e(2);
        if (Intrinsics.f(strE, "custom-assets") && cVar.e(3).length() > 0) {
            return new h(new AnalyticsFeatureConfig.TotalWealthCustomAssetDetails.Destination(cVar.e(3)), new q06.b(ibb.c.f160140a, null));
        }
        f fVarD = d(strE);
        if (fVarD == null) {
            f.Companion.getClass();
            fVarD = f.f226814c;
        }
        amd.a aVarB = b(cVar);
        return new h(new AnalyticsFeatureConfig.TotalWealthScreen.Destination(fVarD.f226815a, NetWorthAccount.Personal.f87455a, fVarD.f226816b, aVarB, null, 16), new q06.b(ibb.c.f160140a, null));
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new a6j.b(deeplink, this, z, 14), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
