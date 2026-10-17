package com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup;

import com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.PseTopupFlow;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.PseTopupFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import je6.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xf6.n0;
import xf6.t;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/colombia/pse/topup/PseTopupFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Lyki/f;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PseTopupFlow extends ViewController<Object> implements f {
    public final PseTopupFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public PseTopupFlow(PseTopupFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: al6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PseTopupFlow f6153b;

            {
                this.f6153b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PseTopupFlow pseTopupFlow = this.f6153b;
                        phm.a aVar = (phm.a) ue0.e.j(pseTopupFlow.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).B;
                        PseTopupFlowContract$InputData pseTopupFlowContract$InputData = pseTopupFlow.K;
                        pseTopupFlowContract$InputData.getClass();
                        return new n0(tVar, pseTopupFlowContract$InputData);
                    case 1:
                        return (b) ((n0) this.f6153b.M.getValue()).d.get();
                    default:
                        PseTopupFlow pseTopupFlow2 = this.f6153b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, pseTopupFlow2, (b) pseTopupFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: al6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PseTopupFlow f6153b;

            {
                this.f6153b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PseTopupFlow pseTopupFlow = this.f6153b;
                        phm.a aVar = (phm.a) ue0.e.j(pseTopupFlow.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).B;
                        PseTopupFlowContract$InputData pseTopupFlowContract$InputData = pseTopupFlow.K;
                        pseTopupFlowContract$InputData.getClass();
                        return new n0(tVar, pseTopupFlowContract$InputData);
                    case 1:
                        return (b) ((n0) this.f6153b.M.getValue()).d.get();
                    default:
                        PseTopupFlow pseTopupFlow2 = this.f6153b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, pseTopupFlow2, (b) pseTopupFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: al6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PseTopupFlow f6153b;

            {
                this.f6153b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PseTopupFlow pseTopupFlow = this.f6153b;
                        phm.a aVar = (phm.a) ue0.e.j(pseTopupFlow.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).B;
                        PseTopupFlowContract$InputData pseTopupFlowContract$InputData = pseTopupFlow.K;
                        pseTopupFlowContract$InputData.getClass();
                        return new n0(tVar, pseTopupFlowContract$InputData);
                    case 1:
                        return (b) ((n0) this.f6153b.M.getValue()).d.get();
                    default:
                        PseTopupFlow pseTopupFlow2 = this.f6153b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, pseTopupFlow2, (b) pseTopupFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (n0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (al6.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
