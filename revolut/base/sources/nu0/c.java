package nu0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GestureDetectorCompat;
import aw0.y8;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.fullscreenheader.InternalFullscreenHeaderView;
import com.revolut.core.ui_kit.internal.views.richvideoplayer.RichVideoPlayerControlsView;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.CaptionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import e8.q;
import efm.r;
import java.util.Iterator;
import java.util.List;
import jv0.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mx0.r2;
import or0.u;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.d0;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends ConstraintLayout implements m {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f219166y = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f219167b;
    public final q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f219168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q f219169h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q f219170j;
    public final q k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q f219171l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f219172m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f219173n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f219174p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f219175q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f219176r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f219177s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f219178t;
    public final Object u;
    public final ihm.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public y8 f219179w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final GestureDetectorCompat f219180x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static wq0.d f0(c cVar) {
        return new wq0.d(cVar.getCaptionsErrorView(), true, wq0.b.REGULAR);
    }

    public static int g0(c cVar) {
        ViewGroup.LayoutParams layoutParams = cVar.getCaptionsView().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final wq0.d getAnimatedCaptionsView() {
        return (wq0.d) this.f219172m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final wq0.d getAnimatedErrorCaptionsView() {
        return (wq0.d) this.f219173n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final wq0.g getAnimatedInterfaceView() {
        return (wq0.g) this.f219175q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final wq0.j getAnimatedProgressView() {
        return (wq0.j) this.f219176r.getValue();
    }

    private final CaptionsView getCaptionsErrorView() {
        return (CaptionsView) this.i.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getCaptionsInitialMarginBottom() {
        return ((Number) this.u.getValue()).intValue();
    }

    private final CaptionsView getCaptionsView() {
        return (CaptionsView) this.f219169h.f();
    }

    private final View getControlsGradientView() {
        return this.k.f();
    }

    private final RichVideoPlayerControlsView getControlsView() {
        return (RichVideoPlayerControlsView) this.f219168g.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getControlsViewInitialMarginBottom() {
        return ((Number) this.f219178t.getValue()).intValue();
    }

    private final View getHeaderGradientView() {
        return this.f219170j.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final List<View> getHeaderInterfaceViews() {
        return (List) this.f219174p.getValue();
    }

    private final InternalFullscreenHeaderView getHeaderView() {
        return (InternalFullscreenHeaderView) this.f.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getHeaderViewInitialMarginTop() {
        return ((Number) this.f219177s.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final List<View> getInterfaceViews() {
        return (List) this.o.getValue();
    }

    private final boolean getPlayerInteractionsAllowed() {
        return this.f219179w instanceof y8.a;
    }

    private final UiKitPlayerView getPlayerView() {
        return (UiKitPlayerView) this.f219167b.f();
    }

    private final ImageView getProgressImage() {
        return (ImageView) this.f219171l.f();
    }

    private final int getScreenWidth() {
        return getResources().getDisplayMetrics().widthPixels;
    }

    public static wq0.g h0(c cVar) {
        List<View> interfaceViews;
        y8 y8Var = cVar.f219179w;
        if (!(y8Var instanceof y8.a)) {
            interfaceViews = f0.f322471a;
        } else if (((y8.a) y8Var).f10632a) {
            interfaceViews = d0.E0(cVar.getHeaderInterfaceViews(), cVar.getInterfaceViews());
        } else {
            interfaceViews = cVar.getInterfaceViews();
        }
        return new wq0.g(interfaceViews);
    }

    public static List i0(c cVar) {
        return v.k(cVar.getControlsView(), cVar.getControlsGradientView());
    }

    public static wq0.d j0(c cVar) {
        return new wq0.d(cVar.getCaptionsView(), false, wq0.b.FAST);
    }

    public static List l0(c cVar) {
        return v.k(cVar.getHeaderView(), cVar.getHeaderGradientView());
    }

    public static int m0(c cVar) {
        ViewGroup.LayoutParams layoutParams = cVar.getControlsView().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static wq0.j n0(c cVar) {
        return new wq0.j(cVar.getProgressImage());
    }

    public static int o0(c cVar) {
        ViewGroup.LayoutParams layoutParams = cVar.getHeaderView().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final j p0(c cVar, MotionEvent motionEvent) {
        return motionEvent.getX() <= ((float) (cVar.getScreenWidth() / 2)) ? j.LEFT : j.RIGHT;
    }

    @Override // nu0.m
    @NotNull
    public y getContentPlayerView() {
        return getPlayerView();
    }

    @Override // nu0.m
    @NotNull
    public n getErrorSubtitlesView() {
        return getAnimatedErrorCaptionsView();
    }

    @Override // nu0.m
    @NotNull
    public d getInterfaceAnimatedView() {
        return getAnimatedInterfaceView();
    }

    @Override // nu0.m
    @NotNull
    public d getProgressAnimatedView() {
        return getAnimatedProgressView();
    }

    public boolean getScrollingForwardEnabled() {
        return getControlsView().getF57516n();
    }

    @Override // nu0.m
    @NotNull
    public n getSubtitlesView() {
        return getAnimatedCaptionsView();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!getPlayerInteractionsAllowed()) {
            return false;
        }
        this.f219180x.onTouchEvent(event);
        return true;
    }

    public final r q0() {
        r map = getPlayerView().f57715r.ofType(jv0.q.class).map(new noi.l(12, new nrb.c(27)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public void setPlayerInterfaceMode(@NotNull y8 mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f219179w = mode;
        Iterator<T> it8 = getInterfaceViews().iterator();
        while (true) {
            int i = 8;
            if (!it8.hasNext()) {
                break;
            }
            View view = (View) it8.next();
            if (mode instanceof y8.a) {
                i = 0;
            }
            view.setVisibility(i);
        }
        if (mode instanceof y8.a) {
            Iterator<T> it9 = getHeaderInterfaceViews().iterator();
            while (it9.hasNext()) {
                ((View) it9.next()).setVisibility(((y8.a) mode).f10632a ? 0 : 8);
            }
        }
        getControlsView().f57516n = getPlayerInteractionsAllowed();
    }

    public void setScrollForwardErrorMessage(@NotNull Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        getCaptionsErrorView().setCaptions(clause);
        getCaptionsErrorView().setVisibility(8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f219167b = kli.a.J(R$id.richVideoPlayer_backgroundPlayer, this);
        this.f = kli.a.J(R$id.richVideoPlayer_header, this);
        this.f219168g = kli.a.J(R$id.richVideoPlayer_controls, this);
        this.f219169h = kli.a.J(R$id.richVideoPlayer_captionsView, this);
        this.i = kli.a.J(R$id.richVideoPlayer_captionsErrorView, this);
        this.f219170j = kli.a.J(R$id.richVideoPlayer_headerGradient, this);
        this.k = kli.a.J(R$id.richVideoPlayer_controlsGradient, this);
        this.f219171l = kli.a.J(R$id.richVideoPlayer_progressImage, this);
        final int i2 = 0;
        this.f219172m = w.y0(new Function0(this) { // from class: nu0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f219164b;

            {
                this.f219164b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return c.j0(this.f219164b);
                    case 1:
                        return c.f0(this.f219164b);
                    case 2:
                        return c.i0(this.f219164b);
                    case 3:
                        return c.l0(this.f219164b);
                    case 4:
                        return c.h0(this.f219164b);
                    case 5:
                        return c.n0(this.f219164b);
                    case 6:
                        return Integer.valueOf(c.o0(this.f219164b));
                    case 7:
                        return Integer.valueOf(c.m0(this.f219164b));
                    default:
                        return Integer.valueOf(c.g0(this.f219164b));
                }
            }
        });
        final int i3 = 1;
        this.f219173n = w.y0(new Function0(this) { // from class: nu0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f219164b;

            {
                this.f219164b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return c.j0(this.f219164b);
                    case 1:
                        return c.f0(this.f219164b);
                    case 2:
                        return c.i0(this.f219164b);
                    case 3:
                        return c.l0(this.f219164b);
                    case 4:
                        return c.h0(this.f219164b);
                    case 5:
                        return c.n0(this.f219164b);
                    case 6:
                        return Integer.valueOf(c.o0(this.f219164b));
                    case 7:
                        return Integer.valueOf(c.m0(this.f219164b));
                    default:
                        return Integer.valueOf(c.g0(this.f219164b));
                }
            }
        });
        final int i5 = 2;
        this.o = w.y0(new Function0(this) { // from class: nu0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f219164b;

            {
                this.f219164b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return c.j0(this.f219164b);
                    case 1:
                        return c.f0(this.f219164b);
                    case 2:
                        return c.i0(this.f219164b);
                    case 3:
                        return c.l0(this.f219164b);
                    case 4:
                        return c.h0(this.f219164b);
                    case 5:
                        return c.n0(this.f219164b);
                    case 6:
                        return Integer.valueOf(c.o0(this.f219164b));
                    case 7:
                        return Integer.valueOf(c.m0(this.f219164b));
                    default:
                        return Integer.valueOf(c.g0(this.f219164b));
                }
            }
        });
        final int i6 = 3;
        this.f219174p = w.y0(new Function0(this) { // from class: nu0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f219164b;

            {
                this.f219164b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return c.j0(this.f219164b);
                    case 1:
                        return c.f0(this.f219164b);
                    case 2:
                        return c.i0(this.f219164b);
                    case 3:
                        return c.l0(this.f219164b);
                    case 4:
                        return c.h0(this.f219164b);
                    case 5:
                        return c.n0(this.f219164b);
                    case 6:
                        return Integer.valueOf(c.o0(this.f219164b));
                    case 7:
                        return Integer.valueOf(c.m0(this.f219164b));
                    default:
                        return Integer.valueOf(c.g0(this.f219164b));
                }
            }
        });
        final int i21 = 4;
        this.f219175q = w.y0(new Function0(this) { // from class: nu0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f219164b;

            {
                this.f219164b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i21) {
                    case 0:
                        return c.j0(this.f219164b);
                    case 1:
                        return c.f0(this.f219164b);
                    case 2:
                        return c.i0(this.f219164b);
                    case 3:
                        return c.l0(this.f219164b);
                    case 4:
                        return c.h0(this.f219164b);
                    case 5:
                        return c.n0(this.f219164b);
                    case 6:
                        return Integer.valueOf(c.o0(this.f219164b));
                    case 7:
                        return Integer.valueOf(c.m0(this.f219164b));
                    default:
                        return Integer.valueOf(c.g0(this.f219164b));
                }
            }
        });
        final int i22 = 5;
        this.f219176r = w.y0(new Function0(this) { // from class: nu0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f219164b;

            {
                this.f219164b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i22) {
                    case 0:
                        return c.j0(this.f219164b);
                    case 1:
                        return c.f0(this.f219164b);
                    case 2:
                        return c.i0(this.f219164b);
                    case 3:
                        return c.l0(this.f219164b);
                    case 4:
                        return c.h0(this.f219164b);
                    case 5:
                        return c.n0(this.f219164b);
                    case 6:
                        return Integer.valueOf(c.o0(this.f219164b));
                    case 7:
                        return Integer.valueOf(c.m0(this.f219164b));
                    default:
                        return Integer.valueOf(c.g0(this.f219164b));
                }
            }
        });
        final int i32 = 6;
        this.f219177s = w.y0(new Function0(this) { // from class: nu0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f219164b;

            {
                this.f219164b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i32) {
                    case 0:
                        return c.j0(this.f219164b);
                    case 1:
                        return c.f0(this.f219164b);
                    case 2:
                        return c.i0(this.f219164b);
                    case 3:
                        return c.l0(this.f219164b);
                    case 4:
                        return c.h0(this.f219164b);
                    case 5:
                        return c.n0(this.f219164b);
                    case 6:
                        return Integer.valueOf(c.o0(this.f219164b));
                    case 7:
                        return Integer.valueOf(c.m0(this.f219164b));
                    default:
                        return Integer.valueOf(c.g0(this.f219164b));
                }
            }
        });
        final int i33 = 7;
        this.f219178t = w.y0(new Function0(this) { // from class: nu0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f219164b;

            {
                this.f219164b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i33) {
                    case 0:
                        return c.j0(this.f219164b);
                    case 1:
                        return c.f0(this.f219164b);
                    case 2:
                        return c.i0(this.f219164b);
                    case 3:
                        return c.l0(this.f219164b);
                    case 4:
                        return c.h0(this.f219164b);
                    case 5:
                        return c.n0(this.f219164b);
                    case 6:
                        return Integer.valueOf(c.o0(this.f219164b));
                    case 7:
                        return Integer.valueOf(c.m0(this.f219164b));
                    default:
                        return Integer.valueOf(c.g0(this.f219164b));
                }
            }
        });
        final int i43 = 8;
        this.u = w.y0(new Function0(this) { // from class: nu0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f219164b;

            {
                this.f219164b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i43) {
                    case 0:
                        return c.j0(this.f219164b);
                    case 1:
                        return c.f0(this.f219164b);
                    case 2:
                        return c.i0(this.f219164b);
                    case 3:
                        return c.l0(this.f219164b);
                    case 4:
                        return c.h0(this.f219164b);
                    case 5:
                        return c.n0(this.f219164b);
                    case 6:
                        return Integer.valueOf(c.o0(this.f219164b));
                    case 7:
                        return Integer.valueOf(c.m0(this.f219164b));
                    default:
                        return Integer.valueOf(c.g0(this.f219164b));
                }
            }
        });
        this.v = v0.a.d("create(...)");
        this.f219179w = new y8.a(true);
        this.f219180x = new GestureDetectorCompat(context, new b(this), new Handler(Looper.getMainLooper()));
        View.inflate(context, R$layout.internal_view_rich_video_player, this);
        getPlayerView().setScaleType(oz0.b.CENTER_CROP);
        CaptionsView captionsView = getCaptionsView();
        captionsView.setStyle(CaptionsView.a.C0438a.f58381a);
        captionsView.setAlignment(r2.CENTER);
        getCaptionsErrorView().setStyle(CaptionsView.a.b.f58382a);
        yy0.f.e(u.k(this).Q(), new AnimatedResourceImage(R$drawable.uikit_icn_48_loading_anim, 12, (Clause) null, Integer.valueOf(R$attr.uikit_colorWhite)), getProgressImage(), null, null, 12);
    }

    @Override // nu0.m
    @NotNull
    /* JADX INFO: renamed from: getControlsView, reason: collision with other method in class */
    public i mo3804getControlsView() {
        return getControlsView();
    }

    @Override // nu0.m
    @NotNull
    /* JADX INFO: renamed from: getHeaderView, reason: collision with other method in class */
    public ot0.a mo3805getHeaderView() {
        return getHeaderView();
    }

    public /* synthetic */ c(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
