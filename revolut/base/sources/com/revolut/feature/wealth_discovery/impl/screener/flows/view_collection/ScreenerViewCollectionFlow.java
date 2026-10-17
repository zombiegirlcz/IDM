package com.revolut.feature.wealth_discovery.impl.screener.flows.view_collection;

import a0.d;
import aii.q;
import com.revolut.feature.wealth_discovery.impl.screener.flows.view_collection.ScreenerViewCollectionFlow;
import com.revolut.feature.wealth_discovery.impl.screener.flows.view_collection.ScreenerViewCollectionFlowContract$Input;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import joh.x;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/flows/view_collection/ScreenerViewCollectionFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScreenerViewCollectionFlow extends ViewController<q> implements f {
    public final ScreenerViewCollectionFlowContract$Input K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public ScreenerViewCollectionFlow(ScreenerViewCollectionFlowContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: fph.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerViewCollectionFlow f137100b;

            {
                this.f137100b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ScreenerViewCollectionFlow screenerViewCollectionFlow = this.f137100b;
                        phm.a aVar = (phm.a) e.j(screenerViewCollectionFlow.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        ScreenerViewCollectionFlowContract$Input screenerViewCollectionFlowContract$Input = screenerViewCollectionFlow.K;
                        screenerViewCollectionFlowContract$Input.getClass();
                        return new x(wVar, screenerViewCollectionFlowContract$Input);
                    case 1:
                        return (b) ((x) this.f137100b.M.getValue()).d.get();
                    default:
                        ScreenerViewCollectionFlow screenerViewCollectionFlow2 = this.f137100b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, screenerViewCollectionFlow2, (b) screenerViewCollectionFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: fph.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerViewCollectionFlow f137100b;

            {
                this.f137100b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ScreenerViewCollectionFlow screenerViewCollectionFlow = this.f137100b;
                        phm.a aVar = (phm.a) e.j(screenerViewCollectionFlow.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        ScreenerViewCollectionFlowContract$Input screenerViewCollectionFlowContract$Input = screenerViewCollectionFlow.K;
                        screenerViewCollectionFlowContract$Input.getClass();
                        return new x(wVar, screenerViewCollectionFlowContract$Input);
                    case 1:
                        return (b) ((x) this.f137100b.M.getValue()).d.get();
                    default:
                        ScreenerViewCollectionFlow screenerViewCollectionFlow2 = this.f137100b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, screenerViewCollectionFlow2, (b) screenerViewCollectionFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: fph.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerViewCollectionFlow f137100b;

            {
                this.f137100b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ScreenerViewCollectionFlow screenerViewCollectionFlow = this.f137100b;
                        phm.a aVar = (phm.a) e.j(screenerViewCollectionFlow.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        ScreenerViewCollectionFlowContract$Input screenerViewCollectionFlowContract$Input = screenerViewCollectionFlow.K;
                        screenerViewCollectionFlowContract$Input.getClass();
                        return new x(wVar, screenerViewCollectionFlowContract$Input);
                    case 1:
                        return (b) ((x) this.f137100b.M.getValue()).d.get();
                    default:
                        ScreenerViewCollectionFlow screenerViewCollectionFlow2 = this.f137100b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, screenerViewCollectionFlow2, (b) screenerViewCollectionFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (x) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (x) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (fph.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
