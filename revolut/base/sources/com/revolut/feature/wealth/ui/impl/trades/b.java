package com.revolut.feature.wealth.ui.impl.trades;

import ael.d0;
import ael.q0;
import amh.w;
import android.os.Parcelable;
import ang.f;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pricing_plans.upgrade_prompt.api.entry_point.UpgradeEntryPointItemContract$ItemType;
import com.revolut.feature_market_data_api.navigation.HistoricFeeBreakdownFeatureConfig;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import dfl.b0;
import dfl.c0;
import dfl.e0;
import dfl.f0;
import dfl.h0;
import dfl.i0;
import dfl.t;
import dfl.v;
import dfl.z;
import grl.k9;
import i7d.o;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.flow.Flow;
import od0.i;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pij.d1;
import pkf.x;
import plb.g;
import pnh.g0;
import pnh.j;
import pnh.m;
import pnh.r;
import pnh.s;
import rnh.e;
import vkm.q;
import ybl.k;
import ybl.l;
import yhl.d;
import zh9.u0;
import zxd.c;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends h implements m {

    @NotNull
    public static final r Companion = new r();
    public final f A;
    public final o B;
    public final i0 C;
    public final y D;
    public final com.revolut.kompot.navigable.vc.modal.a E;
    public final Lazy F;
    public final ybl.o o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f96051p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f96052q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d0 f96053r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ybl.b f96054s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k f96055t;
    public final tga.k u;
    public final kgm.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f96056w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final fkg.a f96057x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final h8b.a f96058y;
    public final e z;

    public b(j initialState, g0 stateMapper, ybl.o tradingStatementsInteractor, l tradingConfigInteractor, c statementsInteractor, d0 stocksInteractor, ybl.b instrumentTickerInteractor, k tradingAccountsInteractor, tga.k upgradeEntryPointItemsProvider, kgm.c orderQuoteFeeAndLimitsInteractor, d corporateEventsInteractor, fkg.a corporateEventsInstrumentTransformer, h8b.a corporateEventDetailsNavigator, e dialogMapper, f userInteractor, o helpWidgetControllerModelExtension, pnh.k inputData) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(tradingStatementsInteractor, "tradingStatementsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(upgradeEntryPointItemsProvider, "upgradeEntryPointItemsProvider");
        Intrinsics.checkNotNullParameter(orderQuoteFeeAndLimitsInteractor, "orderQuoteFeeAndLimitsInteractor");
        Intrinsics.checkNotNullParameter(corporateEventsInteractor, "corporateEventsInteractor");
        Intrinsics.checkNotNullParameter(corporateEventsInstrumentTransformer, "corporateEventsInstrumentTransformer");
        Intrinsics.checkNotNullParameter(corporateEventDetailsNavigator, "corporateEventDetailsNavigator");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(helpWidgetControllerModelExtension, "helpWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = tradingStatementsInteractor;
        this.f96051p = tradingConfigInteractor;
        this.f96052q = statementsInteractor;
        this.f96053r = stocksInteractor;
        this.f96054s = instrumentTickerInteractor;
        this.f96055t = tradingAccountsInteractor;
        this.u = upgradeEntryPointItemsProvider;
        this.v = orderQuoteFeeAndLimitsInteractor;
        this.f96056w = corporateEventsInteractor;
        this.f96057x = corporateEventsInstrumentTransformer;
        this.f96058y = corporateEventDetailsNavigator;
        this.z = dialogMapper;
        this.A = userInteractor;
        this.B = helpWidgetControllerModelExtension;
        this.C = inputData.f237789a;
        this.D = mra.d.b(this, initialState, stateMapper, null, false, 12);
        this.E = hx7.e.a(this, new g(this, 8));
        this.F = yhm.j.b(new pka.c(28));
    }

    @Override // yji.l
    public final void I1() {
        Flow flowB;
        String str;
        Flow flowY;
        String str2;
        Flow flowY2;
        i0 i0Var = this.C;
        Continuation continuation = null;
        yji.l.a1(this, this.B.Z2(i0Var instanceof b0 ? new i7d.j("holding-trade-details", new TextLocalisedClause(R.string.contact_us, null, null, 14), new i7d.c("topic.stock-lending")) : new i7d.j("holding-trade-details", new TextLocalisedClause(R.string.contact_us, null, null, 14), new i7d.c("topic.trading"))), null, null, new s(this, continuation, 0), 3);
        String strM = i0Var.m();
        xi0.b.Companion.getClass();
        yji.l.a1(this, cp5.d.C(xi0.a.a(strM)) ? new w(q.Q(rd0.e.b(((ael.k) this.f96054s).f(strM)), new x(continuation, this, 7)), 22) : zi0.c.i(new Pair(null, null)), null, null, new s(this, continuation, 1), 3);
        yji.l.a1(this, l.d(this.f96051p), null, null, new s(this, continuation, 2), 3);
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        boolean z = i0Var instanceof dfl.l;
        i iVar = i.f224256b;
        if (z || (i0Var instanceof f0) || (i0Var instanceof dfl.b) || (i0Var instanceof dfl.j) || (i0Var instanceof dfl.g) || (i0Var instanceof dfl.y) || (i0Var instanceof dfl.h) || (i0Var instanceof b0) || (i0Var instanceof dfl.g0) || (i0Var instanceof dfl.d) || (i0Var instanceof z) || (i0Var instanceof dfl.k) || (i0Var instanceof h0) || (i0Var instanceof dfl.c) || (i0Var instanceof v) || (i0Var instanceof dfl.i) || (i0Var instanceof t) || (i0Var instanceof c0) || (i0Var instanceof e0) || (i0Var instanceof dfl.w) || (i0Var instanceof dfl.d0)) {
            flowB = rd0.e.b(this.u.c(UpgradeEntryPointItemContract$ItemType.Transaction.Stocks.f80999a));
        } else {
            if (!(i0Var instanceof dfl.s) && !(i0Var instanceof dfl.e) && !(i0Var instanceof dfl.m)) {
                throw new NoWhenBranchMatchedException();
            }
            i.Companion.getClass();
            flowB = zi0.c.i(iVar);
        }
        yji.l.a1(this, mo3.a.g(flowB, null, new pj9.m(23), 1), null, null, new s(this, continuation, 3), 3);
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        boolean z3 = i0Var instanceof dfl.b;
        if (z3 || (i0Var instanceof dfl.h) || (i0Var instanceof dfl.j) || (i0Var instanceof b0) || (i0Var instanceof dfl.g0) || (i0Var instanceof dfl.d) || (i0Var instanceof z) || (i0Var instanceof v) || (i0Var instanceof dfl.w) || (i0Var instanceof dfl.g) || (i0Var instanceof dfl.y) || z || (i0Var instanceof h0) || (i0Var instanceof dfl.i) || (i0Var instanceof t) || (i0Var instanceof c0) || (i0Var instanceof e0) || (i0Var instanceof dfl.c) || (i0Var instanceof dfl.d0)) {
            str = null;
        } else if (i0Var instanceof f0) {
            str = ((f0) i0Var).f114293b;
        } else if (i0Var instanceof dfl.e) {
            str = ((dfl.e) i0Var).f114262b;
        } else if (i0Var instanceof dfl.k) {
            str = ((dfl.k) i0Var).f114393b;
        } else if (i0Var instanceof dfl.s) {
            str = ((dfl.s) i0Var).f114454b;
        } else {
            if (!(i0Var instanceof dfl.m)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((dfl.m) i0Var).f114429b;
        }
        if (str == null) {
            i.Companion.getClass();
            flowY = zi0.c.i(iVar);
        } else {
            flowY = nim.a.y(nim.a.v(rd0.e.b(this.v.e(str)), new pmj.b(24)), new pmj.b(25));
        }
        yji.l.a1(this, flowY, null, null, new s(this, continuation, 4), 3);
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        if (z3 || (i0Var instanceof dfl.h) || (i0Var instanceof dfl.j) || (i0Var instanceof b0) || (i0Var instanceof dfl.g0) || (i0Var instanceof dfl.d) || (i0Var instanceof z) || (i0Var instanceof v) || (i0Var instanceof dfl.w) || (i0Var instanceof dfl.g) || (i0Var instanceof dfl.y) || z || (i0Var instanceof h0) || (i0Var instanceof dfl.i) || (i0Var instanceof f0) || (i0Var instanceof dfl.e) || (i0Var instanceof dfl.k) || (i0Var instanceof dfl.s) || (i0Var instanceof dfl.m) || (i0Var instanceof dfl.c) || (i0Var instanceof dfl.d0)) {
            str2 = null;
        } else if (i0Var instanceof t) {
            str2 = ((t) i0Var).f114486w;
        } else if (i0Var instanceof c0) {
            str2 = ((c0) i0Var).f114236w;
        } else {
            if (!(i0Var instanceof e0)) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = ((e0) i0Var).v;
        }
        w4l.h hVar = w4l.h.f294642c;
        if (str2 == null) {
            i.Companion.getClass();
            flowY2 = zi0.c.i(iVar);
        } else {
            efm.r rVarCompose = rd0.e.c(nim.a.v(this.f96056w.d(str2, false, hVar), new pmj.b(26)), kotlin.coroutines.g.f186406a).compose(this.f96057x);
            Intrinsics.checkNotNullExpressionValue(rVarCompose, "compose(...)");
            flowY2 = nim.a.y(nim.a.v(boh.f.e(nim.a.v(rd0.e.b(rVarCompose), new pmj.b(27)), new d1(this, 23)), new pmj.b(28)), new pmj.b(22));
        }
        yji.l.a1(this, flowY2, null, null, new s(this, continuation, 5), 3);
        String strG = i0Var.g();
        if (strG != null) {
            yji.l.a1(this, nim.a.A(((q0) this.f96055t).o(strG, hVar), new pmj.b(23)), null, null, new s(this, continuation, 6), 3);
        }
        yji.l.a1(this, this.A.j(hVar), null, null, new s(this, continuation, 7), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // od0.f
    public final void accept(Object obj2) {
        pnh.i action = (pnh.i) obj2;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action.equals(pnh.h.f237782a)) {
            B2();
            return;
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (action.equals(pnh.g.f237774a)) {
            l2(new pe2.l(this, objArr2 == true ? 1 : 0, 19), new yi5.b(26));
            return;
        }
        if (!(action instanceof pnh.e)) {
            if (!(action instanceof pnh.f)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new a(((pnh.f) action).f237771a, this, null, null), new yi5.b(26));
            return;
        }
        CellDetailsActionDelegate.Model model = ((pnh.e) action).f237770a;
        Object obj3 = model.f51787l;
        if (!(obj3 instanceof ChargeBreakdown)) {
            if (!(obj3 instanceof pnh.l)) {
                l2(new a(model.f51781a, this, obj3, null), new yi5.b(26));
                return;
            }
            String str = ((pnh.l) obj3).f237790a;
            if (a0.y(str, "pdf", false)) {
                l2(new pnh.z(this, str, objArr == true ? 1 : 0, 1), new yi5.b(26));
                return;
            } else {
                C1(new ExternalDestination.Browser(str, null));
                return;
            }
        }
        i0 i0Var = this.C;
        String strF = i0Var.f();
        if (strF != null) {
            ChargeBreakdown chargeBreakdown = (ChargeBreakdown) obj3;
            xi0.b bVar = i0Var instanceof dfl.e ? (xi0.b) ((dfl.e) i0Var).f114274t.f186386b : null;
            c4i.a aVar = i0Var instanceof dfl.m ? c4i.a.TRADING_FUND_ORDER : c4i.a.TRADING_ORDER;
            k9 value = k9.Trading;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            Intrinsics.checkNotNullParameter(value, "value");
            C1(u0.c(new HistoricFeeBreakdownFeatureConfig(chargeBreakdown, strF, (z3i.b) null, bVar, false, false, aVar, new AnalyticsProduct.Retail(value), 308)));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.D;
    }
}
