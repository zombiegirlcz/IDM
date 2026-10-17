package cc3;

import c2f.m;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import com.revolut.feature.cash_topup.impl.R$string;
import com.revolut.feature.cash_topup.impl.ui.flow.delete_barcode.DeleteBarcodeConfirmationFlowContract$Step;
import ip0.tm0;
import ip0.um0;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends oki.h implements e {
    public final j60.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f22931p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t1 f22932q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f22933r;

    public j(j60.a bottomDialogExtension, a dialogMapper, t1 barcodeInteractor) {
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(barcodeInteractor, "barcodeInteractor");
        this.o = bottomDialogExtension;
        this.f22931p = dialogMapper;
        this.f22932q = barcodeInteractor;
        m mVar = new m(28);
        this.f22933r = cp5.d.a(this, DeleteBarcodeConfirmationFlowContract$Step.f65655a, f0.f322471a, mVar);
    }

    @Override // yji.l
    public final void I1() {
        this.f22931p.getClass();
        AnimatedResourceImage animatedResourceImage = null;
        boolean z = false;
        String str = null;
        AnimatedResourceImage animatedResourceImage2 = null;
        this.o.x(new y(u.c(new um0("TWIN_BUTTON_ID", new tm0(LargeActionButton.ButtonStyle.f58726b, animatedResourceImage, new TextLocalisedClause(R$string.topup_cash_barcode_delete_dialog_action_go_back, null, null, 14), z, str, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, animatedResourceImage2, new TextLocalisedClause(R$string.topup_cash_barcode_delete_dialog_action_cancel_deposit, null, null, 14), false, "DELETE_BUTTON_TAG", null, 40), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016)), new t(new TextLocalisedClause(R$string.topup_cash_barcode_delete_dialog_title, null, null, 14), new TextLocalisedClause(R$string.topup_cash_barcode_delete_dialog_description, null, null, 14), null, 28), null, null, null, null, 1020));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f22933r;
    }
}
