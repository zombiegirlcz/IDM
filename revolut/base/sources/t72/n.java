package t72;

import android.os.Parcelable;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.id;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.w60;
import ip0.x60;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        f fVar = domainState.f268410a;
        if (fVar == null) {
            return new k(u.c(new x60("ID_PROMPT_LOADING", w60.BACKGROUND_ASSET, null)));
        }
        TextLocalisedClause textLocalisedClause = fVar.f268412b;
        TextLocalisedClause textLocalisedClause2 = fVar.f268413c;
        PromptMarketingContentDelegate.Model.Content.MediaContent mediaContent = new PromptMarketingContentDelegate.Model.Content.MediaContent(fVar.f268411a, null);
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) fVar.d, (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
        LargeActionButton.ButtonStyle buttonStyle = null;
        boolean z = false;
        Object[] objArr = 0 == true ? 1 : 0;
        id idVar = null;
        PromptMarketingContentDelegate.Model.Footer footer = null;
        Object obj2 = null;
        Parcelable parcelable = null;
        String str = null;
        String str2 = null;
        Clause clause = null;
        PromptMarketingContentDelegate.Model.AnimationType animationType = null;
        AnimationRequest animationRequest = null;
        return new k(u.c(new PromptMarketingContentDelegate.Model("ID_PROMPT", textLocalisedClause, textLocalisedClause2, mediaContent, null, null, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, button, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), (ResourceImage) objArr, buttonStyle, z, (String) null, 62), idVar, footer, obj2, parcelable, str, str2, clause, animationType, animationRequest, null, 2095536)));
    }
}
