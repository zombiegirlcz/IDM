package p73;

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
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.reissued_physical_card_dialog.ReissuedPhysicalCardDialogContract$InputData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReissuedPhysicalCardDialogContract$InputData f233547a;

    public f(ReissuedPhysicalCardDialogContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f233547a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = 6;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.card_screen_reissued_physical_card_dialog_title, null, null, 14), null, new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_refinancing_card, null, null, 6)), null, false, 26);
        ReissuedPhysicalCardDialogContract$InputData reissuedPhysicalCardDialogContract$InputData = this.f233547a;
        int i2 = reissuedPhysicalCardDialogContract$InputData.f65389c ? R$string.card_screen_reissued_physical_card_dialog_item_old_card_terminates : R$string.card_screen_reissued_physical_card_dialog_item_terminated;
        boolean z = false;
        ArrayList arrayListN = v.n(new RowDelegate.Model(String.valueOf(i2), new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_card, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(i2, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
        if (reissuedPhysicalCardDialogContract$InputData.f65387a) {
            arrayListN.add(new RowDelegate.Model(String.valueOf(R$string.card_screen_reissued_physical_card_dialog_item_subscriptions), new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_refinancing_card, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.card_screen_reissued_physical_card_dialog_item_subscriptions, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
        }
        if (reissuedPhysicalCardDialogContract$InputData.f65388b) {
            arrayListN.add(new RowDelegate.Model(String.valueOf(R$string.card_screen_reissued_physical_card_dialog_item_add_to_google_wallet), new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_google_pay, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.card_screen_reissued_physical_card_dialog_item_add_to_google_wallet, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
        }
        yp0.b.k(arrayListN, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.card_screen_reissued_physical_card_dialog_button_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, 55), arrayListN, aVar);
    }
}
