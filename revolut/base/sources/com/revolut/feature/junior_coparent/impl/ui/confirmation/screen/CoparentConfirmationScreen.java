package com.revolut.feature.junior_coparent.impl.ui.confirmation.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.junior_coparent.impl.R$string;
import com.revolut.feature.junior_coparent.impl.ui.confirmation.screen.CoparentConfirmationScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import je8.b;
import je8.c;
import je8.f;
import je8.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zd8.d;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_coparent/impl/ui/confirmation/screen/CoparentConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lje8/f;", "Ldli/a;", "Lje8/g;", "feature_junior_coparent_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CoparentConfirmationScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(CoparentConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinHorizontalButtonsBinding;", 0))};
    public final CoparentConfirmationScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;

    public CoparentConfirmationScreen(CoparentConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_twin_horizontal_buttons;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: je8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoparentConfirmationScreen f173236b;

            {
                this.f173236b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CoparentConfirmationScreen coparentConfirmationScreen = this.f173236b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CoparentConfirmationScreen.Q;
                        CoparentConfirmationScreen coparentConfirmationScreen2 = this.f173236b;
                        return dli.f.a(coparentConfirmationScreen2, (h) coparentConfirmationScreen2.P.getValue(), v.k(new ListSubheaderDelegate(), new ListCellDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CoparentConfirmationScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(coparentConfirmationScreen.m2()).a().get(zd8.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zd8.f.class, " is not found"));
                        }
                        zd8.f fVar = ((zd8.f) aVar2.b()).i;
                        zd8.d dVar = new zd8.d();
                        dVar.f321336a = e4m.b.b(new zd8.c(0));
                        return dVar;
                    default:
                        KProperty[] kPropertyArr3 = CoparentConfirmationScreen.Q;
                        return (h) ((zd8.d) coparentConfirmationScreen.O.getValue()).f321336a.get();
                }
            }
        });
        this.N = s.t(this, b.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: je8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoparentConfirmationScreen f173236b;

            {
                this.f173236b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CoparentConfirmationScreen coparentConfirmationScreen = this.f173236b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CoparentConfirmationScreen.Q;
                        CoparentConfirmationScreen coparentConfirmationScreen2 = this.f173236b;
                        return dli.f.a(coparentConfirmationScreen2, (h) coparentConfirmationScreen2.P.getValue(), v.k(new ListSubheaderDelegate(), new ListCellDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CoparentConfirmationScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(coparentConfirmationScreen.m2()).a().get(zd8.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zd8.f.class, " is not found"));
                        }
                        zd8.f fVar = ((zd8.f) aVar2.b()).i;
                        zd8.d dVar = new zd8.d();
                        dVar.f321336a = e4m.b.b(new zd8.c(0));
                        return dVar;
                    default:
                        KProperty[] kPropertyArr3 = CoparentConfirmationScreen.Q;
                        return (h) ((zd8.d) coparentConfirmationScreen.O.getValue()).f321336a.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: je8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoparentConfirmationScreen f173236b;

            {
                this.f173236b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CoparentConfirmationScreen coparentConfirmationScreen = this.f173236b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CoparentConfirmationScreen.Q;
                        CoparentConfirmationScreen coparentConfirmationScreen2 = this.f173236b;
                        return dli.f.a(coparentConfirmationScreen2, (h) coparentConfirmationScreen2.P.getValue(), v.k(new ListSubheaderDelegate(), new ListCellDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CoparentConfirmationScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(coparentConfirmationScreen.m2()).a().get(zd8.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zd8.f.class, " is not found"));
                        }
                        zd8.f fVar = ((zd8.f) aVar2.b()).i;
                        zd8.d dVar = new zd8.d();
                        dVar.f321336a = e4m.b.b(new zd8.c(0));
                        return dVar;
                    default:
                        KProperty[] kPropertyArr3 = CoparentConfirmationScreen.Q;
                        return (h) ((zd8.d) coparentConfirmationScreen.O.getValue()).f321336a.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (je8.h) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174567b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        int i = R$string.rev_u18_co_parent_resolve_invitation_header_title;
        CoparentConfirmationScreenContract$InputData coparentConfirmationScreenContract$InputData = this.K;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(coparentConfirmationScreenContract$InputData.f76883b), null, 12);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.rev_u18_co_parent_resolve_invitation_header_subtitle, v.k(coparentConfirmationScreenContract$InputData.f76882a, coparentConfirmationScreenContract$InputData.f76883b), null, 12));
        navBarWithToolbar.setDescriptionVisible(true);
        TwinHorizontalButton twinHorizontalButton = d3().d;
        twinHorizontalButton.setPrimaryButtonText(new TextLocalisedClause(R$string.junior_co_parent_resolve_invitation_action_accept, null, null, 14));
        twinHorizontalButton.setPrimaryButtonLoadingTag(coparentConfirmationScreenContract$InputData.f76884c);
        twinHorizontalButton.setSecondaryButtonText(new TextLocalisedClause(R$string.junior_co_parent_resolve_invitation_action_decline, null, null, 14));
        twinHorizontalButton.setSecondaryButtonLoadingTag(coparentConfirmationScreenContract$InputData.d);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().d.c()), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().d.d()), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174567b.f59410q), new c(this, null, 2), 3);
    }

    public final jii.v d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.v) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
