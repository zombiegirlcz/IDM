package com.revolut.feature.junior_profile.impl.ui.flow.details;

import a0.d;
import aii.q;
import com.revolut.feature.junior_profile.impl.ui.flow.details.JuniorProfileDetailsFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mj8.h;
import qji.b;
import sj8.c;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_profile/impl/ui/flow/details/JuniorProfileDetailsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_junior_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorProfileDetailsFlow extends ViewController<q> implements f {
    public final c K;
    public final Object L;
    public final Object M;
    public final Object N;

    public JuniorProfileDetailsFlow(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: sj8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorProfileDetailsFlow f263686b;

            {
                this.f263686b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        JuniorProfileDetailsFlow juniorProfileDetailsFlow = this.f263686b;
                        return czi.c.d(0, 6, null, juniorProfileDetailsFlow, (b) juniorProfileDetailsFlow.N.getValue());
                    case 1:
                        JuniorProfileDetailsFlow juniorProfileDetailsFlow2 = this.f263686b;
                        phm.a aVar = (phm.a) e.j(juniorProfileDetailsFlow2.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", h.class, " is not found"));
                        }
                        h hVar = ((h) aVar2.b()).f;
                        c cVar = juniorProfileDetailsFlow2.K;
                        cVar.getClass();
                        return new mj8.d(hVar, cVar);
                    default:
                        return (b) ((mj8.d) this.f263686b.M.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: sj8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorProfileDetailsFlow f263686b;

            {
                this.f263686b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        JuniorProfileDetailsFlow juniorProfileDetailsFlow = this.f263686b;
                        return czi.c.d(0, 6, null, juniorProfileDetailsFlow, (b) juniorProfileDetailsFlow.N.getValue());
                    case 1:
                        JuniorProfileDetailsFlow juniorProfileDetailsFlow2 = this.f263686b;
                        phm.a aVar = (phm.a) e.j(juniorProfileDetailsFlow2.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", h.class, " is not found"));
                        }
                        h hVar = ((h) aVar2.b()).f;
                        c cVar = juniorProfileDetailsFlow2.K;
                        cVar.getClass();
                        return new mj8.d(hVar, cVar);
                    default:
                        return (b) ((mj8.d) this.f263686b.M.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: sj8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorProfileDetailsFlow f263686b;

            {
                this.f263686b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        JuniorProfileDetailsFlow juniorProfileDetailsFlow = this.f263686b;
                        return czi.c.d(0, 6, null, juniorProfileDetailsFlow, (b) juniorProfileDetailsFlow.N.getValue());
                    case 1:
                        JuniorProfileDetailsFlow juniorProfileDetailsFlow2 = this.f263686b;
                        phm.a aVar = (phm.a) e.j(juniorProfileDetailsFlow2.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", h.class, " is not found"));
                        }
                        h hVar = ((h) aVar2.b()).f;
                        c cVar = juniorProfileDetailsFlow2.K;
                        cVar.getClass();
                        return new mj8.d(hVar, cVar);
                    default:
                        return (b) ((mj8.d) this.f263686b.M.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (mj8.d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (mj8.d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (sj8.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
