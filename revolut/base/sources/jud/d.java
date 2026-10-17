package jud;

import ag1.k;
import android.content.Context;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.apm.breb.impl.ui.qr_request.request.BrebQrRequestScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.cashback.flow.FreelancerCashbackFlowContract$DomainState;
import com.revolut.feature.freelancer.impl.ui.cashback.flow.FreelancerCashbackFlowContract$Step;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.shared.feature.market_data.models.domain.models.Limit;
import efm.r;
import ip0.jl;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jck.y;
import jv0.m;
import jv0.q;
import jv0.x;
import jwf.n;
import jyk.c0;
import jyk.k0;
import jzb.f0;
import jzh.g0;
import jzh.s;
import jzh.s0;
import jzh.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import kwg.l;
import org.jmrtd.cbeff.ISO781611;
import qtc.t;
import vkm.j2;
import wtc.o0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f178653b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f178652a = i;
        this.f178653b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [int] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String strA;
        Object value;
        r rVarW;
        int i = this.f178652a;
        int i2 = 13;
        int i3 = 2;
        ?? r112 = 0;
        int i5 = 1;
        boolean z = false;
        Object obj3 = this.f178653b;
        switch (i) {
            case 0:
                jo3.c cVar = ((e) obj3).f178656c;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * from staking_pockets");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "productId");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stakingBalance");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fiatBalance");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unstakingLockedBalance");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new mud.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), cVar.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3)), cVar.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4)), cVar.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5))));
                        break;
                    }
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return (List) ((jul.e) obj3).f178683b.getValue();
            case 2:
                UiKitPlayerView uiKitPlayerView = (UiKitPlayerView) obj3;
                m mVar = (m) obj2;
                int i6 = UiKitPlayerView.z;
                q qVar = mVar instanceof q ? (q) mVar : null;
                oz0.a aVar = qVar != null ? qVar.f178759a : null;
                if (aVar == null) {
                    return Unit.f186387a;
                }
                int i21 = aVar.f231097a;
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                if (i21 == 2001 || i21 == 2002) {
                    return Unit.f186387a;
                }
                x xVar = uiKitPlayerView.f57707g;
                if (xVar != null) {
                    Context context = uiKitPlayerView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    strA = xVar.a(context);
                } else {
                    strA = null;
                }
                RuntimeException runtimeException = new RuntimeException("PlaybackError " + i21 + " : " + aVar.f231098b + " resource=" + strA, aVar.f231099c);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var);
                return Unit.f186387a;
            case 3:
                jv5.e eVar = (jv5.e) obj3;
                aq6.e result = (aq6.e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof aq6.c) {
                    eVar.L2(eVar.f178778s.a(true));
                }
                return Unit.f186387a;
            case 4:
                com.revolut.feature.freelancer.impl.ui.cashback.flow.c cVar2 = (com.revolut.feature.freelancer.impl.ui.cashback.flow.c) obj3;
                yja.b output = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (((FreelancerCashbackFlowContract$DomainState) ((j2) cVar2.f73747s.f22677a).getValue()).f73737a == jv6.d.DEFAULT || output == yja.b.NEXT_CLICK) {
                    oki.h.u2(cVar2, cVar2.f73748t, FreelancerCashbackFlowContract$Step.Booster.f73739a, null, 6);
                }
                return Unit.f186387a;
            case 5:
                jv6.d boosterArticleMode = (jv6.d) obj3;
                FreelancerCashbackFlowContract$DomainState update = (FreelancerCashbackFlowContract$DomainState) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                Intrinsics.checkNotNullParameter(boosterArticleMode, "boosterArticleMode");
                return new FreelancerCashbackFlowContract$DomainState(boosterArticleMode);
            case 6:
                return jvc.i.a((jvc.i) obj2, false, null, null, null, null, null, false, (o0) obj3, null, false, null, 65023);
            case 7:
                return jvc.i.a((jvc.i) obj2, false, (t) obj3, null, null, null, null, false, null, null, false, null, 65531);
            case 8:
                mw1.g result2 = (mw1.g) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                j2 j2Var = ((com.revolut.feature.apm.breb.impl.ui.qr_request.a) obj3).f61757q;
                do {
                    value = j2Var.getValue();
                } while (!j2Var.h(value, new BrebQrRequestScreenContract$InputData(result2.f209306a, ((BrebQrRequestScreenContract$InputData) value).f61761b)));
                return Unit.f186387a;
            case 9:
                jwc.f update2 = (jwc.f) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return jwc.f.a(update2, (OutboundTransactionLimit) obj3, null, 13);
            case 10:
                ((n) obj3).x2(new y(((Boolean) obj2).booleanValue(), 4));
                return Unit.f186387a;
            case 11:
                jwg.h hVar = (jwg.h) obj3;
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List<WidgetisedAnalyticsType> list = it8;
                ArrayList flows = new ArrayList(w.t(list, 10));
                for (WidgetisedAnalyticsType analyticsType : list) {
                    l lVar = hVar.f179005a;
                    if (hVar.e.g(analyticsType)) {
                        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
                        rVarW = nim.a.w(lVar.f(new jl(lVar, analyticsType, (boolean) r112, i3)), new jwg.a(analyticsType, 0));
                    } else {
                        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
                        rVarW = nim.a.w(lVar.e(analyticsType, new a4b.i(lVar, (boolean) r112, analyticsType, i2)), new jwg.a(analyticsType, 1));
                    }
                    flows.add(new ie7.h(rd0.e.b(rVarW), analyticsType, 20));
                }
                Intrinsics.checkNotNullParameter(flows, "flows");
                Flow[] flowArr = (Flow[]) flows.toArray(new Flow[0]);
                Flow[] flows2 = (Flow[]) Arrays.copyOf(flowArr, flowArr.length);
                Intrinsics.checkNotNullParameter(flows2, "flows");
                return new k((Flow[]) Arrays.copyOf(flows2, flows2.length), 11);
            case 12:
                f6j.b bVar = (f6j.b) ((jxk.e) obj3).i;
                bVar.getClass();
                pfm.h hVar2 = new pfm.h(new a08.d(bVar, 16), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                return hVar2;
            case 13:
                jy2.b bVar2 = (jy2.b) obj3;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                iy2.b bVar3 = (iy2.b) pair.f186385a;
                od0.i iVar = (od0.i) pair.f186386b;
                Intrinsics.h(bVar3);
                Clause clause = (Clause) iVar.f224257a;
                jy2.n nVar = (jy2.n) bVar2.f179307a;
                te0.n nVar2 = nVar.i;
                KProperty[] kPropertyArr = jy2.n.f179315r;
                Integer num = (Integer) ((od0.i) nVar2.getValue(nVar, kPropertyArr[7]).get()).f224257a;
                jy2.n nVar3 = (jy2.n) bVar2.f179307a;
                return new jy2.c(bVar3, clause, num, (Integer) ((od0.i) nVar3.f179320j.getValue(nVar3, kPropertyArr[8]).get()).f224257a, ((Boolean) nVar3.z0().get()).booleanValue());
            case 14:
                NaviCommand it9 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new ufm.c(new fag.g((jyk.g) obj3, it9, 21), i3);
            case 15:
                NaviCommand naviCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
                return new ufm.c(new fag.g((jyk.i) obj3, naviCommand, 22), i3);
            case 16:
                d1l.c it10 = (d1l.c) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return ((jyk.r) obj3).d(it10);
            case 17:
                NaviCommand it11 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                ((jyk.y) obj3).f179513a.c(it11);
                return Unit.f186387a;
            case 18:
                TradingOnboardingFeatureConfig.TradingAccountOrType it12 = (TradingOnboardingFeatureConfig.TradingAccountOrType) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return ((c0) obj3).d(it12);
            case 19:
                NaviCommand it13 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                ((jyk.h0) obj3).f179480a.c(it13);
                return Unit.f186387a;
            case 20:
                NaviCommand it14 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                ((k0) obj3).f179489a.c(it14);
                return Unit.f186387a;
            case 21:
                String str = (String) obj2;
                ((jzb.d) obj3).getClass();
                if (str != null) {
                    String str2 = str.length() + ":" + str;
                    if (str2 != null) {
                        return str2;
                    }
                }
                return "~";
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                ((jzb.n) obj3).getClass();
                ArrayList arrayList2 = new ArrayList(7);
                while (r112 < 7) {
                    arrayList2.add(nb0.b(pb0.Companion, a0.d.n("BONUS_POINTS_ITEM_PREFIX", r112), false, 0, false, 30));
                    r112++;
                }
                return yp0.b.g(arrayList2, jzb.n.a(), null, 0, 0, 126);
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                ((jzb.r) obj3).getClass();
                IntRange intRangeO = kotlin.ranges.f.o(0, 3);
                ArrayList arrayList3 = new ArrayList(w.t(intRangeO, 10));
                vim.f it15 = intRangeO.iterator();
                while (it15.f289625c) {
                    arrayList3.add(nb0.b(pb0.Companion, a0.d.n("CARD_SPEND_ROW_LOADING_LIST_PREFIX", it15.nextInt()), false, 0, false, 30));
                }
                return yp0.b.g(arrayList3, jzb.r.a(), null, 0, 0, 126);
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                ((f0) obj3).getClass();
                ArrayList arrayList4 = new ArrayList(3);
                for (int i22 = 0; i22 < 3; i22++) {
                    arrayList4.add(nb0.b(pb0.Companion, a0.d.n("TOP_UPS_ITEM_PREFIX", i22), false, 0, false, 30));
                }
                return yp0.b.g(arrayList4, f0.a(), null, 0, 0, 126);
            case 25:
                jze.b bVar4 = (jze.b) obj3;
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var2);
                bVar4.C2(new ste.g(e));
                oki.h.D2(bVar4.f179800r);
                return Boolean.TRUE;
            case 26:
                jzh.r update3 = (jzh.r) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return jzh.r.a(update3, null, u.b((u) ((s) obj3), !r15.f179858a, null, null, 6), null, null, null, null, null, ISO781611.SMT_TAG);
            case 27:
                Limit.UsageLimit usageLimit = (Limit.UsageLimit) obj3;
                jzh.r update4 = (jzh.r) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                s sVar = update4.f179848b;
                return (sVar instanceof g0 ? (g0) sVar : null) == null ? update4 : jzh.r.a(update4, null, new g0(usageLimit), null, null, null, null, null, ISO781611.SMT_TAG);
            case 28:
                com.revolut.feature_crypto_order_flow.impl.order_summary.a aVar2 = (com.revolut.feature_crypto_order_flow.impl.order_summary.a) obj3;
                nyh.b output2 = (nyh.b) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2.H2(aVar2.E, new jp3.b(aVar2, output2.f220875a, 29));
                aVar2.l2(new s0(i5, aVar2, z ? 1 : 0), new yi5.b(26));
                return Unit.f186387a;
            default:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (j0d.h) ((k0d.b) obj3).f180013b.get("MEMORY_CACHE_KEY_SUPERVISION_CONFIG");
        }
    }
}
