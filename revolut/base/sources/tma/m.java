package tma;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.impl.userauth.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.email_verification_status_check_email_title, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R.string.email_verification_status_check_email_content, u.c(domainState.f272170b), null, 12);
        PromptMarketingContentDelegate.Model.Content.BackgroundMediaContent backgroundMediaContent = new PromptMarketingContentDelegate.Model.Content.BackgroundMediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D001", null, null, null, 30));
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R.string.email_verification_status_check_email_button, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
        boolean z = domainState.d;
        int i = domainState.f272171c;
        if (z) {
            textLocalisedClause = new TextLocalisedClause(R.string.email_verification_status_check_email_did_not_receive, null, null, 14);
        } else {
            String str = String.format("00:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textLocalisedClause = new TextLocalisedClause(R.string.email_verification_status_check_email_resend_in, u.c(str), null, 12);
        }
        return new j(u.c(new PromptMarketingContentDelegate.Model("CHECK_INBOX_ID", textLocalisedClause2, textLocalisedClause3, backgroundMediaContent, null, null, new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, button, new PromptMarketingContentDelegate.Model.Button(textLocalisedClause, (ResourceImage) null, domainState.d ? LargeActionButton.ButtonStyle.o : LargeActionButton.ButtonStyle.f58726b, z, "CHECK_INBOX_SCREEN_SECONDARY_BUTTON_TAG", 6), null, null, null, null, null, null, null, null, null, null, 2095536)));
    }
}
