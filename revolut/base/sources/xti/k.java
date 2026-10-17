package xti;

import com.revolut.feature.payments.profile.impl.ui_kompot.flow.PaymentProfileFlow;
import com.revolut.feature.payments.profile.impl.ui_kompot.lazy_flow.PaymentProfileLazyFlowContract$Step;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.purchase.RevPointsGiftCardPurchaseScreenContract$ModalStep;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.terms_and_conditions.RevPointsGiftcardsTermsAndConditionsScreen;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xv4.m;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f308834a;

    public /* synthetic */ k(int i) {
        this.f308834a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f308834a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(ivi.a.f168867a);
            case 1:
                Throwable error = (Throwable) obj2;
                Pair pair = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (pair == null) {
                    return error;
                }
                return null;
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, "ERROR_LINKED_WALLETS_ITEM_ID", 4, true);
            case 3:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new m(null, (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null)), false);
            case 4:
                Throwable error2 = (Throwable) obj2;
                xi0.b bVar = (xi0.b) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (bVar == null) {
                    return error2;
                }
                return null;
            case 5:
                ((Boolean) obj2).booleanValue();
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 6:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new xvc.m(iii.c.b(null, null, 6, false), f0.f322471a);
            case 8:
                Throwable error3 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list == null) {
                    return error3;
                }
                return null;
            case 9:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null));
            case 10:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 11:
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                PaymentProfileLazyFlowContract$Step step = (PaymentProfileLazyFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof PaymentProfileLazyFlowContract$Step.Profile) {
                    return new PaymentProfileFlow(((PaymentProfileLazyFlowContract$Step.Profile) step).f79646a);
                }
                throw new NoWhenBranchMatchedException();
            case 12:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                RevPointsGiftCardPurchaseScreenContract$ModalStep step2 = (RevPointsGiftCardPurchaseScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof RevPointsGiftCardPurchaseScreenContract$ModalStep.TermsAndConditions) {
                    return new RevPointsGiftcardsTermsAndConditionsScreen(((RevPointsGiftCardPurchaseScreenContract$ModalStep.TermsAndConditions) step2).f83726a);
                }
                throw new NoWhenBranchMatchedException();
            case 13:
                Function1 defaultErrorItemsProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItemsProvider, "defaultErrorItemsProvider");
                return new cii.b(null, (List) defaultErrorItemsProvider.invoke(new iii.d(12, null, true, true, null)), xwb.h.a());
            case 14:
                ((Boolean) obj2).booleanValue();
                if (((Throwable) obj3) != null) {
                    return f0.f322471a;
                }
                return null;
            case 15:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 16:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 17:
                Throwable error4 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list2 == null) {
                    return error4;
                }
                return null;
            case 18:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 19:
                Throwable error5 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list3 == null) {
                    return error5;
                }
                return null;
            case 20:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 21:
                Throwable error6 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list4 == null) {
                    return error6;
                }
                return null;
            case 22:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 23:
                Throwable error7 = (Throwable) obj2;
                List list5 = (List) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (list5 == null) {
                    return error7;
                }
                return null;
            case 24:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 25:
                Throwable error8 = (Throwable) obj2;
                List list6 = (List) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (list6 == null) {
                    return error8;
                }
                return null;
            case 26:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 27:
                Throwable error9 = (Throwable) obj2;
                List list7 = (List) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (list7 == null) {
                    return error9;
                }
                return null;
            case 28:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            default:
                Throwable error10 = (Throwable) obj2;
                List list8 = (List) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (list8 == null) {
                    return error10;
                }
                return null;
        }
    }

    public /* synthetic */ k(xwb.h hVar) {
        this.f308834a = 13;
    }
}
