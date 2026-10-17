package qa9;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.onboarding.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f243977a;

    public a(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f243977a = featureToggleInteractor;
    }

    public static TextLocalisedClause a(int i, String str) {
        return new TextLocalisedClause(i, null, new Click(30, (Integer) null, (Object) null, str, false), 10);
    }

    public static Clause b(String str) {
        return yoj.b.w(yoj.b.w(new TextLocalisedClause(R$string.signup_registration_country_footer, zhm.v.k(a(R$string.signup_input_passcode_TnC, str), a(R$string.signup_agreement_privacy_policy, "PRIVACY_LINK_ID")), null, 12), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new TextLocalisedClause(R$string.signup_registration_encryption_note, null, null, 14));
    }
}
