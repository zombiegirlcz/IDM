package com.revolut.feature.joint.impl.ui.invite_flow;

import aii.q;
import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.joint.impl.ui.invite_flow.InviteFlow;
import com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import te0.w;
import xki.e;
import yki.f;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "Lno/m;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InviteFlow extends ViewController<q> implements f, m {
    public final InviteFlowContract$InputData K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;
    public final LargeActionButtonDelegate P;
    public final boolean Q;
    public final AnalyticsProduct.Retail R;

    public InviteFlow(InviteFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: b58.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InviteFlow f12442b;

            {
                this.f12442b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        InviteFlow inviteFlow = this.f12442b;
                        phm.a aVar = (phm.a) ue0.e.j(inviteFlow.m2()).a().get(e48.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", e48.g.class, " is not found"));
                        }
                        e48.g gVar = ((e48.g) aVar2.b()).z;
                        InviteFlowContract$InputData inviteFlowContract$InputData = inviteFlow.K;
                        inviteFlowContract$InputData.getClass();
                        return new e48.m(gVar, inviteFlow, inviteFlowContract$InputData);
                    case 1:
                        return (c) ((e48.m) this.f12442b.L.getValue()).f122459h.get();
                    default:
                        InviteFlow inviteFlow2 = this.f12442b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, inviteFlow2, (c) inviteFlow2.N.getValue());
                }
            }
        });
        this.M = R$layout.screen_transparent;
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: b58.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InviteFlow f12442b;

            {
                this.f12442b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        InviteFlow inviteFlow = this.f12442b;
                        phm.a aVar = (phm.a) ue0.e.j(inviteFlow.m2()).a().get(e48.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", e48.g.class, " is not found"));
                        }
                        e48.g gVar = ((e48.g) aVar2.b()).z;
                        InviteFlowContract$InputData inviteFlowContract$InputData = inviteFlow.K;
                        inviteFlowContract$InputData.getClass();
                        return new e48.m(gVar, inviteFlow, inviteFlowContract$InputData);
                    case 1:
                        return (c) ((e48.m) this.f12442b.L.getValue()).f122459h.get();
                    default:
                        InviteFlow inviteFlow2 = this.f12442b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, inviteFlow2, (c) inviteFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: b58.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InviteFlow f12442b;

            {
                this.f12442b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        InviteFlow inviteFlow = this.f12442b;
                        phm.a aVar = (phm.a) ue0.e.j(inviteFlow.m2()).a().get(e48.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", e48.g.class, " is not found"));
                        }
                        e48.g gVar = ((e48.g) aVar2.b()).z;
                        InviteFlowContract$InputData inviteFlowContract$InputData = inviteFlow.K;
                        inviteFlowContract$InputData.getClass();
                        return new e48.m(gVar, inviteFlow, inviteFlowContract$InputData);
                    case 1:
                        return (c) ((e48.m) this.f12442b.L.getValue()).f122459h.get();
                    default:
                        InviteFlow inviteFlow2 = this.f12442b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, inviteFlow2, (c) inviteFlow2.N.getValue());
                }
            }
        });
        this.P = new LargeActionButtonDelegate();
        this.Q = true;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137508w;
        this.R = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e48.m) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (e48.m) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (b58.c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((e48.m) this.L.getValue()).f.get()).d(u.c(this.P));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.d.f121375b), null, new b58.b(2, 4, b58.c.class, (b58.c) this.N.getValue(), "onBottomDialogActionButtonClick", "onBottomDialogActionButtonClick(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V"), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.M;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Q);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
