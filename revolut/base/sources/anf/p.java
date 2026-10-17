package anf;

import com.revolut.core.error.data.model.UnknownApiError;
import com.revolut.core.ui_kit.chat.prompt.ChatPromptSuggestion;
import com.revolut.core.ui_kit.chat.prompt.ChatPromptView;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.TransferWidgetCustomisationScreenContract$BottomSheetState;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import ip0.p20;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zod.n0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7745a;

    public /* synthetic */ p(int i) {
        this.f7745a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f7745a;
        od0.i iVar = od0.i.f224256b;
        switch (i) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return new Data(null, error, false, 5, null);
            case 1:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new whf.p((List) rVar.f314201a, (k71.q) rVar.f314202b, (whf.a) rVar.f314203c);
            case 2:
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                return new Data(null, error2, false, 5, null);
            case 3:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 4:
                co3.a it8 = (co3.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new co3.a(it8.f25486a, it8.f25487b);
            case 5:
                zlg.n usernameData = (zlg.n) obj2;
                Intrinsics.checkNotNullParameter(usernameData, "usernameData");
                int size = usernameData.f323260a - usernameData.f323261b.size();
                return Integer.valueOf(size >= 0 ? size : 0);
            case 6:
                List registeredIdentitiesInfo = (List) obj2;
                Intrinsics.checkNotNullParameter(registeredIdentitiesInfo, "registeredIdentitiesInfo");
                return Boolean.valueOf(registeredIdentitiesInfo.size() > 1);
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 8:
                TradingLegalEntityInformation it9 = (TradingLegalEntityInformation) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                hel.b bVar = it9.f105106a;
                switch (bVar == null ? -1 : anh.r.f7799a[bVar.ordinal()]) {
                    case -1:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        z = false;
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                    case 2:
                        break;
                }
                return Boolean.valueOf(z);
            case 9:
                List assets = (List) obj2;
                Intrinsics.checkNotNullParameter(assets, "assets");
                List listV0 = d0.V0(assets, 3);
                List<enh.a> list = listV0;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (enh.a aVar : list) {
                    arrayList.add(new p5d.b(aVar.f127830a.a(), zi0.c.N(aVar.f127830a), null));
                }
                return new anh.g(arrayList, listV0);
            case 10:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 11:
                String code = (String) obj2;
                Intrinsics.checkNotNullParameter(code, "code");
                UnknownApiError unknownApiError = new UnknownApiError(code);
                Set setW = m72.b.w("server_error_code", code);
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, unknownApiError, setW);
                return Unit.f186387a;
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                Intrinsics.checkNotNullParameter("ID_PLAN", "listId");
                int i2 = R$attr.uikit_dp16;
                p20 p20Var = new p20();
                p20Var.f165757a = c.d.f249513a;
                p20Var.f165758b = i2;
                p20Var.f165759c = i2;
                p20Var.d = i2;
                p20Var.e = i2;
                p20Var.f = null;
                p20Var.f165760g = null;
                p20Var.f165761h = null;
                p20Var.i = null;
                return zhm.u.c(p20Var);
            case 13:
                oga.g it10 = (oga.g) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it10);
            case 14:
                oga.g it11 = (oga.g) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it11);
            case 15:
                PricingPlanSubscription it12 = (PricingPlanSubscription) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                hha.d dVar = it12.f81129a;
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                return Boolean.valueOf(hha.s.p(dVar));
            case 16:
                snb.b it13 = (snb.b) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it13);
            case 17:
                qib.i it14 = (qib.i) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it14);
            case 18:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 19:
                do3.n it15 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return do3.q.y(it15);
            case 20:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 21:
                ChatPromptView.Companion aVar2 = ChatPromptView.INSTANCE;
                Object obj3 = ((RowDelegate.Model) obj2).u;
                if (obj3 instanceof ChatPromptSuggestion) {
                    return (ChatPromptSuggestion) obj3;
                }
                return null;
            case 22:
                List cryptoAddresses = (List) obj2;
                Intrinsics.checkNotNullParameter(cryptoAddresses, "cryptoAddresses");
                List<CryptoAddress> list2 = cryptoAddresses;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                for (CryptoAddress cryptoAddress : list2) {
                    arrayList2.add(new zk5.a(cryptoAddress.f71059a, CryptoAddress.e(cryptoAddress, 0, 3).f186223a, cryptoAddress.f71061c));
                }
                int iB = q0.b(zhm.w.t(arrayList2, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj4 : arrayList2) {
                    linkedHashMap.put(((zk5.a) obj4).f322905a, obj4);
                }
                int iB2 = q0.b(zhm.w.t(arrayList2, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
                for (Object obj5 : arrayList2) {
                    linkedHashMap2.put(((zk5.a) obj5).f322907c, obj5);
                }
                return new zk5.c(linkedHashMap, linkedHashMap2);
            case 23:
                Function0 defaultItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultItems, "defaultItems");
                return (List) defaultItems.invoke();
            case 24:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 25:
                List optionals = (List) obj2;
                Intrinsics.checkNotNullParameter(optionals, "optionals");
                ArrayList arrayList3 = new ArrayList();
                Iterator it16 = optionals.iterator();
                while (it16.hasNext()) {
                    n0 n0Var = (n0) ((od0.i) it16.next()).f224257a;
                    if (n0Var != null) {
                        arrayList3.add(n0Var);
                    }
                }
                return arrayList3;
            case 26:
                JuniorBankingProfile profile = (JuniorBankingProfile) obj2;
                Intrinsics.checkNotNullParameter(profile, "profile");
                return profile.f77099b;
            case 27:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return "";
            case 28:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new aqb.e((ejb.b) pair.f186385a, (uib.a) pair.f186386b);
            default:
                aqb.f updateState = (aqb.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return aqb.f.a(updateState, TransferWidgetCustomisationScreenContract$BottomSheetState.SelectAccount.f83390a, null, false, null, null, 30);
        }
    }

    public /* synthetic */ p(Object obj2, int i) {
        this.f7745a = i;
    }
}
