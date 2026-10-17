package au6;

import android.content.Context;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CandleStickGraphDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.k0;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.FreelancerBanner;
import com.revolut.feature.freelancer.common.models.FreelancerInboundVolume;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_history.RewardsHubChallengeHistoryScreen;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.u20;
import ip0.w20;
import ip0.xc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9520a;

    public /* synthetic */ e2(int i) {
        this.f9520a = i;
    }

    /* JADX WARN: Type inference failed for: r0v96, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        int i = 0;
        switch (this.f9520a) {
            case 0:
                List banners = (List) obj2;
                Intrinsics.checkNotNullParameter(banners, "banners");
                List<com.revolut.feature.freelancer.impl.network.models.s> list = banners;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (com.revolut.feature.freelancer.impl.network.models.s sVar : list) {
                    Map map = ft6.k.f137948a;
                    Intrinsics.checkNotNullParameter(sVar, "<this>");
                    arrayList.add(new FreelancerInboundVolume(sVar.getCurrency(), sVar.getFrom(), sVar.getTo()));
                }
                return arrayList;
            case 1:
                List<com.revolut.feature.freelancer.impl.network.models.q> banners2 = (List) obj2;
                Intrinsics.checkNotNullParameter(banners2, "banners");
                ArrayList arrayList2 = new ArrayList();
                for (com.revolut.feature.freelancer.impl.network.models.q qVar : banners2) {
                    Map map2 = ft6.k.f137948a;
                    Intrinsics.checkNotNullParameter(qVar, "<this>");
                    lr6.b bVar = (lr6.b) le.u1.v(qVar.getBannerType(), ft6.k.f137948a);
                    FreelancerBanner freelancerBanner = bVar != null ? new FreelancerBanner(bVar) : null;
                    if (freelancerBanner != null) {
                        arrayList2.add(freelancerBanner);
                    }
                }
                return arrayList2;
            case 2:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.TRUE;
            case 3:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.TRUE;
            case 4:
                od0.i optionalBoolean = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalBoolean, "optionalBoolean");
                return Boolean.valueOf(Intrinsics.f(optionalBoolean.g(), Boolean.TRUE));
            case 5:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                nb0 nb0Var = pb0.Companion;
                List listK = zhm.v.k(nb0.b(nb0Var, "loadingItemId1", false, 0, false, 30), nb0.b(nb0Var, "loadingItemId2", false, 0, false, 30), nb0.b(nb0Var, "loadingItemId3", false, 0, false, 30), nb0.b(nb0Var, "loadingItemId4", false, 0, false, 30));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 6:
                Context context = (Context) obj2;
                RewardsHubChallengeHistoryScreen.Companion aVar = RewardsHubChallengeHistoryScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(context, "context");
                return new ScreenGridLayoutManager(context, 2, 4);
            case 7:
                av5.f updateState = (av5.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return av5.f.a(updateState, null, null, 13);
            case 8:
                av7.e updateState2 = (av7.e) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                Data data2 = updateState2.f9929b;
                try {
                    Object content = data2.getContent();
                    data = new Data(content != null ? gu7.j1.a((gu7.j1) content, null, null, 3) : null, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                return av7.e.a(updateState2, data);
            case 9:
                Function0 it11 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                aim.e eVarB = zhm.u.b();
                eVarB.add(new gu("LOADING_SUBHEADER_ITEM", 0, R$attr.uikit_dp12, 26));
                ArrayList arrayList3 = new ArrayList(3);
                while (i < 3) {
                    arrayList3.add(new u20(a0.d.n("LOADING_ITEM_", i), w20.ICON_60DP));
                    i++;
                }
                yp0.b.k(arrayList3, R$attr.uikit_dp0, 0, 0, 0, 30);
                zhm.a0.x(arrayList3, eVarB);
                return zhm.u.a(eVarB);
            case 10:
                ec5.b it12 = (ec5.b) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                ec5.a aVar2 = it12.f;
                if (aVar2 != null) {
                    return Boolean.valueOf(aVar2.f124428a);
                }
                return null;
            case 11:
                CandleStickGraphDelegate.a state = (CandleStickGraphDelegate.a) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                od0.h hVar = od0.i.Companion;
                com.revolut.core.ui_kit.delegates.y1 y1Var = state instanceof com.revolut.core.ui_kit.delegates.y1 ? (com.revolut.core.ui_kit.delegates.y1) state : null;
                hVar.getClass();
                return od0.h.a(y1Var);
            case 12:
                avk.m it13 = (avk.m) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.e;
            case 13:
                avk.m it14 = (avk.m) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.e;
            case 14:
                avk.m it15 = (avk.m) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                Data data3 = it15.e;
                if (data3 != null) {
                    return (nel.n) data3.getContent();
                }
                return null;
            case 15:
                Function0 it16 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return avk.p.f10117a;
            case 16:
                Throwable it17 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.getCause();
            case 17:
                ej0.b amount = (ej0.b) obj2;
                k0.a aVar3 = com.revolut.core.ui_kit.models.k0.Companion;
                Intrinsics.checkNotNullParameter(amount, "amount");
                return new MoneyClause(new dj0.d(amount.f126703a.longValue(), amount.f126704b), com.revolut.core.ui_kit.models.k0.f58090c, null, null, 12);
            case 18:
                ej0.b amount2 = (ej0.b) obj2;
                k0.b bVar2 = k0.b.d;
                Intrinsics.checkNotNullParameter(amount2, "amount");
                return new MoneyClause(new dj0.d(amount2.f126703a.longValue(), amount2.f126704b), com.revolut.core.ui_kit.models.k0.f58089b, null, null, 12);
            case 19:
                ej0.b amount3 = (ej0.b) obj2;
                k0.c cVar = k0.c.d;
                Intrinsics.checkNotNullParameter(amount3, "amount");
                return new MoneyClause(mif.a.Q(amount3), com.revolut.core.ui_kit.models.k0.f58089b, null, o9.NON_SENSITIVE, 4);
            case 20:
                ej0.b amount4 = (ej0.b) obj2;
                k0.c cVar2 = k0.c.d;
                Intrinsics.checkNotNullParameter(amount4, "amount");
                return new NumberClause(amount4.f126703a, new NumberClause.Format.Compact(true), null, null, 12);
            case 21:
                ej0.b amount5 = (ej0.b) obj2;
                k0.d dVar = k0.d.d;
                Intrinsics.checkNotNullParameter(amount5, "amount");
                return new MoneyClause(mif.a.P(amount5, amount5.f126703a.scale(), 2), com.revolut.core.ui_kit.models.k0.f58089b, null, o9.NON_SENSITIVE, 4);
            case 22:
                aw1.g update = (aw1.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data aliases = Data.copy$default(update.f10652a, null, null, true, 3, null);
                Intrinsics.checkNotNullParameter(aliases, "aliases");
                return new aw1.g(aliases);
            case 23:
                Function0 loadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(loadingItems, "loadingItems");
                return (List) loadingItems.invoke();
            case 24:
                Function0 it18 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return null;
            case 25:
                Function0 it19 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return zhm.f0.f322471a;
            case 26:
                Function0 it20 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                aim.e eVarB2 = zhm.u.b();
                eVarB2.add(new gu("LOADING_SUBHEADER_ITEM", 0, R$attr.uikit_dp12, 26));
                s7 s7Var = new s7("LOADING_CELL_ITEM", 0, R$attr.uikit_dp12, 0, 0, false, null, 122);
                yp0.b.l(s7Var, R$attr.uikit_dp0, 0, 0, 0, null, false, 62);
                eVarB2.add(s7Var);
                ArrayList arrayList4 = new ArrayList(3);
                while (i < 3) {
                    arrayList4.add(new u20(a0.d.n("LOADING_ITEM_", i), w20.ICON_60DP));
                    i++;
                }
                yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
                zhm.a0.x(arrayList4, eVarB2);
                return zhm.u.c(new xc("LOADING_PAGE", zhm.u.a(eVarB2), 0, null, null, 0, 0, 0, 1020));
            case 27:
                Object obj3 = ((RowDelegate.Model) obj2).u;
                if (obj3 instanceof awk.n) {
                    return (awk.n) obj3;
                }
                return null;
            case 28:
                awk.h update2 = (awk.h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                ?? r06 = update2.f10802a;
                LinkedHashMap assetStatsSelectionStates = new LinkedHashMap(zhm.q0.b(r06.size()));
                Iterator it21 = r06.entrySet().iterator();
                while (it21.hasNext()) {
                    assetStatsSelectionStates.put(((Map.Entry) it21.next()).getKey(), Boolean.FALSE);
                }
                Intrinsics.checkNotNullParameter(assetStatsSelectionStates, "assetStatsSelectionStates");
                return new awk.h(assetStatsSelectionStates);
            default:
                Byte b4 = (Byte) obj2;
                b4.byteValue();
                return a0.d.v(new Object[]{b4}, 1, "%02x", "format(...)");
        }
    }
}
