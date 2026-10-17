package com.revolut.core.ui_kit.views.video;

import a0.d;
import ag.q;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.collection.MutableIntSet;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.shimmer.RevolutShimmerDrawable;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.core.ui_kit.views.slider_layout.h;
import com.revolut.core.ui_kit_core.displayers.video.Video;
import com.revolut.core.ui_kit_resources.R$attr;
import cs0.a;
import cs0.b;
import ip0.g0;
import is2.t;
import ivb.i;
import ix0.d2;
import ix0.f2;
import ix0.h1;
import ix0.i2;
import ix0.j2;
import ix0.v1;
import ix0.w1;
import ix0.x1;
import iy0.c;
import java.util.ArrayList;
import jv0.m;
import jv0.o;
import jv0.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import nhi.k;
import nji.j;
import or0.u;
import org.jetbrains.annotations.NotNull;
import te0.w;
import z92.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003234B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 R*\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R*\u00100\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%\"\u0004\b/\u0010'¨\u00065"}, d2 = {"Lcom/revolut/core/ui_kit/views/video/ZoomableFullScreenVideoView;", "Landroid/widget/FrameLayout;", "Lix0/w1;", "", "Lix0/d2;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "delay", "Lcom/revolut/core/ui_kit/models/Clause;", "text", "", "setSkipButton", "(JLcom/revolut/core/ui_kit/models/Clause;)V", "Lcom/revolut/core/ui_kit_core/displayers/video/Video;", "video", "setVideo", "(Lcom/revolut/core/ui_kit_core/displayers/video/Video;)V", "", "autoDismiss", "setAutoDismissEnabled", "(Z)V", "visible", "setShimmerVisible", "", "getSliderHandlerId", "()Ljava/lang/String;", "Lkotlin/Function0;", "r", "Lkotlin/jvm/functions/Function0;", "getOnFirstFrameRendered", "()Lkotlin/jvm/functions/Function0;", "setOnFirstFrameRendered", "(Lkotlin/jvm/functions/Function0;)V", "onFirstFrameRendered", "u", "getOnDismiss", "setOnDismiss", "onDismiss", "w", "getOnError", "setOnError", "onError", "Companion", "fu0/a", "ag/q", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ZoomableFullScreenVideoView extends FrameLayout implements w1, d2 {
    public static final /* synthetic */ int C = 0;

    @NotNull
    private static final a Companion = new a();
    public iy0.a A;
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Video f59749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f59750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f59751c;
    public boolean d;
    public boolean e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x1 f59752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SliderLayout f59753h;
    public fu0.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RevolutShimmerDrawable f59754j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ValueAnimator f59755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UiKitPlayerView f59756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j2 f59757n;
    public final MutableIntSet o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public q f59758p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f59759q;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public Function0 onFirstFrameRendered;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f59761s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f59762t;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public Function0 onDismiss;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Function0 onError;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final SmallActionButton f59764x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f59765y;
    public Clause z;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZoomableFullScreenVideoView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void b(ZoomableFullScreenVideoView zoomableFullScreenVideoView) {
        if (zoomableFullScreenVideoView.d) {
            return;
        }
        if (!zoomableFullScreenVideoView.e) {
            zoomableFullScreenVideoView.setShimmerVisible(true);
        }
        j2 j2Var = zoomableFullScreenVideoView.f59757n;
        if (j2Var != null) {
            j2Var.cancel();
        }
        zoomableFullScreenVideoView.f59757n = null;
    }

    public static Unit c(ZoomableFullScreenVideoView zoomableFullScreenVideoView, m mVar) {
        if (mVar instanceof m.a) {
            zoomableFullScreenVideoView.e = true;
            if (!zoomableFullScreenVideoView.o.isNotEmpty()) {
                if (!zoomableFullScreenVideoView.f59759q) {
                    zoomableFullScreenVideoView.f59759q = true;
                    Function0 function0 = zoomableFullScreenVideoView.onFirstFrameRendered;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
                zoomableFullScreenVideoView.setShimmerVisible(false);
            }
            zoomableFullScreenVideoView.f59756m.animate().alpha(1.0f).setDuration(250L).start();
        } else if (mVar instanceof p) {
            zoomableFullScreenVideoView.f(false);
        } else if (mVar instanceof o) {
            boolean z = ((o) mVar).f178755a;
            if (z != zoomableFullScreenVideoView.B) {
                zoomableFullScreenVideoView.B = z;
                if (zoomableFullScreenVideoView.z != null) {
                    zoomableFullScreenVideoView.h();
                }
            }
        } else if (mVar instanceof jv0.q) {
            if (!zoomableFullScreenVideoView.v) {
                zoomableFullScreenVideoView.v = true;
                Function0 function02 = zoomableFullScreenVideoView.onError;
                if (function02 != null) {
                    function02.invoke();
                }
            }
            zoomableFullScreenVideoView.f(false);
        }
        return Unit.f186387a;
    }

    private final String getSliderHandlerId() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        String strN = d.n("video_", hashCode());
        this.f = strN;
        return strN;
    }

    private final void setShimmerVisible(boolean visible) {
        if (visible == this.k) {
            return;
        }
        this.k = visible;
        RevolutShimmerDrawable revolutShimmerDrawable = this.f59754j;
        if (revolutShimmerDrawable == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iD = kli.a.q(context) ? io0.a.d(0.1f, -1) : io0.a.d(0.1f, -16777216);
            a.c cVar = new a.c();
            cs0.a aVar = cVar.f108423a;
            aVar.e = 0;
            aVar.d = iD;
            cVar.k(b.MASKED);
            a.c cVar2 = (a.c) ((a.c) ((a.c) ((a.c) cVar.i(45.0f)).d(cs0.d.LEFT_TO_RIGHT)).j()).f(1500L);
            cs0.a aVar2 = cVar2.f108423a;
            aVar2.o = 1;
            aVar2.f108416m = true;
            cs0.a aVarA = cVar2.a();
            RevolutShimmerDrawable revolutShimmerDrawable2 = new RevolutShimmerDrawable();
            revolutShimmerDrawable2.a(aVarA);
            this.f59754j = revolutShimmerDrawable2;
            revolutShimmerDrawable = revolutShimmerDrawable2;
        }
        int i = visible ? 255 : 0;
        long j2 = visible ? 200L : 400L;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(revolutShimmerDrawable.f56062b.getAlpha(), i);
        Intrinsics.h(valueAnimatorOfInt);
        c cVar3 = new c(valueAnimatorOfInt, visible, this, visible);
        valueAnimatorOfInt.addListener(cVar3);
        valueAnimatorOfInt.addUpdateListener(cVar3);
        valueAnimatorOfInt.setDuration(j2);
        valueAnimatorOfInt.start();
        ValueAnimator valueAnimator = this.f59755l;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f59755l = valueAnimatorOfInt;
    }

    @Override // ix0.d2
    public final void D(boolean z) {
        Window window;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity activityI = f.i(context);
        if (activityI == null || (window = activityI.getWindow()) == null) {
            return;
        }
        if (z) {
            window.addFlags(128);
        } else {
            window.clearFlags(128);
        }
    }

    @Override // ix0.w1
    public final void a(v1 newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        Runnable runnable = this.f59758p;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f59758p = null;
        }
        boolean z = newState != v1.NONE;
        if (z == this.d) {
            return;
        }
        if (z) {
            this.d = true;
            d(1);
        } else {
            q qVar = new q(this, 21);
            this.f59758p = qVar;
            post(qVar);
        }
    }

    public final void d(int i) {
        MutableIntSet mutableIntSet = this.o;
        if (mutableIntSet.add(i) && mutableIntSet.get_size() == 1) {
            this.f59756m.h();
        }
    }

    public final void e() {
        x1 x1Var = this.f59752g;
        if (x1Var != null) {
            j jVar = (j) x1Var;
            Intrinsics.checkNotNullParameter(this, "callback");
            ArrayList arrayList = jVar.f216536b;
            arrayList.remove(this);
            if (arrayList.size() == 0) {
                k.b(jVar);
            }
        }
        this.f59752g = null;
        SliderLayout sliderLayout = this.f59753h;
        if (sliderLayout != null) {
            sliderLayout.u(getSliderHandlerId());
        }
        this.f59753h = null;
        fu0.a aVar = this.i;
        if (aVar != null) {
            aVar.remove();
        }
        this.i = null;
        j2 j2Var = this.f59757n;
        if (j2Var != null) {
            j2Var.cancel();
        }
        this.f59757n = null;
        h();
    }

    public final void f(boolean z) {
        this.f59750b = true;
        if (this.f59751c || this.d) {
            return;
        }
        e();
        if (!this.f59762t) {
            this.f59762t = true;
            Function0 function0 = this.onDismiss;
            if (function0 != null) {
                function0.invoke();
            }
        }
        if (this.f59761s) {
            if (!z) {
                animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(250L).withEndAction(new iy0.a(this, 2));
                return;
            }
            ViewParent parent = getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this);
            }
        }
    }

    public final void g(int i) {
        MutableIntSet mutableIntSet = this.o;
        if (mutableIntSet.remove(i) && mutableIntSet.get_size() == 0) {
            this.f59756m.i();
            if (this.e) {
                if (!this.f59759q) {
                    this.f59759q = true;
                    Function0 function0 = this.onFirstFrameRendered;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
                setShimmerVisible(false);
            }
        }
    }

    public final Function0<Unit> getOnDismiss() {
        return this.onDismiss;
    }

    public final Function0<Unit> getOnError() {
        return this.onError;
    }

    public final Function0<Unit> getOnFirstFrameRendered() {
        return this.onFirstFrameRendered;
    }

    public final void h() {
        SmallActionButton smallActionButton = this.f59764x;
        if (smallActionButton.getVisibility() == 0) {
            return;
        }
        iy0.a aVar = this.A;
        if (aVar != null) {
            h1.e(aVar);
        }
        this.A = null;
        if (this.B && isAttachedToWindow()) {
            long contentPosition = this.f59765y - this.f59756m.getContentPosition();
            if (contentPosition > 0) {
                iy0.a aVar2 = new iy0.a(this, 1);
                this.A = aVar2;
                h1.d(contentPosition, aVar2);
            } else {
                this.A = null;
                smallActionButton.setAlpha(BitmapDescriptorFactory.HUE_RED);
                smallActionButton.setVisibility(0);
                smallActionButton.animate().alpha(1.0f).start();
            }
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
        Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        int i = insets2.top;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        u.z(this.f59764x, 0, kli.a.k(context, 2.0f) + i, 0, 0, false, 29);
        return super.onApplyWindowInsets(insets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        SliderLayout sliderLayout;
        x1 x1VarR;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        while (true) {
            if (parent == null) {
                sliderLayout = null;
                break;
            } else {
                if (parent instanceof SliderLayout) {
                    sliderLayout = (SliderLayout) parent;
                    break;
                }
                parent = parent.getParent();
            }
        }
        this.f59753h = sliderLayout;
        if (!this.f59750b && this.f59761s && sliderLayout != null) {
            sliderLayout.k(new h(getSliderHandlerId(), this, this));
        }
        Intrinsics.checkNotNullParameter(this, "<this>");
        View view = this;
        while (true) {
            x1VarR = w.R(view);
            if (x1VarR != null) {
                break;
            }
            Object parent2 = view.getParent();
            view = parent2 instanceof View ? (View) parent2 : null;
            if (view == null) {
                x1VarR = null;
                break;
            }
        }
        this.f59752g = x1VarR;
        if (x1VarR != null) {
            j jVar = (j) x1VarR;
            Intrinsics.checkNotNullParameter(this, "callback");
            ArrayList arrayList = jVar.f216536b;
            arrayList.add(this);
            if (arrayList.size() == 1) {
                k.a(jVar);
            }
            a(jVar.a());
        }
        if (!this.e && !this.k) {
            i2 i2Var = j2.Companion;
            iy0.a aVar = new iy0.a(this, 0);
            i2Var.getClass();
            this.f59757n = i2.a(this, aVar);
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity activityI = f.i(context);
        AppCompatActivity appCompatActivity = activityI instanceof AppCompatActivity ? (AppCompatActivity) activityI : null;
        if (appCompatActivity != null) {
            fu0.a aVar2 = new fu0.a(this, 1);
            this.i = aVar2;
            appCompatActivity.getOnBackPressedDispatcher().addCallback(aVar2);
        }
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    public final void setAutoDismissEnabled(boolean autoDismiss) {
        this.f59761s = autoDismiss;
    }

    public final void setOnDismiss(Function0<Unit> function0) {
        this.onDismiss = function0;
    }

    public final void setOnError(Function0<Unit> function0) {
        this.onError = function0;
    }

    public final void setOnFirstFrameRendered(Function0<Unit> function0) {
        this.onFirstFrameRendered = function0;
    }

    public final void setSkipButton(long delay, Clause text) {
        this.z = text;
        this.f59764x.setText(text);
        this.f59765y = delay;
        h();
    }

    public final void setVideo(@NotNull Video video) {
        Intrinsics.checkNotNullParameter(video, "video");
        if (Intrinsics.f(video, this.f59749a)) {
            return;
        }
        this.f59749a = video;
        mz0.a aVarV = u.k(this).V();
        UiKitPlayerView uiKitPlayerView = this.f59756m;
        aVarV.a(video, uiKitPlayerView, null);
        if (this.o.isNotEmpty()) {
            uiKitPlayerView.h();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZoomableFullScreenVideoView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomableFullScreenVideoView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.o = new MutableIntSet(0, 1, null);
        this.f59761s = true;
        setBackgroundColor(kli.a.s(R$attr.uikit_colorGroupedBackground, context));
        UiKitPlayerView uiKitPlayerView = new UiKitPlayerView(context, null, 6, 0);
        this.f59756m = uiKitPlayerView;
        uiKitPlayerView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        addView(uiKitPlayerView, new FrameLayout.LayoutParams(-1, -1));
        SmallActionButton smallActionButton = new SmallActionButton(context, null, 6, 0);
        this.f59764x = smallActionButton;
        smallActionButton.setVisibility(8);
        smallActionButton.i(h4.SEMIACCENT);
        smallActionButton.setOnClickListener(new g0(this, 7));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388661);
        layoutParams.setMarginEnd(kli.a.k(context, 16.0f));
        layoutParams.topMargin = kli.a.k(context, 2.0f);
        addView(smallActionButton, layoutParams);
        uiKitPlayerView.f57715r.subscribe(new i(new t(this, 28), 10));
        setOnTouchListener(new gzl.b(this, 4));
        new f2(this, this).a();
    }

    public /* synthetic */ ZoomableFullScreenVideoView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
