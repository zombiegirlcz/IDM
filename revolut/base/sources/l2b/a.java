package l2b;

import ael.y;
import com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import efm.d0;
import java.util.Iterator;
import kel.g;
import kel.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kye.l0;
import od0.i;
import w4l.h;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f191731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f191732c;

    public /* synthetic */ a(f fVar, String str, int i) {
        this.f191730a = i;
        this.f191731b = fVar;
        this.f191732c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        int i = this.f191730a;
        int i2 = 25;
        h hVar = h.f294642c;
        String str = this.f191732c;
        f fVar = this.f191731b;
        switch (i) {
            case 0:
                wel.e portfolio = (wel.e) obj2;
                Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                Iterator it8 = portfolio.e.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        g gVar = (g) next;
                        if (!(gVar instanceof n) || !Intrinsics.f(((n) gVar).f183173a.f183145a, str)) {
                        }
                    } else {
                        next = null;
                    }
                }
                g gVar2 = (g) next;
                return fVar.g(gVar2 != null ? gc0.c.f(new CfdTradingFeatureConfig.PositionDetails((n) gVar2, null)) : null);
            case 1:
                i optionalAccount = (i) obj2;
                Intrinsics.checkNotNullParameter(optionalAccount, "optionalAccount");
                String strC = f.c((TradingAccount) optionalAccount.f224257a);
                if (strC == null) {
                    return d0.m(f.b(null));
                }
                ybl.d dVar = fVar.e;
                ybl.c cVar = ybl.d.Companion;
                d0 d0VarFirstOrError = m70.a.g(rd0.e.c(((y) dVar).e(strC, hVar), kotlin.coroutines.g.f186406a), null, new l0(27), 1).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                kxj.e eVar = new kxj.e(new k7c.n(fVar, str), i2);
                d0VarFirstOrError.getClass();
                return new ufm.i(d0VarFirstOrError, eVar, 1);
            default:
                i optionalAccount2 = (i) obj2;
                Intrinsics.checkNotNullParameter(optionalAccount2, "optionalAccount");
                TradingAccount tradingAccount = (TradingAccount) optionalAccount2.f224257a;
                String strD = tradingAccount != null ? f.d(tradingAccount) : null;
                if (strD == null || !com.revolut.shared.feature.wealth.models.trading_accounts.d.e(tradingAccount) || str.length() == 0) {
                    return fVar.g(null);
                }
                ybl.d dVar2 = fVar.e;
                ybl.c cVar2 = ybl.d.Companion;
                return m70.a.g(rd0.e.c(((y) dVar2).e(strD, hVar), kotlin.coroutines.g.f186406a), null, new l0(i2), 1).flatMapCompletable(new kxj.e(new a(fVar, str, 0), 20));
        }
    }
}
