package com.revolut.feature.kyc.vendors.shared.impl.uaepass;

import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.R$style;
import com.revolut.feature.kyc.shared.R$layout;
import com.revolut.feature.kyc.shared.web_kyc.view.WebPortalLoadingView;
import com.revolut.feature.kyc.vendors.shared.api.uae_pass.UaePassFlowOutputData;
import com.revolut.feature.kyc.vendors.shared.impl.uaepass.UaePassScreen;
import com.revolut.feature.kyc.vendors.shared.impl.uaepass.UaePassScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import hy8.a;
import iy8.i;
import iy8.j;
import iy8.l;
import iy8.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import vc.s;
import vkm.t0;
import xki.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/vendors/shared/impl/uaepass/UaePassScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/kyc/vendors/shared/api/uae_pass/UaePassFlowOutputData;", "Lcli/w;", "Liy8/m;", "feature_kyc_vendors_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UaePassScreen extends ViewController<UaePassFlowOutputData> implements w {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(UaePassScreen.class, "binding", "getBinding()Lcom/revolut/feature/kyc/shared/databinding/ScreenWebKycBinding;", 0))};
    public final UaePassScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final int O;
    public final Object P;
    public final h Q;
    public final Object R;
    public final Object S;

    public UaePassScreen(UaePassScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: iy8.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UaePassScreen f169629b;

            {
                this.f169629b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                UaePassScreen uaePassScreen = this.f169629b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = UaePassScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(uaePassScreen.m2()).a().get(hy8.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hy8.b.class, " is not found"));
                        }
                        hy8.b bVar = ((hy8.b) aVar2.b()).f;
                        UaePassScreenContract$InputData uaePassScreenContract$InputData = uaePassScreen.K;
                        uaePassScreenContract$InputData.getClass();
                        return new hy8.a(bVar, uaePassScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = UaePassScreen.T;
                        return (l) ((hy8.a) uaePassScreen.L.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = UaePassScreen.T;
                        return n14.e.a(uaePassScreen, uaePassScreen.d());
                    case 3:
                        KProperty[] kPropertyArr4 = UaePassScreen.T;
                        hy8.a aVar3 = (hy8.a) uaePassScreen.L.getValue();
                        aVar3.getClass();
                        return new ay8.a((yx8.a) aVar3.f156759c.get(), (dy8.a) aVar3.e.get());
                    default:
                        KProperty[] kPropertyArr5 = UaePassScreen.T;
                        hy8.a aVar4 = (hy8.a) uaePassScreen.L.getValue();
                        aVar4.getClass();
                        return new zx8.a((yx8.a) aVar4.f156759c.get());
                }
            }
        });
        final int i2 = 1;
        this.M = te0.w.y0(new Function0(this) { // from class: iy8.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UaePassScreen f169629b;

            {
                this.f169629b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                UaePassScreen uaePassScreen = this.f169629b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UaePassScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(uaePassScreen.m2()).a().get(hy8.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hy8.b.class, " is not found"));
                        }
                        hy8.b bVar = ((hy8.b) aVar2.b()).f;
                        UaePassScreenContract$InputData uaePassScreenContract$InputData = uaePassScreen.K;
                        uaePassScreenContract$InputData.getClass();
                        return new hy8.a(bVar, uaePassScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = UaePassScreen.T;
                        return (l) ((hy8.a) uaePassScreen.L.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = UaePassScreen.T;
                        return n14.e.a(uaePassScreen, uaePassScreen.d());
                    case 3:
                        KProperty[] kPropertyArr4 = UaePassScreen.T;
                        hy8.a aVar3 = (hy8.a) uaePassScreen.L.getValue();
                        aVar3.getClass();
                        return new ay8.a((yx8.a) aVar3.f156759c.get(), (dy8.a) aVar3.e.get());
                    default:
                        KProperty[] kPropertyArr5 = UaePassScreen.T;
                        hy8.a aVar4 = (hy8.a) uaePassScreen.L.getValue();
                        aVar4.getClass();
                        return new zx8.a((yx8.a) aVar4.f156759c.get());
                }
            }
        });
        this.N = R$layout.screen_web_kyc;
        this.O = R$style.UiKitTheme_Day;
        final int i3 = 2;
        this.P = te0.w.y0(new Function0(this) { // from class: iy8.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UaePassScreen f169629b;

            {
                this.f169629b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                UaePassScreen uaePassScreen = this.f169629b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UaePassScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(uaePassScreen.m2()).a().get(hy8.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hy8.b.class, " is not found"));
                        }
                        hy8.b bVar = ((hy8.b) aVar2.b()).f;
                        UaePassScreenContract$InputData uaePassScreenContract$InputData = uaePassScreen.K;
                        uaePassScreenContract$InputData.getClass();
                        return new hy8.a(bVar, uaePassScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = UaePassScreen.T;
                        return (l) ((hy8.a) uaePassScreen.L.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = UaePassScreen.T;
                        return n14.e.a(uaePassScreen, uaePassScreen.d());
                    case 3:
                        KProperty[] kPropertyArr4 = UaePassScreen.T;
                        hy8.a aVar3 = (hy8.a) uaePassScreen.L.getValue();
                        aVar3.getClass();
                        return new ay8.a((yx8.a) aVar3.f156759c.get(), (dy8.a) aVar3.e.get());
                    default:
                        KProperty[] kPropertyArr5 = UaePassScreen.T;
                        hy8.a aVar4 = (hy8.a) uaePassScreen.L.getValue();
                        aVar4.getClass();
                        return new zx8.a((yx8.a) aVar4.f156759c.get());
                }
            }
        });
        this.Q = s.t(this, i.f);
        final int i5 = 3;
        this.R = te0.w.y0(new Function0(this) { // from class: iy8.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UaePassScreen f169629b;

            {
                this.f169629b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                UaePassScreen uaePassScreen = this.f169629b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UaePassScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(uaePassScreen.m2()).a().get(hy8.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hy8.b.class, " is not found"));
                        }
                        hy8.b bVar = ((hy8.b) aVar2.b()).f;
                        UaePassScreenContract$InputData uaePassScreenContract$InputData = uaePassScreen.K;
                        uaePassScreenContract$InputData.getClass();
                        return new hy8.a(bVar, uaePassScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = UaePassScreen.T;
                        return (l) ((hy8.a) uaePassScreen.L.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = UaePassScreen.T;
                        return n14.e.a(uaePassScreen, uaePassScreen.d());
                    case 3:
                        KProperty[] kPropertyArr4 = UaePassScreen.T;
                        hy8.a aVar3 = (hy8.a) uaePassScreen.L.getValue();
                        aVar3.getClass();
                        return new ay8.a((yx8.a) aVar3.f156759c.get(), (dy8.a) aVar3.e.get());
                    default:
                        KProperty[] kPropertyArr5 = UaePassScreen.T;
                        hy8.a aVar4 = (hy8.a) uaePassScreen.L.getValue();
                        aVar4.getClass();
                        return new zx8.a((yx8.a) aVar4.f156759c.get());
                }
            }
        });
        final int i6 = 4;
        this.S = te0.w.y0(new Function0(this) { // from class: iy8.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UaePassScreen f169629b;

            {
                this.f169629b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                UaePassScreen uaePassScreen = this.f169629b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UaePassScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(uaePassScreen.m2()).a().get(hy8.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hy8.b.class, " is not found"));
                        }
                        hy8.b bVar = ((hy8.b) aVar2.b()).f;
                        UaePassScreenContract$InputData uaePassScreenContract$InputData = uaePassScreen.K;
                        uaePassScreenContract$InputData.getClass();
                        return new hy8.a(bVar, uaePassScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = UaePassScreen.T;
                        return (l) ((hy8.a) uaePassScreen.L.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = UaePassScreen.T;
                        return n14.e.a(uaePassScreen, uaePassScreen.d());
                    case 3:
                        KProperty[] kPropertyArr4 = UaePassScreen.T;
                        hy8.a aVar3 = (hy8.a) uaePassScreen.L.getValue();
                        aVar3.getClass();
                        return new ay8.a((yx8.a) aVar3.f156759c.get(), (dy8.a) aVar3.e.get());
                    default:
                        KProperty[] kPropertyArr5 = UaePassScreen.T;
                        hy8.a aVar4 = (hy8.a) uaePassScreen.L.getValue();
                        aVar4.getClass();
                        return new zx8.a((yx8.a) aVar4.f156759c.get());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getX() {
        return Integer.valueOf(this.O);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f292848b.i0(uiState.f169632a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        WebPortalLoadingView webPortalLoadingView = d3().f292848b;
        webPortalLoadingView.setWebViewClient((WebViewClient) this.R.getValue());
        webPortalLoadingView.setWebChromeClient((WebChromeClient) this.S.getValue());
        webPortalLoadingView.g0(this.K.f77915a.f77908a);
        webPortalLoadingView.setNavbarBackNavigationButtonVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, d3().f292848b.f77907n, null, new j(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, d3().f292848b.h0(), null, new j(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, new t0(((iy8.o) d()).f169638w, 1), null, new iug.j(this, (Continuation) null, 9), 3);
    }

    public final vx8.a d3() {
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (vx8.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.P.getValue();
    }
}
