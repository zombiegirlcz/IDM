package com.revolut.feature.devicemanagement.impl.ui.flow;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.devicemanagement.api.navigation.DeviceManagementDestination;
import com.revolut.feature.devicemanagement.impl.ui.flow.DeviceManagementFlow;
import com.revolut.kompot.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n86.g;
import te0.w;
import u6h.h;
import u86.d;
import uki.c;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/devicemanagement/impl/ui/flow/DeviceManagementFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Luki/c;", "feature_device_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeviceManagementFlow extends ViewController<q> implements c {
    public static final /* synthetic */ int Q = 0;
    public final DeviceManagementDestination.Config K;
    public final TwinHorizontalButtonDelegate L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;

    public DeviceManagementFlow(DeviceManagementDestination.Config input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        this.L = new TwinHorizontalButtonDelegate();
        this.M = w.y0(new h(8));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: u86.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceManagementFlow f278123b;

            {
                this.f278123b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        DeviceManagementFlow deviceManagementFlow = this.f278123b;
                        phm.a aVar = (phm.a) ue0.e.j(deviceManagementFlow.m2()).a().get(n86.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n86.h.class, " is not found"));
                        }
                        n86.e eVarC = ((n86.h) aVar2.b()).c();
                        eVarC.f213238b = deviceManagementFlow;
                        DeviceManagementDestination.Config config = deviceManagementFlow.K;
                        config.getClass();
                        eVarC.f213239c = config;
                        return (v86.a) eVarC.build();
                    case 1:
                        return (d) ((g) ((v86.a) this.f278123b.N.getValue())).f.get();
                    default:
                        DeviceManagementFlow deviceManagementFlow2 = this.f278123b;
                        return czi.c.a(R$id.container, (d) deviceManagementFlow2.O.getValue(), deviceManagementFlow2);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: u86.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceManagementFlow f278123b;

            {
                this.f278123b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        DeviceManagementFlow deviceManagementFlow = this.f278123b;
                        phm.a aVar = (phm.a) ue0.e.j(deviceManagementFlow.m2()).a().get(n86.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n86.h.class, " is not found"));
                        }
                        n86.e eVarC = ((n86.h) aVar2.b()).c();
                        eVarC.f213238b = deviceManagementFlow;
                        DeviceManagementDestination.Config config = deviceManagementFlow.K;
                        config.getClass();
                        eVarC.f213239c = config;
                        return (v86.a) eVarC.build();
                    case 1:
                        return (d) ((g) ((v86.a) this.f278123b.N.getValue())).f.get();
                    default:
                        DeviceManagementFlow deviceManagementFlow2 = this.f278123b;
                        return czi.c.a(R$id.container, (d) deviceManagementFlow2.O.getValue(), deviceManagementFlow2);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: u86.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceManagementFlow f278123b;

            {
                this.f278123b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        DeviceManagementFlow deviceManagementFlow = this.f278123b;
                        phm.a aVar = (phm.a) ue0.e.j(deviceManagementFlow.m2()).a().get(n86.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n86.h.class, " is not found"));
                        }
                        n86.e eVarC = ((n86.h) aVar2.b()).c();
                        eVarC.f213238b = deviceManagementFlow;
                        DeviceManagementDestination.Config config = deviceManagementFlow.K;
                        config.getClass();
                        eVarC.f213239c = config;
                        return (v86.a) eVarC.build();
                    case 1:
                        return (d) ((g) ((v86.a) this.f278123b.N.getValue())).f.get();
                    default:
                        DeviceManagementFlow deviceManagementFlow2 = this.f278123b;
                        return czi.c.a(R$id.container, (d) deviceManagementFlow2.O.getValue(), deviceManagementFlow2);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v86.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (v86.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (d) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((g) ((v86.a) this.N.getValue())).d.get()).d(v.k((CellDetailsSwitcherDelegate) this.M.getValue(), new CellDetailsStandaloneNoteDelegate(), this.L, new TextDelegate()));
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsSwitcherDelegate) this.M.getValue()).f51912c), null, new u86.b(this, null), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.L;
        ViewController.P2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), new u86.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), new u86.c(this, continuation, 1), 3);
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
