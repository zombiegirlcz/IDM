package cw1;

import aw0.m6;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.breb.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements n {
    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        RowDelegate.Model model = new RowDelegate.Model("ROW_FIRST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_bullet_1, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.bre_b_key_being_used_step_login_to_title, u.c(domainState.f109525b), null, 12), null, 0, new TextLocalisedClause(R$string.bre_b_key_being_used_step_login_to_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.bre_b_key_being_used_step_remove_key_title, null, null, 14);
        int i = R$string.bre_b_key_being_used_step_remove_key_subtitle;
        String str = domainState.f109525b;
        List listK = v.k(model, new RowDelegate.Model("ROW_SECOND_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_bullet_2, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), textLocalisedClause, null, 0, new TextLocalisedClause(i, u.c(str), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("ROW_THIRD_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_bullet_3, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.bre_b_key_being_used_step_register_with_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.bre_b_key_being_used_step_register_with_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.bre_b_key_being_used_footer_action_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55), listK, new lw0.a(new TextLocalisedClause(R$string.bre_b_key_being_used_header_title, u.c(str), null, 12), new TextLocalisedClause(R$string.bre_b_key_being_used_header_subtitle, v.k(domainState.f109524a, str), null, 12), null, null, false, 28));
    }
}
