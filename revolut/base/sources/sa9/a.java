package sa9;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.onboarding.impl.R$string;
import ip0.iq;
import java.util.List;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements d {
    @Override // sa9.d
    public final List b() {
        return f0.f322471a;
    }

    @Override // sa9.d
    public final List c(boolean z) {
        InputChecklistDelegate.Model model = new InputChecklistDelegate.Model("country_explicit_consent_item_id", new TextLocalisedClause(R$string.signup_registration_country_consent_checkbox_title, null, null, 14), z, false, null, iq.CHECK_BUTTON, null, null, null, null, 0, 0, 0, 524248);
        yp0.b.l(model, R$attr.uikit_dp0, 0, 0, 0, null, false, 62);
        return u.c(model);
    }

    @Override // sa9.d
    public final List d() {
        return f0.f322471a;
    }
}
