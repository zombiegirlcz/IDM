package com.revolut.kompot.bridge.impl.rootflow;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.core.content.IntentCompat;
import androidx.core.util.Consumer;
import androidx.view.ComponentActivity;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cmi.m;
import cmi.n;
import com.revolut.kompot.bridge.impl.R$id;
import com.revolut.kompot.bridge.impl.R$layout;
import com.revolut.kompot.bridge.impl.launcher.KompotLauncherFragment;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlow;
import com.revolut.kompot.bridge.navigation.DeeplinkDestination;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.flow.navigation.NavigationFlow;
import com.revolut.kompot.common.view.ControllerContainerSliderLayout;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.root.RootFlow;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.retail.core.navigation.FinishFragmentNavigateCommand;
import java.util.concurrent.CopyOnWriteArrayList;
import jji.o;
import jji.t;
import jo0.g;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kz0.b;
import nii.q1;
import nii.t0;
import no.d1;
import ru0.d;
import te0.w;
import tji.f;
import uhi.c;
import vc.s;
import yhm.j;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u00042\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/kompot/bridge/impl/rootflow/KompotFlow;", "Lcom/revolut/kompot/navigable/root/RootFlow;", "Lcom/revolut/kompot/bridge/impl/rootflow/KompotFlowContract$Step;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Landroidx/core/util/Consumer;", "Landroid/content/Intent;", "Lno/d1;", "kompot_bridge_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class KompotFlow extends RootFlow<KompotFlowContract$Step, IOData$EmptyInput> implements Consumer<Intent>, d1 {
    public static final /* synthetic */ KProperty[] g0 = {o0.f186429a.j(new h0(KompotFlow.class, "binding", "getBinding()Lcom/revolut/kompot/bridge/impl/databinding/FlowBridgeRootBinding;", 0))};
    public final Object U;
    public final Lazy V;
    public final int W;
    public final int X;
    public final h Y;
    public final b Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f98257a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f98258b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f98259d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f98260e0;
    public final Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KompotFlow(KompotLauncherFragment fragment, c dependencies) {
        super(IOData$EmptyInput.f98299a);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        this.U = w.y0(new ao.a(dependencies, 4, this, fragment));
        final int i = 0;
        this.V = j.b(new Function0(this) { // from class: whi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KompotFlow f297674b;

            {
                this.f297674b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                KompotFlow kompotFlow = this.f297674b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = KompotFlow.g0;
                        return (d) ((xhi.b) kompotFlow.U.getValue()).o.get();
                    case 1:
                        KProperty[] kPropertyArr2 = KompotFlow.g0;
                        return new tji.f(new tji.d(kompotFlow.m2(), new vc.j(kompotFlow)), d0.F0((((Boolean) g.b().getValue()).booleanValue() && ((Boolean) g.a().getValue()).booleanValue()) ? new q1(kompotFlow) : new t0(kompotFlow.m2()), kii.g.a(kompotFlow.m2())));
                    case 2:
                        KProperty[] kPropertyArr3 = KompotFlow.g0;
                        ViewBinding value = kompotFlow.Y.getValue(kompotFlow, KompotFlow.g0[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        ControllerContainerSliderLayout rootSlidingContainer = ((qhi.a) value).f246613c;
                        Intrinsics.checkNotNullExpressionValue(rootSlidingContainer, "rootSlidingContainer");
                        return new t(kompotFlow, rootSlidingContainer);
                    case 3:
                        KProperty[] kPropertyArr4 = KompotFlow.g0;
                        o.a aVar = o.Companion;
                        Activity activityM2 = kompotFlow.m2();
                        aVar.getClass();
                        return o.a.a(activityM2);
                    case 4:
                        KProperty[] kPropertyArr5 = KompotFlow.g0;
                        return new wii.a(kompotFlow.m2());
                    default:
                        KProperty[] kPropertyArr6 = KompotFlow.g0;
                        return new sz.b(((xhi.b) kompotFlow.U.getValue()).f306252l, 2).a();
                }
            }
        });
        this.W = R$layout.flow_bridge_root;
        this.X = R$id.root_sliding_container;
        this.Y = s.t(this, whi.c.f);
        this.Z = dependencies.f280245a.o0();
        final int i2 = 1;
        this.f98257a0 = w.y0(new Function0(this) { // from class: whi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KompotFlow f297674b;

            {
                this.f297674b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                KompotFlow kompotFlow = this.f297674b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = KompotFlow.g0;
                        return (d) ((xhi.b) kompotFlow.U.getValue()).o.get();
                    case 1:
                        KProperty[] kPropertyArr2 = KompotFlow.g0;
                        return new tji.f(new tji.d(kompotFlow.m2(), new vc.j(kompotFlow)), d0.F0((((Boolean) g.b().getValue()).booleanValue() && ((Boolean) g.a().getValue()).booleanValue()) ? new q1(kompotFlow) : new t0(kompotFlow.m2()), kii.g.a(kompotFlow.m2())));
                    case 2:
                        KProperty[] kPropertyArr3 = KompotFlow.g0;
                        ViewBinding value = kompotFlow.Y.getValue(kompotFlow, KompotFlow.g0[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        ControllerContainerSliderLayout rootSlidingContainer = ((qhi.a) value).f246613c;
                        Intrinsics.checkNotNullExpressionValue(rootSlidingContainer, "rootSlidingContainer");
                        return new t(kompotFlow, rootSlidingContainer);
                    case 3:
                        KProperty[] kPropertyArr4 = KompotFlow.g0;
                        o.a aVar = o.Companion;
                        Activity activityM2 = kompotFlow.m2();
                        aVar.getClass();
                        return o.a.a(activityM2);
                    case 4:
                        KProperty[] kPropertyArr5 = KompotFlow.g0;
                        return new wii.a(kompotFlow.m2());
                    default:
                        KProperty[] kPropertyArr6 = KompotFlow.g0;
                        return new sz.b(((xhi.b) kompotFlow.U.getValue()).f306252l, 2).a();
                }
            }
        });
        final int i3 = 2;
        this.f98258b0 = w.y0(new Function0(this) { // from class: whi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KompotFlow f297674b;

            {
                this.f297674b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                KompotFlow kompotFlow = this.f297674b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = KompotFlow.g0;
                        return (d) ((xhi.b) kompotFlow.U.getValue()).o.get();
                    case 1:
                        KProperty[] kPropertyArr2 = KompotFlow.g0;
                        return new tji.f(new tji.d(kompotFlow.m2(), new vc.j(kompotFlow)), d0.F0((((Boolean) g.b().getValue()).booleanValue() && ((Boolean) g.a().getValue()).booleanValue()) ? new q1(kompotFlow) : new t0(kompotFlow.m2()), kii.g.a(kompotFlow.m2())));
                    case 2:
                        KProperty[] kPropertyArr3 = KompotFlow.g0;
                        ViewBinding value = kompotFlow.Y.getValue(kompotFlow, KompotFlow.g0[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        ControllerContainerSliderLayout rootSlidingContainer = ((qhi.a) value).f246613c;
                        Intrinsics.checkNotNullExpressionValue(rootSlidingContainer, "rootSlidingContainer");
                        return new t(kompotFlow, rootSlidingContainer);
                    case 3:
                        KProperty[] kPropertyArr4 = KompotFlow.g0;
                        o.a aVar = o.Companion;
                        Activity activityM2 = kompotFlow.m2();
                        aVar.getClass();
                        return o.a.a(activityM2);
                    case 4:
                        KProperty[] kPropertyArr5 = KompotFlow.g0;
                        return new wii.a(kompotFlow.m2());
                    default:
                        KProperty[] kPropertyArr6 = KompotFlow.g0;
                        return new sz.b(((xhi.b) kompotFlow.U.getValue()).f306252l, 2).a();
                }
            }
        });
        final int i5 = 3;
        this.c0 = w.y0(new Function0(this) { // from class: whi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KompotFlow f297674b;

            {
                this.f297674b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                KompotFlow kompotFlow = this.f297674b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = KompotFlow.g0;
                        return (d) ((xhi.b) kompotFlow.U.getValue()).o.get();
                    case 1:
                        KProperty[] kPropertyArr2 = KompotFlow.g0;
                        return new tji.f(new tji.d(kompotFlow.m2(), new vc.j(kompotFlow)), d0.F0((((Boolean) g.b().getValue()).booleanValue() && ((Boolean) g.a().getValue()).booleanValue()) ? new q1(kompotFlow) : new t0(kompotFlow.m2()), kii.g.a(kompotFlow.m2())));
                    case 2:
                        KProperty[] kPropertyArr3 = KompotFlow.g0;
                        ViewBinding value = kompotFlow.Y.getValue(kompotFlow, KompotFlow.g0[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        ControllerContainerSliderLayout rootSlidingContainer = ((qhi.a) value).f246613c;
                        Intrinsics.checkNotNullExpressionValue(rootSlidingContainer, "rootSlidingContainer");
                        return new t(kompotFlow, rootSlidingContainer);
                    case 3:
                        KProperty[] kPropertyArr4 = KompotFlow.g0;
                        o.a aVar = o.Companion;
                        Activity activityM2 = kompotFlow.m2();
                        aVar.getClass();
                        return o.a.a(activityM2);
                    case 4:
                        KProperty[] kPropertyArr5 = KompotFlow.g0;
                        return new wii.a(kompotFlow.m2());
                    default:
                        KProperty[] kPropertyArr6 = KompotFlow.g0;
                        return new sz.b(((xhi.b) kompotFlow.U.getValue()).f306252l, 2).a();
                }
            }
        });
        this.f98259d0 = w.y0(new d(22));
        final int i6 = 4;
        this.f98260e0 = w.y0(new Function0(this) { // from class: whi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KompotFlow f297674b;

            {
                this.f297674b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                KompotFlow kompotFlow = this.f297674b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = KompotFlow.g0;
                        return (d) ((xhi.b) kompotFlow.U.getValue()).o.get();
                    case 1:
                        KProperty[] kPropertyArr2 = KompotFlow.g0;
                        return new tji.f(new tji.d(kompotFlow.m2(), new vc.j(kompotFlow)), d0.F0((((Boolean) g.b().getValue()).booleanValue() && ((Boolean) g.a().getValue()).booleanValue()) ? new q1(kompotFlow) : new t0(kompotFlow.m2()), kii.g.a(kompotFlow.m2())));
                    case 2:
                        KProperty[] kPropertyArr3 = KompotFlow.g0;
                        ViewBinding value = kompotFlow.Y.getValue(kompotFlow, KompotFlow.g0[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        ControllerContainerSliderLayout rootSlidingContainer = ((qhi.a) value).f246613c;
                        Intrinsics.checkNotNullExpressionValue(rootSlidingContainer, "rootSlidingContainer");
                        return new t(kompotFlow, rootSlidingContainer);
                    case 3:
                        KProperty[] kPropertyArr4 = KompotFlow.g0;
                        o.a aVar = o.Companion;
                        Activity activityM2 = kompotFlow.m2();
                        aVar.getClass();
                        return o.a.a(activityM2);
                    case 4:
                        KProperty[] kPropertyArr5 = KompotFlow.g0;
                        return new wii.a(kompotFlow.m2());
                    default:
                        KProperty[] kPropertyArr6 = KompotFlow.g0;
                        return new sz.b(((xhi.b) kompotFlow.U.getValue()).f306252l, 2).a();
                }
            }
        });
        final int i21 = 5;
        this.f0 = w.y0(new Function0(this) { // from class: whi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KompotFlow f297674b;

            {
                this.f297674b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                KompotFlow kompotFlow = this.f297674b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = KompotFlow.g0;
                        return (d) ((xhi.b) kompotFlow.U.getValue()).o.get();
                    case 1:
                        KProperty[] kPropertyArr2 = KompotFlow.g0;
                        return new tji.f(new tji.d(kompotFlow.m2(), new vc.j(kompotFlow)), d0.F0((((Boolean) g.b().getValue()).booleanValue() && ((Boolean) g.a().getValue()).booleanValue()) ? new q1(kompotFlow) : new t0(kompotFlow.m2()), kii.g.a(kompotFlow.m2())));
                    case 2:
                        KProperty[] kPropertyArr3 = KompotFlow.g0;
                        ViewBinding value = kompotFlow.Y.getValue(kompotFlow, KompotFlow.g0[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        ControllerContainerSliderLayout rootSlidingContainer = ((qhi.a) value).f246613c;
                        Intrinsics.checkNotNullExpressionValue(rootSlidingContainer, "rootSlidingContainer");
                        return new t(kompotFlow, rootSlidingContainer);
                    case 3:
                        KProperty[] kPropertyArr4 = KompotFlow.g0;
                        o.a aVar = o.Companion;
                        Activity activityM2 = kompotFlow.m2();
                        aVar.getClass();
                        return o.a.a(activityM2);
                    case 4:
                        KProperty[] kPropertyArr5 = KompotFlow.g0;
                        return new wii.a(kompotFlow.m2());
                    default:
                        KProperty[] kPropertyArr6 = KompotFlow.g0;
                        return new sz.b(((xhi.b) kompotFlow.U.getValue()).f306252l, 2).a();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.root.RootFlow, com.revolut.kompot.navigable.flow.BaseFlow, com.revolut.kompot.navigable.a
    public final void H2() {
        super.H2();
        n nVar = (n) this.f0.getValue();
        if (nVar != null) {
            whi.d dVar = (whi.d) this.V.getValue();
            Intrinsics.i(dVar, "null cannot be cast to non-null type com.revolut.navigation.deeplink.api.DeeplinkDestinationInterceptor");
            ((m) nVar).r3((wli.o) dVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.root.RootFlow, com.revolut.kompot.navigable.flow.BaseFlow, com.revolut.kompot.navigable.a
    public final void I2() {
        n nVar = (n) this.f0.getValue();
        if (nVar != null) {
            whi.d dVar = (whi.d) this.V.getValue();
            Intrinsics.i(dVar, "null cannot be cast to non-null type com.revolut.navigation.deeplink.api.DeeplinkDestinationInterceptor");
            ((m) nVar).u3((wli.o) dVar);
        }
        super.I2();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (xhi.b) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (xhi.b) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    /* JADX INFO: renamed from: R2, reason: from getter */
    public final int getR() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final dki.s S2() {
        return (whi.d) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final Function1 U2() {
        return new whi.b(0);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.root.RootFlow, com.revolut.kompot.navigable.flow.BaseFlow
    public final void a3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.a3(view);
        if (m2() instanceof wri.a) {
            Activity activityM2 = m2();
            if (!(activityM2 instanceof ComponentActivity)) {
                activityM2 = null;
            }
            ComponentActivity componentActivity = (ComponentActivity) activityM2;
            if (componentActivity != null) {
                componentActivity.addOnNewIntentListener(this);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("KompotFlow: Activity is not ComponentActivity, unable to listen for new intents");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            }
        }
        ((t) this.f98258b0.getValue()).a();
        o oVar = (o) this.c0.getValue();
        if (oVar != null) {
            oVar.a();
        }
        ((wii.c) this.f98259d0.getValue()).a();
        ((wii.a) this.f98260e0.getValue()).a();
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Intent intent) {
        Intent value = intent;
        Intrinsics.checkNotNullParameter(value, "value");
        KompotDestination destination = (KompotDestination) IntentCompat.getParcelableExtra(value, "intent_kompot_destination_key", KompotDestination.class);
        if (destination == null) {
            return;
        }
        a aVar = (a) ((whi.d) this.V.getValue());
        aVar.getClass();
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination instanceof DeeplinkDestination) {
            aVar.C1(((DeeplinkDestination) destination).getF98272b());
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.root.RootFlow, com.revolut.kompot.navigable.flow.BaseFlow
    public final void b3() {
        Activity activityM2 = m2();
        if (!(activityM2 instanceof ComponentActivity)) {
            activityM2 = null;
        }
        ComponentActivity componentActivity = (ComponentActivity) activityM2;
        if (componentActivity != null) {
            componentActivity.removeOnNewIntentListener(this);
        }
        super.b3();
        ((t) this.f98258b0.getValue()).b();
        o oVar = (o) this.c0.getValue();
        if (oVar != null) {
            oVar.b();
        }
        ((wii.c) this.f98259d0.getValue()).b();
        ((wii.a) this.f98260e0.getValue()).b();
    }

    @Override // com.revolut.kompot.navigable.root.RootFlow, com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        KompotFlowContract$Step step = (KompotFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.root.RootFlow
    public final ControllerContainerFrameLayout h3() {
        ViewBinding value = this.Y.getValue(this, g0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ControllerContainerFrameLayout bridgeRootContainerModal = ((qhi.a) value).f246612b;
        Intrinsics.checkNotNullExpressionValue(bridgeRootContainerModal, "bridgeRootContainerModal");
        return bridgeRootContainerModal;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.root.RootFlow
    public final f i3() {
        return (f) this.f98257a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.root.RootFlow
    public final void j3() {
        ((a) ((whi.d) this.V.getValue())).z.c(new FinishFragmentNavigateCommand(0));
    }

    @Override // com.revolut.kompot.navigable.root.RootFlow
    public final com.revolut.kompot.navigable.a l3(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        a aVar = (a) ((whi.d) this.V.getValue());
        aVar.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new NavigationFlow(controller, aVar.C, aVar);
    }
}
