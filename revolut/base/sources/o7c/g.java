package o7c;

import efm.d0;
import java.util.HashMap;
import k7c.m0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nya.i0;
import skm.p0;
import te0.w;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements jf0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f222757a;

    public g(m0 revolutPayJoinCampaignRepository) {
        Intrinsics.checkNotNullParameter(revolutPayJoinCampaignRepository, "revolutPayJoinCampaignRepository");
        this.f222757a = revolutPayJoinCampaignRepository;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return Intrinsics.f(deeplink.e(1) + "/" + deeplink.e(2), "revolut-pay/join");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strE = deeplink.e(3);
        HashMap map = deeplink.d;
        String str = deeplink.f173629c;
        if (Intrinsics.f(strE, "order")) {
            String strE2 = deeplink.e(4);
            if (strE2.length() <= 0) {
                strE2 = null;
            }
            if (strE2 == null) {
                ufm.c cVarL = d0.l(new IllegalArgumentException(p.a.p("Deeplink uri=", str, " doesn't contain token")));
                Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
                return cVarL;
            }
            ufm.i iVar = new ufm.i(w.o0(p0.f264003c, new i0(strE2, this, null, 10)), new o5i.a(7, new o69.b(9)), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            return iVar;
        }
        m70.a.c(t0.f186434a);
        if (!Intrinsics.f(strE, "")) {
            ufm.c cVarL2 = d0.l(new IllegalArgumentException(j6.a.q("Invalid deeplink path uri=", str)));
            Intrinsics.checkNotNullExpressionValue(cVarL2, "error(...)");
            return cVarL2;
        }
        String str2 = (String) map.get("merchantPublicKey");
        if (str2 == null) {
            ufm.c cVarL3 = d0.l(new IllegalArgumentException(p.a.p("Deeplink uri=", str, " doesn't contain merchant public key")));
            Intrinsics.checkNotNullExpressionValue(cVarL3, "error(...)");
            return cVarL3;
        }
        String str3 = (String) map.get("currency");
        if (str3 == null) {
            ufm.c cVarL4 = d0.l(new IllegalArgumentException(p.a.p("Deeplink uri=", str, " doesn't contain currency")));
            Intrinsics.checkNotNullExpressionValue(cVarL4, "error(...)");
            return cVarL4;
        }
        ufm.i iVar2 = new ufm.i(w.o0(p0.f264003c, new i0(this, new u9c.a(str2, str3), null, 9)), new o5i.a(8, new o69.b(10)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }
}
