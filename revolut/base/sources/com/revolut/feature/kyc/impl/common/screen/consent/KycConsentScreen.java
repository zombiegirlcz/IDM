package com.revolut.feature.kyc.impl.common.screen.consent;

import android.view.View;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.feature.kyc.impl.common.screen.consent.KycConsentScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import kji.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ns8.a;
import uu8.b;
import uu8.d;
import xki.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/kyc/impl/common/screen/consent/KycConsentScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetController;", "Lns8/a;", "Lcli/w;", "Luu8/b;", "Lkji/f;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class KycConsentScreen extends BaseBottomSheetController<a> implements w, f {
    public static final /* synthetic */ int R = 0;
    public final uu8.a N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public KycConsentScreen(uu8.a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        final int i = 0;
        this.O = te0.w.y0(new Function0(this) { // from class: uu8.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KycConsentScreen f283170b;

            {
                this.f283170b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                KycConsentScreen kycConsentScreen = this.f283170b;
                switch (i2) {
                    case 0:
                        int i3 = KycConsentScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(kycConsentScreen.m2()).a().get(su8.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", su8.a.class, " is not found"));
                        }
                        su8.a aVar3 = ((su8.a) aVar2.b()).f265687b;
                        a aVar4 = kycConsentScreen.N;
                        aVar4.getClass();
                        return new su8.b(aVar3, aVar4);
                    case 1:
                        int i5 = KycConsentScreen.R;
                        return (d) ((su8.b) kycConsentScreen.O.getValue()).f265690c.get();
                    default:
                        int i6 = KycConsentScreen.R;
                        return n14.e.a(kycConsentScreen, (d) kycConsentScreen.P.getValue());
                }
            }
        });
        final int i2 = 1;
        this.P = te0.w.y0(new Function0(this) { // from class: uu8.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KycConsentScreen f283170b;

            {
                this.f283170b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                KycConsentScreen kycConsentScreen = this.f283170b;
                switch (i22) {
                    case 0:
                        int i3 = KycConsentScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(kycConsentScreen.m2()).a().get(su8.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", su8.a.class, " is not found"));
                        }
                        su8.a aVar3 = ((su8.a) aVar2.b()).f265687b;
                        a aVar4 = kycConsentScreen.N;
                        aVar4.getClass();
                        return new su8.b(aVar3, aVar4);
                    case 1:
                        int i5 = KycConsentScreen.R;
                        return (d) ((su8.b) kycConsentScreen.O.getValue()).f265690c.get();
                    default:
                        int i6 = KycConsentScreen.R;
                        return n14.e.a(kycConsentScreen, (d) kycConsentScreen.P.getValue());
                }
            }
        });
        final int i3 = 2;
        this.Q = te0.w.y0(new Function0(this) { // from class: uu8.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KycConsentScreen f283170b;

            {
                this.f283170b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                KycConsentScreen kycConsentScreen = this.f283170b;
                switch (i22) {
                    case 0:
                        int i32 = KycConsentScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(kycConsentScreen.m2()).a().get(su8.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", su8.a.class, " is not found"));
                        }
                        su8.a aVar3 = ((su8.a) aVar2.b()).f265687b;
                        a aVar4 = kycConsentScreen.N;
                        aVar4.getClass();
                        return new su8.b(aVar3, aVar4);
                    case 1:
                        int i5 = KycConsentScreen.R;
                        return (d) ((su8.b) kycConsentScreen.O.getValue()).f265690c.get();
                    default:
                        int i6 = KycConsentScreen.R;
                        return n14.e.a(kycConsentScreen, (d) kycConsentScreen.P.getValue());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        b uiState = (b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        j3(uiState.f283165a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (su8.b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (d) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, e3(), new uea.e(this, continuation, 23), 3);
        ViewController.P2(this, h3(), new up2.q(this, continuation, 7), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.Q.getValue();
    }
}
