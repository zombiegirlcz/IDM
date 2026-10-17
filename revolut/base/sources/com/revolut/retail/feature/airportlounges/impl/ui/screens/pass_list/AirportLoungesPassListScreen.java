package com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list;

import android.content.Context;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.R$layout;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.AirportLoungesPassListScreen;
import cwi.c1;
import et0.q0;
import fp0.l;
import gul.n;
import gvi.p;
import gyi.b;
import gyi.d0;
import gyi.i;
import gyi.j;
import gyi.k;
import gyi.x;
import gyi.y;
import gyi.z;
import java.util.ArrayList;
import java.util.List;
import kli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.c7;
import vc.s;
import vkm.t0;
import xki.e;
import zhm.v;
import zvi.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/pass_list/AirportLoungesPassListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgyi/b;", "Lcli/w;", "Lgyi/k;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportLoungesPassListScreen extends ViewController<b> implements w {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(AirportLoungesPassListScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/airportlounges/impl/databinding/ScreenAirportLoungesPassListBinding;", 0))};
    public final AirportLoungesPassListContract$InputData K;
    public final int L;
    public final int M;
    public final boolean N;
    public final h O;
    public boolean P;
    public boolean Q;
    public OneShotPreDrawListener R;
    public final Object S;
    public final y T;
    public final Object U;
    public final Object V;
    public final Object W;

    public AirportLoungesPassListScreen(AirportLoungesPassListContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_airport_lounges_pass_list;
        this.M = R$style.UiKitTheme_Transparent;
        this.N = true;
        this.O = s.t(this, gyi.w.f);
        final int i = 0;
        this.S = te0.w.y0(new Function0(this) { // from class: gyi.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesPassListScreen f147909b;

            {
                this.f147909b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AirportLoungesPassListScreen airportLoungesPassListScreen = this.f147909b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungesPassListScreen.X;
                        AirportLoungesPassListScreen airportLoungesPassListScreen2 = this.f147909b;
                        return new s(new a76.c(0, airportLoungesPassListScreen2.k3(), h.class, "onRetryClick", "onRetryClick()V", 0, 25), new gwc.h(1, airportLoungesPassListScreen2, AirportLoungesPassListScreen.class, "handleActionItemClick", "handleActionItemClick(Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/pass_list/AirportLoungesPassListContract$PassActionPayload;)V", 0, 2));
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungesPassListScreen.X;
                        return n14.e.a(airportLoungesPassListScreen, airportLoungesPassListScreen.k3());
                    case 2:
                        KProperty[] kPropertyArr3 = AirportLoungesPassListScreen.X;
                        qji.b bVarU2 = airportLoungesPassListScreen.U2();
                        if (bVarU2 != null) {
                            return (c1) ((hyi.a) ((hyi.b) bVarU2).j().mo3808a(airportLoungesPassListScreen)).Y(airportLoungesPassListScreen.K).mo3783build();
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.di.AirportLoungesPassListScreenInjector");
                    default:
                        KProperty[] kPropertyArr4 = AirportLoungesPassListScreen.X;
                        c1 c1Var = (c1) airportLoungesPassListScreen.V.getValue();
                        switch (c1Var.f109648a) {
                            case 0:
                                return (h) c1Var.f109653j.get();
                            case 1:
                                return (h) c1Var.f109653j.get();
                            case 2:
                                return (h) c1Var.f109653j.get();
                            default:
                                return (h) c1Var.f109653j.get();
                        }
                }
            }
        });
        this.T = new y(this);
        final int i2 = 1;
        this.U = te0.w.y0(new Function0(this) { // from class: gyi.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesPassListScreen f147909b;

            {
                this.f147909b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AirportLoungesPassListScreen airportLoungesPassListScreen = this.f147909b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungesPassListScreen.X;
                        AirportLoungesPassListScreen airportLoungesPassListScreen2 = this.f147909b;
                        return new s(new a76.c(0, airportLoungesPassListScreen2.k3(), h.class, "onRetryClick", "onRetryClick()V", 0, 25), new gwc.h(1, airportLoungesPassListScreen2, AirportLoungesPassListScreen.class, "handleActionItemClick", "handleActionItemClick(Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/pass_list/AirportLoungesPassListContract$PassActionPayload;)V", 0, 2));
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungesPassListScreen.X;
                        return n14.e.a(airportLoungesPassListScreen, airportLoungesPassListScreen.k3());
                    case 2:
                        KProperty[] kPropertyArr3 = AirportLoungesPassListScreen.X;
                        qji.b bVarU2 = airportLoungesPassListScreen.U2();
                        if (bVarU2 != null) {
                            return (c1) ((hyi.a) ((hyi.b) bVarU2).j().mo3808a(airportLoungesPassListScreen)).Y(airportLoungesPassListScreen.K).mo3783build();
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.di.AirportLoungesPassListScreenInjector");
                    default:
                        KProperty[] kPropertyArr4 = AirportLoungesPassListScreen.X;
                        c1 c1Var = (c1) airportLoungesPassListScreen.V.getValue();
                        switch (c1Var.f109648a) {
                            case 0:
                                return (h) c1Var.f109653j.get();
                            case 1:
                                return (h) c1Var.f109653j.get();
                            case 2:
                                return (h) c1Var.f109653j.get();
                            default:
                                return (h) c1Var.f109653j.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.V = te0.w.y0(new Function0(this) { // from class: gyi.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesPassListScreen f147909b;

            {
                this.f147909b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AirportLoungesPassListScreen airportLoungesPassListScreen = this.f147909b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungesPassListScreen.X;
                        AirportLoungesPassListScreen airportLoungesPassListScreen2 = this.f147909b;
                        return new s(new a76.c(0, airportLoungesPassListScreen2.k3(), h.class, "onRetryClick", "onRetryClick()V", 0, 25), new gwc.h(1, airportLoungesPassListScreen2, AirportLoungesPassListScreen.class, "handleActionItemClick", "handleActionItemClick(Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/pass_list/AirportLoungesPassListContract$PassActionPayload;)V", 0, 2));
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungesPassListScreen.X;
                        return n14.e.a(airportLoungesPassListScreen, airportLoungesPassListScreen.k3());
                    case 2:
                        KProperty[] kPropertyArr3 = AirportLoungesPassListScreen.X;
                        qji.b bVarU2 = airportLoungesPassListScreen.U2();
                        if (bVarU2 != null) {
                            return (c1) ((hyi.a) ((hyi.b) bVarU2).j().mo3808a(airportLoungesPassListScreen)).Y(airportLoungesPassListScreen.K).mo3783build();
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.di.AirportLoungesPassListScreenInjector");
                    default:
                        KProperty[] kPropertyArr4 = AirportLoungesPassListScreen.X;
                        c1 c1Var = (c1) airportLoungesPassListScreen.V.getValue();
                        switch (c1Var.f109648a) {
                            case 0:
                                return (h) c1Var.f109653j.get();
                            case 1:
                                return (h) c1Var.f109653j.get();
                            case 2:
                                return (h) c1Var.f109653j.get();
                            default:
                                return (h) c1Var.f109653j.get();
                        }
                }
            }
        });
        final int i5 = 3;
        this.W = te0.w.y0(new Function0(this) { // from class: gyi.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesPassListScreen f147909b;

            {
                this.f147909b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                AirportLoungesPassListScreen airportLoungesPassListScreen = this.f147909b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungesPassListScreen.X;
                        AirportLoungesPassListScreen airportLoungesPassListScreen2 = this.f147909b;
                        return new s(new a76.c(0, airportLoungesPassListScreen2.k3(), h.class, "onRetryClick", "onRetryClick()V", 0, 25), new gwc.h(1, airportLoungesPassListScreen2, AirportLoungesPassListScreen.class, "handleActionItemClick", "handleActionItemClick(Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/pass_list/AirportLoungesPassListContract$PassActionPayload;)V", 0, 2));
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungesPassListScreen.X;
                        return n14.e.a(airportLoungesPassListScreen, airportLoungesPassListScreen.k3());
                    case 2:
                        KProperty[] kPropertyArr3 = AirportLoungesPassListScreen.X;
                        qji.b bVarU2 = airportLoungesPassListScreen.U2();
                        if (bVarU2 != null) {
                            return (c1) ((hyi.a) ((hyi.b) bVarU2).j().mo3808a(airportLoungesPassListScreen)).Y(airportLoungesPassListScreen.K).mo3783build();
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.di.AirportLoungesPassListScreenInjector");
                    default:
                        KProperty[] kPropertyArr4 = AirportLoungesPassListScreen.X;
                        c1 c1Var = (c1) airportLoungesPassListScreen.V.getValue();
                        switch (c1Var.f109648a) {
                            case 0:
                                return (h) c1Var.f109653j.get();
                            case 1:
                                return (h) c1Var.f109653j.get();
                            case 2:
                                return (h) c1Var.f109653j.get();
                            default:
                                return (h) c1Var.f109653j.get();
                        }
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getM() {
        return Integer.valueOf(this.M);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        j jVar = qVar instanceof j ? (j) qVar : null;
        boolean z = jVar == null || jVar.f147890a;
        if (jVar == null || jVar.f147891b) {
            this.Q = false;
            OneShotPreDrawListener oneShotPreDrawListener = this.R;
            if (oneShotPreDrawListener != null) {
                oneShotPreDrawListener.removeListener();
            }
            this.R = null;
            gyi.s sVar = (gyi.s) this.S.getValue();
            i pageItems = uiState.f147892a;
            q0 onCommitted = new q0(this, uiState, z, 1);
            sVar.getClass();
            Intrinsics.checkNotNullParameter(pageItems, "pageItems");
            Intrinsics.checkNotNullParameter(onCommitted, "onCommitted");
            List list = pageItems.f147889b;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            int i = 0;
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                arrayList.add(new gyi.o(String.valueOf(i), (ProfileCardModel) obj2));
                i = i2;
            }
            sVar.submitList(arrayList, new l(onCommitted, 5));
        } else {
            h3(uiState, z);
        }
        BasicNavBar basicNavBar = d3().e;
        ?? r2 = uiState.f147894c;
        Clause clause = uiState.e;
        Clause clause2 = uiState.d;
        basicNavBar.setTitle((Clause) r2);
        FooterTextView footerTextView = d3().f325692c;
        footerTextView.setVisibility(clause2 != null ? 0 : 8);
        if (clause2 != null) {
            footerTextView.setContent(new c7(clause2, false, null, 6));
        }
        LargeActionButton largeActionButton = d3().f325691b;
        largeActionButton.setVisibility(clause == null ? 8 : 0);
        if (clause != null) {
            largeActionButton.setText(clause);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c1) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().e.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ViewPager2 viewPager2 = d3().f;
        viewPager2.setAdapter((gyi.s) this.S.getValue());
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = a.k(context, 20.0f);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.setPageTransformer(new MarginPageTransformer(com.google.android.gms.internal.mlkit_vision_face.a.a(view, "getContext(...)", 12.0f)));
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            ViewCompat.setPaddingRelative(recyclerView, iK, 0, iK, 0);
            recyclerView.setClipToPadding(false);
            recyclerView.setClipChildren(false);
            recyclerView.setOverScrollMode(2);
            recyclerView.setItemAnimator(null);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        OneShotPreDrawListener oneShotPreDrawListener = this.R;
        if (oneShotPreDrawListener != null) {
            oneShotPreDrawListener.removeListener();
        }
        this.R = null;
        d3().f.unregisterOnPageChangeCallback(this.T);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().e.f59211b), new x(this, continuation, 0), 3);
        d3().f.registerOnPageChangeCallback(this.T);
        g3();
        ViewController.P2(this, rd0.e.b(d3().f325692c.f58608l), new n(this, continuation, 7), 3);
        ViewController.P2(this, rd0.e.b(d3().f325691b.o), new x(this, continuation, 1), 3);
    }

    public final d d3() {
        ViewBinding value = this.O.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final gyi.h d() {
        return (gyi.h) this.W.getValue();
    }

    public final Integer f3() {
        ViewPager2 airportLoungesPassListPager = d3().f;
        Intrinsics.checkNotNullExpressionValue(airportLoungesPassListPager, "airportLoungesPassListPager");
        Integer numValueOf = Integer.valueOf(airportLoungesPassListPager.getCurrentItem());
        if (this.P && this.Q && airportLoungesPassListPager.getScrollState() == 0 && airportLoungesPassListPager.isAttachedToWindow()) {
            return numValueOf;
        }
        return null;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void g1(boolean z) {
        super.g1(z);
        if (z) {
            this.P = true;
            d0 d0Var = (d0) k3();
            if (!d0Var.f147881x) {
                d0Var.f147881x = true;
                yji.l.a1(d0Var, vkm.q.P(new t0(d0Var.f147882y.B(new p(d0Var, 20)), 1), 1), null, null, new gsh.w(d0Var, null, 7), 3);
            }
            g3();
        }
    }

    public final void g3() {
        OneShotPreDrawListener oneShotPreDrawListener = this.R;
        if (oneShotPreDrawListener != null) {
            oneShotPreDrawListener.removeListener();
        }
        this.R = null;
        Integer numF3 = f3();
        if (numF3 != null) {
            int iIntValue = numF3.intValue();
            ViewPager2 airportLoungesPassListPager = d3().f;
            Intrinsics.checkNotNullExpressionValue(airportLoungesPassListPager, "airportLoungesPassListPager");
            this.R = OneShotPreDrawListener.add(airportLoungesPassListPager, new z(airportLoungesPassListPager, this, iIntValue));
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    public final void h3(k kVar, boolean z) {
        ScrollingPagerIndicatorView scrollingPagerIndicatorView = d3().d;
        scrollingPagerIndicatorView.setDotCount(kVar.f147892a.f147889b.size());
        int i = kVar.f147893b;
        scrollingPagerIndicatorView.setCurrentPosition(i);
        scrollingPagerIndicatorView.K(BitmapDescriptorFactory.HUE_RED, i);
        if (z && d3().f.getCurrentItem() != i) {
            d3().f.setCurrentItem(i, false);
        }
        g3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }

    public AirportLoungesPassListScreen() {
        this(new AirportLoungesPassListContract$InputData(null, null));
    }
}
