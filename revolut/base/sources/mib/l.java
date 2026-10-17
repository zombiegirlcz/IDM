package mib;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.salary_account.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.salaried_growth_work_email_verification_email_sent_title, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        String str = domainState.f205636a;
        return new g(u.c(new PromptMarketingContentDelegate.Model("WORK_EMAIL_VERIFICATION_ID", textLocalisedClause, (str == null || d0.W(str)) ? new TextLocalisedClause(R$string.salaried_growth_work_email_verification_email_sent_no_email_description, null, null, 14) : new TextLocalisedClause(R$string.salaried_growth_work_email_verification_email_sent_description, u.c(str), null, 12), new PromptMarketingContentDelegate.Model.Content.MediaContent(new GlyphImage(R$drawable.uikit_icn_24_envelope, null, null, 6), null), null, null, resourceImage, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097072)));
    }
}
