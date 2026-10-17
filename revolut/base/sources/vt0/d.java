package vt0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aw0.d4;
import aw0.n6;
import aw0.y9;
import az0.o0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.ViewUtils;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.FcaDisclaimerDelegate;
import com.revolut.core.ui_kit.internal.delegates.ProductArticleHeaderDelegate;
import com.revolut.core.ui_kit.internal.views.BottomSwipeView;
import com.revolut.core.ui_kit.internal.views.FcaDisclaimerView;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.lightprompt.LightPromptViewModel;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.lightprompt.LightPromptFullScreenView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import e8.q;
import efm.r;
import java.util.ArrayList;
import java.util.List;
import jv0.m;
import jv0.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mx0.c9;
import or0.u;
import org.jetbrains.annotations.NotNull;
import qv0.n;
import vrl.i0;
import vrl.v0;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends FrameLayout {

    @NotNull
    private static final a Companion = new a();
    public static final /* synthetic */ int u = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f291856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f291857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f291858c;
    public final q d;
    public final q e;
    public final q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f291859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final as0.a f291860h;
    public final sq0.m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ProductArticleHeaderDelegate f291861j;
    public z4l.j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.f f291862l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public vt0.a f291863m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ihm.f f291864n;
    public ifm.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ifm.c f291865p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Animator f291866q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public UiKitPlayerView f291867r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b f291868s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LightPromptViewModel.V2Content f291869t;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Unit a(d dVar) {
        Intrinsics.i(dVar.getRecyclerView().getLayoutManager(), "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        dVar.getRecyclerView().smoothScrollToPosition(((LinearLayoutManager) r0).getItemCount() - 1);
        return Unit.f186387a;
    }

    public static void b(d dVar) {
        dVar.setState(b.ANIMATING_TO_LIST_SCREEN);
    }

    public static Unit c(d dVar, jv0.m mVar) {
        ViewGroup viewGroupC;
        if (mVar instanceof p) {
            if (dVar.f291868s == b.FULL_SCREEN) {
                dVar.setState(b.ANIMATING_TO_LIST_SCREEN);
                vt0.a aVar = dVar.f291863m;
                if (aVar != null) {
                    LightPromptFullScreenView lightPromptFullScreenView = (LightPromptFullScreenView) ((pak.h) aVar).f234573b;
                    lightPromptFullScreenView.f59154j = false;
                    LightPromptViewModel lightPromptViewModel = lightPromptFullScreenView.e;
                    if (lightPromptViewModel instanceof LightPromptViewModel.V2Content) {
                        viewGroupC = lightPromptFullScreenView.b();
                    } else if (lightPromptViewModel instanceof LightPromptViewModel.V1Content) {
                        viewGroupC = lightPromptFullScreenView.c();
                    }
                    lightPromptFullScreenView.e(viewGroupC);
                }
            }
        } else if (mVar instanceof m.a) {
            vt0.a aVar2 = dVar.f291863m;
            if (aVar2 != null) {
                ((pak.h) aVar2).j();
            }
        } else if (mVar instanceof jv0.q) {
            dVar.f291864n.onNext(Unit.f186387a);
        }
        return Unit.f186387a;
    }

    public static final void e(d dVar) {
        dVar.getActionFooter().setVisibility(0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(dVar.getActionFooter(), (Property<ActionFooterView, Float>) FrameLayout.TRANSLATION_Y, dVar.getActionFooter().getHeight(), BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.addListener(new f(dVar, 0));
        objectAnimatorOfFloat.start();
        dVar.f291866q = objectAnimatorOfFloat;
    }

    public static List f(String str, List list, Parcelable parcelable, int i, int i2) {
        if (list.isEmpty()) {
            return f0.f322471a;
        }
        int size = list.size();
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i3 = 0;
        for (Object obj2 : list2) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                v.s();
                throw null;
            }
            d4 d4Var = (d4) obj2;
            boolean z = size == 1;
            boolean z3 = i3 == 0;
            boolean z4 = i3 == size + (-1);
            FcaDisclaimerDelegate.Model model = new FcaDisclaimerDelegate.Model(com.google.android.gms.internal.mlkit_vision_face.a.k(i3, str, "_"), d4Var, parcelable);
            yp0.b.r(model, (z || z3) ? i : R$attr.uikit_dp4, (z || z4) ? i2 : R$attr.uikit_dp4, 0, 0, 12);
            arrayList.add(model);
            i3 = i5;
        }
        return arrayList;
    }

    private final ActionFooterView getActionFooter() {
        return (ActionFooterView) this.f.f();
    }

    private final BottomSwipeView getBottomSwipeView() {
        return (BottomSwipeView) this.f291859g.f();
    }

    private final CoordinatorLayout getContentContainer() {
        return (CoordinatorLayout) this.f291858c.f();
    }

    private final FcaDisclaimerView getHeaderDisclaimer() {
        return (FcaDisclaimerView) this.d.f();
    }

    private final UiKitMediaView getMediaView() {
        return (UiKitMediaView) this.f291857b.f();
    }

    private final BasicNavBar getNavbar() {
        return (BasicNavBar) this.f291856a.f();
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.e.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(b bVar) {
        this.f291868s = bVar;
        int i = e.f291870a[bVar.ordinal()];
        if (i == 1) {
            vt0.a aVar = this.f291863m;
            if (aVar != null) {
                LightPromptFullScreenView lightPromptFullScreenView = (LightPromptFullScreenView) ((pak.h) aVar).f234573b;
                lightPromptFullScreenView.f = y9.THEME;
                lightPromptFullScreenView.f59152g = dx0.c.DEFAULT;
                lightPromptFullScreenView.a();
            }
            Animator animator = this.f291866q;
            if (animator != null) {
                animator.cancel();
            }
            getBottomSwipeView().i0();
            getBottomSwipeView().setVisibility(8);
            UiKitPlayerView uiKitPlayerView = this.f291867r;
            if (uiKitPlayerView != null) {
                uiKitPlayerView.m();
                jv0.i iVar = uiKitPlayerView.f57717t;
                iVar.a();
                if (uiKitPlayerView.getExternalMediaRegistry() != null) {
                    ExoPlayer exoPlayer = uiKitPlayerView.f57712n;
                    if (exoPlayer != null) {
                        exoPlayer.stop();
                    }
                } else {
                    uiKitPlayerView.k();
                }
                iVar.onPlayWhenReadyChanged(false, 1);
            }
            getMediaView().setVisibility(8);
            getContentContainer().setAlpha(1.0f);
            getContentContainer().setVisibility(0);
            ActionFooterView actionFooter = getActionFooter();
            LightPromptViewModel.V2Content v2Content = this.f291869t;
            actionFooter.setVisibility((v2Content != null ? v2Content.f : null) == null ? 8 : 0);
            return;
        }
        if (i == 2) {
            vt0.a aVar2 = this.f291863m;
            if (aVar2 != null) {
                ((pak.h) aVar2).i(null);
            }
            Animator animator2 = this.f291866q;
            if (animator2 != null) {
                animator2.cancel();
            }
            getBottomSwipeView().setVisibility(0);
            getBottomSwipeView().m0();
            getMediaView().setAlpha(1.0f);
            getMediaView().setVisibility(0);
            getContentContainer().setVisibility(8);
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        vt0.a aVar3 = this.f291863m;
        if (aVar3 != null) {
            LightPromptFullScreenView lightPromptFullScreenView2 = (LightPromptFullScreenView) ((pak.h) aVar3).f234573b;
            lightPromptFullScreenView2.f = y9.THEME;
            lightPromptFullScreenView2.f59152g = dx0.c.DEFAULT;
            lightPromptFullScreenView2.a();
        }
        Animator animator3 = this.f291866q;
        if (animator3 != null) {
            animator3.cancel();
        }
        getBottomSwipeView().i0();
        getBottomSwipeView().setVisibility(8);
        LightPromptViewModel.V2Content v2Content2 = this.f291869t;
        com.revolut.core.ui_kit.models.lightprompt.a aVar4 = v2Content2 != null ? v2Content2.f : null;
        if (aVar4 != null) {
            getActionFooter().setVisibility(4);
        }
        UiKitMediaView mediaView = getMediaView();
        float[] fArr = {1.0f, BitmapDescriptorFactory.HUE_RED};
        Property property = FrameLayout.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(mediaView, (Property<UiKitMediaView, Float>) property, fArr);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(getContentContainer(), (Property<CoordinatorLayout, Float>) property, BitmapDescriptorFactory.HUE_RED, 1.0f);
        CoordinatorLayout contentContainer = getContentContainer();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(contentContainer, (Property<CoordinatorLayout, Float>) FrameLayout.TRANSLATION_Y, kli.a.l(context, 40.0f), BitmapDescriptorFactory.HUE_RED);
        getContentContainer().setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(600L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet.addListener(new o0(aVar4, this, 14));
        animatorSet.start();
        this.f291866q = animatorSet;
    }

    public final r g() {
        r map = getActionFooter().f.map(new v0(3, new i0(4)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
        int iSystemBars = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime();
        Insets insets2 = windowInsetsCompat.getInsets(iSystemBars);
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        u.z(getNavbar(), 0, insets2.top, 0, 0, false, 29);
        u.z(getContentContainer(), 0, 0, 0, insets2.bottom, false, 23);
        FcaDisclaimerView headerDisclaimer = getHeaderDisclaimer();
        int i = insets2.top;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        u.z(headerDisclaimer, 0, kli.a.k(context, 56.0f) + i, 0, 0, false, 29);
        WindowInsetsCompat windowInsetsCompatBuild = new WindowInsetsCompat.Builder(windowInsetsCompat).setInsets(iSystemBars, Insets.NONE).build();
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatBuild, "build(...)");
        WindowInsets windowInsets = windowInsetsCompatBuild.toWindowInsets();
        return windowInsets == null ? insets : windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f291866q;
        if (animator != null) {
            animator.cancel();
        }
        ifm.c cVar = this.o;
        if (cVar != null) {
            cVar.dispose();
        }
        ifm.c cVar2 = this.f291865p;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        getBottomSwipeView().i0();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        com.revolut.core.ui_kit.models.lightprompt.c cVar;
        LightPromptViewModel.V2Content v2Content = this.f291869t;
        boolean z3 = ((v2Content == null || (cVar = v2Content.f58099a) == null) ? null : cVar.f58110a) != null;
        boolean zN = ue0.e.n(v2Content != null ? v2Content.f58101c : null);
        if (z3) {
            ViewGroup.LayoutParams layoutParams = getHeaderDisclaimer().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int measuredHeight = getHeaderDisclaimer().getMeasuredHeight() + (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0);
            ViewGroup.LayoutParams layoutParams2 = getHeaderDisclaimer().getLayoutParams();
            marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            i = (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) + measuredHeight;
        } else if (!zN) {
            ViewGroup.LayoutParams layoutParams3 = getHeaderDisclaimer().getLayoutParams();
            marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams != null) {
                i = marginLayoutParams.topMargin;
            }
        }
        as0.a aVar = this.f291860h;
        int i6 = aVar.f8736b;
        if (i6 != i) {
            aVar.f8736b = i;
            if (i6 != -1) {
                getRecyclerView().invalidateItemDecorations();
            }
        }
        super.onLayout(z, i, i2, i3, i5);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i = e.f291870a[this.f291868s.ordinal()];
        if (i == 1) {
            return super.onTouchEvent(event);
        }
        if (i != 2) {
            if (i == 3) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (event.getAction() == 1) {
            setState(b.ANIMATING_TO_LIST_SCREEN);
        }
        return true;
    }

    public final void setCloseButtonClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getNavbar().setOnNavigationButtonClickListener(listener);
    }

    public final void setDelegates(@NotNull List<? extends koi.k> delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        koi.c cVar = this.k.f;
        if (cVar.e().size() == 1) {
            cVar.b(delegates);
        } else {
            this.k = new z4l.j(7, (List) ue0.e.J(this.f291861j, delegates), false);
        }
        getRecyclerView().setAdapter(this.k);
    }

    public final void setEventsListener$ui_kit_components_release(@NotNull vt0.a eventListener) {
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f291863m = eventListener;
    }

    public final void setModel(@NotNull LightPromptViewModel.V2Content model) {
        b bVar;
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(this.f291869t, model)) {
            return;
        }
        LightPromptViewModel.V2Content v2Content = this.f291869t;
        aw0.d dVar = null;
        com.revolut.core.ui_kit.models.lightprompt.d dVar2 = v2Content != null ? v2Content.e : null;
        this.f291869t = model;
        com.revolut.core.ui_kit.models.lightprompt.c cVar = model.f58099a;
        ArrayList arrayList = model.f58100b;
        List list = model.f58101c;
        List list2 = model.d;
        Parcelable parcelable = model.f58102g;
        List listF = f("pa_top_disclaimer", list, parcelable, R$attr.uikit_dp4, R$attr.uikit_dp8);
        int i = R$attr.uikit_dp16;
        List listF2 = f("pa_bottom_disclaimer", list2, parcelable, i, i);
        aim.e eVarB = zhm.u.b();
        eVarB.addAll(listF);
        eVarB.add(new pq0.a(cVar.f58112c, cVar.f58111b));
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i2 = 0;
        for (Object obj2 : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            if (i2 == 0) {
                obj2 = (koi.j) obj2;
                if (obj2 instanceof n) {
                    ((n) obj2).s(this.i);
                }
            }
            arrayList2.add(obj2);
            i2 = i3;
        }
        eVarB.addAll(arrayList2);
        eVarB.addAll(listF2);
        this.k.c(zhm.u.a(eVarB));
        d4 d4Var = model.f58099a.f58110a;
        if (d4Var == null) {
            ifm.c cVar2 = this.f291865p;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            this.f291865p = null;
            getHeaderDisclaimer().setVisibility(8);
        } else {
            getHeaderDisclaimer().setVisibility(0);
            FcaDisclaimerView headerDisclaimer = getHeaderDisclaimer();
            if (true != headerDisclaimer.f56175h) {
                headerDisclaimer.f56175h = true;
                float f = headerDisclaimer.f;
                if (f != BitmapDescriptorFactory.HUE_RED) {
                    headerDisclaimer.a(f);
                }
            }
            getHeaderDisclaimer().setAnalyticsContext(model.f58102g);
            getHeaderDisclaimer().setContent(d4Var);
            ifm.c cVar3 = this.f291865p;
            if (cVar3 != null) {
                cVar3.dispose();
            }
            this.f291865p = getHeaderDisclaimer().f56171a.subscribe(new v0(6, new vsl.f(1, this.f291862l, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 1)));
        }
        Parcelable parcelable2 = model.f58102g;
        com.revolut.core.ui_kit.models.lightprompt.a aVar = model.f;
        if (aVar != null) {
            ActionFooterView actionFooter = getActionFooter();
            TextLocalisedClause textLocalisedClause = aVar.f58104a;
            LargeActionButton.ButtonStyle.BlackOrWhiteButton.Plain plain = aVar.f58105b;
            String str = aVar.f58106c;
            if (str == null) {
                str = "";
            }
            n6 n6Var = new n6(textLocalisedClause, plain, null, str, false, parcelable2, null, 940);
            LightPromptViewModel.V2Content v2Content2 = this.f291869t;
            if (v2Content2 != null && v2Content2.f58103h) {
                dVar = new aw0.d(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
            }
            actionFooter.setModel(new aw0.e(true, null, null, n6Var, dVar, null, 38));
        }
        com.revolut.core.ui_kit.models.lightprompt.d dVar3 = model.e;
        if (dVar3 == null) {
            int i5 = e.f291870a[this.f291868s.ordinal()];
            if (i5 == 1) {
                bVar = b.LIST_SCREEN;
            } else {
                if (i5 != 2) {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                bVar = b.ANIMATING_TO_LIST_SCREEN;
            }
            setState(bVar);
            return;
        }
        if (!jo0.m.f176850g || Intrinsics.f(dVar2, dVar3)) {
            return;
        }
        UiKitPlayerView uiKitPlayerViewJ = getMediaView().j();
        this.f291867r = uiKitPlayerViewJ;
        ifm.c cVar4 = this.o;
        if (cVar4 != null) {
            cVar4.dispose();
        }
        this.o = uiKitPlayerViewJ.f57715r.subscribe(new v0(4, new c(this, 0)));
        setState(b.FULL_SCREEN);
        vt0.a aVar2 = this.f291863m;
        if (aVar2 != null) {
            ((pak.h) aVar2).l();
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ((jz0.b) jh.d.f(context).a0()).b(dVar3.f58113a, getMediaView(), null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f291856a = kli.a.J(R$id.lightPromptFullScreenContent_navbar, this);
        this.f291857b = kli.a.J(R$id.lightPromptFullScreenContent_media, this);
        this.f291858c = kli.a.J(R$id.lightPromptFullScreenContent_contentContainer, this);
        this.d = kli.a.J(R$id.lightPromptFullScreenContent_headerDisclaimer, this);
        this.e = kli.a.J(R$id.lightPromptFullScreenContent_recycler, this);
        this.f = kli.a.J(R$id.lightPromptFullScreenContent_actionFooter, this);
        this.f291859g = kli.a.J(R$id.lightPromptFullScreenContent_swipeIndicator, this);
        as0.a aVar = new as0.a();
        this.f291860h = aVar;
        this.i = new sq0.m(R$attr.uikit_dp0);
        ProductArticleHeaderDelegate productArticleHeaderDelegate = new ProductArticleHeaderDelegate();
        this.f291861j = productArticleHeaderDelegate;
        this.k = new z4l.j(7, zhm.u.c(productArticleHeaderDelegate), false);
        this.f291862l = v0.a.d("create(...)");
        this.f291864n = v0.a.d("create(...)");
        this.f291868s = b.LIST_SCREEN;
        View.inflate(context, R$layout.internal_view_light_prompt_full_screen_content_v2, this);
        getNavbar().setVisibility(0);
        getNavbar().setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        getRecyclerView().addItemDecoration(aVar);
        getRecyclerView().setAdapter(this.k);
        getBottomSwipeView().setIcon(new ResourceImage(R$drawable.uikit_icn_24_navigation_swipe, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        getBottomSwipeView().setOnClickListener(new c9(this, 29));
        getMediaView().setVideoScaleType(oz0.b.CENTER_CROP);
        getActionFooter().f58956h.subscribe(new v0(5, new c(this, 1)));
        ViewUtils.requestApplyInsetsWhenAttached(this);
    }

    public /* synthetic */ d(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
