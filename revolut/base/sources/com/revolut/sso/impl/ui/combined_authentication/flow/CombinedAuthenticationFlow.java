package com.revolut.sso.impl.ui.combined_authentication.flow;

import bjl.m;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.api.login.RevolutSsoApi$InputData$CombinedAuthentication;
import com.revolut.sso.api.models.UICustomization;
import com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlow;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ljl.j;
import no.d1;
import te0.w;
import xki.e;
import yki.f;
import ywj.i;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbjl/m;", "Lyki/f;", "Lno/d1;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CombinedAuthenticationFlow extends ViewController<m> implements f, d1 {
    public final Object K;
    public final Object L;
    public final Object M;

    public CombinedAuthenticationFlow(RevolutSsoApi$InputData$CombinedAuthentication inputData, i codeChallengeGenerator, UICustomization uiCustomization) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(codeChallengeGenerator, "codeChallengeGenerator");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        this.K = w.y0(new bib.b(this, inputData, codeChallengeGenerator, uiCustomization, 18));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: mll.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CombinedAuthenticationFlow f207039b;

            {
                this.f207039b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (c) ((ljl.j) this.f207039b.K.getValue()).f195990m.get();
                    default:
                        CombinedAuthenticationFlow combinedAuthenticationFlow = this.f207039b;
                        return czi.c.d(0, 6, null, combinedAuthenticationFlow, (c) combinedAuthenticationFlow.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: mll.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CombinedAuthenticationFlow f207039b;

            {
                this.f207039b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (c) ((ljl.j) this.f207039b.K.getValue()).f195990m.get();
                    default:
                        CombinedAuthenticationFlow combinedAuthenticationFlow = this.f207039b;
                        return czi.c.d(0, 6, null, combinedAuthenticationFlow, (c) combinedAuthenticationFlow.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (j) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (mll.c) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
