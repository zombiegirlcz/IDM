package i4h;

import aw0.y4;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.feature_market_data_impl.data.model.OrderQuoteLimitsParams;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import ip0.bo0;
import ip0.c2;
import ip0.d2;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.xk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jel.w2;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158479a;

    public /* synthetic */ q(int i) {
        this.f158479a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        eel.a aVarA;
        switch (this.f158479a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Data dataT = t1.t((Data) pair.f186386b, (Data) pair.f186385a);
                try {
                    Object content = dataT.getContent();
                    if (content != null) {
                        Pair pair2 = (Pair) content;
                        od0.i iVar = (od0.i) pair2.f186385a;
                        eel.a aVar = (eel.a) pair2.f186386b;
                        ArrayList arrayListF1 = zhm.d0.f1(aVar.f125219c);
                        if (iVar.d() && !arrayListF1.isEmpty()) {
                            arrayListF1.set(zhm.v.j(arrayListF1), iVar.c());
                        } else if (iVar.d()) {
                            arrayListF1.add(iVar.c());
                        }
                        aVarA = eel.a.a(aVar, 0L, arrayListF1, 3);
                    } else {
                        aVarA = null;
                    }
                    return new Data(aVarA, dataT.getError(), dataT.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, dataT.getLoading());
                }
            case 1:
                e3h.c it8 = (e3h.c) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f122275g;
            case 2:
                InstrumentTicker it9 = (InstrumentTicker) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.v;
            case 3:
                e3h.c it10 = (e3h.c) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f122278l;
            case 4:
                e3h.c it11 = (e3h.c) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f122277j;
            case 5:
                e3h.c it12 = (e3h.c) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f122275g;
            case 6:
                e3h.c it13 = (e3h.c) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.k;
            case 7:
                return ((e3h.c) obj2).f122275g;
            case 8:
                j59.a it14 = (j59.a) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                Intrinsics.checkNotNullParameter(it14, "<this>");
                return new k59.c(it14.getRate(), new k59.b(l9.l.x(it14.getOrderLimits().getLimitLowerBound()), l9.l.x(it14.getOrderLimits().getLimitUpperBound()), l9.l.x(it14.getOrderLimits().getStopLowerBound()), l9.l.x(it14.getOrderLimits().getStopUpperBound())));
            case 9:
                e8l.d dto = (e8l.d) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                return d8l.d.B(dto);
            case 10:
                Intrinsics.checkNotNullParameter((OrderQuoteLimitsParams) obj2, "it");
                return null;
            case 11:
                List currencyStrings = (List) obj2;
                Intrinsics.checkNotNullParameter(currencyStrings, "currencyStrings");
                List list = currencyStrings;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it15 = list.iterator();
                while (it15.hasNext()) {
                    t61.a.A(xi0.b.Companion, (String) it15.next(), arrayList);
                }
                return zhm.d0.i1(arrayList);
            case 12:
                List list2 = (List) obj2;
                Intrinsics.checkNotNullParameter(list2, "list");
                return Boolean.valueOf(!list2.isEmpty());
            case 13:
                i52.c updateExtraData = (i52.c) obj2;
                Intrinsics.checkNotNullParameter(updateExtraData, "$this$updateExtraData");
                TransferTrustData trustData = com.revolut.feature.transfer.models.transfer.a.b(updateExtraData.f158552b);
                ApmQuote apmQuote = updateExtraData.f158551a;
                Intrinsics.checkNotNullParameter(trustData, "trustData");
                return new i52.c(apmQuote, trustData);
            case 14:
                i52.b it16 = (i52.b) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.e;
            case 15:
                WealthAccount account = (WealthAccount) obj2;
                Intrinsics.checkNotNullParameter(account, "account");
                boolean z = account.getF95255c() == xzg.o0.ACTIVE;
                return new h2b.a(z, z);
            case 16:
                WealthAccount wealthAccount = (WealthAccount) obj2;
                Intrinsics.i(wealthAccount, "null cannot be cast to non-null type com.revolut.feature.wealth.api.domain.model.WealthAccount.Margin");
                return (WealthAccount.Margin) wealthAccount;
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.v.k(nb0.a(pb0.Companion, "margin-trading-settings-loading-item-1", false, 6), new s7("margin-trading-settings-loading-item-2", 0, 0, 0, 0, false, null, 126));
            case 18:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 19:
                jel.c it17 = (jel.c) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                if (it17 instanceof w2) {
                    return (w2) it17;
                }
                return null;
            case 20:
                yoj.a it18 = (yoj.a) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(it18.f315683b == yoj.d.ENABLED);
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                int i = R$attr.uikit_dp18;
                gu guVar = new gu("LIST_ID_LOADING_HEADER_PREFIX_0", i, i, 24);
                ArrayList arrayList2 = new ArrayList(3);
                for (int i2 = 0; i2 < 3; i2++) {
                    bo0 bo0Var = new bo0(a0.d.n("LIST_ID_LOADING_AVATAR_PREFIX_", i2));
                    int i3 = R$attr.uikit_dp0;
                    yp0.b.l(bo0Var, i3, i3, i3, i3, null, false, 48);
                    arrayList2.add(bo0Var);
                }
                gg.c cVar = new gg.c(0);
                g6a.m.Companion.getClass();
                hg hgVar = new hg("LIST_ID_LOADING_SCROLLER", arrayList2, 2, new y4(g6a.e.f140898b), null, cVar, false, false, null, null, 0, 0, 0, 0, 32720);
                int i5 = R$attr.uikit_dp0;
                yp0.b.p(hgVar, i5, R$attr.uikit_dp16, i5, i5);
                int i6 = R$attr.uikit_dp18;
                gu guVar2 = new gu("LIST_ID_LOADING_HEADER_PREFIX_1", i6, i6, 24);
                ArrayList arrayList3 = new ArrayList(12);
                for (int i21 = 0; i21 < 12; i21++) {
                    arrayList3.add(new d2(a0.d.n("LIST_ID_LOADING_AVATAR_PREFIX_", i21), c2.CIRCLE));
                }
                xk xkVar = new xk("LIST_ID_LOADING_GRID", arrayList3, 4, null, null, 56);
                yp0.b.l(xkVar, R$attr.uikit_dp0, 0, 0, 0, null, false, 62);
                return new g6a.l(zhm.v.k(guVar, hgVar, guVar2, xkVar), null, null, null, false, false, 14);
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                gu guVar3 = new gu("LIST_ID_LOADING_HEADER", 0, 0, 30);
                pb0 pb0VarB = nb0.b(pb0.Companion, "LIST_ID_LOADING_SCROLLER", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                return zhm.v.k(guVar3, pb0VarB);
            case 23:
                i6f.t it19 = (i6f.t) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return new vf0.h(it19.o, it19.f158978p, it19.f.f222572a, it19.f158969a);
            case 24:
                Template it20 = (Template) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.k;
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 26:
                i6g.f state = (i6g.f) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                return state.f158995a;
            case 27:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new s7("LOADING_TOTAL_HOLDINGS_LIST_ID", 0, 0, 0, 0, false, null, 126);
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new s7("LOADING_UNREALISED_RETURN_LIST_ID", 0, 0, 0, 0, false, null, 126);
        }
    }

    public /* synthetic */ q(Object obj2, int i) {
        this.f158479a = i;
    }
}
