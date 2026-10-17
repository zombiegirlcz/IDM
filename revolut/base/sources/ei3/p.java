package ei3;

import b93.f;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.topup_screen.api.feature_config.TopUpCheckoutFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import h93.j0;
import h93.l0;
import h93.r;
import hha.w0;
import java.time.Instant;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Period;
import pi3.s;

/* JADX INFO: loaded from: classes21.dex */
public final class p {
    public static FeatureCommand a(CheckoutParams params, NaviCommand naviCommand, AnalyticsProduct automaticEventProduct) {
        pi3.d dVar;
        pi3.d dVar2;
        pi3.e eVar;
        s sVar;
        Intrinsics.checkNotNullParameter(params, "checkoutParams");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        boolean z = params instanceof CheckoutParams.CardOrder;
        b93.f fVar = z ? ((CheckoutParams.CardOrder) params).f65850a : null;
        if (fVar == null) {
            dVar2 = null;
        } else {
            if (fVar instanceof f.a) {
                b93.b.Companion.getClass();
                b93.b bVar = b93.b.X;
                e93.b bVar2 = e93.b.UNKNOWN;
                c93.j.Companion.getClass();
                c93.j jVar = c93.j.f22287c;
                dVar = new pi3.d("NO_ID", "", bVar, bVar2, (String) null, jVar, (d93.b) null, jVar, true, (c93.j) null, (Instant) null, (r) null, j0.RETAIL, l0.DEBIT, (dj0.d) null, 51200);
            } else if (fVar instanceof b93.h) {
                b93.h hVar = (b93.h) fVar;
                e93.e eVar2 = hVar.f13633a;
                b93.b bVar3 = eVar2.f123843c;
                e93.b bVar4 = eVar2.f123842b;
                String str = eVar2.f123848m;
                c93.j jVar2 = hVar.i;
                if (jVar2 == null) {
                    c93.j.Companion.getClass();
                    jVar2 = c93.j.f22287c;
                }
                c93.j.Companion.getClass();
                dVar = new pi3.d("NO_ID", "", bVar3, bVar4, str, jVar2, (d93.b) null, c93.j.f22287c, true, (c93.j) null, (Instant) null, (r) null, eVar2.f123850p, eVar2.f123851q, hVar.f13638j, 34816);
            } else if (fVar instanceof b93.g) {
                b93.g gVar = (b93.g) fVar;
                e93.f fVar2 = gVar.f13619a;
                b93.b bVarC = fVar2.c();
                e93.b bVarB = fVar2.b();
                String title = fVar2.getTitle();
                c93.j jVar3 = gVar.f13623h;
                if (jVar3 == null) {
                    c93.j.Companion.getClass();
                    jVar3 = c93.j.f22287c;
                }
                c93.j jVar4 = jVar3;
                d93.b bVar5 = gVar.e;
                c93.j jVar5 = gVar.i;
                if (jVar5 == null) {
                    c93.j.Companion.getClass();
                    jVar5 = c93.j.f22287c;
                }
                dVar = new pi3.d("NO_ID", "", bVarC, bVarB, title, jVar4, bVar5, jVar5, false, gVar.f13624j, (Instant) null, (r) null, fVar2.q(), fVar2.r(), gVar.f13628p, 34816);
            } else {
                if (!(fVar instanceof f.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                b93.b.Companion.getClass();
                b93.b bVar6 = b93.b.f13605w0;
                e93.b bVar7 = e93.b.UNKNOWN;
                c93.j.Companion.getClass();
                c93.j jVar6 = c93.j.f22287c;
                dVar = new pi3.d("NO_ID", "", bVar6, bVar7, (String) null, jVar6, (d93.b) null, jVar6, true, (c93.j) null, (Instant) null, (r) null, j0.PRO, l0.DEBIT, (dj0.d) null, 51200);
            }
            dVar2 = dVar;
        }
        Intrinsics.checkNotNullParameter(params, "params");
        pi3.h hVar2 = z ? ((CheckoutParams.CardOrder) params).f65851b : params instanceof CheckoutParams.Plan ? ((CheckoutParams.Plan) params).f65853a : null;
        if (hVar2 == null) {
            eVar = null;
        } else {
            hha.d dVar3 = hVar2.f236404a;
            Period periodA = pi3.b.a(hVar2.f236405b);
            hha.o oVarM = periodA != null ? cp5.c.m(dVar3, periodA) : null;
            String str2 = dVar3.f152287a;
            w0 w0VarF = hha.s.f(dVar3);
            if (oVarM == null) {
                hha.n nVar = hha.o.Companion;
                dj0.d dVar4 = new dj0.d(0L, dVar3.d);
                nVar.getClass();
                oVarM = hha.n.a(dVar4);
            }
            eVar = new pi3.e(str2, w0VarF, "", oVarM, dVar3.f152288b, hVar2.f236405b, null, hVar2.f236406c, hVar2.d);
        }
        if (dVar2 == null || (sVar = s.CARD) == null) {
            sVar = s.PLAN;
        }
        return new FeatureCommand(new TopUpCheckoutFeatureConfig(new CheckoutOrder(sVar, pi3.f.PENDING, pi3.g.PAYMENT_REQUIRED, dVar2, eVar, null), params, naviCommand, params.getF65852c(), automaticEventProduct));
    }
}
