package d74;

import aw0.t0;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentRetention;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.preferences.LegacyConsentPreferencesScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LegacyConsentPreferencesScreenContract$InputData f111823a;

    public n(LegacyConsentPreferencesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f111823a = inputData;
    }

    public static CellDetailsDelegate.Model a(ConsentRetention consentRetention, String str, TextLocalisedClause textLocalisedClause, Clause clause) {
        return new CellDetailsDelegate.Model(str, new t0((Clause) textLocalisedClause, (Image) null, 0, false, 30), clause, null, consentRetention, null, null, 0, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, true, null, null, 25528);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (l) iii.c.f(domainState.f111811a, new d6j.b(this, 12), new czh.a(this, 24), new cf1.h(this, 21));
    }
}
