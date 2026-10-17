package eyi;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.ad;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.retail.feature.airportlounges.impl.R$plurals;
import java.time.chrono.ChronoZonedDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import org.jetbrains.annotations.NotNull;
import yik.h;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f130863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f130864b;

    public b(e dateProvider, h pricingPlanStringMapper) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        this.f130863a = dateProvider;
        this.f130864b = pricingPlanStringMapper;
    }

    public static PromptContentDelegate.Model c(Clause clause, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3) {
        return new PromptContentDelegate.Model("AIRPORT_LOUNGES_PASS_WELCOME_PROMPT", textLocalisedClause, clause, null, new ad(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D009", null, null, null, 30), false), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), textLocalisedClause2, null, false, textLocalisedClause3, null, null, null, null, null, null, false, null, false, null, null, null, PromptContentDelegate.Model.BackgroundType.Dialog.f53074a, null, null, null, null, null, 532675976);
    }

    public final TextLocalisedClause a(PricingPlanSubscription pricingPlanSubscription, int i, int i2, int i3, long j2) {
        if (jli.b.g(pricingPlanSubscription.e).compareTo((ChronoZonedDateTime<?>) ((f) this.f130863a).k().minusDays(j2)) <= 0) {
            i = i2;
        }
        return new TextLocalisedClause(i, u.c(new TextLocalisedClause(i3, null, new Click(30, (Integer) null, (Object) null, "ID_TERMS_AND_CONDITIONS_CLAUSE", false), 10)), null, 12);
    }

    public final PromptContentDelegate.Model b(PricingPlanSubscription pricingPlanSubscription, int i, int i2, int i3, int i5, int i6, int i21, int i22) {
        return c(i > 0 ? new TextLocalisedQuantityClause(R$plurals.airport_lounges_free_guest_prompt_subtitle, Integer.valueOf(i), v.k(fgk.b.a(this.f130864b, pricingPlanSubscription.f81129a), Integer.valueOf(i)), (Style) null, 24) : new TextLocalisedClause(i3, null, null, 14), new TextLocalisedClause(i2, null, null, 14), a(pricingPlanSubscription, i5, i6, i21, 14L), new TextLocalisedClause(i22, null, null, 14));
    }
}
