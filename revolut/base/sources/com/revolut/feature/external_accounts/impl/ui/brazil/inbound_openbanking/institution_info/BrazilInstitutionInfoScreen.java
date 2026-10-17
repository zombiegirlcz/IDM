package com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.institution_info;

import aii.r;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.institution_info.BrazilInstitutionInfoScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.institution_info.BrazilInstitutionInfoScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import se4.c;
import sj6.b;
import sj6.d;
import sj6.e;
import te0.w;
import tx0.t3;
import vc.s;
import xf6.m;
import xf6.p;
import xf6.t;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/institution_info/BrazilInstitutionInfoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/r;", "Ldli/a;", "Lsj6/e;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrazilInstitutionInfoScreen extends ViewController<r> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(BrazilInstitutionInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final BrazilInstitutionInfoScreenContract$InputData K;
    public final int L;
    public final h M;
    public final TextDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public BrazilInstitutionInfoScreen(BrazilInstitutionInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = new TextDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: sj6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrazilInstitutionInfoScreen f263678b;

            {
                this.f263678b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BrazilInstitutionInfoScreen brazilInstitutionInfoScreen = this.f263678b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BrazilInstitutionInfoScreen.R;
                        qji.b bVarU2 = brazilInstitutionInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.institution_info.di.BrazilInstitutionInfoScreenInjector");
                        m mVar = (m) bVarU2;
                        t tVar = mVar.f304943b;
                        m mVar2 = mVar.f304944c;
                        BrazilInstitutionInfoScreenContract$InputData brazilInstitutionInfoScreenContract$InputData = brazilInstitutionInfoScreen.K;
                        brazilInstitutionInfoScreenContract$InputData.getClass();
                        return new p(tVar, mVar2, brazilInstitutionInfoScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = BrazilInstitutionInfoScreen.R;
                        return (d) ((p) brazilInstitutionInfoScreen.O.getValue()).f304983c.get();
                    default:
                        KProperty[] kPropertyArr3 = BrazilInstitutionInfoScreen.R;
                        BrazilInstitutionInfoScreen brazilInstitutionInfoScreen2 = this.f263678b;
                        return dli.f.a(brazilInstitutionInfoScreen2, (d) brazilInstitutionInfoScreen2.P.getValue(), v.k(brazilInstitutionInfoScreen2.N, new CellDetailsLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: sj6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrazilInstitutionInfoScreen f263678b;

            {
                this.f263678b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BrazilInstitutionInfoScreen brazilInstitutionInfoScreen = this.f263678b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrazilInstitutionInfoScreen.R;
                        qji.b bVarU2 = brazilInstitutionInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.institution_info.di.BrazilInstitutionInfoScreenInjector");
                        m mVar = (m) bVarU2;
                        t tVar = mVar.f304943b;
                        m mVar2 = mVar.f304944c;
                        BrazilInstitutionInfoScreenContract$InputData brazilInstitutionInfoScreenContract$InputData = brazilInstitutionInfoScreen.K;
                        brazilInstitutionInfoScreenContract$InputData.getClass();
                        return new p(tVar, mVar2, brazilInstitutionInfoScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = BrazilInstitutionInfoScreen.R;
                        return (d) ((p) brazilInstitutionInfoScreen.O.getValue()).f304983c.get();
                    default:
                        KProperty[] kPropertyArr3 = BrazilInstitutionInfoScreen.R;
                        BrazilInstitutionInfoScreen brazilInstitutionInfoScreen2 = this.f263678b;
                        return dli.f.a(brazilInstitutionInfoScreen2, (d) brazilInstitutionInfoScreen2.P.getValue(), v.k(brazilInstitutionInfoScreen2.N, new CellDetailsLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: sj6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrazilInstitutionInfoScreen f263678b;

            {
                this.f263678b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BrazilInstitutionInfoScreen brazilInstitutionInfoScreen = this.f263678b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrazilInstitutionInfoScreen.R;
                        qji.b bVarU2 = brazilInstitutionInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.institution_info.di.BrazilInstitutionInfoScreenInjector");
                        m mVar = (m) bVarU2;
                        t tVar = mVar.f304943b;
                        m mVar2 = mVar.f304944c;
                        BrazilInstitutionInfoScreenContract$InputData brazilInstitutionInfoScreenContract$InputData = brazilInstitutionInfoScreen.K;
                        brazilInstitutionInfoScreenContract$InputData.getClass();
                        return new p(tVar, mVar2, brazilInstitutionInfoScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = BrazilInstitutionInfoScreen.R;
                        return (d) ((p) brazilInstitutionInfoScreen.O.getValue()).f304983c.get();
                    default:
                        KProperty[] kPropertyArr3 = BrazilInstitutionInfoScreen.R;
                        BrazilInstitutionInfoScreen brazilInstitutionInfoScreen2 = this.f263678b;
                        return dli.f.a(brazilInstitutionInfoScreen2, (d) brazilInstitutionInfoScreen2.P.getValue(), v.k(brazilInstitutionInfoScreen2.N, new CellDetailsLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        if (uiState.f263682c) {
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        } else {
            navBarWithToolbar.l0();
            String str = uiState.f263681b;
            if (str != null) {
                navBarWithToolbar.setTitle(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
                navBarWithToolbar.setToolbarTitle(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (d) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new c(this, null, 5), 3);
        ViewController.P2(this, rd0.e.b(this.N.d), new sek.q(this, null, 3), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
