package com.revolut.feature.selfserve.entity.config.shared.ui.help;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.selfserve.entity.config.shared.ui.help.EntityHelpScreen;
import com.revolut.feature.selfserve.entity.config.shared.ui.help.EntityHelpScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.selfserve.entity.config.api.R$string;
import cyc.b;
import cyc.c;
import cyc.d;
import cyc.f;
import dli.a;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/selfserve/entity/config/shared/ui/help/EntityHelpScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lcyc/f;", "feature_selfserve_entity_config_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EntityHelpScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(EntityHelpScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final EntityHelpScreenContract$InputData K;
    public final h L;
    public final ListCellDelegate M;
    public final ErrorDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final int R;

    public EntityHelpScreen(EntityHelpScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new ListCellDelegate();
        this.N = new ErrorDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: cyc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EntityHelpScreen f110079b;

            {
                this.f110079b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EntityHelpScreen entityHelpScreen = this.f110079b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EntityHelpScreen.S;
                        qji.b bVarU2 = entityHelpScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.selfserve.entity.config.shared.ui.help.di.EntityHelpScreenInjector");
                        vxc.c cVar = (vxc.c) bVarU2;
                        vxc.d dVar = cVar.f293058b;
                        vxc.c cVar2 = cVar.f293059c;
                        EntityHelpScreenContract$InputData entityHelpScreenContract$InputData = entityHelpScreen.K;
                        entityHelpScreenContract$InputData.getClass();
                        return new vxc.e(dVar, cVar2, entityHelpScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EntityHelpScreen.S;
                        return (h) ((vxc.e) entityHelpScreen.O.getValue()).f293065c.get();
                    default:
                        KProperty[] kPropertyArr3 = EntityHelpScreen.S;
                        EntityHelpScreen entityHelpScreen2 = this.f110079b;
                        return dli.f.a(entityHelpScreen2, entityHelpScreen2.d(), v.k(entityHelpScreen2.M, entityHelpScreen2.N, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: cyc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EntityHelpScreen f110079b;

            {
                this.f110079b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EntityHelpScreen entityHelpScreen = this.f110079b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EntityHelpScreen.S;
                        qji.b bVarU2 = entityHelpScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.selfserve.entity.config.shared.ui.help.di.EntityHelpScreenInjector");
                        vxc.c cVar = (vxc.c) bVarU2;
                        vxc.d dVar = cVar.f293058b;
                        vxc.c cVar2 = cVar.f293059c;
                        EntityHelpScreenContract$InputData entityHelpScreenContract$InputData = entityHelpScreen.K;
                        entityHelpScreenContract$InputData.getClass();
                        return new vxc.e(dVar, cVar2, entityHelpScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EntityHelpScreen.S;
                        return (h) ((vxc.e) entityHelpScreen.O.getValue()).f293065c.get();
                    default:
                        KProperty[] kPropertyArr3 = EntityHelpScreen.S;
                        EntityHelpScreen entityHelpScreen2 = this.f110079b;
                        return dli.f.a(entityHelpScreen2, entityHelpScreen2.d(), v.k(entityHelpScreen2.M, entityHelpScreen2.N, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: cyc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EntityHelpScreen f110079b;

            {
                this.f110079b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EntityHelpScreen entityHelpScreen = this.f110079b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EntityHelpScreen.S;
                        qji.b bVarU2 = entityHelpScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.selfserve.entity.config.shared.ui.help.di.EntityHelpScreenInjector");
                        vxc.c cVar = (vxc.c) bVarU2;
                        vxc.d dVar = cVar.f293058b;
                        vxc.c cVar2 = cVar.f293059c;
                        EntityHelpScreenContract$InputData entityHelpScreenContract$InputData = entityHelpScreen.K;
                        entityHelpScreenContract$InputData.getClass();
                        return new vxc.e(dVar, cVar2, entityHelpScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EntityHelpScreen.S;
                        return (h) ((vxc.e) entityHelpScreen.O.getValue()).f293065c.get();
                    default:
                        KProperty[] kPropertyArr3 = EntityHelpScreen.S;
                        EntityHelpScreen entityHelpScreen2 = this.f110079b;
                        return dli.f.a(entityHelpScreen2, entityHelpScreen2.d(), v.k(entityHelpScreen2.M, entityHelpScreen2.N, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.R = R$layout.screen_recycler_navbar_nextbutton;
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (vxc.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.sow_info_header, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.sow_info_header, null, null, 14));
        d3().f174564b.setText(new TextLocalisedClause(R$string.action_got_it, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.M.d), new c(2, d(), cyc.h.class, "onClauseClicked", "onClauseClicked(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 0), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52226c), new c(2, d(), cyc.h.class, "onErrorClicked", "onErrorClicked(Lcom/revolut/core/ui_kit/delegates/ErrorDelegate$Model;)V", 4, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new d(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final cyc.h d() {
        return (cyc.h) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF0() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
