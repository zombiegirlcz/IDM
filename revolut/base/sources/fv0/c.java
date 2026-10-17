package fv0;

import aw0.o9;
import cli.n;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.dialogs.ToolboxDialogDisplayer$Configuration$Divider;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.ui.info.CreditInfoController;
import com.revolut.feature.credit.core.ui.info.CreditInfoControllerContract$ModalStep;
import com.revolut.feature.external_accounts.api.model.Mandate;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductGroupResponse;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import com.revolut.feature.statements.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import fwc.s;
import fxc.m;
import fy4.t;
import fy6.r;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ms0.h4;
import op0.q;
import tof.i7;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138303a;

    public /* synthetic */ c(int i) {
        this.f138303a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        switch (this.f138303a) {
            case 0:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ToolboxDialogDisplayer$Configuration$Divider);
            case 1:
                Throwable error = (Throwable) obj2;
                i7 i7Var = (i7) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (i7Var == null) {
                    return error;
                }
                return null;
            case 2:
                Function1 getDefaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, false, false, null));
            case 3:
                Function1 getDefaultErrorItems2 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null));
            case 4:
                Function1 getDefaultErrorItems3 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new s((List) getDefaultErrorItems3.invoke(new iii.d(12, null, false, true, null)));
            case 5:
                Function1 getDefaultErrorItems4 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(6, fwf.e.RETRY, true, false, null));
            case 6:
                Function1 getDefaultErrorItems5 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(14, null, false, false, null));
            case 7:
                Function1 getDefaultErrorItems6 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return (List) getDefaultErrorItems6.invoke(new iii.d(12, null, true, true, null));
            case 8:
                Throwable error2 = (Throwable) obj2;
                List list = (List) data;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list == null) {
                    return error2;
                }
                return null;
            case 9:
                Throwable error3 = (Throwable) obj2;
                VoucherProductGroupResponse voucherProductGroupResponse = (VoucherProductGroupResponse) data;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (voucherProductGroupResponse == null) {
                    return error3;
                }
                return null;
            case 10:
                Function1 defaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return new m((List) defaultErrorItems.invoke(new iii.d(14, null, true, false, null)));
            case 11:
                Throwable error4 = (Throwable) obj2;
                Optional optional = (Optional) data;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (optional == null) {
                    return error4;
                }
                return null;
            case 12:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                Intrinsics.checkNotNullParameter("PORTFOLIO_INSIGHTS_WIDGET_ERROR_LIST_ID", "listId");
                return u.c(uyg.a.a("PORTFOLIO_INSIGHTS_WIDGET_ERROR_LIST_ID", q.MEDIUM));
            case 13:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 14:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 15:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CreditInfoControllerContract$ModalStep step = (CreditInfoControllerContract$ModalStep) data;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof CreditInfoControllerContract$ModalStep.InfoPopup) {
                    return new CreditInfoController(new t(((CreditInfoControllerContract$ModalStep.InfoPopup) step).f69838a));
                }
                throw new NoWhenBranchMatchedException();
            case 16:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 17:
                Function1 getDefaultErrorItems7 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems7, "getDefaultErrorItems");
                return new fy6.s((List) getDefaultErrorItems7.invoke(new iii.d(12, null, true, true, null)), new r(false));
            case 18:
                Throwable error5 = (Throwable) obj2;
                Mandate mandate = (Mandate) data;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (mandate == null) {
                    return error5;
                }
                return null;
            case 19:
                Throwable error6 = (Throwable) obj2;
                Mandate mandate2 = (Mandate) data;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (mandate2 == null) {
                    return error6;
                }
                return null;
            case 20:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof fyl.a);
            case 21:
                InvoiceTemplate.CustomField field = (InvoiceTemplate.CustomField) obj2;
                String name = (String) data;
                Intrinsics.checkNotNullParameter(field, "field");
                Intrinsics.checkNotNullParameter(name, "name");
                return InvoiceTemplate.CustomField.a(field, name, null, 2);
            case 22:
                InvoiceTemplate.CustomField field2 = (InvoiceTemplate.CustomField) obj2;
                String value = (String) data;
                Intrinsics.checkNotNullParameter(field2, "field");
                Intrinsics.checkNotNullParameter(value, "value");
                return InvoiceTemplate.CustomField.a(field2, null, value, 1);
            case 23:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ID_ERROR_STATE_WIDGET", new TextLocalisedClause(R$string.consolidated_statement_filters_error_description, null, null, 14), null, new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, null, null, 6)), new l6(12, new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), null, h4.ACCENT), null, false, null, null, null, 2020);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return new fzd.m(u.c(model));
            case 24:
                Throwable error7 = (Throwable) obj2;
                cue.d dVar = (cue.d) data;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (dVar == null) {
                    return error7;
                }
                return null;
            case 25:
                Function1 getDefaultErrorItems8 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems8, "getDefaultErrorItems");
                return (List) getDefaultErrorItems8.invoke(new iii.d(12, null, false, false, null));
            case 26:
                Throwable error8 = (Throwable) obj2;
                Boolean bool = (Boolean) data;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (bool == null) {
                    return error8;
                }
                return null;
            case 27:
                Throwable error9 = (Throwable) obj2;
                yh5.a aVar = (yh5.a) data;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (aVar == null) {
                    return error9;
                }
                return null;
            case 28:
                Throwable error10 = (Throwable) obj2;
                Boolean bool2 = (Boolean) data;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (bool2 == null) {
                    return error10;
                }
                return null;
            default:
                Throwable error11 = (Throwable) obj2;
                Boolean bool3 = (Boolean) data;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (bool3 == null) {
                    return error11;
                }
                return null;
        }
    }

    public /* synthetic */ c(n nVar, int i) {
        this.f138303a = i;
    }
}
