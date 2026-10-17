package hy2;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.LayoutDirection;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.card_management.impl.cardagreements.screens.disposable_card_info.DisposableCardInfoScreen;
import com.revolut.feature.card_management.impl.cardagreements.screens.overview.CardIssuanceAgreementsScreenContract$ModalStep;
import com.revolut.feature_crypto_order_details.impl.ui.details.CryptoOrderDetailsController;
import com.revolut.feature_crypto_order_details.impl.ui.pager.CryptoOrderDetailsPagerFlowContract$OrderPage;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState;
import hz2.p;
import i2k.m;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1c.m0;
import zhm.f0;
import zw7.d0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156692a;

    public /* synthetic */ b(int i) {
        this.f156692a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f156692a) {
            case 0:
                Throwable error = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                    return error;
                }
                return null;
            case 1:
                Throwable error2 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list2 == null) {
                    return error2;
                }
                return null;
            case 2:
                Throwable th10 = (Throwable) obj2;
                if (((String) obj3) == null) {
                    return th10;
                }
                return null;
            case 3:
                Throwable error3 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list3 == null) {
                    return error3;
                }
                return null;
            case 4:
                Throwable error4 = (Throwable) obj2;
                xzg.k kVar = (xzg.k) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (kVar == null) {
                    return error4;
                }
                return null;
            case 5:
                Throwable error5 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list4 == null) {
                    return error5;
                }
                return null;
            case 6:
                Throwable error6 = (Throwable) obj2;
                List list5 = (List) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list5 == null) {
                    return error6;
                }
                return null;
            case 7:
                ali.b PagerCoordinator = (ali.b) obj2;
                CryptoOrderDetailsPagerFlowContract$OrderPage page = (CryptoOrderDetailsPagerFlowContract$OrderPage) obj3;
                Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                Intrinsics.checkNotNullParameter(page, "page");
                return new CryptoOrderDetailsController(page.a());
            case 8:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((pxk.b) obj3, "<unused var>");
                return Unit.f186387a;
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new p(hz2.b.a(), false);
            case 10:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CardIssuanceAgreementsScreenContract$ModalStep step = (CardIssuanceAgreementsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof CardIssuanceAgreementsScreenContract$ModalStep.ShowDisposableCardInfo) {
                    return new DisposableCardInfoScreen();
                }
                throw new NoWhenBranchMatchedException();
            case 11:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null));
            case 12:
                Throwable error7 = (Throwable) obj2;
                d0 d0Var = (d0) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (d0Var == null) {
                    return error7;
                }
                return null;
            case 13:
                Throwable error8 = (Throwable) obj2;
                RevPointsPocketState revPointsPocketState = (RevPointsPocketState) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (revPointsPocketState == null) {
                    return error8;
                }
                return null;
            case 14:
                Throwable th11 = (Throwable) obj2;
                if (((m0) obj3) == null) {
                    return th11;
                }
                return null;
            case 15:
                Throwable th12 = (Throwable) obj2;
                if (((cue.d) obj3) == null) {
                    return th12;
                }
                return null;
            case 16:
                Throwable th13 = (Throwable) obj2;
                if (((t61.g) obj3) == null) {
                    return th13;
                }
                return null;
            case 17:
                Throwable error9 = (Throwable) obj2;
                List list6 = (List) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (list6 != null) {
                    return error9;
                }
                return null;
            case 18:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 19:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 20:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 21:
                return Integer.valueOf(Arrangement.spacedBy_0680j_4$lambda$0(((Integer) obj2).intValue(), (LayoutDirection) obj3));
            case 22:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return Boolean.FALSE;
            case 23:
                Throwable error10 = (Throwable) obj2;
                List list7 = (List) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (list7 == null) {
                    return error10;
                }
                return null;
            case 24:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 26:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null));
            case 27:
                Throwable error11 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (model == null) {
                    return error11;
                }
                return null;
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new m(null, iii.c.b(null, null, 6, false));
        }
    }
}
