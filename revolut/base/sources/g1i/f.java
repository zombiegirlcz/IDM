package g1i;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f139619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xi0.b f139620c;

    public /* synthetic */ f(d0 d0Var, xi0.b bVar, int i) {
        this.f139618a = i;
        this.f139619b = d0Var;
        this.f139620c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        UUID uuid;
        Object next;
        TradingAccount.Portfolio portfolio;
        int i = this.f139618a;
        w4l.h hVar = w4l.h.f294642c;
        xi0.b bVar = this.f139620c;
        d0 d0Var = this.f139619b;
        switch (i) {
            case 0:
                od0.i pocketOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(pocketOptional, "pocketOptional");
                if (pocketOptional.d()) {
                    return nim.a.w(rd0.e.c(d0Var.f139611w.b(bVar, hVar), kotlin.coroutines.g.f186406a), new djc.z(2, pocketOptional));
                }
                od0.i.Companion.getClass();
                return zi0.c.j(od0.i.f224256b);
            case 1:
                List pricingPlans = (List) obj2;
                Intrinsics.checkNotNullParameter(pricingPlans, "pricingPlans");
                xv5.a aVar = d0Var.f139601h;
                Intrinsics.h(bVar);
                aVar.getClass();
                ArrayList arrayListA = xv5.a.a(pricingPlans, bVar);
                d0Var.f139601h.getClass();
                return new r1i.a(bVar, xv5.a.b(bVar), arrayListA);
            default:
                List accounts = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                Iterator it8 = accounts.iterator();
                while (true) {
                    uuid = null;
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (next instanceof WealthAccount.Securities) {
                        }
                    } else {
                        next = null;
                    }
                }
                WealthAccount.Securities securities = (WealthAccount.Securities) next;
                if (securities != null && (portfolio = securities.f95240c) != null) {
                    uuid = portfolio.f105210a;
                }
                String strValueOf = String.valueOf(uuid);
                ybl.d dVar = d0Var.D;
                ybl.c cVar = ybl.d.Companion;
                return nim.a.w(rd0.e.c(((ael.y) dVar).e(strValueOf, hVar), kotlin.coroutines.g.f186406a), new dv5.p(22, bVar));
        }
    }
}
