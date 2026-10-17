package ft4;

import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.feature.kyc.impl.choosedocument.ChooseDocumentKycFragment;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137932a;

    public /* synthetic */ w(int i) {
        this.f137932a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f137932a) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 1:
                od0.i it8 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (ql4.e) it8.c();
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                u uVarB = l0.b();
                aim.e eVarB = zhm.u.b();
                gu guVar = new gu("id_instalment_transactions_loading_header", R$attr.uikit_dp16, R$attr.uikit_dp8, 24);
                nb0 nb0Var = pb0.Companion;
                pb0 pb0VarB = nb0.b(nb0Var, "id_instalment_transactions_loading_item_1", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
                pb0 pb0VarB2 = nb0.b(nb0Var, "id_instalment_transactions_loading_item_2", false, 0, false, 30);
                yp0.b.l(pb0VarB2, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
                eVarB.addAll(zhm.v.k(guVar, pb0VarB, pb0VarB2));
                return new v(uVarB, zhm.u.a(eVarB), s.f137926a, false);
            case 3:
                rlm.f Json = (rlm.f) obj2;
                Lazy lazy = fta.i.f138007a;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255101c = true;
                Json.f255100b = false;
                return Unit.f186387a;
            case 4:
                TradingLegalEntityInformation it9 = (TradingLegalEntityInformation) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                hel.b bVar = it9.f105106a;
                switch (bVar == null ? -1 : ftk.a.f138029a[bVar.ordinal()]) {
                    case -1:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                    case 2:
                        z = true;
                        break;
                }
                return Boolean.valueOf(z);
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 7:
                FreelancerAccountOnboardingState it10 = (FreelancerAccountOnboardingState) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return com.revolut.feature.freelancer.common.models.a.e(it10);
            case 8:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new fu6.n((List) getDefaultLoadingItems.invoke());
            case 9:
                SelectableDelegate.Model it11 = (SelectableDelegate.Model) obj2;
                int i = ChooseDocumentKycFragment.f77588n0;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (CellDetailsListDelegate.Model) it11.f53305b;
            case 10:
                SelectableDelegate.Model it12 = (SelectableDelegate.Model) obj2;
                int i2 = ChooseDocumentKycFragment.f77588n0;
                Intrinsics.checkNotNullParameter(it12, "it");
                return (RowDelegate.Model) it12.f53305b;
            case 11:
                int i3 = ChooseDocumentKycFragment.f77588n0;
                Intrinsics.checkNotNullParameter((PromptMarketingContentDelegate.Model) obj2, "it");
                return Unit.f186387a;
            case 12:
                fu8.a behavior = (fu8.a) obj2;
                Intrinsics.checkNotNullParameter(behavior, "behavior");
                return behavior.f();
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 14:
                yoj.a feature = (yoj.a) obj2;
                Intrinsics.checkNotNullParameter(feature, "feature");
                return Boolean.valueOf(yoj.b.k(feature) || yoj.b.l(feature));
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return nb0.b(pb0.Companion, "PAYMENT_METHOD_PAYMENT_METHODS_LIST_ID", false, 0, false, 30);
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 18:
                mel.p it13 = (mel.p) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.d;
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 25:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new fv4.e((List) pair.f186385a, (wi0.b) pair.f186386b);
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                fv4.p pVar = new fv4.p(null, zhm.f0.f322471a);
                IntRange intRange = new IntRange(1, 5, 1);
                ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it14 = intRange.iterator();
                while (it14.f289625c) {
                    arrayList.add(new com.revolut.core.ui_kit.views.q(a0.d.n("id_credit_card_statement_hub_loading_", it14.nextInt()), Tabs.c.a.f58897a, 50));
                }
                return new fv4.q(pVar, new fv4.o(null, arrayList));
            case 27:
                fv6.g update = (fv6.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return fv6.g.a(update, null, null, null, !update.d, 7);
            case 28:
                fv6.g update2 = (fv6.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return fv6.g.a(update2, null, null, null, false, 7);
            default:
                List pages = (List) obj2;
                Intrinsics.checkNotNullParameter(pages, "pages");
                ArrayList arrayList2 = new ArrayList();
                Iterator it15 = pages.iterator();
                while (it15.hasNext()) {
                    zhm.a0.x(((pr6.q) it15.next()).f238959a, arrayList2);
                }
                return arrayList2;
        }
    }

    public /* synthetic */ w(Object obj2, int i) {
        this.f137932a = i;
    }
}
