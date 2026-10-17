package sa5;

import ba6.l;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.backend_driven_limits.impl.v2.ui.list.b;
import com.revolut.feature.backend_driven_limits.impl.v2.ui.list.c;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.TravelHotelsPropertyGuestsReviewsScreenContract$ModalStep;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.verification_disclaimer.TravelHotelsReviewVerificationDisclaimerScreen;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState;
import com.revolut.revolut.feature_fourthline_impl.R;
import ddi.f;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import pcd.s;
import sec.g;
import sj6.e;
import sl2.m;
import zhm.f0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261292a;

    public /* synthetic */ a(int i) {
        this.f261292a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f261292a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new ja5.a(yp0.b.g((List) getDefaultErrorItems.invoke(new iii.d(8, null, true, true, "CREDIT_POST_TERMINATION_PLAN_LOADING_ERROR")), c.b(), null, 0, 0, 126));
            case 1:
                Throwable error = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                    return error;
                }
                return null;
            case 2:
                Throwable error2 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list2 == null) {
                    return error2;
                }
                return null;
            case 3:
                Throwable error3 = (Throwable) obj2;
                l lVar = (l) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (lVar == null) {
                    return error3;
                }
                return null;
            case 4:
                Throwable error4 = (Throwable) obj2;
                i iVar = (i) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (iVar == null) {
                    return error4;
                }
                return null;
            case 5:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 6:
                Throwable error5 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list3 == null) {
                    return error5;
                }
                return null;
            case 7:
                Throwable error6 = (Throwable) obj2;
                Map map = (Map) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (map == null) {
                    return error6;
                }
                return null;
            case 8:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, false, true, null));
            case 9:
                Throwable error7 = (Throwable) obj2;
                PaymentCounterpartyInfo paymentCounterpartyInfo = (PaymentCounterpartyInfo) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (paymentCounterpartyInfo == null) {
                    return error7;
                }
                return null;
            case 10:
                Throwable error8 = (Throwable) obj2;
                s sVar = (s) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (sVar == null) {
                    return error8;
                }
                return null;
            case 11:
                Throwable error9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (obj3 == null) {
                    return error9;
                }
                return null;
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 13:
                Throwable error10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error10, "error");
                return error10;
            case 14:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelHotelsPropertyGuestsReviewsScreenContract$ModalStep step = (TravelHotelsPropertyGuestsReviewsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof TravelHotelsPropertyGuestsReviewsScreenContract$ModalStep.Disclaimer) {
                    return new TravelHotelsReviewVerificationDisclaimerScreen();
                }
                throw new NoWhenBranchMatchedException();
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 16:
                Throwable th10 = (Throwable) obj2;
                if (((f) obj3) == null) {
                    return th10;
                }
                return null;
            case 17:
                Throwable error11 = (Throwable) obj2;
                RevPointsPocketState revPointsPocketState = (RevPointsPocketState) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (revPointsPocketState == null) {
                    return error11;
                }
                return null;
            case 18:
                Throwable error12 = (Throwable) obj2;
                Integer num = (Integer) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (num == null) {
                    return error12;
                }
                return null;
            case 19:
                Function1 getErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getErrorItems, "getErrorItems");
                return new g(null, (List) getErrorItems.invoke(new iii.d(14, null, true, false, null)), false);
            case 20:
                Throwable error13 = (Throwable) obj2;
                hha.d dVar = (hha.d) obj3;
                Intrinsics.checkNotNullParameter(error13, "error");
                if (dVar == null) {
                    return error13;
                }
                return null;
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 22:
                Throwable th11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                if (th11 != null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "CryptoOnboardingBannerWidget", null, th11, h0Var);
                }
                return f0.f322471a;
            case 23:
                Throwable th12 = (Throwable) obj2;
                if (((pha.a) obj3) == null) {
                    return th12;
                }
                return null;
            case 24:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new e((List) getDefaultErrorItems3.invoke(new iii.d(12, null, false, true, null)), null, false);
            case 25:
                Throwable error14 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error14, "error");
                if (bool == null) {
                    return error14;
                }
                return null;
            case 26:
                return Boolean.valueOf(((Boolean) obj2).booleanValue() || ((Boolean) obj3).booleanValue());
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new sk4.d(u.c(new FullScreenStateDelegate.Model("id_error_state", new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), null, new TextLocalisedClause(R.string.common_action_retry, null, null, 14), false, null, null, false, 0, 0, 32596)));
            case 28:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new m(c.a.f63214a, b.a.f63212a, (List) getDefaultErrorItems4.invoke(new iii.d(10, null, true, false, "ERROR_STATE_ID")));
            default:
                Throwable error15 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error15, "error");
                if (list4 == null) {
                    return error15;
                }
                return null;
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f261292a = i;
    }
}
