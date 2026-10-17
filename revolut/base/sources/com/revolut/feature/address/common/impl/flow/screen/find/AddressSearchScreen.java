package com.revolut.feature.address.common.impl.flow.screen.find;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlaceholderRowDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceLoadingDelegate;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.common.impl.flow.screen.find.AddressSearchScreen;
import com.revolut.feature.address.common.impl.flow.screen.find.AddressSearchScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.concurrent.TimeUnit;
import ji1.i;
import kji.f;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import no.m;
import sh1.l;
import te0.w;
import th1.d;
import vc.s;
import xki.e;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/address/common/impl/flow/screen/find/AddressSearchScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lth1/d;", "Ldli/a;", "Lji1/i;", "Lkji/f;", "Lno/m;", "Lno/k;", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddressSearchScreen extends ViewController<d> implements dli.a, f, m, k {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(AddressSearchScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final AddressSearchScreenContract$InputData K;
    public final l L;
    public final int M;
    public final AnalyticsProduct N;
    public AnalyticsContext O;
    public final h P;
    public final boolean Q;
    public final Lazy R;
    public final Object S;
    public final RowDelegate T;
    public final ListSubheaderDelegate U;
    public final PlaceholderRowDelegate V;
    public final SingleChoiceLoadingDelegate W;
    public final FullScreenStateDelegate X;
    public final Object Y;

    public AddressSearchScreen(AddressSearchScreenContract$InputData inputData, l strings) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(strings, "strings");
        this.K = inputData;
        this.L = strings;
        this.M = R$layout.screen_recycler_navbar;
        this.N = inputData.f61010b;
        this.O = inputData.f61011c;
        this.P = s.t(this, ji1.b.f);
        this.Q = true;
        final int i = 0;
        this.R = j.b(new Function0(this) { // from class: ji1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressSearchScreen f174321b;

            {
                this.f174321b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddressSearchScreen addressSearchScreen = this.f174321b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddressSearchScreen.Z;
                        qji.b bVarU2 = addressSearchScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.address.common.impl.flow.screen.find.di.AddressSearchScreenInjector");
                        yh1.k kVarB = ((ki1.a) bVarU2).b();
                        AddressSearchScreenContract$InputData addressSearchScreenContract$InputData = addressSearchScreen.K;
                        switch (kVarB.f313727a) {
                            case 0:
                                addressSearchScreenContract$InputData.getClass();
                                kVarB.d = addressSearchScreenContract$InputData;
                                break;
                            default:
                                addressSearchScreenContract$InputData.getClass();
                                kVarB.d = addressSearchScreenContract$InputData;
                                break;
                        }
                        sh1.l lVar = addressSearchScreen.L;
                        switch (kVarB.f313727a) {
                            case 0:
                                lVar.getClass();
                                kVarB.e = lVar;
                                break;
                            default:
                                lVar.getClass();
                                kVarB.e = lVar;
                                break;
                        }
                        return (yh1.l) ((yh1.k) kVarB.mo3808a(addressSearchScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = AddressSearchScreen.Z;
                        yh1.l lVar2 = (yh1.l) addressSearchScreen.R.getValue();
                        switch (lVar2.f313730a) {
                            case 0:
                                return (f) lVar2.f313733g.get();
                            default:
                                return (f) lVar2.f313733g.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = AddressSearchScreen.Z;
                        AddressSearchScreen addressSearchScreen2 = this.f174321b;
                        return dli.f.a(addressSearchScreen2, (f) addressSearchScreen2.S.getValue(), v.k(addressSearchScreen2.T, addressSearchScreen2.U, addressSearchScreen2.V, addressSearchScreen2.W, addressSearchScreen2.X), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: ji1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressSearchScreen f174321b;

            {
                this.f174321b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddressSearchScreen addressSearchScreen = this.f174321b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddressSearchScreen.Z;
                        qji.b bVarU2 = addressSearchScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.address.common.impl.flow.screen.find.di.AddressSearchScreenInjector");
                        yh1.k kVarB = ((ki1.a) bVarU2).b();
                        AddressSearchScreenContract$InputData addressSearchScreenContract$InputData = addressSearchScreen.K;
                        switch (kVarB.f313727a) {
                            case 0:
                                addressSearchScreenContract$InputData.getClass();
                                kVarB.d = addressSearchScreenContract$InputData;
                                break;
                            default:
                                addressSearchScreenContract$InputData.getClass();
                                kVarB.d = addressSearchScreenContract$InputData;
                                break;
                        }
                        sh1.l lVar = addressSearchScreen.L;
                        switch (kVarB.f313727a) {
                            case 0:
                                lVar.getClass();
                                kVarB.e = lVar;
                                break;
                            default:
                                lVar.getClass();
                                kVarB.e = lVar;
                                break;
                        }
                        return (yh1.l) ((yh1.k) kVarB.mo3808a(addressSearchScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = AddressSearchScreen.Z;
                        yh1.l lVar2 = (yh1.l) addressSearchScreen.R.getValue();
                        switch (lVar2.f313730a) {
                            case 0:
                                return (f) lVar2.f313733g.get();
                            default:
                                return (f) lVar2.f313733g.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = AddressSearchScreen.Z;
                        AddressSearchScreen addressSearchScreen2 = this.f174321b;
                        return dli.f.a(addressSearchScreen2, (f) addressSearchScreen2.S.getValue(), v.k(addressSearchScreen2.T, addressSearchScreen2.U, addressSearchScreen2.V, addressSearchScreen2.W, addressSearchScreen2.X), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.T = new RowDelegate(null, null, 7);
        this.U = new ListSubheaderDelegate();
        this.V = new PlaceholderRowDelegate();
        this.W = new SingleChoiceLoadingDelegate();
        this.X = new FullScreenStateDelegate();
        final int i3 = 2;
        this.Y = w.y0(new Function0(this) { // from class: ji1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressSearchScreen f174321b;

            {
                this.f174321b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddressSearchScreen addressSearchScreen = this.f174321b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddressSearchScreen.Z;
                        qji.b bVarU2 = addressSearchScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.address.common.impl.flow.screen.find.di.AddressSearchScreenInjector");
                        yh1.k kVarB = ((ki1.a) bVarU2).b();
                        AddressSearchScreenContract$InputData addressSearchScreenContract$InputData = addressSearchScreen.K;
                        switch (kVarB.f313727a) {
                            case 0:
                                addressSearchScreenContract$InputData.getClass();
                                kVarB.d = addressSearchScreenContract$InputData;
                                break;
                            default:
                                addressSearchScreenContract$InputData.getClass();
                                kVarB.d = addressSearchScreenContract$InputData;
                                break;
                        }
                        sh1.l lVar = addressSearchScreen.L;
                        switch (kVarB.f313727a) {
                            case 0:
                                lVar.getClass();
                                kVarB.e = lVar;
                                break;
                            default:
                                lVar.getClass();
                                kVarB.e = lVar;
                                break;
                        }
                        return (yh1.l) ((yh1.k) kVarB.mo3808a(addressSearchScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = AddressSearchScreen.Z;
                        yh1.l lVar2 = (yh1.l) addressSearchScreen.R.getValue();
                        switch (lVar2.f313730a) {
                            case 0:
                                return (f) lVar2.f313733g.get();
                            default:
                                return (f) lVar2.f313733g.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = AddressSearchScreen.Z;
                        AddressSearchScreen addressSearchScreen2 = this.f174321b;
                        return dli.f.a(addressSearchScreen2, (f) addressSearchScreen2.S.getValue(), v.k(addressSearchScreen2.T, addressSearchScreen2.U, addressSearchScreen2.V, addressSearchScreen2.W, addressSearchScreen2.X), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setHint(uiState.f174330b);
        navBarWithToolbar.E0();
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.O = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getC0() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (yh1.l) this.R.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getT() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (ji1.f) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: T2 */
    public final Boolean getG() {
        return Boolean.valueOf(this.Q);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
        navBarWithToolbar.j0(false);
        navBarWithToolbar.K0(j4.NO_ANIMATION);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new j2c.b(this, null, 25), 3);
        SearchView searchView = navBarWithToolbar.f59409p;
        ihm.f fVar = searchView.f57337m;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.y(fVar, 300L)), null, new ji1.c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(searchView.f57336l), null, new j82.q(navBarWithToolbar, this, null, 28), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.f53218h), null, new ji1.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.V.d), null, new ji1.c(this, continuation, 1), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.P.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Y.getValue();
    }
}
