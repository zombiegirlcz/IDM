package com.revolut.feature.pix.impl.flow.pix_area.screens.alias_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pix.impl.flow.pix_area.screens.alias_details.AliasDetailsScreen;
import com.revolut.feature.pix.impl.flow.pix_area.screens.alias_details.AliasDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import p8a.d0;
import p8a.n;
import paa.b;
import paa.c;
import paa.g;
import paa.i;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/pix_area/screens/alias_details/AliasDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpaa/g;", "Ldli/a;", "Lpaa/h;", "Lno/d1;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AliasDetailsScreen extends ViewController<g> implements a, d1 {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AliasDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final AliasDetailsScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public AliasDetailsScreen(AliasDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: paa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AliasDetailsScreen f234459b;

            {
                this.f234459b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AliasDetailsScreen aliasDetailsScreen = this.f234459b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AliasDetailsScreen.R;
                        qji.b bVarU2 = aliasDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.pix_area.screens.alias_details.di.AliasDetailsScreenInjector");
                        n nVar = (n) bVarU2;
                        d0 d0Var = nVar.f234031b;
                        n nVar2 = nVar.f234032c;
                        AliasDetailsScreenContract$InputData aliasDetailsScreenContract$InputData = aliasDetailsScreen.K;
                        aliasDetailsScreenContract$InputData.getClass();
                        return new p8a.e(d0Var, nVar2, aliasDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AliasDetailsScreen.R;
                        return (i) ((p8a.e) aliasDetailsScreen.M.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = AliasDetailsScreen.R;
                        AliasDetailsScreen aliasDetailsScreen2 = this.f234459b;
                        return dli.f.a(aliasDetailsScreen2, (i) aliasDetailsScreen2.N.getValue(), u.c((RowDelegate) aliasDetailsScreen2.Q.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: paa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AliasDetailsScreen f234459b;

            {
                this.f234459b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AliasDetailsScreen aliasDetailsScreen = this.f234459b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AliasDetailsScreen.R;
                        qji.b bVarU2 = aliasDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.pix_area.screens.alias_details.di.AliasDetailsScreenInjector");
                        n nVar = (n) bVarU2;
                        d0 d0Var = nVar.f234031b;
                        n nVar2 = nVar.f234032c;
                        AliasDetailsScreenContract$InputData aliasDetailsScreenContract$InputData = aliasDetailsScreen.K;
                        aliasDetailsScreenContract$InputData.getClass();
                        return new p8a.e(d0Var, nVar2, aliasDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AliasDetailsScreen.R;
                        return (i) ((p8a.e) aliasDetailsScreen.M.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = AliasDetailsScreen.R;
                        AliasDetailsScreen aliasDetailsScreen2 = this.f234459b;
                        return dli.f.a(aliasDetailsScreen2, (i) aliasDetailsScreen2.N.getValue(), u.c((RowDelegate) aliasDetailsScreen2.Q.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        this.O = s.t(this, b.f);
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: paa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AliasDetailsScreen f234459b;

            {
                this.f234459b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AliasDetailsScreen aliasDetailsScreen = this.f234459b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AliasDetailsScreen.R;
                        qji.b bVarU2 = aliasDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.pix_area.screens.alias_details.di.AliasDetailsScreenInjector");
                        n nVar = (n) bVarU2;
                        d0 d0Var = nVar.f234031b;
                        n nVar2 = nVar.f234032c;
                        AliasDetailsScreenContract$InputData aliasDetailsScreenContract$InputData = aliasDetailsScreen.K;
                        aliasDetailsScreenContract$InputData.getClass();
                        return new p8a.e(d0Var, nVar2, aliasDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AliasDetailsScreen.R;
                        return (i) ((p8a.e) aliasDetailsScreen.M.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = AliasDetailsScreen.R;
                        AliasDetailsScreen aliasDetailsScreen2 = this.f234459b;
                        return dli.f.a(aliasDetailsScreen2, (i) aliasDetailsScreen2.N.getValue(), u.c((RowDelegate) aliasDetailsScreen2.Q.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = w.y0(new p0l.a(24));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        paa.h uiState = (paa.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((jii.n) value).f174542b.setHeaderModel(uiState.f234464b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p8a.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.Q.getValue()).f53218h), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
