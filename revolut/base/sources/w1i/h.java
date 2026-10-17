package w1i;

import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import g1i.d0;
import g1i.l0;
import g1i.m0;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f293857b;

    public /* synthetic */ h(o oVar, int i) {
        this.f293856a = i;
        this.f293857b = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ExplicitActivityDestination explicitActivityDestination;
        int i;
        TextLocalisedClause textLocalisedClause;
        int i2;
        switch (this.f293856a) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                o oVar = this.f293857b;
                pfm.a aVarK3 = ((d0) oVar.i).k3();
                l0 l0Var = (l0) oVar.f293866j;
                if (((Boolean) ((m0) l0Var.f139651c).H0().get()).booleanValue()) {
                    i2i.l.Companion.getClass();
                    explicitActivityDestination = i2i.f.f157959b;
                } else {
                    m1i.o.Companion.getClass();
                    explicitActivityDestination = m1i.f.f201532b;
                }
                pfm.a aVarE = aVarK3.e(l0Var.d.a(com.revolut.retail.core.navigation.a.d(new ActivityNavigateCommand(explicitActivityDestination, ExchangeFeatureConfig.Refresh.f96849a, null, null, 0, null, null, null, null, false, 1020))));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
            case 1:
                Data settingsData = (Data) obj2;
                Intrinsics.checkNotNullParameter(settingsData, "settingsData");
                y1i.b bVar = (y1i.b) settingsData.getContent();
                o oVar2 = this.f293857b;
                if (bVar != null) {
                    oVar2.k.setEnabled(bVar.i);
                } else {
                    oVar2.k.setEnabled(false);
                }
                return Unit.f186387a;
            case 2:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return ((l0) this.f293857b.f293866j).finish();
            case 3:
                ty0.a clickData = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (!Intrinsics.f(clickData.f275445a, "CurrentRateDescriptionClickId")) {
                    return pfm.m.f235744a;
                }
                o oVar3 = this.f293857b;
                efm.d0 d0VarFirstOrError = ((d0) oVar3.i).I3().firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                pfm.a aVar = new pfm.a(zi0.c.s(hx7.a.O(d0VarFirstOrError, oVar3.o, true, null, 24)), new vz4.c(new h(oVar3, 6), 9), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return ue0.e.v(aVar);
            case 4:
                Data settingsData2 = (Data) obj2;
                Intrinsics.checkNotNullParameter(settingsData2, "settingsData");
                y1i.b bVar2 = (y1i.b) settingsData2.getContent();
                if (bVar2 != null) {
                    xi0.b bVar3 = bVar2.e;
                    xpi.g gVar = this.f293857b.f293865h;
                    xi0.b bVar4 = bVar2.f;
                    wd6.e eVar = bVar2.f310385g;
                    boolean z = cp5.d.z(bVar4) || cp5.d.z(bVar3);
                    int i3 = j.f293858a[bVar2.d.ordinal()];
                    CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
                    if (i3 == 1) {
                        int i5 = j.f293859b[eVar.ordinal()];
                        if (i5 == 1) {
                            i = R$string.exchange_order_settings_subtitle_limit_buy;
                        } else {
                            if (i5 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = R$string.exchange_order_settings_subtitle_limit_sell;
                        }
                        textLocalisedClause = new TextLocalisedClause(i, v.k(new CurrencyClause(bVar3, ticker, null, 4), o.N(bVar2, !z)), null, 12);
                    } else {
                        if (i3 != 2) {
                            throw new IllegalArgumentException("Market orders have no settings");
                        }
                        int i6 = j.f293859b[eVar.ordinal()];
                        if (i6 == 1) {
                            i2 = R$string.exchange_order_settings_subtitle_stop_buy;
                        } else {
                            if (i6 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i2 = R$string.exchange_order_settings_subtitle_stop_sell;
                        }
                        textLocalisedClause = new TextLocalisedClause(i2, v.k(new CurrencyClause(bVar3, ticker, null, 4), o.N(bVar2, !z)), null, 12);
                    }
                    ((xpi.c) gVar).Y(textLocalisedClause);
                }
                return Unit.f186387a;
            case 5:
                String formattedRate = (String) obj2;
                Intrinsics.checkNotNullParameter(formattedRate, "formattedRate");
                o oVar4 = this.f293857b;
                BigDecimal bigDecimalD = oVar4.f293867l.d(formattedRate);
                g1i.a aVar2 = oVar4.i;
                double dDoubleValue = bigDecimalD.doubleValue();
                d0 d0Var = (d0) aVar2;
                d0Var.getClass();
                Intrinsics.checkNotNullParameter(formattedRate, "formattedRate");
                return w.z0(((m0) d0Var.e).z0(), new Pair(Double.valueOf(dDoubleValue), formattedRate));
            default:
                y1i.b settings = (y1i.b) obj2;
                Intrinsics.checkNotNullParameter(settings, "settings");
                e eVar2 = this.f293857b.f293866j;
                xi0.b currencyFrom = settings.e;
                xi0.b currencyTo = settings.f;
                l0 l0Var2 = (l0) eVar2;
                l0Var2.getClass();
                Intrinsics.checkNotNullParameter(currencyFrom, "currencyFrom");
                Intrinsics.checkNotNullParameter(currencyTo, "currencyTo");
                return l0Var2.d.a(l0Var2.f139652g.h(currencyFrom, currencyTo));
        }
    }
}
