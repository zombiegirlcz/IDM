package u4i;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.cashback.api.models.CashbackBySources;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.overdraft.impl.ui.details.OverdraftDetailsScreenContract$ModalStep;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeResult;
import com.revolut.retail.feature.crypto_deposits.api.models.CryptoDepositAddress;
import com.revolut.retail.feature.payments.payment_links.impl.ui.details.PaymentLinkNotActiveException;
import com.revolut.shared.feature.offboarding.impl.flow.OffboardingFlowContract$Step;
import com.revolut.shared.feature.offboarding.impl.ui.home.OffboardingScreen;
import ip0.w60;
import ip0.x60;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class u implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f277365a;

    public /* synthetic */ u(int i) {
        this.f277365a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f277365a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 1:
                Throwable error = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (model == null) {
                    return error;
                }
                return null;
            case 2:
                Throwable error2 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model2 = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (model2 == null) {
                    return error2;
                }
                return null;
            case 3:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null));
            case 4:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return hx7.a.p(getDefaultErrorItems3);
            case 5:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new u7k.h(((Throwable) obj2) instanceof PaymentLinkNotActiveException ? f0.f322471a : (List) getDefaultErrorItems4.invoke(new iii.d(12, null, true, true, null)), u7k.d.f277953a);
            case 6:
                Function1 defaultErrorItemsProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItemsProvider, "defaultErrorItemsProvider");
                return (List) defaultErrorItemsProvider.invoke(new iii.d(12, null, true, true, null));
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 8:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 9:
                Throwable error3 = (Throwable) obj2;
                bcb.d dVar = (bcb.d) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (dVar == null) {
                    return error3;
                }
                return null;
            case 10:
                Throwable error4 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list == null) {
                    return error4;
                }
                return null;
            case 11:
                yki.l FlowCoordinator = (yki.l) obj2;
                OffboardingFlowContract$Step step = (OffboardingFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (Intrinsics.f(step, OffboardingFlowContract$Step.Home.f104880a)) {
                    return new OffboardingScreen();
                }
                throw new NoWhenBranchMatchedException();
            case 12:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                OverdraftDetailsScreenContract$ModalStep step2 = (OverdraftDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof OverdraftDetailsScreenContract$ModalStep.AprInfo) {
                    return com.revolut.feature.credit.overdraft.impl.ui.details.a.K2(R$string.overdraft_details_sheet_apr_title, R$string.overdraft_details_sheet_apr_description);
                }
                if (step2 instanceof OverdraftDetailsScreenContract$ModalStep.SpendInfo) {
                    return com.revolut.feature.credit.overdraft.impl.ui.details.a.K2(R$string.overdraft_details_sheet_overdraftSpend_title, R$string.overdraft_details_sheet_overdraftSpend_descriptionPlain);
                }
                if (step2 instanceof OverdraftDetailsScreenContract$ModalStep.MonthCharges) {
                    return com.revolut.feature.credit.overdraft.impl.ui.details.a.K2(R$string.overdraft_details_sheet_monthCharges_title, R$string.overdraft_details_sheet_monthCharges_description);
                }
                throw new NoWhenBranchMatchedException();
            case 13:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(14, null, true, false, null));
            case 14:
                Throwable error5 = (Throwable) obj2;
                qla.a aVar = (qla.a) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (aVar == null) {
                    return error5;
                }
                return null;
            case 15:
                Function1 defaultFactory = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return new u9a.o((List) defaultFactory.invoke(new iii.d(14, null, true, false, null)));
            case 16:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return (List) getDefaultErrorItems6.invoke(new iii.d(10, null, true, false, "LIST_ID_BENEFICIARIES"));
            case 17:
                PixQrCodeDecodeResult decodeResult = (PixQrCodeDecodeResult) obj2;
                ube.a qrCodeContent = (ube.a) obj3;
                Intrinsics.checkNotNullParameter(decodeResult, "decodeResult");
                Intrinsics.checkNotNullParameter(qrCodeContent, "qrCodeContent");
                qua.p subscription = qrCodeContent.f278839a;
                Data transactionsResult = qrCodeContent.f278840b;
                k71.q qVar = qrCodeContent.f278841c;
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                Intrinsics.checkNotNullParameter(transactionsResult, "transactionsResult");
                return new ube.a(subscription, transactionsResult, qVar, decodeResult);
            case 18:
                xk5.a domain = (xk5.a) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain, "domain");
                return ofm.q.c0(domain);
            case 19:
                al5.a dto = (al5.a) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(dto, "dto");
                return ofm.q.b0(dto);
            case 20:
                Intrinsics.checkNotNullParameter((ubj.d) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((CryptoDepositAddress) obj3, "<unused var>");
                return Unit.f186387a;
            case 21:
                Function1 defaultItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultItems, "defaultItems");
                return (List) defaultItems.invoke(new iii.d(12, null, false, true, null));
            case 22:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new x60("PROMPT_ID_SPIN_DEREGISTER", w60.BACKGROUND_ASSET, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
            case 23:
                Throwable error6 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (iVar == null) {
                    return error6;
                }
                return null;
            case 24:
                Throwable error7 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (list2 == null) {
                    return error7;
                }
                return null;
            case 25:
                Throwable error8 = (Throwable) obj2;
                BigDecimal bigDecimal = (BigDecimal) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (bigDecimal == null) {
                    return error8;
                }
                return null;
            case 26:
                Throwable error9 = (Throwable) obj2;
                ed3.b bVar = (ed3.b) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (bVar == null) {
                    return error9;
                }
                return null;
            case 27:
                Throwable th10 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th10;
                }
                return null;
            case 28:
                Throwable th11 = (Throwable) obj2;
                if (((CashbackBySources) obj3) == null) {
                    return th11;
                }
                return null;
            default:
                Throwable th12 = (Throwable) obj2;
                if (((CashbackBySources) obj3) == null) {
                    return th12;
                }
                return null;
        }
    }

    public /* synthetic */ u(Object obj2, int i) {
        this.f277365a = i;
    }
}
