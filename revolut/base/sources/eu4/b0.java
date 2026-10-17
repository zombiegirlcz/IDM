package eu4;

import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.repay.choose_payments.CreditCardChoosePaymentsScreenContract$ModalStep;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mx0.f3;
import mx0.h3;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129501a;

    public /* synthetic */ b0(int i) {
        this.f129501a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f129501a) {
            case 0:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CreditCardChoosePaymentsScreenContract$ModalStep step = (CreditCardChoosePaymentsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof CreditCardChoosePaymentsScreenContract$ModalStep.IneligibilityWarning)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.credit_card_statement_financing_payment_options_dialog_payment_unavailable_title, null, null, 14), new TextLocalisedClause(R$string.credit_card_statement_financing_payment_options_dialog_payment_unavailable_description, zhm.u.c(sx4.f.b(3, null, null, ((CreditCardChoosePaymentsScreenContract$ModalStep.IneligibilityWarning) step).f69562a)), null, 12), new lw0.b(new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, null, null, 6), null), null, false, 24);
                aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            case 1:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new a0(new x(new TextLocalisedClause(R$string.credit_card_payment_options_title, null, null, 14), new TextLocalisedClause(R$string.credit_card_payment_options_subtitle, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)));
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 3:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new euj.l((List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null)), true);
            case 4:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return eul.c.a();
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 6:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                bw0.m.Companion.getClass();
                return bw0.k.a();
            case 10:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new f3(null, null, null, false, h3.LOADING, false);
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return h3.ACTIVE;
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return Boolean.FALSE;
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 16:
                Throwable error = (Throwable) obj2;
                ll4.d0 d0Var = (ll4.d0) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (d0Var == null) {
                    return error;
                }
                return null;
            case 17:
                ev4.g old2 = (ev4.g) obj2;
                ev4.g gVar = (ev4.g) obj3;
                Intrinsics.checkNotNullParameter(old2, "old");
                Intrinsics.checkNotNullParameter(gVar, "new");
                return Boolean.valueOf(old2.f129709a == gVar.f129709a);
            case 18:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new ev4.k(ev4.r.b(), (List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null)), null, new ev4.i(null, false, false));
            case 19:
                Function1 defaultErrorItem = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItem, "defaultErrorItem");
                return new ev7.g((List) defaultErrorItem.invoke(new iii.d(14, null, false, false, null)));
            case 20:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 21:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 22:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(ivi.a.f168867a);
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new lw0.a(new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_time_slot_header_title, null, null, 14), null, null, null, false, 30);
            case 24:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 25:
                Throwable error2 = (Throwable) obj2;
                do3.n nVar = (do3.n) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (nVar == null) {
                    return error2;
                }
                return null;
            case 26:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(14, null, false, false, null));
            case 27:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return (List) getDefaultErrorItems6.invoke(new iii.d(14, null, false, false, null));
            case 28:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
        }
    }

    public /* synthetic */ b0(Object obj2, int i) {
        this.f129501a = i;
    }
}
