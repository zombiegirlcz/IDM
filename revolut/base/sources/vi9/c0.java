package vi9;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.pay_later.api.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import org.jetbrains.annotations.NotNull;
import zh9.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f289534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gk9.b f289535b;

    public c0(l payLaterInstalmentItemMapper, gk9.b payLaterPlanItemMapper) {
        Intrinsics.checkNotNullParameter(payLaterInstalmentItemMapper, "payLaterInstalmentItemMapper");
        Intrinsics.checkNotNullParameter(payLaterPlanItemMapper, "payLaterPlanItemMapper");
        this.f289534a = payLaterInstalmentItemMapper;
        this.f289535b = payLaterPlanItemMapper;
    }

    public static rp0.y a(RowDelegate.Model model, String str, bi9.f fVar) {
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pay_later_plan_actions_pay_now, null, null, 14);
        int i = R$attr.uikit_dp16;
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_PAY_NOW", defaultFilledButton, null, textLocalisedClause, false, null, fVar, i, R$attr.uikit_dp8, i, i, 368);
        LargeActionButton.ButtonStyle.FlatButton flatButton = LargeActionButton.ButtonStyle.o;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.pay_later_repayment_action_no_go_back, null, null, 14);
        int i2 = R$attr.uikit_dp16;
        LargeActionButtonDelegate.Model model3 = new LargeActionButtonDelegate.Model("ID_GO_BACK", flatButton, null, textLocalisedClause2, false, null, null, R$attr.uikit_dp8, i2, i2, i2, 496);
        return new rp0.y(i2b.a.p(i2b.a.r(model, model2), model3), new rp0.t(new TextLocalisedClause(R$string.pay_later_repayment_confirm_payment, null, null, 14), null, null, 30), rp0.l.WINDOW, null, null, null, str, null, null, null, 3832);
    }

    public static rp0.y b(TextLocalisedClause textLocalisedClause) {
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.pay_later_insufficient_funds_info_title, null, null, 14), textLocalisedClause, null, 28);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.pay_later_repayment_insufficient_funds_action, null, null, 14);
        int i = R$attr.uikit_dp16;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_ADD_MONEY", defaultFilledButton, null, textLocalisedClause2, false, null, null, R$attr.uikit_dp24, R$attr.uikit_dp8, i, i, 496);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_cancel, null, null, 14);
        int i2 = R$attr.uikit_dp16;
        return new rp0.y(zhm.v.k(model, new LargeActionButtonDelegate.Model("ID_CANCEL", defaultFilledButton2, null, textLocalisedClause3, false, null, null, R$attr.uikit_dp8, i2, i2, i2, 496)), tVar, rp0.l.WINDOW, null, null, null, 1016);
    }

    public static rp0.y c() {
        return b(new TextLocalisedClause(R$string.pay_later_insufficient_funds_info_text, null, null, 14));
    }

    public static y0 d(TextLocalisedClause textLocalisedClause, dj0.d dVar) {
        return new y0("repaid-success", new j0((Clause) new TextLocalisedClause(R$string.pay_later_manual_repayment_success_title, zhm.u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, 8)), null, 12), (Clause) textLocalisedClause, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 4);
    }

    public static RowDelegate.Model.MainImage.Image40 f(int i) {
        return new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), null, null, false, null, false, 62);
    }

    public static y0 g(bi9.f parcel) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Integer num = parcel.f15452b;
        r0 r0Var = parcel.f15451a;
        if (num == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.pay_later_manual_repayment_success_fully_repaid, zhm.u.c(r0Var.d), null, 12);
        } else {
            Iterator it8 = r0Var.B.iterator();
            if (!it8.hasNext()) {
                throw new NoSuchElementException();
            }
            int i = ((zh9.p) it8.next()).f322316a;
            while (it8.hasNext()) {
                int i2 = ((zh9.p) it8.next()).f322316a;
                if (i < i2) {
                    i = i2;
                }
            }
            textLocalisedClause = num.intValue() == i ? new TextLocalisedClause(R$string.pay_later_manual_repayment_success_fully_repaid, zhm.u.c(r0Var.d), null, 12) : new TextLocalisedClause(R$string.pay_later_manual_repayment_success_instalment_repaid, zhm.v.k(r0Var.d, Integer.valueOf(num.intValue() + 1), Integer.valueOf(r0Var.B.size())), null, 12);
        }
        return d(textLocalisedClause, parcel.f15453c);
    }

    public final rp0.y e(zh9.y repayment, String str, bi9.f fVar) {
        Intrinsics.checkNotNullParameter(repayment, "repayment");
        czi.c.F(repayment.f322366b);
        RowDelegate.Model modelA = yh9.b.a(this.f289534a, repayment);
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        return a(modelA, str, fVar);
    }
}
