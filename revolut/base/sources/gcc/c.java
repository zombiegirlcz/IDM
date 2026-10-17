package gcc;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.revolut.feature.revolutpay.shared.ui.add_payment_method.AddPaymentMethodScreenContract$ModalStep;
import com.revolut.feature.revolutpay.shared.ui.bottom_sheet.encrypted_by_revolut.EncryptedByRevolutScreen;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.b;
import ge1.i;
import gk7.n;
import ip0.zj;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142397a;

    public /* synthetic */ c(int i) {
        this.f142397a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f142397a) {
            case 0:
                ((Boolean) obj2).getClass();
                fcc.f dto = (fcc.f) obj3;
                Intrinsics.checkNotNullParameter(dto, "dto");
                return Boolean.valueOf(dto.getListing());
            case 1:
                Data old2 = (Data) obj2;
                Data data = (Data) obj3;
                Intrinsics.checkNotNullParameter(old2, "old");
                Intrinsics.checkNotNullParameter(data, "new");
                return Boolean.valueOf(i2b.a.k(old2) ? old2.equals(data) : Intrinsics.f(old2.getContent(), data.getContent()));
            case 2:
                Throwable error = (Throwable) obj2;
                HotelsProperty hotelsProperty = (HotelsProperty) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (hotelsProperty == null) {
                    return error;
                }
                return null;
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return Boolean.TRUE;
            case 4:
                Throwable error2 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list == null) {
                    return error2;
                }
                return null;
            case 5:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AddPaymentMethodScreenContract$ModalStep step = (AddPaymentMethodScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof AddPaymentMethodScreenContract$ModalStep.EncryptedByRevolut) {
                    return new EncryptedByRevolutScreen();
                }
                throw new NoWhenBranchMatchedException();
            case 6:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_STATE_LIST_ID", new TextLocalisedClause(R$string.product_catalogue_flow_catalogue_list_error_title, null, null, 14), new TextLocalisedClause(R$string.product_catalogue_flow_catalogue_list_error_caption, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D148", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.product_catalogue_flow_catalogue_list_error_action, null, null, 14), false, null, null, false, 0, 0, 32576);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return new i(u.c(model));
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 8:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, false, false, null));
            case 9:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, false, true, null));
            case 10:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new gh3.i(new gh3.g(new TextLocalisedClause(com.revolut.feature.checklist_challenges_ui.impl.R$string.checklist_step_details_header_title, u.c(new TextLocalisedClause(com.revolut.feature.checklist_challenges_ui.impl.R$string.checklist_step_details_header_fallback_title, null, null, 14)), null, 12)), tj0.a.a((Throwable) obj2) ? kh3.a.a(com.revolut.kompot.common.R$string.common_offline_state_title, R$drawable.uikit_icn_24_communication, Integer.valueOf(com.revolut.kompot.common.R$string.common_offline_state_description)) : kh3.a.a(com.revolut.feature.checklist_challenges_ui.impl.R$string.checklist_step_details_error_title, R$drawable.uikit_icn_24_exclamation_triangle, null), null);
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.e.e;
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return b.a.f103065a;
            case 16:
                Throwable error3 = (Throwable) obj2;
                sh5.c cVar = (sh5.c) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (cVar == null) {
                    return error3;
                }
                return null;
            case 17:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 18:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return n.b();
            case 19:
                Throwable error4 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (iVar == null) {
                    return error4;
                }
                return null;
            case 20:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, false, true, null));
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 22:
                Throwable error5 = (Throwable) obj2;
                hha.d dVar = (hha.d) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (dVar == null) {
                    return error5;
                }
                return null;
            case 23:
                Throwable error6 = (Throwable) obj2;
                ec5.c cVar2 = (ec5.c) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (cVar2 == null) {
                    return error6;
                }
                return null;
            case 24:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, false, false, null));
            case 25:
                Function1 defaultItemsProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultItemsProvider, "defaultItemsProvider");
                List list2 = (List) defaultItemsProvider.invoke(new iii.d(14, null, true, false, null));
                yp0.b.k(list2, R$attr.uikit_dp24, 0, 0, 0, 30);
                return list2;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 28:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(14, null, false, false, null));
            default:
                Function1 errorItemsFactory = (Function1) obj3;
                Intrinsics.checkNotNullParameter(errorItemsFactory, "errorItemsFactory");
                return (List) errorItemsFactory.invoke(new iii.d(10, null, true, false, "ID_INVITATION_ERROR_STATE_ITEM"));
        }
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f142397a = i;
    }
}
