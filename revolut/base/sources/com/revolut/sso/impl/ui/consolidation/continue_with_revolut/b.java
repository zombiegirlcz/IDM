package com.revolut.sso.impl.ui.consolidation.continue_with_revolut;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.domain.models.UserInfoPicture;
import com.revolut.sso.impl.ui.consolidation.continue_with_revolut.ContinueWithRevolutScreenContract$InputData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import zhm.a1;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContinueWithRevolutScreenContract$InputData f106495a;

    public b(ContinueWithRevolutScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f106495a = inputData;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Map] */
    @Override // cli.n
    public final o c(j jVar) {
        Image contactImage;
        PromptMarketingContentDelegate.Model model;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ContinueWithRevolutScreenContract$InputData continueWithRevolutScreenContract$InputData = this.f106495a;
        if (continueWithRevolutScreenContract$InputData instanceof ContinueWithRevolutScreenContract$InputData.Anonymous) {
            PromptMarketingContentDelegate.Model.Content.MediaContent mediaContent = new PromptMarketingContentDelegate.Model.Content.MediaContent(LottieImage.Companion.a(LottieImage.INSTANCE, uc0.b.a("mobile/lottie_animations_icons", "revolut_app"), false, false, null, null, 254), null);
            model = new PromptMarketingContentDelegate.Model("LIST_ID_CONTINUE_WITH_REVOLUT_ID", new TextLocalisedClause(R$string.revolut_sso_continue_with_revolut_id_continue_with_revolut_screen_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_continue_with_revolut_id_continue_with_revolut_screen_description, null, null, 14), mediaContent, null, null, new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.revolut_sso_common_actions_continue, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, new TextLocalisedClause(R$string.revolut_sso_continue_with_revolut_id_continue_with_revolut_screen_learn_more, null, null, 14), null, null, null, 1965488);
        } else {
            if (!(continueWithRevolutScreenContract$InputData instanceof ContinueWithRevolutScreenContract$InputData.Identified)) {
                throw new NoWhenBranchMatchedException();
            }
            ContinueWithRevolutScreenContract$InputData.Identified identified = (ContinueWithRevolutScreenContract$InputData.Identified) continueWithRevolutScreenContract$InputData;
            UserInfoPicture userInfoPicture = identified.f106491c;
            if (userInfoPicture != null) {
                String str = identified.f106489a;
                contactImage = new UrlImage(userInfoPicture.f106214a, null, null, null, 0L, new UrlImage.SimpleCustomHeaders(a1.m(userInfoPicture.f106216c, "X-Device-Id"), userInfoPicture.f106215b), null, null, null, new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, str, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063), false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 502718);
            } else {
                contactImage = new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, identified.f106489a, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
            }
            PromptMarketingContentDelegate.Model.Content.AvatarContent avatarContent = new PromptMarketingContentDelegate.Model.Content.AvatarContent(identified.f106490b, contactImage);
            model = new PromptMarketingContentDelegate.Model("LIST_ID_CONTINUE_WITH_REVOLUT_ID", new TextLocalisedClause(R$string.revolut_sso_continue_with_revolut_id_continue_with_revolut_screen_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_continue_with_revolut_id_continue_with_revolut_screen_description, null, null, 14), avatarContent, null, null, new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.revolut_sso_common_actions_continue, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.revolut_sso_continue_with_revolut_id_continue_with_revolut_screen_not_you, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, new TextLocalisedClause(R$string.revolut_sso_continue_with_revolut_id_continue_with_revolut_screen_learn_more, null, null, 14), null, null, null, 1964464);
        }
        return new jml.j(u.c(model));
    }
}
