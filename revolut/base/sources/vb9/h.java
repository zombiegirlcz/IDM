package vb9;

import android.content.Context;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.ld;
import com.revolut.core.ui_kit.delegates.pd;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.feature.onboarding.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements n {

    @NotNull
    private static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f287452a;

    public h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f287452a = context;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new e(u.c(new PromptMarketingContentDelegate.Model("ACTIVATION_READY_PROMPT_ID", new TextLocalisedClause(R$string.waiting_list_activation_ready_prompt_title, null, null, 14), new TextLocalisedClause(R$string.waiting_list_activation_ready_prompt_subtitle, null, null, 14), new PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent(new UrlVideo("https://assets.revolut.com/mobile/onboarding/waitlist/activation_background.mp4", (String) null, false, oz0.b.CENTER_CROP, false, (oz0.c) null, 114), null, null, 6), null, pd.BLACK, null, ld.CAPTION, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, new PromptMarketingContentDelegate.Model.AnimationType.SlideInAndFadeIn(2300L, 1000L, this.f287452a.getResources().getDisplayMetrics().heightPixels), new AnimationRequest(false), null, 1309968)));
    }
}
