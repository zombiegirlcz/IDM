package ih8;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.feature.junior_graduation.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg8.a f161306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z70.a f161307b;

    public k(lg8.a inputData, z70.a contextProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.f161306a = inputData;
        this.f161307b = contextProvider;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.signup_personalised_welcome_title, u.c(this.f161306a.f195083a.f76909a), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.signup_personalised_welcome_subtitle, null, null, 14);
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.signup_personalised_welcome_login_button, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
        PromptMarketingContentDelegate.Model.Button button2 = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.signup_personalised_welcome_secondary_button, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.o, false, (String) null, 54);
        domainState.getClass();
        return new g(u.c(new PromptMarketingContentDelegate.Model("JUNIOR_PERSONALISED_SCREEN_PROMPT_ID", textLocalisedClause, textLocalisedClause2, new PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent(new UrlVideo("https://assets.revolut.com/published-assets-v3/4dd61b5d-8ec4-4654-90f3-90624669bfc2/4d8124e7-7a34-40a2-bc93-de5292c6f0fc.mp4", (String) null, false, oz0.b.CENTER_CROP, false, (oz0.c) null, LDSFile.EF_DG4_TAG), null, null, 6), null, null, null, null, null, button, button2, null, null, null, null, null, null, null, new PromptMarketingContentDelegate.Model.AnimationType.SlideInAndFadeIn(0L, 500L, kli.a.l(this.f161307b.getContext(), 100.0f)), new AnimationRequest(false), null, 1309104)));
    }
}
