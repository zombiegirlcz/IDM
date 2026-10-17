package oq3;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingaddprovider.CryptoAddressHostingAddProviderContract$WalletTypeModalStep;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingaddprovider.wallettypemodal.CryptoAddressHostingTypeDialogController;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.bottom_sheet.EmbeddedBottomSheetScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.bottom_sheet.EmbeddedBottomSheetScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.CoverageDetailsScreenContract$ModalStep;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.zj;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import jsl.j0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import os9.q;
import zhm.f0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227709a;

    public /* synthetic */ e(int i) {
        this.f227709a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f227709a) {
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
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (iVar == null) {
                    return error2;
                }
                return null;
            case 2:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CryptoAddressHostingAddProviderContract$WalletTypeModalStep it8 = (CryptoAddressHostingAddProviderContract$WalletTypeModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                return new CryptoAddressHostingTypeDialogController();
            case 3:
                Function1 defaultErrorProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorProvider, "defaultErrorProvider");
                return new oqe.m(oqe.j.f227894a, (List) defaultErrorProvider.invoke(new iii.d(14, null, true, false, null)));
            case 4:
                Throwable error3 = (Throwable) obj2;
                Integer num = (Integer) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (num == null) {
                    return error3;
                }
                return null;
            case 5:
                Throwable error4 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list2 == null) {
                    return error4;
                }
                return null;
            case 6:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null));
            case 7:
                Throwable error5 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list3 == null) {
                    return error5;
                }
                return null;
            case 8:
                Throwable error6 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list4 == null) {
                    return error6;
                }
                return null;
            case 9:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Optional optionalEmpty = Optional.empty();
                if (zBooleanValue) {
                    return null;
                }
                return optionalEmpty;
            case 10:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 11:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                Optional optionalEmpty2 = Optional.empty();
                if (zBooleanValue2) {
                    return null;
                }
                return optionalEmpty2;
            case 12:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                IllegalStateException illegalStateException = new IllegalStateException(v1.c.u("No data to display Group Chat Members: ", (Throwable) obj2));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                f0 f0Var = f0.f322471a;
                return new q(f0Var, f0Var);
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 16:
                Throwable error7 = (Throwable) obj2;
                tsl.f fVar = (tsl.f) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (fVar == null) {
                    return error7;
                }
                return null;
            case 17:
                Throwable th10 = (Throwable) obj2;
                if (((tsl.c) obj3) == null) {
                    return th10;
                }
                return null;
            case 18:
                Throwable th11 = (Throwable) obj2;
                if (((tsl.c) obj3) == null) {
                    return th11;
                }
                return null;
            case 19:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new j0(jsl.h0.f178214a, (List) getDefaultErrorItems2.invoke(new iii.d(14, null, false, false, null)));
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return otk.h.f229732a;
            case 21:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CoverageDetailsScreenContract$ModalStep step = (CoverageDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof CoverageDetailsScreenContract$ModalStep.CoverageDetails) {
                    return new EmbeddedBottomSheetScreen(new EmbeddedBottomSheetScreenContract$InputData(((CoverageDetailsScreenContract$ModalStep.CoverageDetails) step).f76106a));
                }
                throw new NoWhenBranchMatchedException();
            case 22:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, null, 6, true);
            case 23:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null));
            case 24:
                Throwable error8 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (model == null) {
                    return error8;
                }
                return null;
            case 25:
                Throwable error9 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model2 = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (model2 == null) {
                    return error9;
                }
                return null;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                List listC = u.c(new FullScreenStateDelegate.Model("RETRY_ID", new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D038A", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R.string.common_action_retry, null, null, 14), false, Integer.valueOf(R$drawable.uikit_icn_24_retry), null, false, 0, 0, 31556));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return listC;
            case 27:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(12, null, false, true, null));
            case 28:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return new owf.i((List) getDefaultErrorItems5.invoke(new iii.d(14, null, false, false, null)), null);
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new cii.b(null, f0.f322471a, ox2.f.a());
        }
    }
}
