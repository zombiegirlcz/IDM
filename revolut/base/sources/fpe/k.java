package fpe;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.id;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.tax_residency.impl.R$string;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f137093a;

    public k(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f137093a = uiKitResources;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        wi0.b bVar = domainState.f137091a;
        int i = R$string.tax_residency_intro_prompt_title;
        String lowerCase = bVar.f297794a.toLowerCase(Locale.ROOT);
        return new i(u.c(new PromptMarketingContentDelegate.Model("tax_residency_sole_list_id", new TextClause(jli.g.b(this.f137093a.b(new TextLocalisedClause(i, u.c(new TextLocalisedClause(t61.a.p(lowerCase, "toLowerCase(...)", "country_name_with_article.", lowerCase), (List) null, (Clause) null, false, 30)), null, 12)).toString()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new CompositeClause(v.k(new TextLocalisedClause(R$string.tax_residency_signup_intro_subtitle_mandatory, null, null, 14), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.tax_residency_intro_prompt_link, null, new Click(22, (Integer) null, (Object) null, "TAX_SOLE_PROMPT_LINK_ID", true), 10)), null, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D299", null, null, null, 30), null), null, null, null, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_yes, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, "PRIMARY_BUTTON_LOADING_TAG", 30), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_no, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, "SECONDARY_BUTTON_LOADING_TAG", 30), id.HORIZONTAL, null, null, null, null, null, null, null, null, null, 2093488)));
    }
}
