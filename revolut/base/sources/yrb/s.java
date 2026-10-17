package yrb;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import com.revolut.feature.retail.trading.advanced.charts.api.models.StockAdvancedChartSymbol;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import grl.k9;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import mx0.lc;
import mx0.mc;
import nel.s0;
import nel.v0;
import vkm.j2;
import vkm.t0;
import vkm.v1;
import vkm.z1;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends v {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kdh.b f316232l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final te0.u f316233m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fsb.a f316234n;
    public final wj0.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ybl.b f316235p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Map f316236q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Map f316237r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Map f316238s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Map f316239t;
    public final vdf.d u;
    public final csb.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f316240w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z1 f316241x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f316242y;
    public final vki.a z;

    public s(kdh.b instrumentActionsInteractor, te0.u persistentFieldProvider, fsb.a termsAndConditionsControllerProvider, wj0.a idempotencyKeyHolder, ybl.b instrumentTickerInteractor, Map tradingInteractors, Map configsProviders, Map validationProviders, Map infoMappers, vdf.d assetFormatter, csb.a orderResultDialogProvider) {
        Intrinsics.checkNotNullParameter(instrumentActionsInteractor, "instrumentActionsInteractor");
        Intrinsics.checkNotNullParameter(persistentFieldProvider, "persistentFieldProvider");
        Intrinsics.checkNotNullParameter(termsAndConditionsControllerProvider, "termsAndConditionsControllerProvider");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(tradingInteractors, "tradingInteractors");
        Intrinsics.checkNotNullParameter(configsProviders, "configsProviders");
        Intrinsics.checkNotNullParameter(validationProviders, "validationProviders");
        Intrinsics.checkNotNullParameter(infoMappers, "infoMappers");
        Intrinsics.checkNotNullParameter(assetFormatter, "assetFormatter");
        Intrinsics.checkNotNullParameter(orderResultDialogProvider, "orderResultDialogProvider");
        this.f316232l = instrumentActionsInteractor;
        this.f316233m = persistentFieldProvider;
        this.f316234n = termsAndConditionsControllerProvider;
        this.o = idempotencyKeyHolder;
        this.f316235p = instrumentTickerInteractor;
        this.f316236q = tradingInteractors;
        this.f316237r = configsProviders;
        this.f316238s = validationProviders;
        this.f316239t = infoMappers;
        this.u = assetFormatter;
        this.v = orderResultDialogProvider;
        this.f316240w = te0.w.y0(new yq0.e(this, 6));
        this.f316241x = vkm.q.a(0, 1, ukm.f.DROP_OLDEST);
        this.f316242y = new ArrayList();
        this.z = pyd.c.a(this, n3(null));
    }

    @Override // yji.n
    public final void H2() {
        vki.a aVar = this.z;
        s0 s0Var = ((x) ((j2) aVar.f22677a).getValue()).f316256j;
        if (((x) ((j2) aVar.f22677a).getValue()).f316259n != j0b.e.EXPANDED || s0Var == null) {
            return;
        }
        p3(s0Var);
    }

    @Override // j0b.a
    public final Flow Z2() {
        return this.f316241x;
    }

    @Override // j0b.a
    public final Flow b3() {
        return (j2) this.z.f22677a;
    }

    @Override // j0b.a
    public final void c3() {
        s0 s0Var = ((x) ((j2) this.z.f22677a).getValue()).f316256j;
        if (s0Var == null) {
            return;
        }
        nel.n nVar = s0Var.e;
        qrb.q.Companion.getClass();
        qrb.q qVarA = qrb.p.a(nVar);
        if (qVarA != null) {
            Map map = this.f316237r;
            if (map.containsKey(qVarA)) {
                N2(((asb.d) r0.h(qVarA, map)).d(s0Var.d, nVar), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new h(this, 1));
                return;
            }
        }
        throw new IllegalStateException("No " + o0.f186429a.b(asb.d.class) + " found for instrument type " + nVar.f214597c);
    }

    @Override // j0b.a
    public final void d3(AdvancedChartSymbol symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (symbol instanceof StockAdvancedChartSymbol) {
            yj2.b bVar = new yj2.b(this, symbol, 29);
            vki.a aVar = this.z;
            X2(aVar, bVar);
            int i = 0;
            Continuation continuation = null;
            yji.n.j2(this, vkm.q.Q(new t0(aVar.B(new ypd.i(20)), 1), new m(i, continuation, this)), null, new o(i, continuation, this), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // j0b.a
    public final void e3() {
        vki.a aVar = this.z;
        int i = j.f316219a[((x) ((j2) aVar.f22677a).getValue()).f316259n.ordinal()];
        if (i == 1) {
            X2(aVar, new ypd.i(21));
            ArrayList arrayList = this.f316242y;
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                ((Job) it8.next()).f(null);
            }
            arrayList.clear();
            this.f316241x.k(null);
            return;
        }
        int i2 = 2;
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (((Boolean) ((te0.t) this.f316240w.getValue()).get()).booleanValue()) {
            o3();
            return;
        }
        this.f316234n.getClass();
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.trading_advanced_chart_trade_consent_title, null, null, 14), null, new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_turbo_transfer, null, null, 6)), null, false, 26);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trading_advanced_chart_trade_consent_description, null, null, 14);
        k9 value = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        N2(new ActionsBottomSheetController(new dii.a(aVar2, new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.trading_advanced_chart_trade_consent_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), new AnalyticsProduct.Retail(value), (AnalyticsContext) null, textLocalisedClause)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new h(this, i2));
    }

    @Override // yrb.v
    public final void f3(Object obj2) {
        Object next;
        dsb.m parcel = obj2 instanceof dsb.m ? (dsb.m) obj2 : null;
        if (parcel == null) {
            return;
        }
        nel.n nVarN = parcel.a().n();
        qrb.q.Companion.getClass();
        qrb.q qVarA = qrb.p.a(nVarN);
        if (qVarA != null) {
            Map map = this.f316239t;
            if (map.containsKey(qVarA)) {
                dsb.e eVar = (dsb.e) ((dsb.d) r0.h(qVarA, map));
                eVar.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Iterator it8 = eVar.f117280a.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it8.next();
                        if (((dsb.c) next).d(parcel)) {
                            break;
                        }
                    }
                }
                dsb.c cVar = (dsb.c) next;
                if (cVar != null) {
                    yji.n.P2(this, o2(cVar.e(parcel)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
                    return;
                } else {
                    throw new IllegalStateException("Can't handle info parcel " + parcel);
                }
            }
        }
        throw new IllegalStateException("No " + o0.f186429a.b(dsb.d.class) + " found for instrument type " + nVarN.f214597c);
    }

    @Override // yrb.v
    public final void g3(String input, boolean z, u parcel) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        X2(this.z, new w43.b(this.u.a(input, parcel.f316246a, parcel.f316247b), this, parcel, z, 5));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.z;
    }

    @Override // yrb.v
    public final void h3(CenteredAmountDelegate.Model model) {
        qrb.b bVar;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.f51981p;
        u uVar = obj2 instanceof u ? (u) obj2 : null;
        if (uVar == null) {
            return;
        }
        qrb.k kVar = uVar.f316248c;
        nel.n nVarN = kVar.n();
        qrb.q.Companion.getClass();
        qrb.q qVarA = qrb.p.a(nVarN);
        if (qVarA != null) {
            Map map = this.f316237r;
            if (map.containsKey(qVarA)) {
                asb.d dVar = (asb.d) r0.h(qVarA, map);
                if (!dVar.b(kVar)) {
                    ViewController viewControllerC = dVar.c(kVar);
                    if (viewControllerC != null) {
                        yji.n.P2(this, viewControllerC, ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
                        return;
                    }
                    return;
                }
                vki.a aVar = this.z;
                int i = j.f316220b[((x) ((j2) aVar.f22677a).getValue()).f316253c.ordinal()];
                if (i == 1) {
                    bVar = qrb.b.QUANTITY;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = qrb.b.AMOUNT;
                }
                X2(aVar, new i(bVar, this, 1));
                return;
            }
        }
        throw new IllegalStateException("No " + o0.f186429a.b(asb.d.class) + " found for instrument type " + nVarN.f214597c);
    }

    @Override // yrb.v
    public final void i3(LargeActionButtonDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.i;
        u uVar = obj2 instanceof u ? (u) obj2 : null;
        if (uVar == null) {
            return;
        }
        V2(new r(this, uVar, null), new yi5.b(29));
    }

    @Override // yrb.v
    public final void j3(InputSliderDelegate.Model model, cy0.a sliderValue) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(sliderValue, "sliderValue");
        Object obj2 = model.f52567m;
        u uVar = obj2 instanceof u ? (u) obj2 : null;
        if (uVar != null && sliderValue.f110015b) {
            float f = sliderValue.f110014a;
            vki.a aVar = this.z;
            ((x) ((j2) aVar.f22677a).getValue()).f.getClass();
            X2(aVar, new h1.a(sliderValue, this, f / 100, uVar));
        }
    }

    @Override // yrb.v
    public final void k3(g6 selectedData) {
        Intrinsics.checkNotNullParameter(selectedData, "selectedData");
        Object obj2 = selectedData.f54200b.f52345g;
        bfl.g gVar = null;
        nel.n nVar = obj2 instanceof nel.n ? (nel.n) obj2 : null;
        if (nVar == null) {
            return;
        }
        String str = selectedData.f54199a;
        if (Intrinsics.f(str, "BUY_TAB_LIST_ID")) {
            gVar = bfl.g.BUY;
        } else if (Intrinsics.f(str, "SELL_TAB_LIST_ID")) {
            gVar = bfl.g.SELL;
        }
        if (gVar != null) {
            X2(this.z, new xwd.o(this, 28, nVar, gVar));
        }
    }

    @Override // yrb.v
    public final void l3(mc model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (((lc) model).f209806a.equals("LEGACY_EXTRA_ACTION_BUTTON_ID")) {
            vki.a aVar = this.z;
            j2 j2Var = (j2) aVar.f22677a;
            j2 j2Var2 = (j2) aVar.f22677a;
            s0 s0Var = ((x) j2Var.getValue()).f316256j;
            if (s0Var != null) {
                nel.n nVar = s0Var.e;
                TradingAccount tradingAccount = s0Var.d;
                qrb.q.Companion.getClass();
                qrb.q qVarA = qrb.p.a(nVar);
                if (qVarA != null) {
                    Map map = this.f316237r;
                    if (map.containsKey(qVarA)) {
                        A2(((asb.d) r0.h(qVarA, map)).e(((x) j2Var2.getValue()).f316252b, nVar, tradingAccount, ((x) j2Var2.getValue()).f316253c, ((x) j2Var2.getValue()).d));
                        return;
                    }
                }
                throw new IllegalStateException("No " + o0.f186429a.b(asb.d.class) + " found for instrument type " + nVar.f214597c);
            }
        }
    }

    public final void m3(Function2 function2, Flow flow) {
        this.f316242y.add(yji.n.l2(this, flow, null, function2, 3));
    }

    public final x n3(String str) {
        this.o.a("advanced-charts-order-idempotency-tag");
        Map mapG = r0.g();
        bfl.g gVar = bfl.g.BUY;
        j0b.e eVar = j0b.e.COLLAPSED;
        qrb.b bVar = qrb.b.AMOUNT;
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return new x(str, gVar, bVar, ZERO, ZERO, new w(0, false), false, null, mapG, null, null, null, new Data(null, null, true, 3, null), eVar, null);
    }

    public final void o3() {
        List list;
        bfl.g gVar;
        Data data = ((x) ((j2) this.z.f22677a).getValue()).f316255h;
        if (data == null || (list = (List) data.getContent()) == null) {
            return;
        }
        if (list.size() <= 1) {
            p3(((hdh.c) d0.b0(list)).f151434a);
            return;
        }
        hdh.e eVar = new hdh.e(list);
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            gVar = bfl.g.SELL;
        } else {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (((hdh.c) it8.next()).f151434a.a()) {
                    gVar = bfl.g.BUY;
                    break;
                }
            }
            gVar = bfl.g.SELL;
        }
        N2(o2(new t2h.h(new t2h.a(gVar, eVar))), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new h(this, 0));
    }

    public final void p3(v0 v0Var) {
        if (!(v0Var instanceof s0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        s0 s0Var = (s0) v0Var;
        nel.n nVar = s0Var.e;
        qrb.q.Companion.getClass();
        qrb.q qVarA = qrb.p.a(nVar);
        if (qVarA != null) {
            Map map = this.f316237r;
            if (map.containsKey(qVarA)) {
                asb.d dVar = (asb.d) r0.h(qVarA, map);
                vki.a aVar = this.z;
                if (!((Boolean) r0.h(nVar.f214596b, ((x) ((j2) aVar.f22677a).getValue()).i)).booleanValue() && !dVar.a()) {
                    A2(dVar.f(((x) ((j2) aVar.f22677a).getValue()).f316252b, nVar, s0Var.d));
                    return;
                }
                X2(aVar, new i(v0Var, dVar, 0));
                Continuation continuation = null;
                m3(new o(4, continuation, this), vkm.q.Q(new v1(new oji.c(5, continuation, aVar.B(new ypd.i(18)))), new m(3, continuation, this)));
                int i = 2;
                m3(new o(i, continuation, this), vkm.q.Q(new t0(aVar.B(new ypd.i(15)), 1), new m(i, continuation, this)));
                m3(new o(5, continuation, this), zi0.c.w(new ymk.u(new v1(new oji.c(4, continuation, aVar.B(new ypd.i(16)))), this, 3)));
                int i2 = 1;
                m3(new o(i2, continuation, this), vkm.q.Q(new v1(new oji.c(4, continuation, aVar.B(new ypd.i(19)))), new m(i2, continuation, this)));
                m3(new o(3, continuation, this), new t0(aVar.B(new ypd.i(17)), 1));
                return;
            }
        }
        throw new IllegalStateException("No " + o0.f186429a.b(asb.d.class) + " found for instrument type " + nVar.f214597c);
    }

    public final BigDecimal q3(float f, qrb.a aVar, int i) {
        int i2 = j.f316220b[((x) ((j2) this.z.f22677a).getValue()).f316253c.ordinal()];
        if (i2 == 1) {
            return pyd.c.Y(pyd.c.N(aVar.f248681a, f));
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        BigDecimal scale = a.a.A(aVar.f248682b, new BigDecimal(String.valueOf(f))).f104717a.setScale(i, RoundingMode.DOWN);
        Intrinsics.h(scale);
        return scale;
    }
}
