package gh8;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_graduation.impl.R$string;
import com.revolut.feature.junior_graduation.impl.ui.screen.identification.JuniorIdentificationScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorIdentificationScreenContract$InputData f143889a;

    public o(JuniorIdentificationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f143889a = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = R$string.junior_graduation_junior_user_identification_welcome_screen_facelift_title;
        JuniorIdentificationScreenContract$InputData juniorIdentificationScreenContract$InputData = this.f143889a;
        return new j(u.c(new PromptMarketingContentDelegate.Model("GRADUATION_WELCOME_PROMPT_ID", new TextLocalisedClause(i, u.c(new TextClause(juniorIdentificationScreenContract$InputData.f76937a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.junior_graduation_junior_user_identification_welcome_screen_facelift_subtitle, u.c(new TextClause(juniorIdentificationScreenContract$InputData.f76938b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new PromptMarketingContentDelegate.Model.Content.MediaContent(new GlyphImage(R$drawable.uikit_icn_24_person_checked, null, null, 6), null), null, null, null, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.junior_graduation_junior_user_identification_welcome_screen_facelift_primary_action, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.junior_graduation_junior_user_identification_welcome_screen_facelift_secondary_action, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, "LOADING_TAG_GRADUATION_WELCOME_SECONDARY", 30), null, null, null, null, null, null, null, null, null, null, 2095536)));
    }
}
