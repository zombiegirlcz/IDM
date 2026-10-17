package enl;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.sso.api.R$string;
import java.util.List;
import jki.i;
import jki.j;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(i iVar) {
        j domainState = (j) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new c(u.c(new PromptMarketingContentDelegate.Model("FACE_OTP_CHALLENGE_PROMPT_ID", new TextLocalisedClause(R$string.revolut_sso_face_otp_reviewing_submission_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_face_otp_reviewing_submission_description, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d007", null, null, null, 30), null), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097072)));
    }
}
