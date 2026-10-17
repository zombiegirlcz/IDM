package com.revolut.retail.feature.limits.impl.ui.limits.screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.limits.impl.ui.limits.flow.SettingsLimitsFlowContract$InputData;
import com.revolut.retail.feature.limits.impl.ui.limits.screen.SettingsLimitController;
import dli.a;
import ehe.o;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kzj.c;
import kzj.e;
import kzj.f;
import pki.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/limits/impl/ui/limits/screen/SettingsLimitController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lkzj/c;", "feature_retail_limits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SettingsLimitController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(SettingsLimitController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K;
    public final RowDelegate L;
    public final List M;
    public final int N;
    public final boolean O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public SettingsLimitController(SettingsLimitsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, e.f);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.L = rowDelegate;
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.M = v.k(rowDelegate, new RowLoadingDelegate(), new TextDelegate(), new ListSubheaderDelegate());
        this.N = R$layout.screen_recycler_navbar;
        this.O = true;
        this.P = w.y0(new Function0(this) { // from class: kzj.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsLimitController f191123b;

            {
                this.f191123b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                SettingsLimitController settingsLimitController = this.f191123b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = SettingsLimitController.S;
                        qji.b bVarU2 = settingsLimitController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.limits.impl.ui.limits.screen.di.SettingsLimitControllerInjector");
                        ezj.d dVar = (ezj.d) bVarU2;
                        ezj.b bVar = dVar.f130961b;
                        ezj.d dVar2 = dVar.f130962c;
                        ezj.c cVar = new ezj.c();
                        cVar.f130955a = e4m.b.b(e4m.c.a(settingsLimitController));
                        int i6 = 10;
                        cVar.f130956b = e4m.b.b(new o(bVar, dVar2, cVar, 2, i6));
                        cVar.f130957c = e4m.b.b(new o(bVar, dVar2, cVar, 1, i6));
                        cVar.d = e4m.b.b(new o(bVar, dVar2, cVar, 0, i6));
                        cVar.e = e4m.b.b(new o(bVar, dVar2, cVar, 4, i6));
                        cVar.f = e4m.b.b(new o(bVar, dVar2, cVar, 3, i6));
                        cVar.f130958g = e4m.b.b(new o(bVar, dVar2, cVar, 6, i6));
                        cVar.f130959h = e4m.b.b(new o(bVar, dVar2, cVar, 5, i6));
                        cVar.i = e4m.b.b(new o(bVar, dVar2, cVar, 7, i6));
                        return cVar;
                    case 1:
                        KProperty[] kPropertyArr2 = SettingsLimitController.S;
                        return (a) ((ezj.c) settingsLimitController.P.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = SettingsLimitController.S;
                        SettingsLimitController settingsLimitController2 = this.f191123b;
                        return dli.f.a(settingsLimitController2, (a) settingsLimitController2.Q.getValue(), settingsLimitController2.M, 0, null, null, null, 60);
                }
            }
        });
        this.Q = w.y0(new Function0(this) { // from class: kzj.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsLimitController f191123b;

            {
                this.f191123b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                SettingsLimitController settingsLimitController = this.f191123b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = SettingsLimitController.S;
                        qji.b bVarU2 = settingsLimitController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.limits.impl.ui.limits.screen.di.SettingsLimitControllerInjector");
                        ezj.d dVar = (ezj.d) bVarU2;
                        ezj.b bVar = dVar.f130961b;
                        ezj.d dVar2 = dVar.f130962c;
                        ezj.c cVar = new ezj.c();
                        cVar.f130955a = e4m.b.b(e4m.c.a(settingsLimitController));
                        int i6 = 10;
                        cVar.f130956b = e4m.b.b(new o(bVar, dVar2, cVar, 2, i6));
                        cVar.f130957c = e4m.b.b(new o(bVar, dVar2, cVar, 1, i6));
                        cVar.d = e4m.b.b(new o(bVar, dVar2, cVar, 0, i6));
                        cVar.e = e4m.b.b(new o(bVar, dVar2, cVar, 4, i6));
                        cVar.f = e4m.b.b(new o(bVar, dVar2, cVar, 3, i6));
                        cVar.f130958g = e4m.b.b(new o(bVar, dVar2, cVar, 6, i6));
                        cVar.f130959h = e4m.b.b(new o(bVar, dVar2, cVar, 5, i6));
                        cVar.i = e4m.b.b(new o(bVar, dVar2, cVar, 7, i6));
                        return cVar;
                    case 1:
                        KProperty[] kPropertyArr2 = SettingsLimitController.S;
                        return (a) ((ezj.c) settingsLimitController.P.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = SettingsLimitController.S;
                        SettingsLimitController settingsLimitController2 = this.f191123b;
                        return dli.f.a(settingsLimitController2, (a) settingsLimitController2.Q.getValue(), settingsLimitController2.M, 0, null, null, null, 60);
                }
            }
        });
        this.R = w.y0(new Function0(this) { // from class: kzj.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsLimitController f191123b;

            {
                this.f191123b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                SettingsLimitController settingsLimitController = this.f191123b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = SettingsLimitController.S;
                        qji.b bVarU2 = settingsLimitController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.limits.impl.ui.limits.screen.di.SettingsLimitControllerInjector");
                        ezj.d dVar = (ezj.d) bVarU2;
                        ezj.b bVar = dVar.f130961b;
                        ezj.d dVar2 = dVar.f130962c;
                        ezj.c cVar = new ezj.c();
                        cVar.f130955a = e4m.b.b(e4m.c.a(settingsLimitController));
                        int i6 = 10;
                        cVar.f130956b = e4m.b.b(new o(bVar, dVar2, cVar, 2, i6));
                        cVar.f130957c = e4m.b.b(new o(bVar, dVar2, cVar, 1, i6));
                        cVar.d = e4m.b.b(new o(bVar, dVar2, cVar, 0, i6));
                        cVar.e = e4m.b.b(new o(bVar, dVar2, cVar, 4, i6));
                        cVar.f = e4m.b.b(new o(bVar, dVar2, cVar, 3, i6));
                        cVar.f130958g = e4m.b.b(new o(bVar, dVar2, cVar, 6, i6));
                        cVar.f130959h = e4m.b.b(new o(bVar, dVar2, cVar, 5, i6));
                        cVar.i = e4m.b.b(new o(bVar, dVar2, cVar, 7, i6));
                        return cVar;
                    case 1:
                        KProperty[] kPropertyArr2 = SettingsLimitController.S;
                        return (a) ((ezj.c) settingsLimitController.P.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = SettingsLimitController.S;
                        SettingsLimitController settingsLimitController2 = this.f191123b;
                        return dli.f.a(settingsLimitController2, (a) settingsLimitController2.Q.getValue(), settingsLimitController2.M, 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f191121b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ezj.c) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (kzj.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new ko2.b(this, null, 13), 3);
        ViewController.P2(this, rd0.e.b(this.L.f53218h), new f(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.K.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.O);
    }
}
