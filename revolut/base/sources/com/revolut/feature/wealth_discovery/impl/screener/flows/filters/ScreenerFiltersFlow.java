package com.revolut.feature.wealth_discovery.impl.screener.flows.filters;

import com.revolut.feature.wealth_discovery.impl.screener.flows.filters.ScreenerFiltersFlow;
import com.revolut.feature.wealth_discovery.impl.screener.flows.filters.ScreenerFiltersFlowContract$Input;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import joh.p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import yki.c;
import yki.f;
import zoh.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/flows/filters/ScreenerFiltersFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzoh/e;", "", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScreenerFiltersFlow extends ViewController<e> implements f {
    public final ScreenerFiltersFlowContract$Input K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public ScreenerFiltersFlow(ScreenerFiltersFlowContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: zoh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerFiltersFlow f324055b;

            {
                this.f324055b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ScreenerFiltersFlow screenerFiltersFlow = this.f324055b;
                        phm.a aVar = (phm.a) ue0.e.j(screenerFiltersFlow.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        ScreenerFiltersFlowContract$Input screenerFiltersFlowContract$Input = screenerFiltersFlow.K;
                        screenerFiltersFlowContract$Input.getClass();
                        return new p(wVar, screenerFiltersFlowContract$Input);
                    case 1:
                        return (b) ((p) this.f324055b.M.getValue()).d.get();
                    default:
                        ScreenerFiltersFlow screenerFiltersFlow2 = this.f324055b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, screenerFiltersFlow2, (b) screenerFiltersFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: zoh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerFiltersFlow f324055b;

            {
                this.f324055b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ScreenerFiltersFlow screenerFiltersFlow = this.f324055b;
                        phm.a aVar = (phm.a) ue0.e.j(screenerFiltersFlow.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        ScreenerFiltersFlowContract$Input screenerFiltersFlowContract$Input = screenerFiltersFlow.K;
                        screenerFiltersFlowContract$Input.getClass();
                        return new p(wVar, screenerFiltersFlowContract$Input);
                    case 1:
                        return (b) ((p) this.f324055b.M.getValue()).d.get();
                    default:
                        ScreenerFiltersFlow screenerFiltersFlow2 = this.f324055b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, screenerFiltersFlow2, (b) screenerFiltersFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: zoh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerFiltersFlow f324055b;

            {
                this.f324055b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ScreenerFiltersFlow screenerFiltersFlow = this.f324055b;
                        phm.a aVar = (phm.a) ue0.e.j(screenerFiltersFlow.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        ScreenerFiltersFlowContract$Input screenerFiltersFlowContract$Input = screenerFiltersFlow.K;
                        screenerFiltersFlowContract$Input.getClass();
                        return new p(wVar, screenerFiltersFlowContract$Input);
                    case 1:
                        return (b) ((p) this.f324055b.M.getValue()).d.get();
                    default:
                        ScreenerFiltersFlow screenerFiltersFlow2 = this.f324055b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, screenerFiltersFlow2, (b) screenerFiltersFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (p) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (zoh.b) this.N.getValue();
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
