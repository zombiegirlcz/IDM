package gkk;

import au0.q0;
import aw0.o9;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import hha.s;
import hha.w0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements cli.n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yik.b f144429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f144430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yik.g f144431c;

    public n(yik.b animatedBackgroundTypeMapper, cjk.a familyPlanPricingProvider, cjk.b familyPlansTermsProvider, gte.a featureToggleInteractor, yik.g pricingPlanAvatarMapper) {
        Intrinsics.checkNotNullParameter(animatedBackgroundTypeMapper, "animatedBackgroundTypeMapper");
        Intrinsics.checkNotNullParameter(familyPlanPricingProvider, "familyPlanPricingProvider");
        Intrinsics.checkNotNullParameter(familyPlansTermsProvider, "familyPlansTermsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanAvatarMapper, "pricingPlanAvatarMapper");
        this.f144429a = animatedBackgroundTypeMapper;
        this.f144430b = featureToggleInteractor;
        this.f144431c = pricingPlanAvatarMapper;
    }

    public static int a(hha.i iVar) {
        return (iVar == null ? -1 : m.f144428a[iVar.ordinal()]) == 1 ? R$string.family_plans_intro_price_title_price_yearly : R$string.family_plans_intro_price_title_price_monthly;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        q0 q0Var;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f144412a, new gk7.a(this, 4), new gcc.c(20), new fyg.b(this, domainState, 16));
        Data data = domainState.f144412a;
        ggk.a aVar = (ggk.a) data.getContent();
        hha.d dVar = aVar != null ? aVar.f143698b : null;
        do3.n nVar = (do3.n) domainState.f144414c.getContent();
        gte.a aVar2 = this.f144430b;
        if (dVar != null) {
            textLocalisedClause = ((jte.d) aVar2).c(PricingPlansUiApi$Toggles.FamilyPlansRedesignBillingCycleExtras.f102630c) ? new TextLocalisedClause(R$string.family_plans_intro_header_add_member_title, null, null, 14) : new TextLocalisedClause(R$string.family_plans_intro_title, u.c(dok.g.d(dVar, null)), null, 12);
        } else {
            textLocalisedClause = null;
        }
        PricingPlansUiApi$Toggles.FamilyPlansRedesignBillingCycleExtras familyPlansRedesignBillingCycleExtras = PricingPlansUiApi$Toggles.FamilyPlansRedesignBillingCycleExtras.f102630c;
        TextLocalisedClause textLocalisedClause2 = (!((jte.d) aVar2).c(familyPlansRedesignBillingCycleExtras) || dVar == null) ? null : new TextLocalisedClause(R$string.family_plans_intro_header_add_member_subtitle, u.c(dok.g.d(dVar, null)), null, 12);
        if (dVar == null || nVar == null) {
            q0Var = null;
        } else {
            w0 w0VarF = s.f(dVar);
            yik.g gVar = this.f144431c;
            AvatarModel.Border.StaticGradient staticGradientC = gVar.c(w0VarF);
            q0Var = new q0(new AvatarModel.Default(new UserAvatarImage(new UserNamePlaceholder.Default(w.I(nVar)), gVar.d(s.f(dVar)), null, 4), null, staticGradientC, null, null, null, 122), new AvatarModel.Default(new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4095), null, staticGradientC, null, null, null, 122), new TagViewData(null, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, R$attr.uikit_colorTransparent, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION));
        }
        return new i(list, textLocalisedClause != null ? new h(q0Var, textLocalisedClause, textLocalisedClause2) : null, dVar != null ? fgk.a.a(this.f144429a, dVar) : null, ((jte.d) aVar2).c(familyPlansRedesignBillingCycleExtras) ? new TextLocalisedClause(R$string.family_plans_intro_action_continue, null, null, 14) : dVar != null ? new TextLocalisedClause(R$string.family_plans_intro_action_upgrade_to_duo_plan, u.c(dok.g.d(dVar, null)), null, 12) : null, ((jte.d) aVar2).c(familyPlansRedesignBillingCycleExtras) ? new TextLocalisedClause(R$string.family_plans_intro_footer_available_in_same_country, null, null, 14) : (Clause) iii.c.f(t1.t(data, domainState.f144413b), new gk7.a(5), new gcc.c(21), new fq7.k(this, 27)));
    }
}
