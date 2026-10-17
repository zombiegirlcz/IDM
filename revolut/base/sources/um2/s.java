package um2;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import aw0.o9;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.CircleActionButtonsBarView;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.feature.backgroundpicker.impl.R$id;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$InputData;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$SandboxAppearance;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationController;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mx0.q4;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class s implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThemeCustomisationController f281219b;

    public /* synthetic */ s(ThemeCustomisationController themeCustomisationController, int i) {
        this.f281218a = i;
        this.f281219b = themeCustomisationController;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        xjg.m mVar;
        com.revolut.kompot.navigable.a aVar;
        Activity activityM2;
        Context applicationContext;
        int i;
        int i2 = this.f281218a;
        boolean zQ = false;
        ThemeCustomisationController themeCustomisationController = this.f281219b;
        switch (i2) {
            case 0:
                ThemeCustomisationController.Companion aVar2 = ThemeCustomisationController.INSTANCE;
                FooterTextView footerTextView = themeCustomisationController.d3().e;
                m70.a.c(t0.f186434a);
                footerTextView.setTextClause(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                return Unit.f186387a;
            case 1:
                ThemeCustomisationController.Companion aVar3 = ThemeCustomisationController.INSTANCE;
                pm2.d dVar = (pm2.d) themeCustomisationController.V.getValue();
                ThemeCustomisationContract$InputData themeCustomisationContract$InputData = dVar.f237463a;
                xm2.c cVar = new xm2.c();
                xm2.e eVar = new xm2.e();
                xm2.f revPointsTextProvider = new xm2.f();
                Intrinsics.checkNotNullParameter(revPointsTextProvider, "revPointsTextProvider");
                xm2.h hVar = new xm2.h();
                pm2.c cVar2 = dVar.f237465c;
                ckg.a aVar4 = cVar2.f237460b;
                xm2.a aVar5 = new xm2.a(new fkg.c(new fkg.a(aVar4.f24834a)), dVar.f237464b);
                hm2.a aVar6 = (hm2.a) cVar2.f237461c;
                gm2.a backgroundPickerConfig = new gm2.a();
                xm2.f revPointsTextProvider2 = new xm2.f();
                Intrinsics.checkNotNullParameter(backgroundPickerConfig, "backgroundPickerConfig");
                Intrinsics.checkNotNullParameter(revPointsTextProvider2, "revPointsTextProvider");
                j0 j0Var = new j0(cVar, eVar, hVar, aVar5, new xm2.b(), new gm2.a());
                l70.e eVar2 = cVar2.f;
                k70.a aVar7 = (k70.a) eVar2.v.get();
                vc.s.j(aVar7);
                r10.v vVarA = aVar6.a();
                l80.e eVarH = eVar2.h();
                vc.s.j(eVarH);
                h0 h0Var = new h0(eVarH);
                hm2.e eVar3 = new hm2.e();
                mk0.a aVarA = cVar2.d.d.a();
                vc.s.j(aVarA);
                km2.x xVar = new km2.x(aVarA);
                bn2.e0 e0Var = (bn2.e0) dVar.d.get();
                bn2.j0 j0VarA = cVar2.a();
                lg3.a aVarA2 = ((og3.e) cVar2.e).a();
                vc.s.j(aVarA2);
                vjg.g gVarA = aVar4.a();
                vc.s.j(gVarA);
                return new com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b(themeCustomisationContract$InputData, j0Var, aVar7, vVarA, h0Var, eVar3, xVar, e0Var, j0VarA, aVarA2, gVarA, new wm2.b(), new gm2.a());
            case 2:
                ThemeCustomisationController.Companion aVar8 = ThemeCustomisationController.INSTANCE;
                return tki.g.b(themeCustomisationController, themeCustomisationController.d());
            case 3:
                ThemeCustomisationController.Companion aVar9 = ThemeCustomisationController.INSTANCE;
                FooterTextView footerTextView2 = themeCustomisationController.d3().e;
                m70.a.c(t0.f186434a);
                footerTextView2.setTextClause(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                return Unit.f186387a;
            case 4:
                ThemeCustomisationController.Companion aVar10 = ThemeCustomisationController.INSTANCE;
                FooterTextView footerTextView3 = themeCustomisationController.d3().e;
                m70.a.c(t0.f186434a);
                footerTextView3.setTextClause(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                return Unit.f186387a;
            case 5:
                ThemeCustomisationController.Companion aVar11 = ThemeCustomisationController.INSTANCE;
                Context context = themeCustomisationController.d3().f207134c.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                q4 q4Var = new q4(context, null);
                q4Var.setId(R$id.themeCustomisation_iconSelectorView);
                q4Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 17));
                return q4Var;
            case 6:
                ThemeCustomisationController.Companion aVar12 = ThemeCustomisationController.INSTANCE;
                Context context2 = themeCustomisationController.d3().f207134c.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                CircleActionButtonsBarView circleActionButtonsBarView = new CircleActionButtonsBarView(context2, null, 6, 0);
                circleActionButtonsBarView.setId(R$id.themeCustomisation_menuActionsView);
                circleActionButtonsBarView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 17));
                return circleActionButtonsBarView;
            case 7:
                ThemeCustomisationController.Companion aVar13 = ThemeCustomisationController.INSTANCE;
                Context context3 = themeCustomisationController.d3().f207134c.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                FooterTextView footerTextView4 = new FooterTextView(context3, null, 6, 0);
                footerTextView4.setId(R$id.themeCustomisation_detailsView);
                footerTextView4.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 48));
                return footerTextView4;
            case 8:
                ThemeCustomisationContract$SandboxAppearance themeCustomisationContract$SandboxAppearance = themeCustomisationController.K.d;
                if (themeCustomisationContract$SandboxAppearance == null || (mVar = themeCustomisationContract$SandboxAppearance.f63774a) == null || (aVar = themeCustomisationController.f98405m) == null || (activityM2 = aVar.m2()) == null || (applicationContext = activityM2.getApplicationContext()) == null) {
                    return null;
                }
                int i3 = t.f281220a[mVar.ordinal()];
                if (i3 == 1) {
                    zQ = kli.a.q(applicationContext);
                } else if (i3 != 2) {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zQ = true;
                }
                if (zQ) {
                    i = R$style.UiKitTheme_Night;
                } else {
                    if (zQ) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$style.UiKitTheme_Day;
                }
                return Integer.valueOf(i);
            case 9:
                ThemeCustomisationContract$SandboxAppearance themeCustomisationContract$SandboxAppearance2 = themeCustomisationController.K.d;
                if ((themeCustomisationContract$SandboxAppearance2 != null ? themeCustomisationContract$SandboxAppearance2.f63775b : null) == null || !themeCustomisationController.q2().d()) {
                    return null;
                }
                return y0.b(Integer.valueOf(R$style.UiKitThemeOverlay_Elevated));
            default:
                ThemeCustomisationController.Companion aVar14 = ThemeCustomisationController.INSTANCE;
                phm.a aVar15 = (phm.a) ue0.e.j(themeCustomisationController.m2()).a().get(pm2.h.class);
                b60.a aVar16 = aVar15 != null ? (b60.a) aVar15.get() : null;
                if (aVar16 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", pm2.h.class, " is not found"));
                }
                pm2.c cVar3 = ((pm2.c) aVar16.b()).f237462g;
                ThemeCustomisationContract$InputData themeCustomisationContract$InputData2 = themeCustomisationController.K;
                themeCustomisationContract$InputData2.getClass();
                return new pm2.d(cVar3, themeCustomisationContract$InputData2, new uhl.b(themeCustomisationController, 22));
        }
    }
}
