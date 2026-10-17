package com.revolut.feature_retail_user_declarations.identity_declarations;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature_retail_user_declarations.identity_declarations.IdentityDeclarationsFlow;
import com.revolut.feature_retail_user_declarations.identity_declarations.IdentityDeclarationsFlowInputData;
import com.revolut.kompot.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import oai.i0;
import oai.q;
import obi.g;
import te0.w;
import uki.c;
import xki.e;
import yhm.j;
import yji.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lobi/g;", "Luki/c;", "Lno/m;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IdentityDeclarationsFlow extends ViewController<g> implements c, m {
    public final IdentityDeclarationsFlowInputData K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Lazy O;

    public IdentityDeclarationsFlow(IdentityDeclarationsFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: obi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdentityDeclarationsFlow f223958b;

            {
                this.f223958b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        IdentityDeclarationsFlow identityDeclarationsFlow = this.f223958b;
                        phm.a aVar = (phm.a) ue0.e.j(identityDeclarationsFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).f223710r;
                        IdentityDeclarationsFlowInputData identityDeclarationsFlowInputData = identityDeclarationsFlow.K;
                        identityDeclarationsFlowInputData.getClass();
                        return new q(i0Var, identityDeclarationsFlowInputData);
                    case 1:
                        return (b) ((q) this.f223958b.L.getValue()).f.get();
                    case 2:
                        IdentityDeclarationsFlow identityDeclarationsFlow2 = this.f223958b;
                        return czi.c.a(R$id.container, (b) identityDeclarationsFlow2.M.getValue(), identityDeclarationsFlow2);
                    default:
                        o oVar = this.f223958b.f98405m;
                        m mVar = oVar instanceof m ? (m) oVar : null;
                        if (mVar != null) {
                            return mVar.getO();
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: obi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdentityDeclarationsFlow f223958b;

            {
                this.f223958b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        IdentityDeclarationsFlow identityDeclarationsFlow = this.f223958b;
                        phm.a aVar = (phm.a) ue0.e.j(identityDeclarationsFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).f223710r;
                        IdentityDeclarationsFlowInputData identityDeclarationsFlowInputData = identityDeclarationsFlow.K;
                        identityDeclarationsFlowInputData.getClass();
                        return new q(i0Var, identityDeclarationsFlowInputData);
                    case 1:
                        return (b) ((q) this.f223958b.L.getValue()).f.get();
                    case 2:
                        IdentityDeclarationsFlow identityDeclarationsFlow2 = this.f223958b;
                        return czi.c.a(R$id.container, (b) identityDeclarationsFlow2.M.getValue(), identityDeclarationsFlow2);
                    default:
                        o oVar = this.f223958b.f98405m;
                        m mVar = oVar instanceof m ? (m) oVar : null;
                        if (mVar != null) {
                            return mVar.getO();
                        }
                        return null;
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: obi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdentityDeclarationsFlow f223958b;

            {
                this.f223958b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        IdentityDeclarationsFlow identityDeclarationsFlow = this.f223958b;
                        phm.a aVar = (phm.a) ue0.e.j(identityDeclarationsFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).f223710r;
                        IdentityDeclarationsFlowInputData identityDeclarationsFlowInputData = identityDeclarationsFlow.K;
                        identityDeclarationsFlowInputData.getClass();
                        return new q(i0Var, identityDeclarationsFlowInputData);
                    case 1:
                        return (b) ((q) this.f223958b.L.getValue()).f.get();
                    case 2:
                        IdentityDeclarationsFlow identityDeclarationsFlow2 = this.f223958b;
                        return czi.c.a(R$id.container, (b) identityDeclarationsFlow2.M.getValue(), identityDeclarationsFlow2);
                    default:
                        o oVar = this.f223958b.f98405m;
                        m mVar = oVar instanceof m ? (m) oVar : null;
                        if (mVar != null) {
                            return mVar.getO();
                        }
                        return null;
                }
            }
        });
        final int i5 = 3;
        this.O = j.b(new Function0(this) { // from class: obi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdentityDeclarationsFlow f223958b;

            {
                this.f223958b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        IdentityDeclarationsFlow identityDeclarationsFlow = this.f223958b;
                        phm.a aVar = (phm.a) ue0.e.j(identityDeclarationsFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).f223710r;
                        IdentityDeclarationsFlowInputData identityDeclarationsFlowInputData = identityDeclarationsFlow.K;
                        identityDeclarationsFlowInputData.getClass();
                        return new q(i0Var, identityDeclarationsFlowInputData);
                    case 1:
                        return (b) ((q) this.f223958b.L.getValue()).f.get();
                    case 2:
                        IdentityDeclarationsFlow identityDeclarationsFlow2 = this.f223958b;
                        return czi.c.a(R$id.container, (b) identityDeclarationsFlow2.M.getValue(), identityDeclarationsFlow2);
                    default:
                        o oVar = this.f223958b.f98405m;
                        m mVar = oVar instanceof m ? (m) oVar : null;
                        if (mVar != null) {
                            return mVar.getO();
                        }
                        return null;
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return (AnalyticsProduct) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (q) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (q) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (obi.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.N.getValue();
    }
}
