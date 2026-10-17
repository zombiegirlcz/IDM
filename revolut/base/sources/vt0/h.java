package vt0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.WindowInsets;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aw0.v1;
import aw0.y9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.ViewUtils;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.LightPromptDelegate;
import com.revolut.core.ui_kit.delegates.u7;
import com.revolut.core.ui_kit.delegates.v7;
import com.revolut.core.ui_kit.internal.views.BottomSwipeView;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.lightprompt.LightPromptViewModel;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.lightprompt.LightPromptFullScreenView;
import com.revolut.core.ui_kit_resources.R$attr;
import e8.q;
import efm.r;
import ip0.zs;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import jv0.m;
import jv0.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import or0.u;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vq5.x;
import vrl.i0;
import vrl.v0;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends ConstraintLayout {
    public static final /* synthetic */ int A = 0;

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f291876b;
    public final q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f291877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q f291878h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z4l.j f291879j;
    public LinearLayoutManager k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f291880l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f291881m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedHashSet f291882n;
    public vt0.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public vt0.b f291883p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f291884q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ifm.c f291885r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final OvershootInterpolator f291886s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ihm.f f291887t;
    public LightPromptViewModel.V1Content u;
    public final k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f291888w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i f291889x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f291890y;
    public final ihm.f z;

    public static final class a {
        private a() {
        }
    }

    public static final class b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f291891a;

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), this.f291891a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Unit f0(h hVar, jv0.m mVar) {
        if (mVar instanceof p) {
            vt0.b bVar = hVar.f291883p;
            vt0.b bVar2 = vt0.b.FULL_SCREEN;
            if (bVar == bVar2 && bVar == bVar2) {
                hVar.setState(vt0.b.ANIMATING_TO_LIST_SCREEN);
            }
        } else if (mVar instanceof m.a) {
            hVar.setVideoState(i.PLAYBACK);
        } else if (mVar instanceof jv0.q) {
            hVar.setVideoState(i.ERROR);
        }
        return Unit.f186387a;
    }

    public static Unit g0(h hVar, LightPromptViewModel.V1Content v1Content, Clause clause, ty0.a it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        u.k(hVar).n0().a(hVar.getHeaderDisclaimer(), v1Content, new py0.c(clause));
        hVar.f291887t.onNext(it8);
        return Unit.f186387a;
    }

    private final ActionFooterView getActionFooter() {
        return (ActionFooterView) this.f291878h.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final BottomSwipeView getBottomSwipeView() {
        return (BottomSwipeView) this.f291877g.getValue();
    }

    private final AppCompatImageButton getCloseButton() {
        return (AppCompatImageButton) this.f291876b.f();
    }

    private final int getFullScreenCloseButtonColor() {
        return p0(getFullScreenColorScheme());
    }

    private final v1 getFullScreenColorScheme() {
        com.revolut.core.ui_kit.models.lightprompt.b bVar;
        LightPromptViewModel.V1Content v1Content = this.u;
        LightPromptDelegate.Model model = (v1Content == null || (bVar = v1Content.f58098c) == null) ? null : bVar.f58109c;
        if (model == null) {
            throw new IllegalStateException("Please, specify Model.fullScreenParams");
        }
        v7 v7Var = model.f;
        Intrinsics.i(v7Var, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.LightPromptDelegate.Model.MediaStyle.FullSize");
        return ((u7) v7Var).f54806a;
    }

    private final AppCompatTextView getHeaderDisclaimer() {
        return (AppCompatTextView) this.i.f();
    }

    private final zs getHolder() {
        RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = getRecyclerView().findViewHolderForLayoutPosition(0);
        if (viewHolderFindViewHolderForLayoutPosition instanceof zs) {
            return (zs) viewHolderFindViewHolderForLayoutPosition;
        }
        return null;
    }

    private final int getListScreenCloseButtonColor() {
        return p0(getSystemColorScheme());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getRecyclerView() {
        return (RecyclerView) this.f.f();
    }

    private final float getSmallMediaCornerRadius() {
        Outline outline = new Outline();
        zs zsVarR0 = r0();
        zsVarR0.itemView.getOutlineProvider().getOutline(zsVarR0.itemView, outline);
        return outline.getRadius();
    }

    private final Rect getSmallMediaRect() {
        View view = r0().f167536h;
        Intrinsics.h(view);
        int iE = knm.b.e(this, view, false);
        int iG = knm.b.g(this, view, false);
        return new Rect(iE, iG, view.getWidth() + iE, view.getHeight() + iG);
    }

    private final v1 getSystemColorScheme() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return kli.a.q(context) ? v1.DARK : v1.LIGHT;
    }

    private final UiKitPlayerView getVideoPlayer() {
        UiKitMediaView uiKitMediaView;
        UiKitPlayerView uiKitPlayerView;
        zs holder = getHolder();
        if (holder == null || (uiKitMediaView = holder.i) == null || (uiKitPlayerView = (UiKitPlayerView) uiKitMediaView.b(R$layout.internal_uikit_media_video)) == null || uiKitPlayerView.getVisibility() != 0) {
            return null;
        }
        return uiKitPlayerView;
    }

    public static void h0(h hVar, zs zsVar, Rect rect, float f, ValueAnimator it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        float f4 = kotlin.ranges.f.f(it8.getCurrentPlayTime() / it8.getDuration(), BitmapDescriptorFactory.HUE_RED, 1.0f);
        Object animatedValue = it8.getAnimatedValue();
        Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        hVar.n0(zsVar, rect, f, hVar.getFullScreenCloseButtonColor(), hVar.getListScreenCloseButtonColor(), f4, ((Float) animatedValue).floatValue());
    }

    public static final boolean j0(h hVar) {
        LightPromptViewModel.V1Content v1Content = hVar.u;
        return (v1Content != null ? v1Content.f58098c : null) != null && (hVar.getRecyclerView().findViewHolderForLayoutPosition(0) instanceof zs);
    }

    public static final void l0(h hVar) {
        ifm.c cVar = hVar.f291885r;
        if (cVar != null) {
            cVar.dispose();
        }
        i iVar = hVar.f291889x;
        i iVar2 = i.PLAYBACK;
        if (iVar == iVar2) {
            return;
        }
        UiKitPlayerView videoPlayer = hVar.getVideoPlayer();
        if (videoPlayer != null) {
            hVar.f291885r = videoPlayer.f57715r.subscribe(new v0(8, new x(hVar, 13)));
        } else if (hVar.f291889x == i.LOADING) {
            hVar.setVideoState(iVar2);
        }
    }

    private final void setFullScreenParams(com.revolut.core.ui_kit.models.lightprompt.b bVar) {
        v7 v7Var = bVar.f58109c.f;
        if (!(v7Var instanceof u7)) {
            throw new IllegalArgumentException("Can only use LightPromptDelegate.Model with MediaStyle.FullSize");
        }
        v1 v1Var = ((u7) v7Var).f54806a;
        getBottomSwipeView().setText(bVar.f58107a);
        getBottomSwipeView().setColorScheme(v1Var);
        z4l.j jVar = this.f291879j;
        if (jVar == null) {
            Intrinsics.r("adapter");
            throw null;
        }
        ArrayList arrayListF1 = d0.f1(jVar.f319395l);
        if (d0.d0(arrayListF1) instanceof LightPromptDelegate.Model) {
            arrayListF1.remove(0);
        }
        z4l.j jVar2 = this.f291879j;
        if (jVar2 != null) {
            jVar2.c(ue0.e.J(bVar.f58109c, arrayListF1));
        } else {
            Intrinsics.r("adapter");
            throw null;
        }
    }

    private final void setItems(List<? extends koi.j> list) {
        com.revolut.core.ui_kit.models.lightprompt.b bVar;
        z4l.j jVar = this.f291879j;
        if (jVar == null) {
            throw new IllegalStateException("Please, call setDelegates first");
        }
        LightPromptViewModel.V1Content v1Content = this.u;
        LightPromptDelegate.Model model = (v1Content == null || (bVar = v1Content.f58098c) == null) ? null : bVar.f58109c;
        if (model != null) {
            list = ue0.e.J(model, list);
        }
        jVar.c(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(vt0.b bVar) {
        ValueAnimator valueAnimator = this.f291884q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f291883p = bVar;
        int i = j.f291892a[bVar.ordinal()];
        int i2 = 8;
        if (i == 1) {
            setVideoState(i.NONE);
            vt0.a aVar = this.o;
            if (aVar != null) {
                LightPromptFullScreenView lightPromptFullScreenView = (LightPromptFullScreenView) ((pak.h) aVar).f234573b;
                int i3 = LightPromptFullScreenView.f59148s;
                lightPromptFullScreenView.f = y9.THEME;
                lightPromptFullScreenView.f59152g = dx0.c.DEFAULT;
                lightPromptFullScreenView.a();
            }
            n0(r0(), getSmallMediaRect(), getSmallMediaCornerRadius(), getFullScreenCloseButtonColor(), getListScreenCloseButtonColor(), 1.0f, 1.0f);
            r0().i.setOutlineProvider(null);
            for (ViewGroup it8 : this.f291880l) {
                Intrinsics.checkNotNullParameter(it8, "it");
                it8.setClipChildren(true);
                Unit unit = Unit.f186387a;
            }
            hx7.i.b(this);
            for (View it9 : this.f291881m) {
                Intrinsics.checkNotNullParameter(it9, "it");
                it9.setClipToOutline(true);
                Unit unit2 = Unit.f186387a;
            }
            hx7.i.b(this);
            for (ViewGroup it10 : this.f291882n) {
                Intrinsics.checkNotNullParameter(it10, "it");
                it10.setClipToPadding(true);
                Unit unit3 = Unit.f186387a;
            }
            hx7.i.b(this);
            getBottomSwipeView().i0();
            BottomSwipeView bottomSwipeView = getBottomSwipeView();
            Intrinsics.checkNotNullExpressionValue(bottomSwipeView, "<get-bottomSwipeView>(...)");
            bottomSwipeView.setVisibility(8);
            rd0.e.q(getCloseButton(), Integer.valueOf(getListScreenCloseButtonColor()));
            return;
        }
        if (i == 2) {
            vt0.a aVar2 = this.o;
            if (aVar2 != null) {
                ((pak.h) aVar2).i(getFullScreenColorScheme());
            }
            this.f291888w = true;
            zs zsVarR0 = r0();
            View view = zsVarR0.f167536h;
            Intrinsics.checkNotNullExpressionValue(view, "<get-fullSizeMediaWrapper>(...)");
            o0(view);
            UiKitMediaView uiKitMediaView = zsVarR0.i;
            uiKitMediaView.setClipToOutline(true);
            uiKitMediaView.setOutlineProvider(new b());
            BottomSwipeView bottomSwipeView2 = getBottomSwipeView();
            Intrinsics.checkNotNullExpressionValue(bottomSwipeView2, "<get-bottomSwipeView>(...)");
            bottomSwipeView2.setVisibility(0);
            getBottomSwipeView().m0();
            n0(r0(), getSmallMediaRect(), getSmallMediaCornerRadius(), getFullScreenCloseButtonColor(), getListScreenCloseButtonColor(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        vt0.a aVar3 = this.o;
        if (aVar3 != null) {
            LightPromptFullScreenView lightPromptFullScreenView2 = (LightPromptFullScreenView) ((pak.h) aVar3).f234573b;
            int i5 = LightPromptFullScreenView.f59148s;
            lightPromptFullScreenView2.f = y9.THEME;
            lightPromptFullScreenView2.f59152g = dx0.c.DEFAULT;
            lightPromptFullScreenView2.a();
        }
        final Rect smallMediaRect = getSmallMediaRect();
        final float smallMediaCornerRadius = getSmallMediaCornerRadius();
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ValueAnimator valueAnimator2 = this.f291884q;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(this.f291886s);
        final zs zsVarR02 = r0();
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: vt0.g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                h.h0(this.f291873a, zsVarR02, smallMediaRect, smallMediaCornerRadius, valueAnimator3);
            }
        });
        valueAnimatorOfFloat.addListener(new byl.i(ref$BooleanRef, i2, this, ref$BooleanRef));
        valueAnimatorOfFloat.start();
        this.f291884q = valueAnimatorOfFloat;
    }

    private final void setVideoState(i iVar) {
        vt0.a aVar;
        ViewGroup viewGroupC;
        i iVar2 = this.f291889x;
        if (iVar == iVar2) {
            return;
        }
        if (iVar2 == i.LOADING && iVar != i.PLAYBACK && (aVar = this.o) != null) {
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
        this.f291889x = iVar;
        int i = j.f291893b[iVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                getRecyclerView().scrollToPosition(0);
                vt0.a aVar2 = this.o;
                if (aVar2 != null) {
                    ((pak.h) aVar2).l();
                    return;
                }
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                this.z.onNext(Unit.f186387a);
            } else {
                vt0.a aVar3 = this.o;
                if (aVar3 != null) {
                    ((pak.h) aVar3).j();
                }
            }
        }
    }

    public final void n0(zs zsVar, Rect rect, float f, int i, int i2, float f4, float f5) {
        int width = getWidth();
        int height = getHeight();
        int iWidth = width - rect.width();
        int iHeight = height - rect.height();
        UiKitMediaView uiKitMediaView = zsVar.i;
        Intrinsics.h(uiKitMediaView);
        ViewGroup.LayoutParams layoutParams = uiKitMediaView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = (int) (width - (iWidth * f5));
        layoutParams2.height = (int) (height - (iHeight * f5));
        layoutParams2.leftMargin = (int) ((rect.left * f5) + (-r0));
        layoutParams2.topMargin = (int) ((rect.top * f5) + (-r0));
        uiKitMediaView.setLayoutParams(layoutParams2);
        ViewOutlineProvider outlineProvider = uiKitMediaView.getOutlineProvider();
        Intrinsics.i(outlineProvider, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.views.lightprompt.LightPromptFullScreenContentView.MediaOutlineProvider");
        ((b) outlineProvider).f291891a = f * f5;
        uiKitMediaView.invalidateOutline();
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        float f6 = 1;
        float f32 = f6 - f5;
        float f35 = (-kli.a.k(r9, 24.0f)) * f32;
        zsVar.f.setTranslationY(f35);
        zsVar.f167535g.setTranslationY(f35);
        getBottomSwipeView().setAlpha(f32);
        getBottomSwipeView().setTranslationY((-f5) * ((height - rect.height()) - rect.top));
        View itemView = zsVar.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ViewGroup.LayoutParams layoutParams3 = itemView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        }
        RecyclerView.LayoutParams layoutParams4 = (RecyclerView.LayoutParams) layoutParams3;
        ((ViewGroup.MarginLayoutParams) layoutParams4).height = (int) ((f32 * (height - rect.bottom)) + rect.height());
        itemView.setLayoutParams(layoutParams4);
        getActionFooter().setTranslationY((f6 - f4) * getActionFooter().getHeight());
        if (i != i2) {
            rd0.e.q(getCloseButton(), Integer.valueOf(ColorUtils.blendARGB(i, i2, f4)));
        }
    }

    public final void o0(View view) {
        if (view.getClipToOutline()) {
            view.setClipToOutline(false);
            this.f291881m.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getClipToPadding()) {
                viewGroup.setClipToPadding(false);
                this.f291882n.add(view);
            }
            if (viewGroup.getClipChildren()) {
                viewGroup.setClipChildren(false);
                this.f291880l.add(view);
            }
        }
        if (view.equals(this) || !(view.getParent() instanceof View)) {
            return;
        }
        Object parent = view.getParent();
        Intrinsics.i(parent, "null cannot be cast to non-null type android.view.View");
        o0((View) parent);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
        int iSystemBars = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime();
        Insets insets2 = windowInsetsCompat.getInsets(iSystemBars);
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        setPaddingRelative(getPaddingStart(), insets2.top, getPaddingEnd(), insets2.bottom);
        WindowInsetsCompat windowInsetsCompatBuild = new WindowInsetsCompat.Builder(windowInsetsCompat).setInsets(iSystemBars, Insets.NONE).build();
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatBuild, "build(...)");
        WindowInsets windowInsets = windowInsetsCompatBuild.toWindowInsets();
        return windowInsets == null ? insets : windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f291884q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        getBottomSwipeView().i0();
        ifm.c cVar = this.f291885r;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i = j.f291892a[this.f291883p.ordinal()];
        if (i == 1) {
            return super.onInterceptTouchEvent(event);
        }
        if (i != 2) {
            if (i == 3) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        float rawX = event.getRawX();
        float rawY = event.getRawY();
        AppCompatImageButton closeButton = getCloseButton();
        int[] iArr = this.f291890y;
        closeButton.getLocationOnScreen(iArr);
        if (rawX >= iArr[0] && rawX <= getCloseButton().getWidth() + r4) {
            if (rawY >= iArr[1] && rawY <= getCloseButton().getHeight() + r0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = parcelable instanceof Bundle ? (Bundle) parcelable : null;
        if (bundle == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = this.k;
        if (linearLayoutManager == null) {
            Intrinsics.r("layoutManager");
            throw null;
        }
        linearLayoutManager.scrollToPosition(-1);
        super.onRestoreInstanceState(bundle.getBundle("STATE_KEY_SUPER"));
        if (bundle.getBoolean("STATE_KEY_FULL_SCREEN_SHOWN", false)) {
            return;
        }
        LightPromptViewModel.V1Content v1Content = this.u;
        if ((v1Content != null ? v1Content.f58098c : null) != null) {
            this.f291888w = true;
            getRecyclerView().getViewTreeObserver().removeOnPreDrawListener(this.v);
            setVideoState(i.PLAYBACK);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        m70.a.r(bundle, "STATE_KEY_SUPER", super.onSaveInstanceState());
        m70.a.r(bundle, "STATE_KEY_FULL_SCREEN_SHOWN", Boolean.valueOf(this.f291883p == vt0.b.FULL_SCREEN));
        return bundle;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i = j.f291892a[this.f291883p.ordinal()];
        if (i == 1) {
            return super.onTouchEvent(event);
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (event.getAction() == 1 && this.f291883p == vt0.b.FULL_SCREEN) {
            setState(vt0.b.ANIMATING_TO_LIST_SCREEN);
        }
        return true;
    }

    public final int p0(v1 v1Var) {
        int i;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i2 = j.f291894c[v1Var.ordinal()];
        if (i2 == 1) {
            i = R$attr.uikit_colorBlack;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.uikit_colorWhite;
        }
        return kli.a.s(i, context);
    }

    public final r q0() {
        r map = getActionFooter().f.map(new v0(7, new i0(5)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final zs r0() {
        zs holder = getHolder();
        if (holder != null) {
            return holder;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void setCloseButtonClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getCloseButton().setOnClickListener(listener);
    }

    public final void setDelegates(@NotNull List<? extends koi.k> delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f291879j = new z4l.j(7, (List) delegates, false);
        this.k = new LinearLayoutManager(getContext(), 1, false);
        RecyclerView recyclerView = getRecyclerView();
        LinearLayoutManager linearLayoutManager = this.k;
        if (linearLayoutManager == null) {
            Intrinsics.r("layoutManager");
            throw null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = getRecyclerView();
        z4l.j jVar = this.f291879j;
        if (jVar == null) {
            Intrinsics.r("adapter");
            throw null;
        }
        recyclerView2.setAdapter(jVar);
        getRecyclerView().addItemDecoration(new o31.b());
    }

    public final void setEventsListener$ui_kit_components_release(@NotNull vt0.a eventsListener) {
        Intrinsics.checkNotNullParameter(eventsListener, "eventsListener");
        this.o = eventsListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setModel(@org.jetbrains.annotations.NotNull com.revolut.core.ui_kit.models.lightprompt.LightPromptViewModel.V1Content r24) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vt0.h.setModel(com.revolut.core.ui_kit.models.lightprompt.LightPromptViewModel$V1Content):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f291876b = kli.a.J(R$id.lightPromptFullScreenContent_closeButton, this);
        this.f = kli.a.J(R$id.lightPromptFullScreenContent_recycler, this);
        this.f291877g = w.y0(new vch.a(this, 29));
        this.f291878h = kli.a.J(R$id.lightPromptFullScreenContent_actionFooter, this);
        this.i = kli.a.J(R$id.lightPromptFullScreenContent_headerDisclaimer, this);
        this.f291880l = new LinkedHashSet();
        this.f291881m = new LinkedHashSet();
        this.f291882n = new LinkedHashSet();
        this.f291883p = vt0.b.LIST_SCREEN;
        this.f291886s = new OvershootInterpolator(1.0f);
        this.f291887t = v0.a.d("create(...)");
        this.v = new k(this);
        this.f291889x = i.NONE;
        this.f291890y = new int[2];
        this.z = v0.a.d("create(...)");
        View.inflate(context, R$layout.internal_view_light_prompt_full_screen_content, this);
        AppCompatImageButton closeButton = getCloseButton();
        closeButton.bringToFront();
        rd0.e.q(closeButton, Integer.valueOf(p0(getSystemColorScheme())));
        ViewUtils.requestApplyInsetsWhenAttached(this);
    }

    public /* synthetic */ h(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
