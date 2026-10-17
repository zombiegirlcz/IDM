package eai;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.id;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.feature_retail_user_declarations.citizenship.citizenship_prompt.NationalityPromptScreenContract$InputData;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NationalityPromptScreenContract$InputData f124266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n8b.a f124267b;

    public m(NationalityPromptScreenContract$InputData inputData, n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f124266a = inputData;
        this.f124267b = countryInteractor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        Integer numA;
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        NationalityPromptScreenContract$InputData nationalityPromptScreenContract$InputData = this.f124266a;
        wi0.b bVar = nationalityPromptScreenContract$InputData.f97509a;
        if (com.bumptech.glide.d.t(bVar)) {
            textLocalisedClause = new TextLocalisedClause(R$string.nationality_prompt_jp_title, null, null, 14);
        } else {
            int i = R$string.kyc_confirm_nationality_prompt_title;
            String lowerCase = bVar.f297794a.toLowerCase(Locale.ROOT);
            textLocalisedClause = new TextLocalisedClause(i, u.c(new TextLocalisedClause(t61.a.p(lowerCase, "toLowerCase(...)", "country_name_with_article.", lowerCase), (List) null, (Clause) new TextClause(((o8b.c) this.f124267b).b(bVar.f297794a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 22)), null, 12);
        }
        TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
        Clause textLocalisedClause3 = nationalityPromptScreenContract$InputData.f97510b;
        if (textLocalisedClause3 == null) {
            textLocalisedClause3 = new TextLocalisedClause(R$string.kyc_confirm_nationality_prompt_subtitle, null, null, 14);
        }
        Clause clause = textLocalisedClause3;
        String lowerCase2 = bVar.f297794a.toLowerCase(Locale.ROOT);
        PromptMarketingContentDelegate.Model.Content.MediaContent mediaContent = new PromptMarketingContentDelegate.Model.Content.MediaContent(new CdnImage(t61.a.p(lowerCase2, "toLowerCase(...)", "flag_", lowerCase2), "mobile/flags", null, null, null, null, Constants.TAG_FC_SPEED_MODE), null);
        rbl.a aVar = nationalityPromptScreenContract$InputData.f97511c;
        int i2 = 54;
        ResourceImage resourceImage = null;
        boolean z = false;
        return new i(u.c(new PromptMarketingContentDelegate.Model("ID_PROMPT_ITEM", textLocalisedClause2, clause, mediaContent, null, null, (aVar == null || (numA = aVar.a()) == null) ? null : new ResourceImage(numA.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_no, null, null, 14), resourceImage, LargeActionButton.ButtonStyle.f58726b, z, (String) null, i2), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_yes, null, null, 14), resourceImage, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, z, (String) (0 == true ? 1 : 0), i2), id.HORIZONTAL, null, null, resourceImage, null, null, 0 == true ? 1 : 0, null, null, null, 2093488)));
    }
}
