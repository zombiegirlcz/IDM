package hmc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f153649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f153650b;

    public m(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f153649a = featureToggleInteractor;
        this.f153650b = te0.w.y0(new h1g.a(this, 24));
    }

    public final RowDelegate.Model a(String str, boolean z) {
        WealthUiApi$Toggles.RoboStrategies roboStrategies = WealthUiApi$Toggles.RoboStrategies.f95863c;
        gte.a aVar = this.f153649a;
        return new RowDelegate.Model("retake-assessment-cell", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_document, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), null, null, false, null, false, 62), new TextLocalisedClause(((jte.d) aVar).c(roboStrategies) ? R$string.wealth_strategies_settings_retake_assessment_title : R$string.wealth_robo_settings_retake_assessment_title, null, null, 14), null, 0, new TextLocalisedClause(((jte.d) aVar).c(roboStrategies) ? R$string.wealth_strategies_settings_retake_assessment_description : R$string.wealth_robo_settings_retake_assessment_description, null, null, 14), null, null, 0, null, z, null, false, z ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a, null, null, null, null, null, z ? new t(str) : null, null, 0, 0, 0, 0, 532658136);
    }
}
