package com.revolut.feature.wealth_discovery.impl.screener.flows.new_collection;

import a0.d;
import aii.q;
import com.revolut.feature.wealth_discovery.impl.screener.flows.new_collection.ScreenerNewCollectionFlow;
import com.revolut.feature.wealth_discovery.impl.screener.flows.new_collection.ScreenerNewCollectionFlowContract$Input;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import joh.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/flows/new_collection/ScreenerNewCollectionFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScreenerNewCollectionFlow extends ViewController<q> implements f {
    public final ScreenerNewCollectionFlowContract$Input K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public ScreenerNewCollectionFlow(ScreenerNewCollectionFlowContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: bph.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerNewCollectionFlow f17623b;

            {
                this.f17623b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ScreenerNewCollectionFlow screenerNewCollectionFlow = this.f17623b;
                        phm.a aVar = (phm.a) e.j(screenerNewCollectionFlow.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        ScreenerNewCollectionFlowContract$Input screenerNewCollectionFlowContract$Input = screenerNewCollectionFlow.K;
                        screenerNewCollectionFlowContract$Input.getClass();
                        return new r(wVar, screenerNewCollectionFlowContract$Input);
                    case 1:
                        return (b) ((r) this.f17623b.M.getValue()).d.get();
                    default:
                        ScreenerNewCollectionFlow screenerNewCollectionFlow2 = this.f17623b;
                        return c.d(R$id.screen_transparent_container, 4, null, screenerNewCollectionFlow2, (b) screenerNewCollectionFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: bph.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerNewCollectionFlow f17623b;

            {
                this.f17623b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ScreenerNewCollectionFlow screenerNewCollectionFlow = this.f17623b;
                        phm.a aVar = (phm.a) e.j(screenerNewCollectionFlow.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        ScreenerNewCollectionFlowContract$Input screenerNewCollectionFlowContract$Input = screenerNewCollectionFlow.K;
                        screenerNewCollectionFlowContract$Input.getClass();
                        return new r(wVar, screenerNewCollectionFlowContract$Input);
                    case 1:
                        return (b) ((r) this.f17623b.M.getValue()).d.get();
                    default:
                        ScreenerNewCollectionFlow screenerNewCollectionFlow2 = this.f17623b;
                        return c.d(R$id.screen_transparent_container, 4, null, screenerNewCollectionFlow2, (b) screenerNewCollectionFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: bph.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerNewCollectionFlow f17623b;

            {
                this.f17623b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ScreenerNewCollectionFlow screenerNewCollectionFlow = this.f17623b;
                        phm.a aVar = (phm.a) e.j(screenerNewCollectionFlow.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        ScreenerNewCollectionFlowContract$Input screenerNewCollectionFlowContract$Input = screenerNewCollectionFlow.K;
                        screenerNewCollectionFlowContract$Input.getClass();
                        return new r(wVar, screenerNewCollectionFlowContract$Input);
                    case 1:
                        return (b) ((r) this.f17623b.M.getValue()).d.get();
                    default:
                        ScreenerNewCollectionFlow screenerNewCollectionFlow2 = this.f17623b;
                        return c.d(R$id.screen_transparent_container, 4, null, screenerNewCollectionFlow2, (b) screenerNewCollectionFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (r) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (r) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (bph.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
