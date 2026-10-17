package com.revolut.feature.widgets.impl.ui.flow.selection;

import ash.i;
import com.revolut.core.ui_kit.R$style;
import com.revolut.feature.widgets.api.navigation.WidgetSelectionFlowControllerDescriptor$OutputData;
import com.revolut.feature.widgets.impl.ui.flow.selection.WidgetSelectionFlow;
import com.revolut.feature.widgets.impl.ui.flow.selection.WidgetSelectionFlowContact$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import csh.k;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ue0.e;
import ush.b;
import yhm.j;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/widgets/impl/ui/flow/selection/WidgetSelectionFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/widgets/api/navigation/WidgetSelectionFlowControllerDescriptor$OutputData;", "Lyki/f;", "feature_widgets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WidgetSelectionFlow extends ViewController<WidgetSelectionFlowControllerDescriptor$OutputData> implements f {
    public final WidgetSelectionFlowContact$InputData K;
    public final boolean L;
    public final boolean M;
    public final Integer N;
    public final Lazy O;
    public final Object P;
    public final Lazy Q;

    public WidgetSelectionFlow(WidgetSelectionFlowContact$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = true;
        this.M = true;
        this.N = Integer.valueOf(R$style.UiKitTheme_Transparent);
        final int i = 0;
        this.O = j.b(new Function0(this) { // from class: tsh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetSelectionFlow f274129b;

            {
                this.f274129b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ush.b bVar = (ush.b) this.f274129b.Q.getValue();
                        return new com.revolut.feature.widgets.impl.ui.flow.selection.a((i) bVar.f.get(), bVar.d);
                    case 1:
                        WidgetSelectionFlow widgetSelectionFlow = this.f274129b;
                        return czi.c.d(0, 6, null, widgetSelectionFlow, (b) widgetSelectionFlow.O.getValue());
                    default:
                        WidgetSelectionFlow widgetSelectionFlow2 = this.f274129b;
                        hf0.a aVarJ = e.j(widgetSelectionFlow2.m2());
                        hsh.b bVar2 = (hsh.b) e.h(aVarJ, hsh.b.class);
                        WidgetSelectionFlowContact$InputData widgetSelectionFlowContact$InputData = widgetSelectionFlow2.K;
                        k kVar = (k) e.h(aVarJ, widgetSelectionFlowContact$InputData.f96373a);
                        ush.a aVar = new ush.a();
                        aVar.f282921a = widgetSelectionFlow2;
                        aVar.f282922b = bVar2;
                        aVar.f282923c = kVar;
                        aVar.d = widgetSelectionFlowContact$InputData;
                        return (ush.b) aVar.build();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: tsh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetSelectionFlow f274129b;

            {
                this.f274129b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ush.b bVar = (ush.b) this.f274129b.Q.getValue();
                        return new com.revolut.feature.widgets.impl.ui.flow.selection.a((i) bVar.f.get(), bVar.d);
                    case 1:
                        WidgetSelectionFlow widgetSelectionFlow = this.f274129b;
                        return czi.c.d(0, 6, null, widgetSelectionFlow, (b) widgetSelectionFlow.O.getValue());
                    default:
                        WidgetSelectionFlow widgetSelectionFlow2 = this.f274129b;
                        hf0.a aVarJ = e.j(widgetSelectionFlow2.m2());
                        hsh.b bVar2 = (hsh.b) e.h(aVarJ, hsh.b.class);
                        WidgetSelectionFlowContact$InputData widgetSelectionFlowContact$InputData = widgetSelectionFlow2.K;
                        k kVar = (k) e.h(aVarJ, widgetSelectionFlowContact$InputData.f96373a);
                        ush.a aVar = new ush.a();
                        aVar.f282921a = widgetSelectionFlow2;
                        aVar.f282922b = bVar2;
                        aVar.f282923c = kVar;
                        aVar.d = widgetSelectionFlowContact$InputData;
                        return (ush.b) aVar.build();
                }
            }
        });
        final int i3 = 2;
        this.Q = j.b(new Function0(this) { // from class: tsh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetSelectionFlow f274129b;

            {
                this.f274129b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ush.b bVar = (ush.b) this.f274129b.Q.getValue();
                        return new com.revolut.feature.widgets.impl.ui.flow.selection.a((i) bVar.f.get(), bVar.d);
                    case 1:
                        WidgetSelectionFlow widgetSelectionFlow = this.f274129b;
                        return czi.c.d(0, 6, null, widgetSelectionFlow, (b) widgetSelectionFlow.O.getValue());
                    default:
                        WidgetSelectionFlow widgetSelectionFlow2 = this.f274129b;
                        hf0.a aVarJ = e.j(widgetSelectionFlow2.m2());
                        hsh.b bVar2 = (hsh.b) e.h(aVarJ, hsh.b.class);
                        WidgetSelectionFlowContact$InputData widgetSelectionFlowContact$InputData = widgetSelectionFlow2.K;
                        k kVar = (k) e.h(aVarJ, widgetSelectionFlowContact$InputData.f96373a);
                        ush.a aVar = new ush.a();
                        aVar.f282921a = widgetSelectionFlow2;
                        aVar.f282922b = bVar2;
                        aVar.f282923c = kVar;
                        aVar.d = widgetSelectionFlowContact$InputData;
                        return (ush.b) aVar.build();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getN() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (tsh.b) this.O.getValue();
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
    public final c k() {
        return (c) this.P.getValue();
    }
}
