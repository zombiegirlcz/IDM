package k1f;

import com.revolut.feature.apm.core.ui.impl.ui.topup_request.TopupRequestFlowContract$Step;
import com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.TopupRequestDetailsScreen;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.wealth.asset.selection.impl.ui.screens.instrument.InstrumentSelectionController;
import j1f.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k37.o;
import k79.t;
import k7c.i0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180240a;

    public /* synthetic */ n(int i) {
        this.f180240a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f180240a) {
            case 0:
                return Boolean.valueOf(Intrinsics.f(((t0) obj2).f170432c, "PENDING") && ((Integer) obj3).intValue() < 5);
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 2:
                Throwable error = (Throwable) obj2;
                cl4.d dVar = (cl4.d) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (dVar == null) {
                    return error;
                }
                return null;
            case 3:
                Throwable th10 = (Throwable) obj2;
                if (((Pair) obj3) == null) {
                    return th10;
                }
                return null;
            case 4:
                List lastVisibleItems = (List) obj2;
                List currentVisibleItems = (List) obj3;
                InstrumentSelectionController.a aVar = InstrumentSelectionController.Companion;
                Intrinsics.checkNotNullParameter(lastVisibleItems, "lastVisibleItems");
                Intrinsics.checkNotNullParameter(currentVisibleItems, "currentVisibleItems");
                List list = lastVisibleItems;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((koi.j) it8.next()).getF55126b());
                }
                List list2 = currentVisibleItems;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(((koi.j) it9.next()).getF55126b());
                }
                return Boolean.valueOf(arrayList.equals(arrayList2));
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 6:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 7:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null));
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return o.f180639a;
            case 9:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 10:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 11:
                yki.l FlowCoordinator = (yki.l) obj2;
                TopupRequestFlowContract$Step step = (TopupRequestFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof TopupRequestFlowContract$Step.Details) {
                    return new TopupRequestDetailsScreen();
                }
                throw new NoWhenBranchMatchedException();
            case 12:
                Throwable th11 = (Throwable) obj2;
                if (((Loan) obj3) == null) {
                    return th11;
                }
                return null;
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return j6b.d.f171721a;
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 16:
                Throwable error2 = (Throwable) obj2;
                Map map = (Map) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (map == null) {
                    return error2;
                }
                return null;
            case 17:
                Throwable error3 = (Throwable) obj2;
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (juniorBankingProfile == null) {
                    return error3;
                }
                return null;
            case 18:
                Throwable error4 = (Throwable) obj2;
                psg.a aVar2 = (psg.a) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (aVar2 == null) {
                    return error4;
                }
                return null;
            case 19:
                Throwable error5 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list3 == null) {
                    return error5;
                }
                return null;
            case 20:
                Throwable error6 = (Throwable) obj2;
                Map map2 = (Map) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (map2 == null) {
                    return error6;
                }
                return null;
            case 21:
                Throwable error7 = (Throwable) obj2;
                Map map3 = (Map) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (map3 == null) {
                    return error7;
                }
                return null;
            case 22:
                Throwable error8 = (Throwable) obj2;
                SavingsAccountDetails savingsAccountDetails = (SavingsAccountDetails) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (savingsAccountDetails == null) {
                    return error8;
                }
                return null;
            case 23:
                Throwable error9 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (list4 == null) {
                    return error9;
                }
                return null;
            case 24:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return t.b(true);
            case 25:
                Intrinsics.checkNotNullParameter((i0) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((Quote) obj3, "<unused var>");
                int i = jli.h.f175850a;
                return Unit.f186387a;
            case 26:
                Intrinsics.checkNotNullParameter((k7c.t0) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((mec.b) obj3, "<unused var>");
                return Unit.f186387a;
            case 27:
                Throwable error10 = (Throwable) obj2;
                Subaccount subaccount = (Subaccount) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (subaccount == null) {
                    return error10;
                }
                return null;
            case 28:
                Throwable error11 = (Throwable) obj2;
                List list5 = (List) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (list5 == null) {
                    return error11;
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
        }
    }
}
