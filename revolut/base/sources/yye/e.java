package yye;

import aw0.h;
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
import com.revolut.feature.topup_screen.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements n {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = 6;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.topup_card_verification_prompt_title, null, null, 14), null, new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_warning, null, null, 6)), null, false, 26);
        h hVar = new h(false, new n6(new TextLocalisedClause(R$string.topup_card_verification_prompt_add_money, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.topup_card_verification_prompt_go_back, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
        boolean z = false;
        List listK = v.k(new RowDelegate.Model("WE_ARE_VERIFYING_CARD_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_card_shield, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.topup_card_verification_prompt_bullets_first_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.topup_card_verification_prompt_bullets_first_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("YOUR_TRANSACTION_WILL_BE_PENDING_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_time, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.topup_card_verification_prompt_bullets_second_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.topup_card_verification_prompt_bullets_second_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("REFUNDED_IF_UNVERIFIED_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_28_refund, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.topup_card_verification_prompt_bullets_third_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.topup_card_verification_prompt_bullets_third_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("WE_WILL_NOTIFY_YOU_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_bell, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.topup_card_verification_prompt_bullets_fourth_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.topup_card_verification_prompt_bullets_fourth_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(hVar, listK, aVar);
    }
}
