package gu8;

import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature_exchange.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t1i.k;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xpi.g f146891b;

    public /* synthetic */ g(xpi.g gVar, int i) {
        this.f146890a = i;
        this.f146891b = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v25, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i;
        int i2;
        switch (this.f146890a) {
            case 0:
                ((xpi.c) this.f146891b).setVisible(false);
                return Unit.f186387a;
            case 1:
                v1i.a settings = (v1i.a) obj2;
                Intrinsics.checkNotNullParameter(settings, "settings");
                wd6.h hVar = settings.f285318a;
                xi0.b bVar = settings.f285320c;
                wd6.e eVar = settings.f285319b;
                int i3 = k.f267367a[hVar.ordinal()];
                xpi.g gVar = this.f146891b;
                switch (i3) {
                    case 1:
                        xpi.c cVar = (xpi.c) gVar;
                        cVar.n0(new TextLocalisedClause(R$string.fx_orders_recurring_buy, null, null, 14));
                        cVar.Y(new TextLocalisedClause(R$string.fx_orders_intro_subtitle_recurring_buy, null, null, 14));
                        break;
                    case 2:
                        xpi.c cVar2 = (xpi.c) gVar;
                        cVar2.n0(new TextLocalisedClause(R$string.fx_orders_limit_order, null, null, 14));
                        int i5 = k.f267368b[eVar.ordinal()];
                        if (i5 == 1) {
                            i = R$string.fx_orders_limit_order_full_description_buy;
                        } else {
                            if (i5 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = R$string.fx_orders_limit_order_full_description_sell;
                        }
                        cVar2.Y(new TextLocalisedClause(i, u.c(new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, null, 4)), null, 12));
                        break;
                    case 3:
                        xpi.c cVar3 = (xpi.c) gVar;
                        cVar3.n0(new TextLocalisedClause(R$string.fx_orders_stop_order, null, null, 14));
                        int i6 = k.f267368b[eVar.ordinal()];
                        if (i6 == 1) {
                            i2 = R$string.fx_orders_stop_order_full_description_buy;
                        } else {
                            if (i6 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i2 = R$string.fx_orders_stop_order_full_description_sell;
                        }
                        cVar3.Y(new TextLocalisedClause(i2, u.c(bVar.f306286a), null, 12));
                        break;
                    case 4:
                        throw new IllegalStateException("No intro screen for market orders!");
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("No intro screen for TP/SL orders!");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            default:
                t2i.a aVar = (t2i.a) obj2;
                Image image = aVar.f267576c;
                xpi.c cVar4 = (xpi.c) this.f146891b;
                cVar4.a0(image);
                cVar4.b0(aVar.d);
                MoneyClause moneyClause = aVar.f267574a;
                cVar4.p0(moneyClause);
                cVar4.n0(moneyClause);
                cVar4.Y(aVar.f267575b);
                NavBarWithToolbar navBarWithToolbar = cVar4.f307974j;
                if (navBarWithToolbar != null) {
                    navBarWithToolbar.setEndProgress(null);
                    return Unit.f186387a;
                }
                Intrinsics.r("navBarWithToolbarView");
                throw null;
        }
    }
}
