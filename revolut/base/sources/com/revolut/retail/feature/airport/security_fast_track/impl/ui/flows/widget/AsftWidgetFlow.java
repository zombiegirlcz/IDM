package com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.widget;

import aii.q;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.widget.AsftWidgetFlow;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.widget.AsftWidgetFlowContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kti.i;
import kti.j;
import qji.b;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/widget/AsftWidgetFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AsftWidgetFlow extends ViewController<q> implements f {
    public final AsftWidgetFlowContract$InputData.PassAvailableSoon K;
    public final Object L;
    public final Object M;
    public final Object N;

    public AsftWidgetFlow(AsftWidgetFlowContract$InputData.PassAvailableSoon inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: wti.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftWidgetFlow f299991b;

            {
                this.f299991b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AsftWidgetFlow asftWidgetFlow = this.f299991b;
                        phm.a aVar = (phm.a) e.j(asftWidgetFlow.m2()).a().get(i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i.class, " is not found"));
                        }
                        i iVar = ((i) aVar2.b()).f189557c;
                        AsftWidgetFlowContract$InputData.PassAvailableSoon passAvailableSoon = asftWidgetFlow.K;
                        passAvailableSoon.getClass();
                        return new j(iVar, passAvailableSoon);
                    case 1:
                        return (b) ((j) this.f299991b.L.getValue()).f189559b.get();
                    default:
                        AsftWidgetFlow asftWidgetFlow2 = this.f299991b;
                        return czi.c.d(0, 6, null, asftWidgetFlow2, (b) asftWidgetFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: wti.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftWidgetFlow f299991b;

            {
                this.f299991b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AsftWidgetFlow asftWidgetFlow = this.f299991b;
                        phm.a aVar = (phm.a) e.j(asftWidgetFlow.m2()).a().get(i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i.class, " is not found"));
                        }
                        i iVar = ((i) aVar2.b()).f189557c;
                        AsftWidgetFlowContract$InputData.PassAvailableSoon passAvailableSoon = asftWidgetFlow.K;
                        passAvailableSoon.getClass();
                        return new j(iVar, passAvailableSoon);
                    case 1:
                        return (b) ((j) this.f299991b.L.getValue()).f189559b.get();
                    default:
                        AsftWidgetFlow asftWidgetFlow2 = this.f299991b;
                        return czi.c.d(0, 6, null, asftWidgetFlow2, (b) asftWidgetFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: wti.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftWidgetFlow f299991b;

            {
                this.f299991b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        AsftWidgetFlow asftWidgetFlow = this.f299991b;
                        phm.a aVar = (phm.a) e.j(asftWidgetFlow.m2()).a().get(i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i.class, " is not found"));
                        }
                        i iVar = ((i) aVar2.b()).f189557c;
                        AsftWidgetFlowContract$InputData.PassAvailableSoon passAvailableSoon = asftWidgetFlow.K;
                        passAvailableSoon.getClass();
                        return new j(iVar, passAvailableSoon);
                    case 1:
                        return (b) ((j) this.f299991b.L.getValue()).f189559b.get();
                    default:
                        AsftWidgetFlow asftWidgetFlow2 = this.f299991b;
                        return czi.c.d(0, 6, null, asftWidgetFlow2, (b) asftWidgetFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (j) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (wti.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
