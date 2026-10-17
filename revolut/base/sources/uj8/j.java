package uj8;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.n6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.BankAccountSwitchingReviewOutScreenContract$ModalStep;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.direct_debits.BankAccountSwitchingDirectDebitsScreen;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.direct_debits.BankAccountSwitchingDirectDebitsScreenContract$InputData;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.kompot.common.R$string;
import hha.e0;
import ip0.zj;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx0.t4;
import um2.m;
import zhm.f0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280540a;

    public /* synthetic */ j(int i) {
        this.f280540a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f280540a) {
            case 0:
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return (List) defaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 1:
                Throwable error = (Throwable) obj2;
                n38.a aVar = (n38.a) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (aVar == null) {
                    return error;
                }
                return null;
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new lw0.a(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, null, null, false, 30);
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                List listC = u.c(new FullScreenStateDelegate.Model("ATM_LOADING_ERROR_ITEM_ID", new TextLocalisedClause(com.revolut.feature.atm.impl.R$string.map_atms_connection_error_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.atm.impl.R$string.map_atms_connection_error_caption, null, null, 14), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_communication, null, null, 6)), new n6(new TextLocalisedClause(com.revolut.feature.atm.impl.R$string.map_atms_error_load_map_button, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, false, 28), zj.REGULAR, false, null, null, null, 1856));
                yp0.b.q(listC, 0, 0, 0, 0, 15);
                return listC;
            case 4:
                Throwable th10 = (Throwable) obj2;
                if (((dj0.d) obj3) == null) {
                    return th10;
                }
                return null;
            case 5:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new uk9.f(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_account_purchases, null, null, 14), (List) getDefaultErrorItems.invoke(new iii.d(12, null, false, true, null)));
            case 6:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(10, null, false, false, "DOCUMENTS_ERROR_LIST_ID"));
            case 7:
                Throwable error2 = (Throwable) obj2;
                e0 e0Var = (e0) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (e0Var == null) {
                    return error2;
                }
                return null;
            case 8:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null));
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 10:
                Throwable th11 = (Throwable) obj2;
                if (((e7l.f) obj3) == null) {
                    return th11;
                }
                return null;
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 12:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, false, false, null));
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 14:
                Function1 defaultErrorItemsAccessor = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItemsAccessor, "defaultErrorItemsAccessor");
                return new um2.i((List) defaultErrorItemsAccessor.invoke(new iii.d(14, null, false, false, null)), -1);
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new m(t4.f210012a, null);
            case 16:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(12, null, false, true, null));
            case 17:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return Boolean.TRUE;
            case 18:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return (List) getDefaultErrorItems6.invoke(new iii.d(12, null, true, true, null));
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 21:
                Throwable error3 = (Throwable) obj2;
                RoboPortfolioInfo roboPortfolioInfo = (RoboPortfolioInfo) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (roboPortfolioInfo == null) {
                    return error3;
                }
                return null;
            case 22:
                Throwable error4 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (iVar == null) {
                    return error4;
                }
                return null;
            case 23:
                Function1 getDefaultErrorItems7 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems7, "getDefaultErrorItems");
                return new uob.i((List) getDefaultErrorItems7.invoke(new iii.d(14, null, false, false, null)), new lw0.h(lw0.i.TITLE_SUBTITLE));
            case 24:
                Throwable error5 = (Throwable) obj2;
                Image image = (Image) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (image == null) {
                    return error5;
                }
                return null;
            case 25:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                BankAccountSwitchingReviewOutScreenContract$ModalStep step = (BankAccountSwitchingReviewOutScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof BankAccountSwitchingReviewOutScreenContract$ModalStep.DirectDebits) {
                    return new BankAccountSwitchingDirectDebitsScreen(new BankAccountSwitchingDirectDebitsScreenContract$InputData(((BankAccountSwitchingReviewOutScreenContract$ModalStep.DirectDebits) step).f64054a));
                }
                throw new NoWhenBranchMatchedException();
            case 26:
                Function1 defaultErrorItem = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItem, "defaultErrorItem");
                return new up2.j(null, (List) defaultErrorItem.invoke(new iii.d(14, null, true, false, null)), false);
            case 27:
                Throwable error6 = (Throwable) obj2;
                CryptoAddress cryptoAddress = (CryptoAddress) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (cryptoAddress == null) {
                    return error6;
                }
                return null;
            case 28:
                Throwable error7 = (Throwable) obj2;
                dj0.d dVar = (dj0.d) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (dVar != null) {
                    return error7;
                }
                return null;
            default:
                Throwable error8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error8, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error8, h0Var);
                return null;
        }
    }

    public /* synthetic */ j(Object obj2, int i) {
        this.f280540a = i;
    }
}
