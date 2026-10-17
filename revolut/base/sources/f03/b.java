package f03;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.cards_core.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.revolut.feature_fourthline_impl.R;
import h93.f0;
import nii.h0;
import nii.j0;
import nii.m0;
import nii.t1;
import nii.u1;
import nii.w1;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f130994b;

    public /* synthetic */ b(f0 f0Var, int i) {
        this.f130993a = i;
        this.f130994b = f0Var;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) {
        switch (this.f130993a) {
            case 0:
                f0 f0Var = this.f130994b;
                return new j0((Clause) new TextLocalisedClause(f0Var.f150112c ? R$string.card_action_unblock_pin_cvv_virtual_success_title : R$string.card_action_unblock_pin_cvv_success_title, null, null, 14), (Clause) new TextLocalisedClause(f0Var.f150112c ? R$string.card_action_unblock_pin_cvv_virtual_success_subtitle : R$string.card_action_unblock_pin_cvv_success_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(6, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076);
            case 1:
                int i = com.revolut.feature.card_add_to_googlepay.impl.R$string.xpay_card_security_success_dialog_card_frozen;
                f0 f0Var2 = this.f130994b;
                return new j0((Clause) new TextLocalisedClause(i, u.c(v04.b.J(f0Var2, f0Var2.f150111b, null, null, 14)), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
            default:
                int i2 = com.revolut.feature.card_add_to_googlepay.impl.R$string.xpay_card_security_success_dialog_card_terminated;
                f0 f0Var3 = this.f130994b;
                return new j0((Clause) new TextLocalisedClause(i2, u.c(v04.b.J(f0Var3, f0Var3.f150111b, null, null, 14)), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
        }
    }
}
