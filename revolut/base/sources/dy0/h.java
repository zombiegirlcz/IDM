package dy0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.core.ui_kit.views.slider_layout.SlidingDimmerView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import ms0.s3;
import org.jetbrains.annotations.NotNull;
import tx0.c3;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements m0, c3 {

    @NotNull
    private static final f Companion = new f();
    public final y A;
    public final w B;
    public s3 C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f120973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f120974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f120975c;
    public float d;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f120976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f120977h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f120978j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f120979l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f120980m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f120981n;
    public float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f120982p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f120983q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f120984r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public NavBarWithContainerHeaderView f120985s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f120986t;
    public float u;
    public float v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f120987w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f120988x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i0 f120989y;
    public final e z;

    public h(TextLocalisedClause textLocalisedClause, g mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f120973a = textLocalisedClause;
        this.f120974b = mode;
        this.f120978j = -1.0f;
        this.k = 0.8f;
        this.f120979l = -1.0f;
        this.f120981n = -1.0f;
        this.f120984r = -1.0f;
        this.f120986t = -1.0f;
        this.u = -1.0f;
        i0 i0Var = new i0(new j0(110.0f), new h0(mode == g.SUGGESTIONS ? 700L : 600L, null, 14), true, true);
        this.f120989y = i0Var;
        this.z = new e(i0Var, c.KEEP_HIDDEN_IF_OVERLAY_BLUR_PRESENT, 4);
        this.A = new y(i0Var);
        this.B = new w(i0Var);
    }

    @Override // dy0.m0
    public final void a(View view, SliderLayout parent, r state) {
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        s3 s3Var = this.C;
        if (s3Var != null && s3Var.f && (viewGroup = s3Var.e) != null) {
            viewGroup.removeOnLayoutChangeListener(s3Var.f208418g);
            viewGroup.getOverlay().remove(s3Var);
            s3Var.e = null;
            s3Var.f = false;
        }
        this.C = null;
        this.z.a(view, parent, state);
        this.A.a(view, parent, state);
        this.B.a(view, parent, state);
        NavBarWithContainerHeaderView navBarWithContainerHeaderView = this.f120985s;
        if (navBarWithContainerHeaderView != null) {
            TextView messageView$ui_kit_components_release = navBarWithContainerHeaderView.getMessageView$ui_kit_components_release();
            if (messageView$ui_kit_components_release != null && messageView$ui_kit_components_release.getAlpha() == BitmapDescriptorFactory.HUE_RED) {
                navBarWithContainerHeaderView.setInteractiveMessage$ui_kit_components_release(null);
            }
            NavBarWithContainerHeaderView.setInteractiveMessageMode$ui_kit_components_release$default(navBarWithContainerHeaderView, false, null, 2, null);
        }
        this.f120985s = null;
    }

    @Override // dy0.m0
    public final void b(View view, SliderLayout parent, float f) {
        float f4;
        float f5;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        NavBarWithContainerHeaderView navBarWithContainerHeaderView = this.f120985s;
        s3 s3Var = this.C;
        TextView messageView$ui_kit_components_release = navBarWithContainerHeaderView != null ? navBarWithContainerHeaderView.getMessageView$ui_kit_components_release() : null;
        if (this.d >= 1.0f) {
            this.e = true;
        }
        boolean z = this.f120976g;
        e eVar = this.z;
        if (!z) {
            this.f120976g = true;
            SlidingDimmerView slidingDimmerView = eVar.e;
            this.f120978j = slidingDimmerView != null ? slidingDimmerView.getDimmingAlpha$ui_kit_components_release() : 0.0f;
            if (this.f) {
                this.f120979l = messageView$ui_kit_components_release != null ? messageView$ui_kit_components_release.getAlpha() : 0.0f;
            }
            this.f120981n = this.o;
            if (s3Var != null) {
                s3Var.setColor(this.f120983q);
            }
        }
        if (navBarWithContainerHeaderView != null && this.e) {
            float f6 = this.v;
            if (f6 != BitmapDescriptorFactory.HUE_RED) {
                if (this.u < BitmapDescriptorFactory.HUE_RED) {
                    this.u = f - (this.f120987w * 0.8f);
                }
                float f32 = ((f6 + this.f120987w) + f) - this.u;
                if (f32 > 1.0f) {
                    f32 = 1.0f;
                }
                navBarWithContainerHeaderView.setMessageCurrentInset$ui_kit_components_release(this.i + ((int) (f32 * this.f120977h)));
            }
        }
        float f35 = this.f120979l;
        if (f35 >= BitmapDescriptorFactory.HUE_RED && messageView$ui_kit_components_release != null) {
            messageView$ui_kit_components_release.setAlpha(AnimationUtils.lerp(f35, BitmapDescriptorFactory.HUE_RED, f));
        }
        g gVar = g.SUGGESTIONS;
        g gVar2 = this.f120974b;
        if (gVar2 == gVar) {
            f4 = 2.5f;
            f5 = 0.65f;
        } else {
            f4 = 2.0f;
            f5 = 0.85f;
        }
        float f36 = this.f120978j;
        float f37 = f4 * f;
        if (f37 > 1.0f) {
            f37 = 1.0f;
        }
        float fLerp = AnimationUtils.lerp(f36, 1.0f, f37);
        eVar.e(view, parent, fLerp);
        if (fLerp > f5 && this.f120984r < BitmapDescriptorFactory.HUE_RED) {
            this.f120984r = f;
        }
        float f41 = this.f120984r;
        float fLerp2 = f41 >= BitmapDescriptorFactory.HUE_RED ? AnimationUtils.lerp(BitmapDescriptorFactory.HUE_RED, 1.0f, f41, 1.0f, f) : 0.0f;
        if (fLerp2 > BitmapDescriptorFactory.HUE_RED && gVar2 == gVar) {
            fLerp2 = 1.0f - jq0.r.f177392a.getInterpolation(1.0f - fLerp2);
        }
        this.A.e(view, parent, fLerp2);
        if (s3Var != null) {
            f(s3Var, AnimationUtils.lerp(this.f120981n, 1.0f, f));
        }
    }

    @Override // dy0.m0
    public final void c(View view, SliderLayout parent, float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        lji.c cVarL = ksj.b.l(view);
        if (cVarL != null) {
            cVarL.c(f);
        }
    }

    @Override // dy0.m0
    public final void d(View view, SliderLayout parent, r targetState) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (kli.a.q(context)) {
            this.k = 0.8f;
            this.f120982p = 0.35f;
            this.f120983q = s3.f208414j;
        } else {
            this.k = 0.6f;
            this.f120982p = 0.6f;
            this.f120983q = s3.k;
        }
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_windowBackground, context2);
        e eVar = this.z;
        eVar.f = iS;
        eVar.d(view, parent, targetState);
        this.A.d(view, parent, targetState);
        this.B.d(view, parent, targetState);
        this.f = false;
        this.f120980m = 0;
        this.i = 0;
        this.f120977h = com.google.android.gms.internal.mlkit_vision_face.a.a(view, "getContext(...)", 110.0f);
        this.f120988x = 0L;
        this.f120986t = -1.0f;
        this.f120978j = -1.0f;
        this.f120984r = -1.0f;
        this.f120979l = -1.0f;
        this.u = -1.0f;
        this.f120981n = -1.0f;
        this.v = BitmapDescriptorFactory.HUE_RED;
        this.o = BitmapDescriptorFactory.HUE_RED;
        this.d = BitmapDescriptorFactory.HUE_RED;
        this.e = false;
        this.f120975c = false;
        this.f120976g = false;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new cli.u(this, 3));
        } else {
            this.f120975c = true;
        }
        NavBarWithContainerHeaderView navBarWithContainerHeaderView = (NavBarWithContainerHeaderView) parent.findViewById(R$id.navBarWithContainer_headerView);
        this.f120985s = navBarWithContainerHeaderView;
        if (navBarWithContainerHeaderView != null) {
            g gVar = g.WITH_GLOW;
            g gVar2 = this.f120974b;
            if (gVar2 == gVar || gVar2 == g.SUGGESTIONS) {
                Context context3 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                s3 s3Var = new s3(context3);
                if (1.0f != s3Var.d || 1.0f != s3Var.f208417c) {
                    s3Var.f208417c = 1.0f;
                    s3Var.d = 1.0f;
                    if (s3Var.f) {
                        s3Var.b();
                    }
                }
                s3Var.setColor(navBarWithContainerHeaderView.getGlowColor());
                s3Var.setAlpha(this.f120982p);
                s3Var.a(parent);
                this.C = s3Var;
            }
            navBarWithContainerHeaderView.setInteractiveMessageMode$ui_kit_components_release(true, this);
            AppCompatTextView appCompatTextViewL = navBarWithContainerHeaderView.l();
            SlidingDimmerView slidingDimmerView = eVar.e;
            if (slidingDimmerView != null) {
                slidingDimmerView.setHighlightTarget(appCompatTextViewL);
            }
        }
    }

    @Override // dy0.m0
    public final void e(View view, SliderLayout parent, float f) {
        TextView messageView$ui_kit_components_release;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.e) {
            return;
        }
        this.d = f;
        this.B.e(view, parent, f);
        if (!this.f120976g && this.f120974b == g.DEFAULT) {
            this.z.e(view, parent, AnimationUtils.lerp(BitmapDescriptorFactory.HUE_RED, this.k, f));
        }
        s3 s3Var = this.C;
        if (s3Var != null && !this.f120976g) {
            f(s3Var, AnimationUtils.lerp(BitmapDescriptorFactory.HUE_RED, 0.8f, this.v) / 2.75f);
        }
        NavBarWithContainerHeaderView navBarWithContainerHeaderView = this.f120985s;
        if (this.f120975c && navBarWithContainerHeaderView != null && this.f) {
            if (this.f120986t < BitmapDescriptorFactory.HUE_RED) {
                this.f120986t = f;
                this.i = navBarWithContainerHeaderView.getW();
                this.f120988x = System.currentTimeMillis();
            }
            float f4 = f - this.f120986t;
            if (f4 < BitmapDescriptorFactory.HUE_RED) {
                this.f120986t = f;
                f4 = 0.0f;
            }
            this.f120987w = Math.abs(f4 - this.v);
            this.v = f4;
            navBarWithContainerHeaderView.setMessageCurrentInset$ui_kit_components_release(this.i + ((int) (this.f120977h * f4)));
            int i = this.f120980m;
            if (i == 1 && f4 >= 0.2f) {
                this.f120980m = System.currentTimeMillis() - this.f120988x < 90 ? 2 : 3;
            } else if (i == 2 && f4 <= 0.2f) {
                this.f120980m = 3;
            }
            if (this.f120980m != 3 || (messageView$ui_kit_components_release = navBarWithContainerHeaderView.getMessageView$ui_kit_components_release()) == null) {
                return;
            }
            float fLerp = AnimationUtils.lerp(BitmapDescriptorFactory.HUE_RED, 1.0f, 0.2f, 0.4f, f4);
            messageView$ui_kit_components_release.setTranslationY(((1.0f - fLerp) * navBarWithContainerHeaderView.getDefaultMessageInset$ui_kit_components_release()) / 2);
            if (this.f120976g) {
                return;
            }
            messageView$ui_kit_components_release.setAlpha(fLerp);
        }
    }

    public final void f(s3 s3Var, float f) {
        this.o = f;
        s3Var.setTranslationY(s3Var.getHeight() * f);
        s3Var.setScaleY((3.0f * f) + 1.0f);
        s3Var.setScaleX(1.0f + f);
        s3Var.setAlpha(AnimationUtils.lerp(this.f120982p, BitmapDescriptorFactory.HUE_RED, f));
    }

    public final void g() {
        this.f = true;
        NavBarWithContainerHeaderView navBarWithContainerHeaderView = this.f120985s;
        if (navBarWithContainerHeaderView == null) {
            return;
        }
        NavBarMessage f59382h0 = navBarWithContainerHeaderView.getF59382h0();
        NavBarMessage navBarMessage = (this.f120976g || f59382h0 != null) ? f59382h0 : new NavBarMessage("interactive", (Clause) this.f120973a, false, false, 24);
        navBarWithContainerHeaderView.setInteractiveMessage$ui_kit_components_release(navBarMessage);
        if (this.f120976g || f59382h0 != null || navBarMessage == null) {
            return;
        }
        this.f120980m = 1;
        TextView messageView$ui_kit_components_release = navBarWithContainerHeaderView.getMessageView$ui_kit_components_release();
        if (messageView$ui_kit_components_release != null) {
            messageView$ui_kit_components_release.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Override // dy0.m0
    public final i0 getConfig() {
        return this.f120989y;
    }
}
