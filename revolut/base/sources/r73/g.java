package r73;

import aw0.m6;
import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_screen.common.R$string;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.renewed_dialog.RenewedDialogContract$InputData;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RenewedDialogContract$InputData f251981a;

    public g(RenewedDialogContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f251981a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        RowDelegate.Model model;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = 6;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.card_screen_renewed_dialog_title, null, null, 14), null, new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_refinancing_card, null, null, 6)), null, false, 26);
        boolean z = false;
        ArrayList arrayListN = v.n(new RowDelegate.Model(String.valueOf(R$string.card_screen_renewed_dialog_item_card_number), new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_card, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.card_screen_renewed_dialog_item_card_number, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856), new RowDelegate.Model(String.valueOf(R$string.card_screen_renewed_dialog_item_cvv_expiry), new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_refinancing_card, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.card_screen_renewed_dialog_item_cvv_expiry, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
        RenewedDialogContract$InputData renewedDialogContract$InputData = this.f251981a;
        switch (f.f251980a[renewedDialogContract$InputData.f65390a.ordinal()]) {
            case 1:
                model = new RowDelegate.Model(String.valueOf(R$string.card_screen_renewed_dialog_item_wallet_apple), new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_apple_pay, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.card_screen_renewed_dialog_item_wallet_apple, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
                break;
            case 2:
                model = new RowDelegate.Model(String.valueOf(R$string.card_screen_renewed_dialog_item_wallet_google), new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_google_pay, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.card_screen_renewed_dialog_item_wallet_google, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
                break;
            case 3:
                model = new RowDelegate.Model(String.valueOf(R$string.card_screen_renewed_dialog_item_wallet_apple_google), new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_wallet, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.card_screen_renewed_dialog_item_wallet_apple_google, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
                break;
            case 4:
                model = new RowDelegate.Model(String.valueOf(R$string.card_screen_renewed_dialog_item_wallet_apple_other), new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_wallet, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.card_screen_renewed_dialog_item_wallet_apple_other, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
                break;
            case 5:
                model = new RowDelegate.Model(String.valueOf(R$string.card_screen_renewed_dialog_item_wallet_google_other), new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_wallet, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.card_screen_renewed_dialog_item_wallet_google_other, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
                break;
            case 6:
                model = new RowDelegate.Model(String.valueOf(R$string.card_screen_renewed_dialog_item_wallet_apple_google_other), new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_wallet, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.card_screen_renewed_dialog_item_wallet_apple_google_other, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
                break;
            case 7:
                model = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (model != null) {
            arrayListN.add(model);
        }
        arrayListN.add(new RowDelegate.Model(String.valueOf(R$string.card_screen_renewed_dialog_item_subscriptions), new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_merchant, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.card_screen_renewed_dialog_item_subscriptions, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
        yp0.b.k(arrayListN, 0, 0, 0, 0, 31);
        return new cii.b(renewedDialogContract$InputData.f65391b ? new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.card_screen_renewed_dialog_button_customise_card, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55) : null, arrayListN, aVar);
    }
}
