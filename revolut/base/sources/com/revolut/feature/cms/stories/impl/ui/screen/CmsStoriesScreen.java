package com.revolut.feature.cms.stories.impl.ui.screen;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.y9;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$style;
import com.revolut.feature.cms.stories.impl.R$layout;
import com.revolut.feature.cms.stories.impl.ui.screen.CmsStoriesScreen;
import com.revolut.feature.cms.stories.impl.ui.screen.CmsStoriesScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import dy0.v;
import efm.r;
import fj3.c;
import ix0.n1;
import ix0.o1;
import ix0.r1;
import java.util.ArrayList;
import java.util.Iterator;
import jo0.h;
import k50.b2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import phc.b;
import pj3.a;
import pj3.d;
import pj3.e;
import pj3.g;
import pj3.i;
import pj3.j;
import pj3.l;
import pj3.m;
import vc.s;
import yw0.f;
import yw0.k;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/cms/stories/impl/ui/screen/CmsStoriesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfj3/c;", "Lcli/w;", "Lpj3/m;", "Landroid/view/View$OnAttachStateChangeListener;", "Companion", "a", "feature_cms_stories_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CmsStoriesScreen extends ViewController<c> implements w, View.OnAttachStateChangeListener {
    public final CmsStoriesScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final h Q;
    public f R;
    public fj3.f S;
    public k T;
    public n1 U;
    public n1 V;
    public final ArrayList W;
    public ViewPropertyAnimator X;
    public ifm.c Y;
    public y9 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f65943a0 = {o0.f186429a.j(new h0(CmsStoriesScreen.class, "binding", "getBinding()Lcom/revolut/feature/cms/stories/impl/databinding/ScreenCmsStoriesBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.cms.stories.impl.ui.screen.CmsStoriesScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public CmsStoriesScreen(CmsStoriesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_cms_stories;
        final int i = 0;
        this.M = te0.w.y0(new Function0(this) { // from class: pj3.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CmsStoriesScreen f236632b;

            {
                this.f236632b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2;
                int i3 = i;
                CmsStoriesScreen cmsStoriesScreen = this.f236632b;
                switch (i3) {
                    case 0:
                        CmsStoriesScreenContract$InputData cmsStoriesScreenContract$InputData = cmsStoriesScreen.K;
                        if (cmsStoriesScreenContract$InputData.d) {
                            i2 = R$style.UiKitTheme_TransparentSlider;
                        } else {
                            int i5 = d.f236633a[cmsStoriesScreenContract$InputData.f65945b.ordinal()];
                            if (i5 == 1) {
                                i2 = R$style.UiKitTheme_TransparentCompat;
                            } else if (i5 == 2) {
                                i2 = R$style.UiKitTheme_TransparentNight;
                            } else {
                                if (i5 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i2 = R$style.UiKitTheme_TransparentLight;
                            }
                        }
                        return Integer.valueOf(i2);
                    case 1:
                        CmsStoriesScreen.Companion companion = CmsStoriesScreen.INSTANCE;
                        Activity activityM2 = cmsStoriesScreen.m2();
                        CmsStoriesScreenContract$InputData cmsStoriesScreenContract$InputData2 = cmsStoriesScreen.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(mj3.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mj3.d.class, " is not found"));
                        }
                        mj3.d dVar = ((mj3.d) aVar2.b()).f;
                        cmsStoriesScreenContract$InputData2.getClass();
                        fj3.f fVar = cmsStoriesScreenContract$InputData2.f65945b;
                        fVar.getClass();
                        return new mj3.f(dVar, cmsStoriesScreen, cmsStoriesScreenContract$InputData2, fVar);
                    case 2:
                        CmsStoriesScreen.Companion companion2 = CmsStoriesScreen.INSTANCE;
                        return (g) ((mj3.f) cmsStoriesScreen.N.getValue()).f205918g.get();
                    default:
                        CmsStoriesScreen.Companion companion3 = CmsStoriesScreen.INSTANCE;
                        return n14.e.a(cmsStoriesScreen, cmsStoriesScreen.R2());
                }
            }
        });
        final int i2 = 1;
        this.N = te0.w.y0(new Function0(this) { // from class: pj3.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CmsStoriesScreen f236632b;

            {
                this.f236632b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22;
                int i3 = i2;
                CmsStoriesScreen cmsStoriesScreen = this.f236632b;
                switch (i3) {
                    case 0:
                        CmsStoriesScreenContract$InputData cmsStoriesScreenContract$InputData = cmsStoriesScreen.K;
                        if (cmsStoriesScreenContract$InputData.d) {
                            i22 = R$style.UiKitTheme_TransparentSlider;
                        } else {
                            int i5 = d.f236633a[cmsStoriesScreenContract$InputData.f65945b.ordinal()];
                            if (i5 == 1) {
                                i22 = R$style.UiKitTheme_TransparentCompat;
                            } else if (i5 == 2) {
                                i22 = R$style.UiKitTheme_TransparentNight;
                            } else {
                                if (i5 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i22 = R$style.UiKitTheme_TransparentLight;
                            }
                        }
                        return Integer.valueOf(i22);
                    case 1:
                        CmsStoriesScreen.Companion companion = CmsStoriesScreen.INSTANCE;
                        Activity activityM2 = cmsStoriesScreen.m2();
                        CmsStoriesScreenContract$InputData cmsStoriesScreenContract$InputData2 = cmsStoriesScreen.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(mj3.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mj3.d.class, " is not found"));
                        }
                        mj3.d dVar = ((mj3.d) aVar2.b()).f;
                        cmsStoriesScreenContract$InputData2.getClass();
                        fj3.f fVar = cmsStoriesScreenContract$InputData2.f65945b;
                        fVar.getClass();
                        return new mj3.f(dVar, cmsStoriesScreen, cmsStoriesScreenContract$InputData2, fVar);
                    case 2:
                        CmsStoriesScreen.Companion companion2 = CmsStoriesScreen.INSTANCE;
                        return (g) ((mj3.f) cmsStoriesScreen.N.getValue()).f205918g.get();
                    default:
                        CmsStoriesScreen.Companion companion3 = CmsStoriesScreen.INSTANCE;
                        return n14.e.a(cmsStoriesScreen, cmsStoriesScreen.R2());
                }
            }
        });
        final int i3 = 2;
        this.O = te0.w.y0(new Function0(this) { // from class: pj3.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CmsStoriesScreen f236632b;

            {
                this.f236632b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22;
                int i32 = i3;
                CmsStoriesScreen cmsStoriesScreen = this.f236632b;
                switch (i32) {
                    case 0:
                        CmsStoriesScreenContract$InputData cmsStoriesScreenContract$InputData = cmsStoriesScreen.K;
                        if (cmsStoriesScreenContract$InputData.d) {
                            i22 = R$style.UiKitTheme_TransparentSlider;
                        } else {
                            int i5 = d.f236633a[cmsStoriesScreenContract$InputData.f65945b.ordinal()];
                            if (i5 == 1) {
                                i22 = R$style.UiKitTheme_TransparentCompat;
                            } else if (i5 == 2) {
                                i22 = R$style.UiKitTheme_TransparentNight;
                            } else {
                                if (i5 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i22 = R$style.UiKitTheme_TransparentLight;
                            }
                        }
                        return Integer.valueOf(i22);
                    case 1:
                        CmsStoriesScreen.Companion companion = CmsStoriesScreen.INSTANCE;
                        Activity activityM2 = cmsStoriesScreen.m2();
                        CmsStoriesScreenContract$InputData cmsStoriesScreenContract$InputData2 = cmsStoriesScreen.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(mj3.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mj3.d.class, " is not found"));
                        }
                        mj3.d dVar = ((mj3.d) aVar2.b()).f;
                        cmsStoriesScreenContract$InputData2.getClass();
                        fj3.f fVar = cmsStoriesScreenContract$InputData2.f65945b;
                        fVar.getClass();
                        return new mj3.f(dVar, cmsStoriesScreen, cmsStoriesScreenContract$InputData2, fVar);
                    case 2:
                        CmsStoriesScreen.Companion companion2 = CmsStoriesScreen.INSTANCE;
                        return (g) ((mj3.f) cmsStoriesScreen.N.getValue()).f205918g.get();
                    default:
                        CmsStoriesScreen.Companion companion3 = CmsStoriesScreen.INSTANCE;
                        return n14.e.a(cmsStoriesScreen, cmsStoriesScreen.R2());
                }
            }
        });
        final int i5 = 3;
        this.P = te0.w.y0(new Function0(this) { // from class: pj3.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CmsStoriesScreen f236632b;

            {
                this.f236632b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22;
                int i32 = i5;
                CmsStoriesScreen cmsStoriesScreen = this.f236632b;
                switch (i32) {
                    case 0:
                        CmsStoriesScreenContract$InputData cmsStoriesScreenContract$InputData = cmsStoriesScreen.K;
                        if (cmsStoriesScreenContract$InputData.d) {
                            i22 = R$style.UiKitTheme_TransparentSlider;
                        } else {
                            int i59 = d.f236633a[cmsStoriesScreenContract$InputData.f65945b.ordinal()];
                            if (i59 == 1) {
                                i22 = R$style.UiKitTheme_TransparentCompat;
                            } else if (i59 == 2) {
                                i22 = R$style.UiKitTheme_TransparentNight;
                            } else {
                                if (i59 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i22 = R$style.UiKitTheme_TransparentLight;
                            }
                        }
                        return Integer.valueOf(i22);
                    case 1:
                        CmsStoriesScreen.Companion companion = CmsStoriesScreen.INSTANCE;
                        Activity activityM2 = cmsStoriesScreen.m2();
                        CmsStoriesScreenContract$InputData cmsStoriesScreenContract$InputData2 = cmsStoriesScreen.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(mj3.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mj3.d.class, " is not found"));
                        }
                        mj3.d dVar = ((mj3.d) aVar2.b()).f;
                        cmsStoriesScreenContract$InputData2.getClass();
                        fj3.f fVar = cmsStoriesScreenContract$InputData2.f65945b;
                        fVar.getClass();
                        return new mj3.f(dVar, cmsStoriesScreen, cmsStoriesScreenContract$InputData2, fVar);
                    case 2:
                        CmsStoriesScreen.Companion companion2 = CmsStoriesScreen.INSTANCE;
                        return (g) ((mj3.f) cmsStoriesScreen.N.getValue()).f205918g.get();
                    default:
                        CmsStoriesScreen.Companion companion3 = CmsStoriesScreen.INSTANCE;
                        return n14.e.a(cmsStoriesScreen, cmsStoriesScreen.R2());
                }
            }
        });
        this.Q = s.t(this, e.f);
        this.S = inputData.f65945b;
        this.W = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getY() {
        return (Integer) this.M.getValue();
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k kVar;
        fj3.f fVar;
        fj3.f fVar2;
        k bVar;
        r rVarI0;
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        if (Intrinsics.f(uiState, pj3.k.f236642a)) {
            bVar = new f.b(0);
            fVar2 = this.S;
        } else {
            if (uiState instanceof l) {
                l lVar = (l) uiState;
                kVar = lVar.f236643a;
                fVar = lVar.f236644b;
            } else if (uiState instanceof i) {
                i iVar = (i) uiState;
                kVar = iVar.f236638a;
                fVar = iVar.f236639b;
            } else {
                if (!(uiState instanceof j)) {
                    throw new NoWhenBranchMatchedException();
                }
                j jVar = (j) uiState;
                kVar = jVar.f236640a;
                fVar = jVar.f236641b;
            }
            k kVar2 = kVar;
            fVar2 = fVar;
            bVar = kVar2;
        }
        boolean zA = bVar.a();
        ifm.c cVar = this.Y;
        if (cVar != null) {
            cVar.dispose();
        }
        ifm.c cVarSubscribe = null;
        this.Y = null;
        if (zA) {
            f fVar3 = this.R;
            if (fVar3 != null && (rVarI0 = fVar3.i0()) != null) {
                cVarSubscribe = rVarI0.subscribe(new b(26, new a(this, 0)));
            }
            this.Y = cVarSubscribe;
        } else {
            j3(this.S);
        }
        if (fVar2 != this.S) {
            this.S = fVar2;
            f fVarF3 = f3(fVar2);
            i3(fVarF3);
            j3(fVar2);
            if (this.K.d) {
                fVarF3.setNestedScrollingEnabled(true);
            }
        }
        if (bVar.equals(this.T)) {
            return;
        }
        this.T = bVar;
        f fVar4 = this.R;
        if (fVar4 != null) {
            fVar4.setModel(bVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (mj3.f) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        g3().f184285a.addOnAttachStateChangeListener(this);
        v vVar = dy0.w.Companion;
        ControllerContainerFrameLayout view2 = g3().f184285a;
        Intrinsics.checkNotNullExpressionValue(view2, "getRoot(...)");
        vVar.getClass();
        Intrinsics.checkNotNullParameter(view2, "view");
        view2.setTag(R$id.sliderThemeSystemBarsTransition_disableAnimation, Boolean.FALSE);
        f3(this.K.f65945b);
        R2().getClass();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        ifm.c cVar = this.Y;
        if (cVar != null) {
            cVar.dispose();
        }
        this.Y = null;
        ViewPropertyAnimator viewPropertyAnimator = this.X;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.X = null;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        f fVar = this.R;
        if (fVar != null) {
            i3(fVar);
            if (this.K.d) {
                fVar.setNestedScrollingEnabled(true);
            }
        }
    }

    public final void d3() {
        h30.q qVar;
        Window window;
        View decorView;
        n1 n1Var;
        h30.q qVar2;
        Window window2;
        View decorView2;
        if (D2().isAttachedToWindow()) {
            if (this.U == null) {
                Activity context = m2();
                Intrinsics.checkNotNullParameter(context, "context");
                int i = R$id.internal_status_bar_controller_tag;
                y9 y9Var = y9.THEME;
                a5.a styleApplicator = new a5.a(19);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(styleApplicator, "styleApplicator");
                Activity activityI = z92.f.i(context);
                View viewFindViewById = (activityI == null || (window2 = activityI.getWindow()) == null || (decorView2 = window2.getDecorView()) == null) ? null : decorView2.findViewById(R.id.content);
                if (activityI == null || viewFindViewById == null) {
                    qVar2 = null;
                } else {
                    Object tag2 = viewFindViewById.getTag(i);
                    r1 r1Var = tag2 instanceof r1 ? (r1) tag2 : null;
                    if (r1Var == null) {
                        r1Var = new r1();
                        viewFindViewById.setTag(i, r1Var);
                    }
                    qVar2 = new h30.q(y9Var, styleApplicator, r1Var, context);
                }
                o1 priority = o1.OVERLAY;
                Intrinsics.checkNotNullParameter(priority, "priority");
                this.U = new n1(qVar2, qVar2 != null ? Long.valueOf(qVar2.K0(priority)) : null);
            }
            y9 y9Var2 = this.Z;
            if (y9Var2 != null && (n1Var = this.U) != null) {
                n1Var.a(y9Var2);
            }
            if (this.V == null) {
                Activity context2 = m2();
                Intrinsics.checkNotNullParameter(context2, "context");
                int i2 = R$id.internal_navigation_bar_controller_tag;
                dx0.c cVar = dx0.c.DEFAULT;
                h35.c styleApplicator2 = new h35.c(25);
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(styleApplicator2, "styleApplicator");
                Activity activityI2 = z92.f.i(context2);
                View viewFindViewById2 = (activityI2 == null || (window = activityI2.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.findViewById(R.id.content);
                if (activityI2 == null || viewFindViewById2 == null) {
                    qVar = null;
                } else {
                    Object tag3 = viewFindViewById2.getTag(i2);
                    r1 r1Var2 = tag3 instanceof r1 ? (r1) tag3 : null;
                    if (r1Var2 == null) {
                        r1Var2 = new r1();
                        viewFindViewById2.setTag(i2, r1Var2);
                    }
                    qVar = new h30.q(cVar, styleApplicator2, r1Var2, context2);
                }
                o1 priority2 = o1.OVERLAY;
                Intrinsics.checkNotNullParameter(priority2, "priority");
                this.V = new n1(qVar, qVar != null ? Long.valueOf(qVar.K0(priority2)) : null);
            }
            n1 n1Var2 = this.V;
            if (n1Var2 != null) {
                n1Var2.a(dx0.c.TRANSPARENT);
            }
        }
    }

    public final void e3(r rVar, Function1 function1) {
        this.W.add(ViewController.P2(this, rd0.e.b(rVar), new b2(2, function1, kotlin.jvm.internal.s.class, "suspendConversion0", "collectTillHide$suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 23), 3));
    }

    public final f f3(fj3.f fVar) {
        int i;
        ViewPropertyAnimator viewPropertyAnimator = this.X;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        f fVar2 = this.R;
        Context contextM2 = m2();
        int i2 = d.f236633a[fVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = R$style.UiKitTheme_TransparentNight;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$style.UiKitTheme_TransparentLight;
            }
            mki.b bVarQ2 = q2();
            Integer numValueOf = Integer.valueOf(i);
            jo0.h.Companion.getClass();
            contextM2 = kji.i.a(bVarQ2, contextM2, numValueOf, null, h.a.a().e);
        }
        f fVar3 = new f(contextM2, null, 6, 0);
        this.R = fVar3;
        this.T = null;
        g3().f184285a.addView(fVar3, new ViewGroup.LayoutParams(-1, -1));
        if (fVar2 != null) {
            fVar3.setAlpha(BitmapDescriptorFactory.HUE_RED);
            ViewPropertyAnimator listener = fVar3.animate().alpha(1.0f).setDuration(300L).setListener(new aq0.k(this, 9));
            listener.start();
            this.X = listener;
        }
        return fVar3;
    }

    public final kj3.a g3() {
        ViewBinding value = this.Q.getValue(this, f65943a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (kj3.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.O.getValue();
    }

    public final void i3(f fVar) {
        ArrayList arrayList = this.W;
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ((Job) it8.next()).f(null);
        }
        arrayList.clear();
        r rVarHide = fVar.f.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        e3(rVarHide, new a(this, 5));
        r rVarHide2 = fVar.i.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide2, "hide(...)");
        e3(rVarHide2, new a(this, 6));
        r map = fVar.getActionFooterView().f.map(new yua.h(new yv8.j(5), 11));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        e3(map, new a(this, 7));
        r map2 = fVar.getActionFooterView().f58955g.map(new yua.h(new yv8.j(4), 9));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        e3(map2, new a(this, 8));
        e3(fVar.getActionFooterView().e, new a(this, 1));
        r rVarHide3 = fVar.k.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide3, "hide(...)");
        e3(rVarHide3, new a(this, 2));
        r rVarHide4 = fVar.f317262l.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide4, "hide(...)");
        e3(rVarHide4, new a(this, 3));
        r rVarHide5 = fVar.f317260h.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide5, "hide(...)");
        e3(rVarHide5, new a(this, 4));
        r rVarHide6 = fVar.f317259g.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide6, "hide(...)");
        e3(rVarHide6, new pj3.b(this, fVar, 0));
    }

    public final void j3(fj3.f fVar) {
        y9 y9Var;
        fj3.e eVar = fj3.f.Companion;
        Activity context = m2();
        eVar.getClass();
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int i = fj3.d.f135524a[fVar.ordinal()];
        if (i == 1) {
            y9Var = y9.LIGHT;
        } else if (i == 2) {
            y9Var = y9.DARK;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            y9Var = fj3.e.a(context) ? y9.LIGHT : y9.DARK;
        }
        this.Z = y9Var;
        d3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.P.getValue();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        d3();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        n1 n1Var = this.U;
        if (n1Var != null) {
            n1Var.b();
        }
        this.U = null;
        n1 n1Var2 = this.V;
        if (n1Var2 != null) {
            n1Var2.b();
        }
        this.V = null;
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.FALSE;
    }
}
