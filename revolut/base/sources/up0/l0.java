package up0;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Choreographer;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class l0 extends TextureView implements TextureView.SurfaceTextureListener, q0 {
    public static final /* synthetic */ int u = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f281732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f281733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Choreographer f281734c;
    public final jq0.h d;
    public b e;
    public p0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f281735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i0 f281736h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RectF f281737j;
    public Float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Float f281738l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f281739m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f281740n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f281741p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f281742q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f281743r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f281744s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f281745t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l0(@NotNull Context context) {
        this(context, null, null, 1.0f);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static boolean f(String str, float f, float f4) throws Throwable {
        if (Math.abs(f) <= Float.MAX_VALUE && Math.abs(f4) <= Float.MAX_VALUE) {
            return true;
        }
        wp5.y.B(str);
        return false;
    }

    public final void a() {
        if (this.f281740n) {
            i0 i0Var = this.f281736h;
            if (i0Var != null) {
                i0.a(i0Var, 5, 0, 0, null, 14);
            }
            b();
        }
        this.f281740n = false;
        this.o = false;
    }

    public final void b() {
        if (!this.f281739m && this.i && isAvailable() && isShown() && getWindowVisibility() == 0) {
            this.f281739m = true;
            this.f281734c.postFrameCallback(this.d);
        }
    }

    public final void c(long j2, float f, float f4, boolean z) {
        if (this.f281740n) {
            i0 i0Var = this.f281736h;
            if (i0Var != null) {
                i0.a(i0Var, 5, 0, 0, null, 14);
            }
            b();
        }
        if (z && this.o && j2 - this.f281741p < this.f281745t && ((float) Math.hypot(f - this.f281742q, f4 - this.f281743r)) < this.f281744s && f("Wave coordinates must be finite", f, f4)) {
            i0 i0Var2 = this.f281736h;
            if (i0Var2 != null) {
                i0.a(i0Var2, 3, Float.floatToRawIntBits(f), Float.floatToRawIntBits(f4), null, 8);
            }
            b();
        }
        this.f281740n = false;
        this.o = false;
    }

    public final void d(SurfaceTexture surfaceTexture, int i, int i2) {
        int iS;
        if (this.f281736h != null) {
            return;
        }
        this.i = false;
        b bVar = this.e;
        if (this.f != null) {
            bVar = null;
        }
        b bVar2 = bVar;
        h0 h0Var = i0.Companion;
        float f = getResources().getDisplayMetrics().density * this.f281733b;
        Integer num = this.f281735g;
        if (num != null) {
            iS = num.intValue();
        } else {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iS = kli.a.s(R$attr.uikit_colorForeground, context);
        }
        int i3 = iS;
        k0 onReady = new k0(this, 0);
        k0 onContextLost = new k0(this, 1);
        umd.n onFailure = new umd.n(this, 6);
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        Intrinsics.checkNotNullParameter(onReady, "onReady");
        Intrinsics.checkNotNullParameter(onContextLost, "onContextLost");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        i0 i0Var = new i0(surfaceTexture, i, i2, f, i3, bVar2, onReady, onContextLost, onFailure);
        i0Var.start();
        Handler handler = new Handler(i0Var.getLooper(), new j4.d(i0Var, 3));
        i0Var.k = handler;
        handler.sendEmptyMessage(0);
        this.f281736h = i0Var;
    }

    public final void e() {
        if (this.f281739m) {
            this.f281739m = false;
            this.f281734c.removeFrameCallback(this.d);
        }
    }

    public final boolean getHasActiveInteraction$ui_kit_components_release() {
        return this.f281740n;
    }

    @Override // up0.q0
    @NotNull
    public View getView() {
        return this;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isAvailable()) {
            b();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration newConfig) {
        int iS;
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Integer num = this.f281735g;
        if (num != null) {
            iS = num.intValue();
        } else {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iS = kli.a.s(R$attr.uikit_colorForeground, context);
        }
        int i = iS;
        i0 i0Var = this.f281736h;
        if (i0Var != null) {
            i0.a(i0Var, 2, i, 0, null, 12);
        }
        b();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        e();
        a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i, int i2) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        d(surface, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        Handler handler;
        Intrinsics.checkNotNullParameter(surface, "surface");
        this.i = false;
        a();
        e();
        i0 i0Var = this.f281736h;
        if (i0Var != null && i0Var.f.compareAndSet(false, true) && ((handler = i0Var.k) == null || !handler.sendEmptyMessage(9))) {
            if (i0Var.f281722g.compareAndSet(false, true)) {
                i0Var.f281719a.release();
            }
            i0Var.quitSafely();
        }
        this.f281736h = null;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i, int i2) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        i0 i0Var = this.f281736h;
        if (i0Var != null) {
            i0.a(i0Var, 8, i, i2, null, 8);
        }
        b();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        if (z) {
            b();
        } else {
            e();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0 && isAvailable()) {
            b();
        } else {
            e();
        }
    }

    @Override // up0.q0
    public void setBalanceConfiguration(@NotNull b configuration, @NotNull p0 transition) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.e = configuration;
        i0 i0Var = this.f281736h;
        if (i0Var == null) {
            this.f = transition;
            b();
        } else {
            this.f = null;
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(transition, "transition");
            i0.a(i0Var, 10, 0, 0, new g0(configuration, transition), 6);
        }
    }

    public void setParticleColor(int i) {
        Integer num = this.f281735g;
        if (num != null && num.intValue() == i) {
            return;
        }
        this.f281735g = Integer.valueOf(i);
        i0 i0Var = this.f281736h;
        if (i0Var != null) {
            i0.a(i0Var, 2, i, 0, null, 12);
        }
        b();
    }

    @Override // up0.q0
    public void setSceneCenter(Float f, Float f4) {
        this.k = f;
        this.f281738l = f4;
        i0 i0Var = this.f281736h;
        if (i0Var != null) {
            i0Var.b(f, f4);
        }
        b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Context context, il9.p pVar, b bVar, float f) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f281732a = pVar;
        this.f281733b = f;
        this.f281734c = Choreographer.getInstance();
        this.d = new jq0.h(this, 2);
        this.e = bVar;
        this.f281744s = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f281745t = ViewConfiguration.getLongPressTimeout();
        setOpaque(false);
        setClickable(false);
        setImportantForAccessibility(2);
        setSurfaceTextureListener(this);
    }
}
