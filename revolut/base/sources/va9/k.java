package va9;

import android.os.Parcelable;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.onboarding.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cli.n
    public final o c(cli.j domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.signup_error_registered_title, null, null, 14);
        CompositeClause compositeClause = new CompositeClause(v.k(new TextLocalisedClause(R$string.signup_error_registered_description, null, null, 14), new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.signup_error_registered_link, null, new Click(22, (Integer) null, (Object) null, "DUPLICATE_ACCOUNT_LEARN_MORE_ID", true), 10)), null, null, null, 14);
        PromptMarketingContentDelegate.Model.Content.MediaContent mediaContent = new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D028", null, null, null, 30), null);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.signup_error_registered_action, null, null, 14);
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) textLocalisedClause2, (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
        LargeActionButton.ButtonStyle buttonStyle = null;
        boolean z = false;
        Object[] objArr = 0 == true ? 1 : 0;
        PromptMarketingContentDelegate.Model.Footer footer = null;
        Object obj2 = null;
        Parcelable parcelable = null;
        String str = null;
        String str2 = null;
        Clause clause = null;
        PromptMarketingContentDelegate.Model.AnimationType animationType = null;
        AnimationRequest animationRequest = null;
        return new h(u.c(new PromptMarketingContentDelegate.Model("DUPLICATE_ACCOUNT_PROMPT_ID", textLocalisedClause, compositeClause, mediaContent, null, null, null, null, 0 == true ? 1 : 0, button, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.signup_duplicate_check_secondary_action, null, null, 14), (ResourceImage) objArr, buttonStyle, z, (String) null, 62), 0 == true ? 1 : 0, footer, obj2, parcelable, str, str2, clause, animationType, animationRequest, null, 2095536)));
    }
}
