package com.revolut.feature.junior_progression.impl.ui.prompt;

import aii.q;
import com.revolut.feature.junior_progression.impl.ui.prompt.JuniorProgressionFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jk8.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import te0.w;
import uki.c;
import xki.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/junior_progression/impl/ui/prompt/JuniorProgressionFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Luki/c;", "<init>", "()V", "feature_junior_progression_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorProgressionFlow extends ViewController<q> implements c {
    public final int K = R$layout.screen_transparent;
    public final Object L;
    public final Object M;
    public final Object N;

    public JuniorProgressionFlow() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ok8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorProgressionFlow f225931b;

            {
                this.f225931b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f225931b.m2()).a().get(jk8.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new jk8.b(((jk8.a) ((jk8.d) aVar2.b())).i);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", jk8.d.class, " is not found"));
                    case 1:
                        return (b) ((jk8.b) this.f225931b.L.getValue()).f175131b.get();
                    default:
                        JuniorProgressionFlow juniorProgressionFlow = this.f225931b;
                        return czi.c.a(R$id.screen_transparent_container, (b) juniorProgressionFlow.M.getValue(), juniorProgressionFlow);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ok8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorProgressionFlow f225931b;

            {
                this.f225931b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f225931b.m2()).a().get(jk8.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new jk8.b(((jk8.a) ((jk8.d) aVar2.b())).i);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", jk8.d.class, " is not found"));
                    case 1:
                        return (b) ((jk8.b) this.f225931b.L.getValue()).f175131b.get();
                    default:
                        JuniorProgressionFlow juniorProgressionFlow = this.f225931b;
                        return czi.c.a(R$id.screen_transparent_container, (b) juniorProgressionFlow.M.getValue(), juniorProgressionFlow);
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: ok8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorProgressionFlow f225931b;

            {
                this.f225931b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f225931b.m2()).a().get(jk8.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new jk8.b(((jk8.a) ((jk8.d) aVar2.b())).i);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", jk8.d.class, " is not found"));
                    case 1:
                        return (b) ((jk8.b) this.f225931b.L.getValue()).f175131b.get();
                    default:
                        JuniorProgressionFlow juniorProgressionFlow = this.f225931b;
                        return czi.c.a(R$id.screen_transparent_container, (b) juniorProgressionFlow.M.getValue(), juniorProgressionFlow);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b k3() {
        return (ok8.b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
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
