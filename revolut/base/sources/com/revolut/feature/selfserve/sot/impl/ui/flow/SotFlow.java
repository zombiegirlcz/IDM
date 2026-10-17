package com.revolut.feature.selfserve.sot.impl.ui.flow;

import aii.q;
import android.content.Intent;
import android.view.View;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.selfserve.sot.api.navigation.SotDestination;
import com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlow;
import com.revolut.kompot.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import jyc.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Luki/c;", "Companion", "a", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SotFlow extends ViewController<q> implements uki.c {
    public final SotDestination.Config K;
    public final LargeActionButtonDelegate L;
    public final ListCellDelegate M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public SotFlow(SotDestination.Config input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        this.L = new LargeActionButtonDelegate();
        this.M = new ListCellDelegate();
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: xyc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SotFlow f309708b;

            {
                this.f309708b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        SotFlow sotFlow = this.f309708b;
                        phm.a aVar = (phm.a) ue0.e.j(sotFlow.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        jyc.i iVarI = ((r) aVar2.b()).i();
                        iVarI.f179389b = sotFlow;
                        SotDestination.Config config = sotFlow.K;
                        config.getClass();
                        iVarI.f179390c = config;
                        return (yyc.a) iVarI.build();
                    case 1:
                        return (d) ((jyc.k) ((yyc.a) this.f309708b.N.getValue())).f.get();
                    case 2:
                        SotFlow sotFlow2 = this.f309708b;
                        return czi.c.a(R$id.container, (d) sotFlow2.O.getValue(), sotFlow2);
                    default:
                        return (j60.a) ((jyc.k) ((yyc.a) this.f309708b.N.getValue())).d.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: xyc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SotFlow f309708b;

            {
                this.f309708b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        SotFlow sotFlow = this.f309708b;
                        phm.a aVar = (phm.a) ue0.e.j(sotFlow.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        jyc.i iVarI = ((r) aVar2.b()).i();
                        iVarI.f179389b = sotFlow;
                        SotDestination.Config config = sotFlow.K;
                        config.getClass();
                        iVarI.f179390c = config;
                        return (yyc.a) iVarI.build();
                    case 1:
                        return (d) ((jyc.k) ((yyc.a) this.f309708b.N.getValue())).f.get();
                    case 2:
                        SotFlow sotFlow2 = this.f309708b;
                        return czi.c.a(R$id.container, (d) sotFlow2.O.getValue(), sotFlow2);
                    default:
                        return (j60.a) ((jyc.k) ((yyc.a) this.f309708b.N.getValue())).d.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: xyc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SotFlow f309708b;

            {
                this.f309708b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        SotFlow sotFlow = this.f309708b;
                        phm.a aVar = (phm.a) ue0.e.j(sotFlow.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        jyc.i iVarI = ((r) aVar2.b()).i();
                        iVarI.f179389b = sotFlow;
                        SotDestination.Config config = sotFlow.K;
                        config.getClass();
                        iVarI.f179390c = config;
                        return (yyc.a) iVarI.build();
                    case 1:
                        return (d) ((jyc.k) ((yyc.a) this.f309708b.N.getValue())).f.get();
                    case 2:
                        SotFlow sotFlow2 = this.f309708b;
                        return czi.c.a(R$id.container, (d) sotFlow2.O.getValue(), sotFlow2);
                    default:
                        return (j60.a) ((jyc.k) ((yyc.a) this.f309708b.N.getValue())).d.get();
                }
            }
        });
        final int i5 = 3;
        this.Q = w.y0(new Function0(this) { // from class: xyc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SotFlow f309708b;

            {
                this.f309708b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        SotFlow sotFlow = this.f309708b;
                        phm.a aVar = (phm.a) ue0.e.j(sotFlow.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        jyc.i iVarI = ((r) aVar2.b()).i();
                        iVarI.f179389b = sotFlow;
                        SotDestination.Config config = sotFlow.K;
                        config.getClass();
                        iVarI.f179390c = config;
                        return (yyc.a) iVarI.build();
                    case 1:
                        return (d) ((jyc.k) ((yyc.a) this.f309708b.N.getValue())).f.get();
                    case 2:
                        SotFlow sotFlow2 = this.f309708b;
                        return czi.c.a(R$id.container, (d) sotFlow2.O.getValue(), sotFlow2);
                    default:
                        return (j60.a) ((jyc.k) ((yyc.a) this.f309708b.N.getValue())).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (yyc.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (yyc.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (xyc.d) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        if (i == 10001) {
            e eVar = (e) ((xyc.d) this.O.getValue());
            eVar.getClass();
            eVar.n2(new b(eVar, null), new whi.b(6));
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.Q.getValue()).d(v.k(this.L, this.M, new TextDelegate()));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.L.d.f121375b), new xyc.c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.P.getValue();
    }
}
