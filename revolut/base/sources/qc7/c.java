package qc7;

import aw0.y4;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeCompleteCriteria;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeReward;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeState;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import ip0.bo0;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.qi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k3l.j;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import qce.q0;
import rp0.p0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244585a;

    public /* synthetic */ c(int i) {
        this.f244585a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = 26;
        int i2 = 24;
        switch (this.f244585a) {
            case 0:
                bla.c it8 = (bla.c) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8 == bla.c.ENABLED);
            case 1:
                Data it9 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf((it9.getLoading() && it9.getContent() == null) ? false : true);
            case 2:
                Data walletProfiles = (Data) obj2;
                Intrinsics.checkNotNullParameter(walletProfiles, "walletProfiles");
                List list = (List) walletProfiles.getContent();
                if (list == null) {
                    return f0.f322471a;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it10 = list2.iterator();
                while (it10.hasNext()) {
                    arrayList.add(((psg.a) it10.next()).f239484a);
                }
                return arrayList;
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new Pair(u.c(new qi("LIST_ID_LOADING_TABS", 5)), Boolean.FALSE);
            case 4:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return null;
            case 6:
                JuniorBankingProfile it11 = (JuniorBankingProfile) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f77099b;
            case 7:
                Function0 defaultFactory = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                List listV0 = d0.V0((Iterable) defaultFactory.invoke(), 1);
                yp0.b.k(listV0, 0, R$attr.uikit_dp24, 0, 0, 29);
                return i2b.a.o(listV0, qce.d.a());
            case 8:
                Intrinsics.checkNotNullParameter((p0.a) obj2, "it");
                return q0.NO_OUTSTANDING_LOAN;
            case 9:
                aii.u destination = (aii.u) obj2;
                Intrinsics.checkNotNullParameter(destination, "destination");
                if (destination instanceof KompotDestination) {
                    return new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) destination, false, (Integer) null, 0, 61));
                }
                if (destination instanceof BridgeDestination) {
                    return ((BridgeDestination) destination).f98270a;
                }
                throw new IllegalArgumentException("Not supported destination: " + destination);
            case 10:
                Intrinsics.checkNotNullParameter((p0.a) obj2, "it");
                return q0.OUTSTANDING_LOAN;
            case 11:
                j dialogResult = (j) obj2;
                Intrinsics.checkNotNullParameter(dialogResult, "dialogResult");
                return Boolean.valueOf(Intrinsics.f(dialogResult.a().getF104385a(), "BUTTON_CANCEL_CONFIRMATION_DIALOG_ID"));
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return null;
            case 13:
                JuniorBankingProfile it12 = (JuniorBankingProfile) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f77099b;
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                gu guVar = new gu("FAVORITE_V2_LOADING_RECENTLY_SAVED_HEADER", 0, R$attr.uikit_dp12, 26);
                ArrayList arrayList2 = new ArrayList(2);
                for (int i3 = 0; i3 < 2; i3++) {
                    bo0 bo0Var = new bo0(a0.d.n("FAVORITE_V2_LOADING_RECENTLY_SAVED_SCROLLER_", i3));
                    yp0.b.l(bo0Var, 0, 0, 0, 0, null, false, 63);
                    arrayList2.add(bo0Var);
                }
                List listK = v.k(guVar, new hg("FAVORITE_V2_LOADING_RECENTLY_SAVED_SCROLLER", arrayList2, 2, new y4(qcg.g.f244785b), null, null, false, false, null, null, 0, 0, 0, 0, 32752));
                aim.e eVarB = u.b();
                eVarB.add(new gu("FAVORITE_V2_LOADING_LOCATIONS_HEADER", R$attr.uikit_dp24, R$attr.uikit_dp12, 24));
                ArrayList arrayList3 = new ArrayList(2);
                for (int i5 = 0; i5 < 2; i5++) {
                    arrayList3.add(nb0.b(pb0.Companion, a0.d.n("FAVORITE_V2_LOADING_LOCATIONS_HEADER_", i5), false, R$attr.uikit_dp16, false, 24));
                }
                yp0.b.k(arrayList3, R$attr.uikit_dp0, 0, 0, 0, 30);
                eVarB.addAll(arrayList3);
                return d0.E0(u.a(eVarB), listK);
            case 15:
                qe0.e data = (qe0.e) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return new Data(data.a(), null, false, 6, null);
            case 16:
                Data data2 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                return Data.copy$default(data2, null, null, data2.getLoading() || data2.getError() != null, 3, null);
            case 17:
                Data data3 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data3, "data");
                return Boolean.valueOf(!data3.getLoading());
            case 18:
                Data data4 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data4, "data");
                return Data.copy$default(data4, null, null, data4.getLoading() || data4.getError() != null, 3, null);
            case 19:
                Data data5 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data5, "data");
                return Boolean.valueOf(!data5.getLoading());
            case 20:
                Intrinsics.checkNotNullParameter((Data) obj2, "it");
                return Boolean.TRUE;
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB2 = u.b();
                List listC = u.c(CounterTextDelegate.Model.Companion.b(CounterTextDelegate.Model.INSTANCE, "reservation_details_details", null, 0, 0, 0, 0, 126));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                eVarB2.addAll(listC);
                List listC2 = u.c(nb0.a(pb0.Companion, "reservation_details_address", true, 4));
                yp0.b.k(listC2, 0, 0, 0, 0, 31);
                eVarB2.addAll(listC2);
                return u.a(eVarB2);
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new qeg.i(f0.f322471a);
            case 24:
                return ChecklistChallengeReward.Unknown.INSTANCE.serializer();
            case 25:
                return ChecklistChallengeState.Unknown.INSTANCE.serializer();
            case 26:
                return ChecklistChallengeCompleteCriteria.Unknown.INSTANCE.serializer();
            case 27:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                tlm.e eVar = Json.f255103h;
                tlm.f fVar = new tlm.f();
                kotlin.jvm.internal.p0 p0Var = o0.f186429a;
                fVar.b(p0Var.b(ChecklistChallengeReward.class), new c(i2));
                fVar.b(p0Var.b(ChecklistChallengeState.class), new c(25));
                fVar.b(p0Var.b(ChecklistChallengeCompleteCriteria.class), new c(i));
                Unit unit = Unit.f186387a;
                tlm.d dVarA = tlm.h.a(eVar, fVar.a());
                Intrinsics.checkNotNullParameter(dVarA, "<set-?>");
                Json.f255103h = dVarA;
                return Unit.f186387a;
            case 28:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return "CACHE_KEY_CRYPTO_GIFTED_ASSETS";
            default:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
        }
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f244585a = i;
    }
}
