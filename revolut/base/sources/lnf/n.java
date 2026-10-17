package lnf;

import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.feature.transactions.impl.ui.pending.revert.dialog.ui.RecallTransactionParcel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f197247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f197248b;

    public n(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f197247a = featureToggleInteractor;
        this.f197248b = w.y0(new ljd.e(this, 8));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.n
    public final o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (((Boolean) this.f197248b.getValue()).booleanValue()) {
            lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.transaction_pending_info_refund_revert_sheet_title, null, null, 14), new TextLocalisedClause(R$string.transaction_pending_info_refund_revert_sheet_subtitle, u.c(new TextLocalisedClause(R$string.transaction_pending_info_refund_revert_sheet_learn_more, null, new Click(30, (Integer) null, (Object) null, "ID_LEARN_MORE", false), 10)), null, 12), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, GlyphImageTint.WARNING.f59933a, null, 4)), null, false, 24);
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transaction_pending_info_refund_revert_sheet_button_revert, null, null, 14);
            RecallTransactionParcel recallTransactionParcel = new RecallTransactionParcel(domainState.f197241a);
            int i = R$attr.uikit_dp24;
            int i2 = R$attr.uikit_dp16;
            LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_CONFIRM_RECALL", defaultFilledButton, null, textLocalisedClause, false, null, recallTransactionParcel, i, 0, i2, i2, 1392);
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.transaction_pending_info_refund_revert_sheet_button_cancel, null, null, 14);
            int i3 = R$attr.uikit_dp16;
            return new f(v.k(model, new LargeActionButtonDelegate.Model("ID_CANCEL_RECALL", defaultFilledButton2, null, textLocalisedClause2, false, null, null, i3, R$attr.uikit_dp24, i3, i3, 496)), aVar);
        }
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.transactionUI_transaction_pending_info_refund_revert_sheet_revert_title, null, null, 14), null, null, null, false, 30);
        RowDelegate.Model model2 = new RowDelegate.Model("ID_CONFIRM_RECALL_INFO", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_exclamation_triangle, R$attr.uikit_colorStatusWarning, R$attr.uikit_colorTransparent), null, null, false, null, false, 62), new TextLocalisedClause(R$string.transactionUI_transaction_pending_info_refund_revert_sheet_info_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.transactionUI_transaction_pending_info_refund_revert_sheet_info_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton3 = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.transactionUI_transaction_pending_info_refund_revert_sheet_confirm, null, null, 14);
        RecallTransactionParcel recallTransactionParcel2 = new RecallTransactionParcel(domainState.f197241a);
        int i5 = R$attr.uikit_dp24;
        int i6 = R$attr.uikit_dp16;
        LargeActionButtonDelegate.Model model3 = new LargeActionButtonDelegate.Model("ID_CONFIRM_RECALL", defaultFilledButton3, null, textLocalisedClause3, false, null, recallTransactionParcel2, i5, 0, i6, i6, 1392);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton4 = LargeActionButton.ButtonStyle.f58726b;
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.transactionUI_transaction_pending_info_refund_revert_sheet_go_back, null, null, 14);
        int i21 = R$attr.uikit_dp16;
        Object[] elements = {model2, model3, new LargeActionButtonDelegate.Model("ID_CONFIRM_RECALL", defaultFilledButton4, null, textLocalisedClause4, false, null, null, i21, R$attr.uikit_dp24, i21, i21, 496)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new f(kotlin.collections.d.L(elements), aVar2);
    }
}
