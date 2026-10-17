package com.revolut.sso.impl.ui.consent.app;

import aii.q;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.api.app_consent.RevolutSsoAppConsentDestination;
import com.revolut.sso.impl.ui.consent.app.AppConsentFlow;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ljl.q0;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/consent/app/AppConsentFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppConsentFlow extends ViewController<q> implements f {
    public final RevolutSsoAppConsentDestination.InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public AppConsentFlow(RevolutSsoAppConsentDestination.InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: xll.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppConsentFlow f307047b;

            {
                this.f307047b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AppConsentFlow appConsentFlow = this.f307047b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, appConsentFlow, (b) appConsentFlow.O.getValue());
                    case 1:
                        AppConsentFlow appConsentFlow2 = this.f307047b;
                        q0 q0Var = ((q0) kli.a.n(appConsentFlow2.m2())).E;
                        RevolutSsoAppConsentDestination.InputData inputData2 = appConsentFlow2.K;
                        inputData2.getClass();
                        return new ljl.b(q0Var, appConsentFlow2, inputData2);
                    default:
                        return (b) ((ljl.b) ((yll.a) this.f307047b.N.getValue())).f.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: xll.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppConsentFlow f307047b;

            {
                this.f307047b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AppConsentFlow appConsentFlow = this.f307047b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, appConsentFlow, (b) appConsentFlow.O.getValue());
                    case 1:
                        AppConsentFlow appConsentFlow2 = this.f307047b;
                        q0 q0Var = ((q0) kli.a.n(appConsentFlow2.m2())).E;
                        RevolutSsoAppConsentDestination.InputData inputData2 = appConsentFlow2.K;
                        inputData2.getClass();
                        return new ljl.b(q0Var, appConsentFlow2, inputData2);
                    default:
                        return (b) ((ljl.b) ((yll.a) this.f307047b.N.getValue())).f.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: xll.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppConsentFlow f307047b;

            {
                this.f307047b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        AppConsentFlow appConsentFlow = this.f307047b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, appConsentFlow, (b) appConsentFlow.O.getValue());
                    case 1:
                        AppConsentFlow appConsentFlow2 = this.f307047b;
                        q0 q0Var = ((q0) kli.a.n(appConsentFlow2.m2())).E;
                        RevolutSsoAppConsentDestination.InputData inputData2 = appConsentFlow2.K;
                        inputData2.getClass();
                        return new ljl.b(q0Var, appConsentFlow2, inputData2);
                    default:
                        return (b) ((ljl.b) ((yll.a) this.f307047b.N.getValue())).f.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (yll.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (yll.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (xll.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
