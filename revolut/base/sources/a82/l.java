package a82;

import com.revolut.core.model.faq.FaqNode;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.model.faq.PigeonNode;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.e9;
import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.list.WithdrawalCodeListScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.OutstandingDebtsV2FlowContract$Step;
import com.revolut.feature.wealth.models.margin.WealthMarginBorrowingInterest;
import com.revolut.feature.wealth.models.margin.WealthMarginBorrowingStatus;
import com.revolut.feature.wealth.models.margin.WealthMarginStatus;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2009a;

    public /* synthetic */ l(int i) {
        this.f2009a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        Data data2;
        WealthMarginBorrowingStatus wealthMarginBorrowingStatus;
        dj0.d dVar;
        zF = false;
        zF = false;
        boolean zF = false;
        switch (this.f2009a) {
            case 0:
                return c.a((c) obj2, null, false, 1);
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                gu guVar = new gu("ID_LOADING_HEADER", 0, 0, 30);
                pb0 pb0VarB = nb0.b(pb0.Companion, "ID_LOADING_ITEM", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                return zhm.v.k(guVar, pb0VarB);
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return d0.E0((List) pair.f186386b, (List) pair.f186385a);
            case 3:
                Data data3 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data3, "data");
                if (data3.getError() != null && data3.getContent() == null) {
                    data = new Data(f0.f322471a, null, false, 6, null);
                } else {
                    if (data3.getContent() != null || data3.getLoading()) {
                        return data3;
                    }
                    data = new Data(f0.f322471a, null, false, 6, null);
                }
                return data;
            case 4:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return d0.E0((List) pair2.f186386b, (List) pair2.f186385a);
            case 5:
                Data data4 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data4, "data");
                if (data4.getError() != null && data4.getContent() == null) {
                    data2 = new Data(f0.f322471a, null, false, 6, null);
                } else {
                    if (data4.getContent() != null || data4.getLoading()) {
                        return data4;
                    }
                    data2 = new Data(f0.f322471a, null, false, 6, null);
                }
                return data2;
            case 6:
                a83.o update = (a83.o) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return a83.o.a(update, null, null, null, null, null, null, null, null, true, null, null, false, null, null, 64511);
            case 7:
                xh9.d it8 = (xh9.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8 instanceof xh9.b);
            case 8:
                return Boolean.valueOf(Intrinsics.f(((AppTipUIModel) obj2).f57725a, "TERMINATED_CARD_TIP_ID"));
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                nb0 nb0Var = pb0.Companion;
                List listK = zhm.v.k(nb0.b(nb0Var, "cards_loading_1", false, 0, false, 30), nb0.b(nb0Var, "cards_loading_2", false, 0, false, 30), nb0.b(nb0Var, "cards_loading_3", false, 0, false, 30), nb0.b(nb0Var, "cards_loading_4", false, 0, false, 30));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                e9 e9Var = new e9("ATM_MAP_LIST_ID", null, true, yv0.j.DP_120, 486);
                yp0.b.l(e9Var, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
                return zhm.u.c(e9Var);
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 15:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 5);
                for (int i = 0; i < 5; i++) {
                    arrayListP.add(new pb0("FAQ_LOADING_ITEM_ID"));
                }
                return p9d.j.b(arrayListP);
            case 16:
                RowDelegate.Model it9 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = WithdrawalCodeListScreen.V;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj3 = it9.u;
                if (obj3 instanceof MultibancoWithdrawalCode) {
                    return (MultibancoWithdrawalCode) obj3;
                }
                return null;
            case 17:
                a92.a update2 = (a92.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return a92.a.a(update2, Data.copy$default(update2.f2296a, null, null, true, 3, null), 0L, 2);
            case 18:
                a92.a it10 = (a92.a) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (List) it10.f2296a.getContent();
            case 19:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new a92.b((List) getDefaultLoadingItems.invoke());
            case 20:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                Pair pair4 = (Pair) pair3.f186385a;
                Pair pair5 = (Pair) pair3.f186386b;
                return new vf0.h(pair4.f186385a, pair4.f186386b, pair5.f186385a, pair5.f186386b);
            case 21:
                a94.r it11 = (a94.r) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(it11.f2329b != null);
            case 22:
                a94.r update3 = (a94.r) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return a94.r.a(update3, null, 1);
            case 23:
                OutstandingDebtsV2FlowContract$Step it12 = (OutstandingDebtsV2FlowContract$Step) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(it12 instanceof OutstandingDebtsV2FlowContract$Step.DebtsHub);
            case 24:
                ArrayList arrayListP2 = kii.e.p((Function0) obj2, "it", 3);
                for (int i2 = 0; i2 < 3; i2++) {
                    arrayListP2.add(new pb0("CARDS_LOADING_ITEM_ID"));
                }
                yp0.b.k(arrayListP2, 0, 0, 0, 0, 31);
                return arrayListP2;
            case 25:
                FaqNodeBase node = (FaqNodeBase) obj2;
                Intrinsics.checkNotNullParameter(node, "node");
                if (node instanceof FaqNode.Category) {
                    return ((FaqNode.Category) node).d;
                }
                if (node instanceof FaqNode.Topic) {
                    return ((FaqNode.Topic) node).e;
                }
                if (node instanceof PigeonNode) {
                    return ((PigeonNode) node).f51438h;
                }
                if (!(node instanceof FaqNode.Article) && !(node instanceof FaqNode.Deeplink)) {
                    throw new NoWhenBranchMatchedException();
                }
                return f0.f322471a;
            case 26:
                od0.i it13 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                WealthMarginStatus wealthMarginStatus = (WealthMarginStatus) it13.g();
                if (wealthMarginStatus != null && (wealthMarginBorrowingStatus = wealthMarginStatus.e) != null && (dVar = wealthMarginBorrowingStatus.f95671b) != null) {
                    zF = dVar.f(dj0.d.e);
                }
                return Boolean.valueOf(zF);
            case 27:
                cfl.u giaMarginProductOnboardingStatus = (cfl.u) obj2;
                Intrinsics.checkNotNullParameter(giaMarginProductOnboardingStatus, "giaMarginProductOnboardingStatus");
                if (!(giaMarginProductOnboardingStatus instanceof cfl.r)) {
                    if (!Intrinsics.f(giaMarginProductOnboardingStatus, cfl.q.f23747a) && !Intrinsics.f(giaMarginProductOnboardingStatus, cfl.s.f23749a) && !Intrinsics.f(giaMarginProductOnboardingStatus, cfl.t.f23750a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                od0.i.Companion.getClass();
                return od0.h.a((WealthMarginBorrowingInterest) obj2);
            default:
                od0.i.Companion.getClass();
                return od0.h.a((WealthMarginStatus) obj2);
        }
    }
}
