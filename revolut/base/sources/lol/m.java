package lol;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.ui.password_flow.password_input.PasswordInputScreenContract$InputData;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements p {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PasswordInputScreenContract$InputData f197478a;

    public m(PasswordInputScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f197478a = inputData;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_login_input_password_password_input_hint, null, null, 14);
        boolean z = domainState.f197468b;
        InputTextDelegate.Model model = new InputTextDelegate.Model("PasswordInputStateMapper_PasswordId", null, null, textLocalisedClause, false, null, null, null, null, null, new ResourceImage(z ? R$drawable.uikit_icn_24_eye_show : R$drawable.uikit_icn_24_eye_hide, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false, null, null, false, false, (z ? 128 : SyslogConstants.LOG_LOCAL2) | 1, 1, null, false, true, "password", true, null, false, false, false, null, null, 0, -1012932618, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        Object[] elements = {model, this.f197478a.f106638b ? new PlainTextDelegate.Model("PasswordInputStateMapper_FORGOT_PASSWORD_ID", (Clause) null, (Clause) new TextLocalisedClause(R$string.revolut_sso_login_input_password_forgot_password, null, new Click(30, (Integer) null, (Object) null, "PasswordInputStateMapper_FORGOT_PASSWORD_ID", false), 10), (v5) null, (UrlImage) null, true, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65262) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        String str = domainState.f197467a;
        return new j(listL, (str != null ? str.length() : 0) > 1, domainState.f197469c);
    }
}
