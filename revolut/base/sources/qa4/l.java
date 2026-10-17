package qa4;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.ad;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements n {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.email_verification_check_email_title, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.email_verification_check_email_description, u.c(domainState.f243952c), null, 12);
        ad adVar = new ad(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D001", null, null, null, 30), false);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.email_verification_check_email_button_primary_title, null, null, 14);
        int i = domainState.f243950a;
        if (i == 0) {
            textLocalisedClause = new TextLocalisedClause(R$string.email_verification_check_email_button_secondary_resend_title, null, null, 14);
        } else {
            int i2 = R$string.email_verification_check_email_button_secondary_title;
            String str = String.format("00:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textLocalisedClause = new TextLocalisedClause(i2, u.c(str), null, 12);
        }
        return new h(u.c(new PromptContentDelegate.Model("ID_EMAIL_PROMPT", textLocalisedClause2, textLocalisedClause3, null, adVar, new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, textLocalisedClause4, textLocalisedClause, null, null, null, i == 0 ? LargeActionButton.ButtonStyle.o : LargeActionButton.ButtonStyle.f58726b, null, false, null, i == 0, null, null, null, null, null, null, null, null, null, 536590792)));
    }
}
