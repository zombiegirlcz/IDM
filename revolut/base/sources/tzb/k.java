package tzb;

import au0.u0;
import au0.z0;
import aw0.n6;
import aw0.o9;
import aw0.s8;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationTargetingOnboardingCta;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationTargetingOnboardingPrompt;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationTargetingOnboardingStep;
import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
import ip0.ck0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f275912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ozb.e f275913b;

    public k(f01.c uiKitResources, ozb.e revPointsDisclaimerUIMapper) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(revPointsDisclaimerUIMapper, "revPointsDisclaimerUIMapper");
        this.f275912a = uiKitResources;
        this.f275913b = revPointsDisclaimerUIMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        TextDelegate.Model model = new TextDelegate.Model("SUBTITLE_ITEM_ID", new TextClause(domainState.f275902a.f84025b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, new ck0(0), null, null, 0, 0, 0, 0, 2036);
        int i = R$attr.uikit_dp0;
        int i2 = R$attr.uikit_dp8;
        yp0.b.p(model, i, i, i2, i2);
        eVarB.add(model);
        RevPointsPersonalisationTargetingOnboardingPrompt revPointsPersonalisationTargetingOnboardingPrompt = domainState.f275902a;
        ArrayList arrayList = revPointsPersonalisationTargetingOnboardingPrompt.d;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i3 = 0;
        for (Object obj2 : arrayList) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                v.s();
                throw null;
            }
            RevPointsPersonalisationTargetingOnboardingStep revPointsPersonalisationTargetingOnboardingStep = (RevPointsPersonalisationTargetingOnboardingStep) obj2;
            String strN = a0.d.n("STEP_ITEM_ID_PREFIX_", i3);
            TextClause textClause = new TextClause(revPointsPersonalisationTargetingOnboardingStep.f84030a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextClause textClause2 = new TextClause(revPointsPersonalisationTargetingOnboardingStep.f84031b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str = revPointsPersonalisationTargetingOnboardingStep.f84032c;
            int iA = this.f275912a.a(str);
            if (iA == 0) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Icon ", str, " not found"));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                iA = R$drawable.uikit_icn_24_revolut;
            }
            arrayList2.add(new RowDelegate.Model(strN, new RowDelegate.Model.MainImage.Image24(new ResourceImage(iA, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), textClause, null, 0, textClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
            i3 = i5;
        }
        eVarB.addAll(arrayList2);
        aim.e eVarA = u.a(eVarB);
        e eVar = new e(new TextClause(revPointsPersonalisationTargetingOnboardingPrompt.f84024a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), u.c(new u0(new NavBarWithContainerBackground.ImageBackground(new UrlImage(revPointsPersonalisationTargetingOnboardingPrompt.f84026c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), (s8) null, (Color.SolidRes) null, 14), new z0(new TextClause(revPointsPersonalisationTargetingOnboardingPrompt.f84024a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false), null, null)));
        int i6 = R$string.rev_points_targeting_prompt_action_continue_personalised;
        RevPointsPersonalisationTargetingOnboardingCta revPointsPersonalisationTargetingOnboardingCta = revPointsPersonalisationTargetingOnboardingPrompt.f;
        RevPointsTextWithLinks revPointsTextWithLinks = revPointsPersonalisationTargetingOnboardingPrompt.e;
        n6 n6Var = new n6(new TextLocalisedClause(i6, u.c(new TextClause(revPointsPersonalisationTargetingOnboardingCta.f84022a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), LargeActionButton.ButtonStyle.f58725a, null, "PRIMARY_ACTION_FOOTER_BUTTON_ITEM_ID", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        RevPointsPersonalisationTargetingOnboardingCta revPointsPersonalisationTargetingOnboardingCta2 = revPointsPersonalisationTargetingOnboardingPrompt.f84027g;
        ozb.e eVar2 = this.f275913b;
        return new f(eVarA, eVar, revPointsPersonalisationTargetingOnboardingCta2 != null ? new aw0.h(true, n6Var, new n6(new TextLocalisedClause(R$string.rev_points_targeting_prompt_action_keep_generic, u.c(new TextClause(revPointsPersonalisationTargetingOnboardingCta2.f84022a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), LargeActionButton.ButtonStyle.o, null, "SECONDARY_ACTION_FOOTER_ITEM_ID", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), eVar2.a(revPointsTextWithLinks), null, null, 112) : new aw0.e(true, eVar2.a(revPointsTextWithLinks), null, n6Var, null, null, 52));
    }
}
