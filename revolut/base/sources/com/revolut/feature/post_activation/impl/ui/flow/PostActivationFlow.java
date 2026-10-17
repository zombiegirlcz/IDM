package com.revolut.feature.post_activation.impl.ui.flow;

import aii.q;
import android.app.Activity;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.background.StatefulAnimatedBackground;
import com.revolut.feature.post_activation.api.navigation.PostActivationFlowDescriptor;
import com.revolut.feature.post_activation.impl.ui.flow.PostActivationFlow;
import com.revolut.feature.post_activation.impl.ui.flow.PostActivationFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.core.ui.activity.CustomTheme;
import g99.j;
import ik3.g;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kji.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.d;
import rfa.b;
import rfa.c;
import te0.w;
import vc.s;
import xki.e;
import yki.f;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/post_activation/impl/ui/flow/PostActivationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_retail_post_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PostActivationFlow extends ViewController<q> implements f {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PostActivationFlow.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/FlowStatefulAnimatedBackgroundBinding;", 0))};
    public final PostActivationFlowContract$InputData K;
    public final h L;
    public final int M;
    public final Object N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public PostActivationFlow(PostActivationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.flow_stateful_animated_background;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: rfa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PostActivationFlow f253738b;

            {
                this.f253738b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PostActivationFlow postActivationFlow = this.f253738b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PostActivationFlow.S;
                        return czi.c.d(R$id.container, 4, null, postActivationFlow, (c) postActivationFlow.Q.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PostActivationFlow.S;
                        phm.a aVar = (phm.a) ue0.e.j(postActivationFlow.m2()).a().get(jfa.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jfa.a.class, " is not found"));
                        }
                        jfa.a aVar3 = ((jfa.a) aVar2.b()).f173741q;
                        PostActivationFlowContract$InputData postActivationFlowContract$InputData = postActivationFlow.K;
                        postActivationFlowContract$InputData.getClass();
                        return new jfa.b(aVar3, postActivationFlowContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PostActivationFlow.S;
                        return (c) ((jfa.b) postActivationFlow.P.getValue()).f173750c.get();
                    default:
                        PostActivationFlow postActivationFlow2 = this.f253738b;
                        ?? r06 = postActivationFlow2.P;
                        if (!(postActivationFlow2.K.f80938a instanceof PostActivationFlowDescriptor.Configuration.Login)) {
                            return zhm.h0.f322473a;
                        }
                        StatefulAnimatedBackground background = postActivationFlow2.d3().f174507b;
                        Intrinsics.checkNotNullExpressionValue(background, "background");
                        ControllerContainerFrameLayout container = postActivationFlow2.d3().f174508c;
                        Intrinsics.checkNotNullExpressionValue(container, "container");
                        cwj.a aVar4 = (cwj.a) ((jfa.b) r06.getValue()).f173749b.f173738m.P.get();
                        s.j(aVar4);
                        fk3.b bVarB = ((jfa.b) r06.getValue()).f173749b.f173740p.b();
                        s.j(bVarB);
                        return y0.b(new g99.h(postActivationFlow2, background, container, aVar4, ((ik3.g) bVarB).f161888g.b().H1, j.f141520a));
                }
            }
        });
        this.O = R$style.UiKitTheme_TransparentCompat;
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: rfa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PostActivationFlow f253738b;

            {
                this.f253738b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PostActivationFlow postActivationFlow = this.f253738b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PostActivationFlow.S;
                        return czi.c.d(R$id.container, 4, null, postActivationFlow, (c) postActivationFlow.Q.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PostActivationFlow.S;
                        phm.a aVar = (phm.a) ue0.e.j(postActivationFlow.m2()).a().get(jfa.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jfa.a.class, " is not found"));
                        }
                        jfa.a aVar3 = ((jfa.a) aVar2.b()).f173741q;
                        PostActivationFlowContract$InputData postActivationFlowContract$InputData = postActivationFlow.K;
                        postActivationFlowContract$InputData.getClass();
                        return new jfa.b(aVar3, postActivationFlowContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PostActivationFlow.S;
                        return (c) ((jfa.b) postActivationFlow.P.getValue()).f173750c.get();
                    default:
                        PostActivationFlow postActivationFlow2 = this.f253738b;
                        ?? r06 = postActivationFlow2.P;
                        if (!(postActivationFlow2.K.f80938a instanceof PostActivationFlowDescriptor.Configuration.Login)) {
                            return zhm.h0.f322473a;
                        }
                        StatefulAnimatedBackground background = postActivationFlow2.d3().f174507b;
                        Intrinsics.checkNotNullExpressionValue(background, "background");
                        ControllerContainerFrameLayout container = postActivationFlow2.d3().f174508c;
                        Intrinsics.checkNotNullExpressionValue(container, "container");
                        cwj.a aVar4 = (cwj.a) ((jfa.b) r06.getValue()).f173749b.f173738m.P.get();
                        s.j(aVar4);
                        fk3.b bVarB = ((jfa.b) r06.getValue()).f173749b.f173740p.b();
                        s.j(bVarB);
                        return y0.b(new g99.h(postActivationFlow2, background, container, aVar4, ((ik3.g) bVarB).f161888g.b().H1, j.f141520a));
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: rfa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PostActivationFlow f253738b;

            {
                this.f253738b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PostActivationFlow postActivationFlow = this.f253738b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PostActivationFlow.S;
                        return czi.c.d(R$id.container, 4, null, postActivationFlow, (c) postActivationFlow.Q.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PostActivationFlow.S;
                        phm.a aVar = (phm.a) ue0.e.j(postActivationFlow.m2()).a().get(jfa.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jfa.a.class, " is not found"));
                        }
                        jfa.a aVar3 = ((jfa.a) aVar2.b()).f173741q;
                        PostActivationFlowContract$InputData postActivationFlowContract$InputData = postActivationFlow.K;
                        postActivationFlowContract$InputData.getClass();
                        return new jfa.b(aVar3, postActivationFlowContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PostActivationFlow.S;
                        return (c) ((jfa.b) postActivationFlow.P.getValue()).f173750c.get();
                    default:
                        PostActivationFlow postActivationFlow2 = this.f253738b;
                        ?? r06 = postActivationFlow2.P;
                        if (!(postActivationFlow2.K.f80938a instanceof PostActivationFlowDescriptor.Configuration.Login)) {
                            return zhm.h0.f322473a;
                        }
                        StatefulAnimatedBackground background = postActivationFlow2.d3().f174507b;
                        Intrinsics.checkNotNullExpressionValue(background, "background");
                        ControllerContainerFrameLayout container = postActivationFlow2.d3().f174508c;
                        Intrinsics.checkNotNullExpressionValue(container, "container");
                        cwj.a aVar4 = (cwj.a) ((jfa.b) r06.getValue()).f173749b.f173738m.P.get();
                        s.j(aVar4);
                        fk3.b bVarB = ((jfa.b) r06.getValue()).f173749b.f173740p.b();
                        s.j(bVarB);
                        return y0.b(new g99.h(postActivationFlow2, background, container, aVar4, ((ik3.g) bVarB).f161888g.b().H1, j.f141520a));
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: rfa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PostActivationFlow f253738b;

            {
                this.f253738b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PostActivationFlow postActivationFlow = this.f253738b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PostActivationFlow.S;
                        return czi.c.d(R$id.container, 4, null, postActivationFlow, (c) postActivationFlow.Q.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PostActivationFlow.S;
                        phm.a aVar = (phm.a) ue0.e.j(postActivationFlow.m2()).a().get(jfa.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jfa.a.class, " is not found"));
                        }
                        jfa.a aVar3 = ((jfa.a) aVar2.b()).f173741q;
                        PostActivationFlowContract$InputData postActivationFlowContract$InputData = postActivationFlow.K;
                        postActivationFlowContract$InputData.getClass();
                        return new jfa.b(aVar3, postActivationFlowContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PostActivationFlow.S;
                        return (c) ((jfa.b) postActivationFlow.P.getValue()).f173750c.get();
                    default:
                        PostActivationFlow postActivationFlow2 = this.f253738b;
                        ?? r06 = postActivationFlow2.P;
                        if (!(postActivationFlow2.K.f80938a instanceof PostActivationFlowDescriptor.Configuration.Login)) {
                            return zhm.h0.f322473a;
                        }
                        StatefulAnimatedBackground background = postActivationFlow2.d3().f174507b;
                        Intrinsics.checkNotNullExpressionValue(background, "background");
                        ControllerContainerFrameLayout container = postActivationFlow2.d3().f174508c;
                        Intrinsics.checkNotNullExpressionValue(container, "container");
                        cwj.a aVar4 = (cwj.a) ((jfa.b) r06.getValue()).f173749b.f173738m.P.get();
                        s.j(aVar4);
                        fk3.b bVarB = ((jfa.b) r06.getValue()).f173749b.f173740p.b();
                        s.j(bVarB);
                        return y0.b(new g99.h(postActivationFlow2, background, container, aVar4, ((ik3.g) bVarB).f161888g.b().H1, j.f141520a));
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getS() {
        return Integer.valueOf(this.O);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (jfa.b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (jfa.b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(this, "controller");
        this.F.addObserver(new esi.c(this));
        Activity activityM2 = m2();
        if (activityM2 instanceof BaseDelegatesActivity) {
            BaseDelegatesActivity baseDelegatesActivity = (BaseDelegatesActivity) activityM2;
            CustomTheme.Companion companion = CustomTheme.INSTANCE;
            fk3.b bVarB = ((jfa.b) this.P.getValue()).f173749b.f173740p.b();
            s.j(bVarB);
            AnimatedBackgroundType animatedBackgroundType = ((g) bVarB).f161888g.b().H1 ? AnimatedBackgroundType.ONBOARDING.f51478a : AnimatedBackgroundType.DEFAULT.f51471a;
            companion.getClass();
            baseDelegatesActivity.T0(CustomTheme.Companion.a(animatedBackgroundType), false);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Post-activation: cannot apply transparent theme flag, expected hosting Activity to be BaseDelegatesActivity");
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        if (this.K.f80938a instanceof PostActivationFlowDescriptor.Configuration.Onboarding) {
            d3().f174507b.setVisibility(8);
        }
    }

    public final jii.d d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.d) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final Set o2() {
        return (Set) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
