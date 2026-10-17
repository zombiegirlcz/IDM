package com.revolut.feature.widgets.impl.ui.flow.carousel;

import aii.q;
import ash.i;
import com.revolut.feature.widgets.impl.ui.flow.carousel.WidgetCarouselFlow;
import com.revolut.feature.widgets.impl.ui.flow.carousel.WidgetCarouselFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import csh.k;
import czi.c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qsh.b;
import te0.w;
import ue0.e;
import yhm.j;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/widgets/impl/ui/flow/carousel/WidgetCarouselFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_widgets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WidgetCarouselFlow extends ViewController<q> implements f {
    public final WidgetCarouselFlowContract$InputData K;
    public final boolean L;
    public final boolean M;
    public final Lazy N;
    public final Object O;
    public final Object P;
    public final int Q;

    public WidgetCarouselFlow(WidgetCarouselFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = true;
        this.M = true;
        final int i = 0;
        this.N = j.b(new Function0(this) { // from class: psh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetCarouselFlow f239488b;

            {
                this.f239488b = this;
            }

            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        WidgetCarouselFlow widgetCarouselFlow = this.f239488b;
                        hf0.a aVarJ = e.j(widgetCarouselFlow.m2());
                        hsh.b bVar = (hsh.b) e.h(aVarJ, hsh.b.class);
                        WidgetCarouselFlowContract$InputData widgetCarouselFlowContract$InputData = widgetCarouselFlow.K;
                        k kVar = (k) e.h(aVarJ, widgetCarouselFlowContract$InputData.f96362a);
                        qsh.a aVar = new qsh.a();
                        aVar.f248837a = widgetCarouselFlow;
                        aVar.f248838b = bVar;
                        aVar.f248839c = kVar;
                        aVar.d = widgetCarouselFlowContract$InputData;
                        return (qsh.b) aVar.build();
                    case 1:
                        qsh.b bVar2 = (qsh.b) this.f239488b.N.getValue();
                        return new com.revolut.feature.widgets.impl.ui.flow.carousel.a(bVar2.f248840a, (i) bVar2.f.get());
                    default:
                        WidgetCarouselFlow widgetCarouselFlow2 = this.f239488b;
                        return c.d(R$id.screen_transparent_container, 4, null, widgetCarouselFlow2, (b) widgetCarouselFlow2.O.getValue());
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: psh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetCarouselFlow f239488b;

            {
                this.f239488b = this;
            }

            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        WidgetCarouselFlow widgetCarouselFlow = this.f239488b;
                        hf0.a aVarJ = e.j(widgetCarouselFlow.m2());
                        hsh.b bVar = (hsh.b) e.h(aVarJ, hsh.b.class);
                        WidgetCarouselFlowContract$InputData widgetCarouselFlowContract$InputData = widgetCarouselFlow.K;
                        k kVar = (k) e.h(aVarJ, widgetCarouselFlowContract$InputData.f96362a);
                        qsh.a aVar = new qsh.a();
                        aVar.f248837a = widgetCarouselFlow;
                        aVar.f248838b = bVar;
                        aVar.f248839c = kVar;
                        aVar.d = widgetCarouselFlowContract$InputData;
                        return (qsh.b) aVar.build();
                    case 1:
                        qsh.b bVar2 = (qsh.b) this.f239488b.N.getValue();
                        return new com.revolut.feature.widgets.impl.ui.flow.carousel.a(bVar2.f248840a, (i) bVar2.f.get());
                    default:
                        WidgetCarouselFlow widgetCarouselFlow2 = this.f239488b;
                        return c.d(R$id.screen_transparent_container, 4, null, widgetCarouselFlow2, (b) widgetCarouselFlow2.O.getValue());
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: psh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetCarouselFlow f239488b;

            {
                this.f239488b = this;
            }

            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        WidgetCarouselFlow widgetCarouselFlow = this.f239488b;
                        hf0.a aVarJ = e.j(widgetCarouselFlow.m2());
                        hsh.b bVar = (hsh.b) e.h(aVarJ, hsh.b.class);
                        WidgetCarouselFlowContract$InputData widgetCarouselFlowContract$InputData = widgetCarouselFlow.K;
                        k kVar = (k) e.h(aVarJ, widgetCarouselFlowContract$InputData.f96362a);
                        qsh.a aVar = new qsh.a();
                        aVar.f248837a = widgetCarouselFlow;
                        aVar.f248838b = bVar;
                        aVar.f248839c = kVar;
                        aVar.d = widgetCarouselFlowContract$InputData;
                        return (qsh.b) aVar.build();
                    case 1:
                        qsh.b bVar2 = (qsh.b) this.f239488b.N.getValue();
                        return new com.revolut.feature.widgets.impl.ui.flow.carousel.a(bVar2.f248840a, (i) bVar2.f.get());
                    default:
                        WidgetCarouselFlow widgetCarouselFlow2 = this.f239488b;
                        return c.d(R$id.screen_transparent_container, 4, null, widgetCarouselFlow2, (b) widgetCarouselFlow2.O.getValue());
                }
            }
        });
        this.Q = R$layout.screen_transparent;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (psh.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.Q;
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.valueOf(this.M);
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.P.getValue();
    }
}
