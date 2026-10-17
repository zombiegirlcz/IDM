package com.revolut.feature.apm.multibanco.impl.via_verde.ui.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.multibanco.api.R$string;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.details.EnrollmentDetailsScreen;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.details.EnrollmentDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import gul.n;
import h30.l;
import h92.c;
import h92.e;
import h92.f;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/details/EnrollmentDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lh92/e;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EnrollmentDetailsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(EnrollmentDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final EnrollmentDetailsScreenContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public EnrollmentDetailsScreen(EnrollmentDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = true;
        this.N = s.t(this, h92.b.f);
        this.O = w.y0(new h43.b(8));
        this.P = w.y0(new h43.b(9));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: h92.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnrollmentDetailsScreen f150084b;

            {
                this.f150084b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EnrollmentDetailsScreen enrollmentDetailsScreen = this.f150084b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EnrollmentDetailsScreen.T;
                        EnrollmentDetailsScreen enrollmentDetailsScreen2 = this.f150084b;
                        return dli.f.a(enrollmentDetailsScreen2, (f) enrollmentDetailsScreen2.S.getValue(), v.k(new ListSubheaderDelegate(), (RowDelegate) enrollmentDetailsScreen2.O.getValue(), (CellDetailsAccountDelegate) enrollmentDetailsScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EnrollmentDetailsScreen.T;
                        qji.b bVarU2 = enrollmentDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.via_verde.ui.details.di.EnrollmentDetailsScreenInjector");
                        g92.f fVar = (g92.f) bVarU2;
                        g92.e eVar = fVar.f141447a;
                        g92.f fVar2 = fVar.f141448b;
                        EnrollmentDetailsScreenContract$InputData enrollmentDetailsScreenContract$InputData = enrollmentDetailsScreen.K;
                        enrollmentDetailsScreenContract$InputData.getClass();
                        return new g92.a(eVar, fVar2, enrollmentDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EnrollmentDetailsScreen.T;
                        return (f) ((g92.a) enrollmentDetailsScreen.R.getValue()).f141430c.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: h92.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnrollmentDetailsScreen f150084b;

            {
                this.f150084b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EnrollmentDetailsScreen enrollmentDetailsScreen = this.f150084b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EnrollmentDetailsScreen.T;
                        EnrollmentDetailsScreen enrollmentDetailsScreen2 = this.f150084b;
                        return dli.f.a(enrollmentDetailsScreen2, (f) enrollmentDetailsScreen2.S.getValue(), v.k(new ListSubheaderDelegate(), (RowDelegate) enrollmentDetailsScreen2.O.getValue(), (CellDetailsAccountDelegate) enrollmentDetailsScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EnrollmentDetailsScreen.T;
                        qji.b bVarU2 = enrollmentDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.via_verde.ui.details.di.EnrollmentDetailsScreenInjector");
                        g92.f fVar = (g92.f) bVarU2;
                        g92.e eVar = fVar.f141447a;
                        g92.f fVar2 = fVar.f141448b;
                        EnrollmentDetailsScreenContract$InputData enrollmentDetailsScreenContract$InputData = enrollmentDetailsScreen.K;
                        enrollmentDetailsScreenContract$InputData.getClass();
                        return new g92.a(eVar, fVar2, enrollmentDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EnrollmentDetailsScreen.T;
                        return (f) ((g92.a) enrollmentDetailsScreen.R.getValue()).f141430c.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: h92.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnrollmentDetailsScreen f150084b;

            {
                this.f150084b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EnrollmentDetailsScreen enrollmentDetailsScreen = this.f150084b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EnrollmentDetailsScreen.T;
                        EnrollmentDetailsScreen enrollmentDetailsScreen2 = this.f150084b;
                        return dli.f.a(enrollmentDetailsScreen2, (f) enrollmentDetailsScreen2.S.getValue(), v.k(new ListSubheaderDelegate(), (RowDelegate) enrollmentDetailsScreen2.O.getValue(), (CellDetailsAccountDelegate) enrollmentDetailsScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EnrollmentDetailsScreen.T;
                        qji.b bVarU2 = enrollmentDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.via_verde.ui.details.di.EnrollmentDetailsScreenInjector");
                        g92.f fVar = (g92.f) bVarU2;
                        g92.e eVar = fVar.f141447a;
                        g92.f fVar2 = fVar.f141448b;
                        EnrollmentDetailsScreenContract$InputData enrollmentDetailsScreenContract$InputData = enrollmentDetailsScreen.K;
                        enrollmentDetailsScreenContract$InputData.getClass();
                        return new g92.a(eVar, fVar2, enrollmentDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EnrollmentDetailsScreen.T;
                        return (f) ((g92.a) enrollmentDetailsScreen.R.getValue()).f141430c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextClause textClause = uiState.f150088b;
        navBarWithToolbar.setTitle(textClause, null);
        navBarWithToolbar.setToolbarTitle(textClause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((b) ((f) this.S.getValue())).C2(q.f5292a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g92.a) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((g92.a) this.R.getValue()).getClass();
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.via_verde_identifier_details_header_subtitle, null, null, 14);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.multibanco_back, null, null, 14), 126));
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, l.y(d3().f174539b.f59410q, d3().f174539b.f59409p.f57336l, "merge(...)"), null, new gqh.o(this, continuation, 22), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsAccountDelegate) this.P.getValue()).d), null, new n(this, continuation, 24), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.O.getValue()).f53218h), null, new c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
