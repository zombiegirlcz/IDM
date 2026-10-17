package h43;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.external.AddExternalAccountControllerContract$ModalStep;
import com.revolut.feature.transfer.core.models.CountryProfile;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.PeerToPeerTransferFlow;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.info_preload.PeerToPeerInfoPreloadFlowContract$Step;
import com.revolut.revolut.feature_fourthline_impl.R;
import grl.k9;
import h8d.w;
import h8d.x;
import ha8.j;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class q implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149300a;

    public /* synthetic */ q(int i) {
        this.f149300a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws Throwable {
        switch (this.f149300a) {
            case 0:
                Throwable th10 = (Throwable) obj2;
                if (((Pair) obj3) == null) {
                    return th10;
                }
                return null;
            case 1:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null));
            case 2:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AddExternalAccountControllerContract$ModalStep step = (AddExternalAccountControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!Intrinsics.f(step, AddExternalAccountControllerContract$ModalStep.ShowNameExplainer.f70295a)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.credit_loan_sepa_direct_debit_external_account_screen_explainer_about_name_title, null, null, 14), new TextLocalisedClause(R$string.credit_loan_sepa_direct_debit_external_account_screen_explainer_about_name_description, null, null, 14), null, null, false, 28);
                aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            case 3:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, false, false, null));
            case 4:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 5:
                Throwable error = (Throwable) obj2;
                CountryProfile countryProfile = (CountryProfile) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (countryProfile == null) {
                    return error;
                }
                return null;
            case 6:
                Throwable error2 = (Throwable) obj2;
                krf.f fVar = (krf.f) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (fVar == null) {
                    return error2;
                }
                return null;
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                m70.a.c(t0.f186434a);
                return new h74.h(h74.r.a(""), zhm.u.c(new FullScreenStateDelegate.Model("ID_ERROR_ITEM", new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), null, new TextLocalisedClause(R.string.common_action_retry, null, null, 14), false, null, null, false, 0, 0, 32596)));
            case 8:
                Throwable error3 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (iVar == null) {
                    return error3;
                }
                return null;
            case 9:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "error");
                return null;
            case 10:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                BigDecimal bigDecimal = BigDecimal.ZERO;
                if (zBooleanValue) {
                    return null;
                }
                return bigDecimal;
            case 11:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "error");
                return null;
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return Boolean.FALSE;
            case 13:
                Throwable th11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                if (th11 == null) {
                    return f0.f322471a;
                }
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("LIST_ID_ERROR", new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_common_error_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_common_error_action_try_again, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), null, null, false, null, new x(w.b.f150016a, 0), false, 0, 0, 32112);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(model);
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 16:
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                PeerToPeerInfoPreloadFlowContract$Step step2 = (PeerToPeerInfoPreloadFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof PeerToPeerInfoPreloadFlowContract$Step.Transfer) {
                    return new PeerToPeerTransferFlow(((PeerToPeerInfoPreloadFlowContract$Step.Transfer) step2).f102354a);
                }
                throw new NoWhenBranchMatchedException();
            case 17:
                Throwable error4 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list == null) {
                    return error4;
                }
                return null;
            case 18:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                return f0.f322471a;
            case 19:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 20:
                Throwable error5 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list2 == null) {
                    return error5;
                }
                return null;
            case 21:
                Throwable error6 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list3 == null) {
                    return error6;
                }
                return null;
            case 22:
                Throwable error7 = (Throwable) obj2;
                Pair pair = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (pair == null) {
                    return error7;
                }
                return null;
            case 23:
                Throwable error8 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (list4 == null) {
                    return error8;
                }
                return null;
            case 24:
                Function1 defaultErrorItems = (Function1) obj3;
                j.a aVar2 = ha8.j.Companion;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return (List) defaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 25:
                Throwable error9 = (Throwable) obj2;
                whf.p pVar = (whf.p) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (pVar == null) {
                    return error9;
                }
                return null;
            case 26:
                Throwable th12 = (Throwable) obj3;
                if (((Boolean) obj2).booleanValue() || th12 == null) {
                    return null;
                }
                throw th12;
            case 27:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(8, null, false, false, "LIST_ID_ERROR"));
            case 28:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                List list5 = (List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null));
                m70.a.c(t0.f186434a);
                return new hb4.j(hb4.o.b(""), list5);
            default:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(14, null, false, false, null));
        }
    }

    public /* synthetic */ q(Object obj2, int i) {
        this.f149300a = i;
    }
}
