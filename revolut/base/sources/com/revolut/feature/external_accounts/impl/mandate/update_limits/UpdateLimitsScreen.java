package com.revolut.feature.external_accounts.impl.mandate.update_limits;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.mandate.update_limits.UpdateLimitsMode;
import com.revolut.feature.external_accounts.impl.mandate.update_limits.UpdateLimitsScreen;
import com.revolut.feature.external_accounts.impl.mandate.update_limits.UpdateLimitsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import h30.l;
import jii.u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lcc.c;
import le8.d;
import lh6.e;
import lh6.g;
import lh6.i;
import lh6.j;
import no.m;
import te0.w;
import vc.s;
import we6.z0;
import xf6.y1;
import xf6.z1;
import xi0.b;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/mandate/update_limits/UpdateLimitsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwe6/z0;", "Ldli/a;", "Llh6/j;", "Lno/m;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpdateLimitsScreen extends ViewController<z0> implements dli.a, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(UpdateLimitsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final UpdateLimitsScreenContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final b R;
    public final InputTextDelegate S;
    public final TextDelegate T;

    public UpdateLimitsScreen(UpdateLimitsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137507t;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        this.N = s.t(this, e.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: lh6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLimitsScreen f195162b;

            {
                this.f195162b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                UpdateLimitsScreen updateLimitsScreen = this.f195162b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = UpdateLimitsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(updateLimitsScreen.m2()).a().get(je6.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", je6.j.class, " is not found"));
                        }
                        y1 y1Var = ((y1) aVar2.b()).i;
                        UpdateLimitsScreenContract$InputData updateLimitsScreenContract$InputData = updateLimitsScreen.K;
                        updateLimitsScreenContract$InputData.getClass();
                        return new z1(y1Var, updateLimitsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = UpdateLimitsScreen.U;
                        return (i) ((z1) updateLimitsScreen.O.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = UpdateLimitsScreen.U;
                        UpdateLimitsScreen updateLimitsScreen2 = this.f195162b;
                        return dli.f.a(updateLimitsScreen2, updateLimitsScreen2.R2(), v.k(updateLimitsScreen2.S, updateLimitsScreen2.T), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: lh6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLimitsScreen f195162b;

            {
                this.f195162b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                UpdateLimitsScreen updateLimitsScreen = this.f195162b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UpdateLimitsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(updateLimitsScreen.m2()).a().get(je6.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", je6.j.class, " is not found"));
                        }
                        y1 y1Var = ((y1) aVar2.b()).i;
                        UpdateLimitsScreenContract$InputData updateLimitsScreenContract$InputData = updateLimitsScreen.K;
                        updateLimitsScreenContract$InputData.getClass();
                        return new z1(y1Var, updateLimitsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = UpdateLimitsScreen.U;
                        return (i) ((z1) updateLimitsScreen.O.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = UpdateLimitsScreen.U;
                        UpdateLimitsScreen updateLimitsScreen2 = this.f195162b;
                        return dli.f.a(updateLimitsScreen2, updateLimitsScreen2.R2(), v.k(updateLimitsScreen2.S, updateLimitsScreen2.T), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: lh6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLimitsScreen f195162b;

            {
                this.f195162b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                UpdateLimitsScreen updateLimitsScreen = this.f195162b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UpdateLimitsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(updateLimitsScreen.m2()).a().get(je6.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", je6.j.class, " is not found"));
                        }
                        y1 y1Var = ((y1) aVar2.b()).i;
                        UpdateLimitsScreenContract$InputData updateLimitsScreenContract$InputData = updateLimitsScreen.K;
                        updateLimitsScreenContract$InputData.getClass();
                        return new z1(y1Var, updateLimitsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = UpdateLimitsScreen.U;
                        return (i) ((z1) updateLimitsScreen.O.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = UpdateLimitsScreen.U;
                        UpdateLimitsScreen updateLimitsScreen2 = this.f195162b;
                        return dli.f.a(updateLimitsScreen2, updateLimitsScreen2.R2(), v.k(updateLimitsScreen2.S, updateLimitsScreen2.T), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = inputData.f72470c.f115083b;
        this.S = new InputTextDelegate(new c(this, 10));
        this.T = new TextDelegate();
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f195169b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (z1) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        UpdateLimitsMode updateLimitsMode = this.K.f72468a;
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.open_banking_mandate_limits_header, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        boolean z = updateLimitsMode instanceof UpdateLimitsMode.UpdateStoredMethodLimits;
        if (!z) {
            navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.open_banking_mandate_limits_description, null, null, 14));
            navBarWithToolbar.setDescriptionVisible(true);
        }
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        if (Intrinsics.f(updateLimitsMode, UpdateLimitsMode.ReturnNewLimits.f72465a) || z) {
            i = R$string.open_banking_common_action_save;
        } else {
            if (!(updateLimitsMode instanceof UpdateLimitsMode.UpdateMandate)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.open_banking_mandate_limits_button_save_and_add_money;
        }
        l.A(i, null, null, 14, d3().f174564b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new g(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new g(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.d), null, new d(this, (Continuation) null, 4), 3);
    }

    public final u d3() {
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
