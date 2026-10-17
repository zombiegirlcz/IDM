package q3d;

import aw0.n6;
import bw0.m;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.models.rev10.LoanState;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.LoanPartialRepaymentController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import com.revolut.feature.gif_view.impl.screen.GifViewScreen;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.search.PaymentsSearchScreen;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.y;
import ip0.yl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import q43.s;
import q64.q;
import q6h.j;
import t4a.l;
import x33.e;
import yhm.r;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241956a;

    public /* synthetic */ i(int i) {
        this.f241956a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f241956a) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return v1d.h.f285297a;
            case 1:
                q42.e update = (q42.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data data = Data.copy$default(update.f241996a, null, null, true, 3, null);
                Intrinsics.checkNotNullParameter(data, "data");
                return new q42.e(data);
            case 2:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                gu guVar = new gu("ID_LOADING_HEADER", 0, 0, 30);
                pb0 pb0VarB = nb0.b(pb0.Companion, "ID_LOADING_ITEM", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                return v.k(guVar, pb0VarB);
            case 3:
                s updateState = (s) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return s.a(updateState, null, null, null, null, null, null, e.b.f302639a, null, null, null, 3967);
            case 4:
                s updateState2 = (s) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return s.a(updateState2, null, null, null, null, null, null, e.a.f302638a, null, null, null, 3967);
            case 5:
                q49.c update2 = (q49.c) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return q49.c.a(update2, null, null, null, 0, 11);
            case 6:
                y it10 = (y) obj2;
                KProperty[] kPropertyArr = PaymentsSearchScreen.f80124a0;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (WhoToTransferFilter) it10.f167226b.f58324n;
            case 7:
                ReferralContactDelegate.Model it11 = (ReferralContactDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = PaymentsSearchScreen.f80124a0;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f53167l;
            case 8:
                RowDelegate.Model it12 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = PaymentsSearchScreen.f80124a0;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.u;
            case 9:
                FullScreenStateDelegate.Model it13 = (FullScreenStateDelegate.Model) obj2;
                KProperty[] kPropertyArr4 = PaymentsSearchScreen.f80124a0;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.k;
            case 10:
                Data results = (Data) obj2;
                Intrinsics.checkNotNullParameter(results, "results");
                l lVar = (l) results.getContent();
                return Boolean.valueOf((lVar != null && lVar.f) || !results.getLoading());
            case 11:
                q4a.f update3 = (q4a.f) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return q4a.f.a(update3, false, false, null, null, null, false, null, null, 479);
            case 12:
                return q4a.f.a((q4a.f) obj2, false, false, null, null, null, false, null, null, 255);
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                gu guVar2 = new gu("INVESTMENTS_WIDGET_LOADING_HEADER", 0, 0, 30);
                IntRange intRangeO = kotlin.ranges.f.o(0, 2);
                ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
                vim.f it14 = intRangeO.iterator();
                while (it14.f289625c) {
                    arrayList.add(nb0.b(pb0.Companion, a0.d.n("INVESTMENTS_WIDGET_LOADING_ITEM_", it14.nextInt()), false, 0, false, 30));
                }
                aim.e eVarB = u.b();
                eVarB.add(guVar2);
                eVarB.addAll(arrayList);
                aim.e eVarA = u.a(eVarB);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                return eVarA;
            case 14:
                q56.k it15 = (q56.k) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f242303a;
            case 15:
                return q56.k.a((q56.k) obj2, null, null, null, false, 7);
            case 16:
                return q56.k.a((q56.k) obj2, null, null, null, true, 7);
            case 17:
                q5g.s update4 = (q5g.s) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return q5g.s.a(update4, null, null, null, null, new Data(null, null, true, 3, null), null, false, null, 479);
            case 18:
                q5g.s update5 = (q5g.s) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return q5g.s.a(update5, null, null, null, null, null, null, !update5.f242390h, null, 383);
            case 19:
                Function0 it16 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                pb0 pb0VarA = nb0.a(pb0.Companion, "LOADING_BANNER_LIST_ID", false, 6);
                yp0.b.l(pb0VarA, 0, 0, 0, 0, null, false, 63);
                return u.c(pb0VarA);
            case 20:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new q((List) getDefaultLoadingItems.invoke());
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                aim.e eVarB2 = u.b();
                eVarB2.add(new yl("loading_header", 0, 30));
                eVarB2.add(new s7("loading_1", 0, 0, 0, 0, false, null, 126));
                eVarB2.add(new s7("loading_2", 0, 0, 0, 0, false, null, 126));
                eVarB2.add(new s7("loading_3", 0, 0, 0, 0, false, null, 126));
                aim.e eVarA2 = u.a(eVarB2);
                yp0.b.k(eVarA2, 0, 0, 0, 0, 31);
                return eVarA2;
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return Boolean.FALSE;
            case 23:
                KProperty[] kPropertyArr5 = GifViewScreen.Q;
                return Unit.f186387a;
            case 24:
                Function0 it17 = (Function0) obj2;
                j.a aVar = q6h.j.Companion;
                Intrinsics.checkNotNullParameter(it17, "it");
                return q6h.j.a(true);
            case 25:
                Function0 it18 = (Function0) obj2;
                j.a aVar2 = q6h.j.Companion;
                Intrinsics.checkNotNullParameter(it18, "it");
                return q6h.j.a(true);
            case 26:
                n6 it19 = (n6) obj2;
                KProperty[] kPropertyArr6 = LoanPartialRepaymentController.X;
                Intrinsics.checkNotNullParameter(it19, "it");
                return new yx4.b("FOOTER_BUTTON", null, null);
            case 27:
                CenteredAmountDelegate.Model it20 = (CenteredAmountDelegate.Model) obj2;
                KProperty[] kPropertyArr7 = LoanPartialRepaymentController.X;
                Intrinsics.checkNotNullParameter(it20, "it");
                m mVar = it20.e;
                return new yx4.b("", mVar != null ? mVar.e : null, null);
            case 28:
                Intrinsics.checkNotNullParameter((r) obj2, "<destruct>");
                return Boolean.valueOf(!(((LoanDetails) r1.f314202b).f70144a.i instanceof LoanState.Repaid));
            default:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new q75.e((Loan) rVar.f314201a, (LoanDetails) rVar.f314202b, (LoanRepaymentAccountModelExtension.RepaymentAccountState) rVar.f314203c);
        }
    }

    public /* synthetic */ i(Object obj2, int i) {
        this.f241956a = i;
    }
}
