package mb9;

import android.os.Parcelable;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.id;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.onboarding.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements n {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // cli.n
    public final o c(j domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.signup_pep_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.signup_pep_subtitle, null, null, 14);
        PromptMarketingContentDelegate.Model.Content.MediaContent mediaContent = new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D177", null, null, null, 30), null);
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_no, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
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
        return new f(u.c(new PromptMarketingContentDelegate.Model("politically_exposed_person_list_id", textLocalisedClause, textLocalisedClause2, mediaContent, null, null, null, null, 0 == true ? 1 : 0, button, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_yes, null, null, 14), (ResourceImage) objArr, buttonStyle, z, (String) null, 62), id.HORIZONTAL, footer, obj2, parcelable, str, str2, clause, animationType, animationRequest, null, 2093488)));
    }
}
