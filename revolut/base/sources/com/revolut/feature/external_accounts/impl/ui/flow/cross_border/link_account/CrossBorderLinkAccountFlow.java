package com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account;

import android.content.Intent;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlow;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import gm6.f;
import in0.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xf6.r;
import xf6.t;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgm6/f;", "Lyki/f;", "Lin0/g;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CrossBorderLinkAccountFlow extends ViewController<f> implements yki.f, g {
    public final CrossBorderLinkAccountFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public CrossBorderLinkAccountFlow(CrossBorderLinkAccountFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: gm6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CrossBorderLinkAccountFlow f144769b;

            {
                this.f144769b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CrossBorderLinkAccountFlow crossBorderLinkAccountFlow = this.f144769b;
                        phm.a aVar = (phm.a) ue0.e.j(crossBorderLinkAccountFlow.m2()).a().get(je6.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", je6.g.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).B;
                        CrossBorderLinkAccountFlowContract$InputData crossBorderLinkAccountFlowContract$InputData = crossBorderLinkAccountFlow.K;
                        crossBorderLinkAccountFlowContract$InputData.getClass();
                        return new r(tVar, crossBorderLinkAccountFlowContract$InputData);
                    case 1:
                        return (b) ((r) this.f144769b.M.getValue()).d.get();
                    default:
                        CrossBorderLinkAccountFlow crossBorderLinkAccountFlow2 = this.f144769b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, crossBorderLinkAccountFlow2, (b) crossBorderLinkAccountFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: gm6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CrossBorderLinkAccountFlow f144769b;

            {
                this.f144769b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CrossBorderLinkAccountFlow crossBorderLinkAccountFlow = this.f144769b;
                        phm.a aVar = (phm.a) ue0.e.j(crossBorderLinkAccountFlow.m2()).a().get(je6.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", je6.g.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).B;
                        CrossBorderLinkAccountFlowContract$InputData crossBorderLinkAccountFlowContract$InputData = crossBorderLinkAccountFlow.K;
                        crossBorderLinkAccountFlowContract$InputData.getClass();
                        return new r(tVar, crossBorderLinkAccountFlowContract$InputData);
                    case 1:
                        return (b) ((r) this.f144769b.M.getValue()).d.get();
                    default:
                        CrossBorderLinkAccountFlow crossBorderLinkAccountFlow2 = this.f144769b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, crossBorderLinkAccountFlow2, (b) crossBorderLinkAccountFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: gm6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CrossBorderLinkAccountFlow f144769b;

            {
                this.f144769b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CrossBorderLinkAccountFlow crossBorderLinkAccountFlow = this.f144769b;
                        phm.a aVar = (phm.a) ue0.e.j(crossBorderLinkAccountFlow.m2()).a().get(je6.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", je6.g.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).B;
                        CrossBorderLinkAccountFlowContract$InputData crossBorderLinkAccountFlowContract$InputData = crossBorderLinkAccountFlow.K;
                        crossBorderLinkAccountFlowContract$InputData.getClass();
                        return new r(tVar, crossBorderLinkAccountFlowContract$InputData);
                    case 1:
                        return (b) ((r) this.f144769b.M.getValue()).d.get();
                    default:
                        CrossBorderLinkAccountFlow crossBorderLinkAccountFlow2 = this.f144769b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, crossBorderLinkAccountFlow2, (b) crossBorderLinkAccountFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (r) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (gm6.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        d dVar = (d) ((gm6.b) this.N.getValue());
        dVar.getClass();
        dVar.C2(new gm6.c(i, i2));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    @Override // in0.g
    public final boolean p0() {
        return this.K.f72862g;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
