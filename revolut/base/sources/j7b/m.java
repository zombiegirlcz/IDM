package j7b;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.flow.ViaVerdeFlowContract$Step;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.home.ViaVerdeHomeScreen;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.feature.crypto_deposits.impl.R$string;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.PlanGiftingReceiverPickerScreenContract$ModalStep;
import eb8.n;
import feh.j;
import ff4.s;
import grl.k9;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.i3;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171898a;

    public /* synthetic */ m(int i) {
        this.f171898a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f171898a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return hx7.a.p(getDefaultErrorItems);
            case 1:
                Throwable error = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                    return error;
                }
                return null;
            case 2:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new j82.l((List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null)), false);
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 4:
                Function1 defaultFactory = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke(new iii.d(14, null, true, false, null));
            case 5:
                Function1 getError = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getError, "getError");
                return (List) getError.invoke(new iii.d(6, j87.d.f172135a, true, false, null));
            case 6:
                Throwable error2 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (bool == null) {
                    return error2;
                }
                return null;
            case 7:
                Throwable error3 = (Throwable) obj2;
                com.revolut.feature.junior_profile.api.models.a aVar = (com.revolut.feature.junior_profile.api.models.a) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (aVar == null) {
                    return error3;
                }
                return null;
            case 8:
                yki.l FlowCoordinator = (yki.l) obj2;
                ViaVerdeFlowContract$Step step = (ViaVerdeFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof ViaVerdeFlowContract$Step.Home) {
                    return new ViaVerdeHomeScreen();
                }
                throw new NoWhenBranchMatchedException();
            case 9:
                Throwable th10 = (Throwable) obj2;
                if (((i3) obj3) == null) {
                    return th10;
                }
                return null;
            case 10:
                Throwable error4 = (Throwable) obj2;
                n nVar = (n) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (nVar == null) {
                    return error4;
                }
                return null;
            case 11:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, false, false, null));
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new CellDetailsDelegate.Model("NETWORK_FEE_ID", new TextLocalisedClause(R$string.crypto_receive_deposit_return_address_list_fees_title, null, null, 14), new TextLocalisedClause(R$string.crypto_receive_deposit_return_summary_network_fee_value, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048512);
            case 14:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PlanGiftingReceiverPickerScreenContract$ModalStep step2 = (PlanGiftingReceiverPickerScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!Intrinsics.f(step2, PlanGiftingReceiverPickerScreenContract$ModalStep.UpcomingBirthdaysInfo.f102505a)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar2 = new lw0.a(new TextLocalisedClause(com.revolut.retail.feature.plan_gifting.impl.R$string.premium_gift_recipient_birthdays_section_disclaimer_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.plan_gifting.impl.R$string.premium_gift_recipient_birthdays_section_disclaimer_description, null, null, 14), null, null, false, 28);
                aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.feature.plan_gifting.impl.R$string.premium_gift_recipient_birthdays_section_disclaimer_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var = k9.Premium;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar2, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 17:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(12, null, true, true, null));
            case 18:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(12, null, true, true, null));
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 21:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return (List) getDefaultErrorItems6.invoke(new iii.d(14, null, true, false, null));
            case 22:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 23:
                Collection collection = (List) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(list2, "new");
                if (collection == null) {
                    collection = f0.f322471a;
                }
                return d0.E0(list2, collection);
            case 24:
                Function1 defaultErrorMapper = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorMapper, "defaultErrorMapper");
                return (List) defaultErrorMapper.invoke(new iii.d(14, null, true, false, null));
            case 25:
                Function1 defaultErrorMapper2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorMapper2, "defaultErrorMapper");
                return (List) defaultErrorMapper2.invoke(new iii.d(14, null, true, false, null));
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return j.b.f134626a;
            case 27:
                Throwable error5 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list3 == null) {
                    return error5;
                }
                return null;
            case 28:
                Throwable error6 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list4 == null) {
                    return error6;
                }
                return null;
            default:
                Function1 getDefaultErrorItems7 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems7, "getDefaultErrorItems");
                return new s((List) getDefaultErrorItems7.invoke(new iii.d(14, null, true, false, null)), null, null, null, null, null, null, null, null, false, false, null, null, 6686);
        }
    }

    public /* synthetic */ m(Object obj2, int i) {
        this.f171898a = i;
    }
}
