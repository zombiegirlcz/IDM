package dy0;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import aw0.y9;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import ix0.n1;
import ix0.o1;
import ix0.r1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class w implements m0 {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f121028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n1 f121029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f121030c;
    public Integer d;
    public Integer e;
    public Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f121031g;

    public w(i0 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f121028a = config;
    }

    @Override // dy0.m0
    public final void a(View view, SliderLayout parent, r state) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        n1 n1Var = this.f121029b;
        if (n1Var != null) {
            n1Var.b();
        }
        this.f121029b = null;
        this.f121030c = false;
        this.f = null;
    }

    @Override // dy0.m0
    public final void c(View view, SliderLayout parent, float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
    }

    @Override // dy0.m0
    public final void d(View view, SliderLayout parent, r targetState) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        Context context = parent.getContext();
        dx0.c cVar = dx0.c.DEFAULT;
        Intrinsics.h(context);
        this.d = Integer.valueOf(io0.a.c(context, cVar.b()));
        this.e = Integer.valueOf(io0.a.c(context, cVar.d()));
        if (Intrinsics.f(view.getTag(R$id.sliderThemeSystemBarsTransition_disableAnimation), Boolean.FALSE)) {
            this.f121031g = true;
        }
    }

    @Override // dy0.m0
    public final void e(View view, SliderLayout parent, float f) {
        Window window;
        h30.q qVar;
        Window window2;
        View decorView;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        double d = f;
        if (d > 0.5d && !this.f121030c) {
            this.f121030c = true;
            Intrinsics.h(context);
            Intrinsics.checkNotNullParameter(context, "context");
            int i = R$id.internal_status_bar_controller_tag;
            y9 y9Var = y9.THEME;
            a5.a styleApplicator = new a5.a(19);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(styleApplicator, "styleApplicator");
            Activity activityI = z92.f.i(context);
            View viewFindViewById = (activityI == null || (window2 = activityI.getWindow()) == null || (decorView = window2.getDecorView()) == null) ? null : decorView.findViewById(R.id.content);
            if (activityI == null || viewFindViewById == null) {
                qVar = null;
            } else {
                Object tag2 = viewFindViewById.getTag(i);
                r1 r1Var = tag2 instanceof r1 ? (r1) tag2 : null;
                if (r1Var == null) {
                    r1Var = new r1();
                    viewFindViewById.setTag(i, r1Var);
                }
                qVar = new h30.q(y9Var, styleApplicator, r1Var, context);
            }
            o1 priority = o1.OVERLAY;
            Intrinsics.checkNotNullParameter(priority, "priority");
            n1 n1Var = new n1(qVar, qVar != null ? Long.valueOf(qVar.K0(priority)) : null);
            this.f121029b = n1Var;
            n1Var.a(y9Var);
        }
        if (this.f121031g) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            boolean z = d > 0.8d;
            if (!Intrinsics.f(this.f, Boolean.valueOf(z))) {
                this.f = Boolean.valueOf(z);
                Context context2 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Activity activityI2 = z92.f.i(context2);
                if (activityI2 != null && (window = activityI2.getWindow()) != null) {
                    a41.g.n(window, Intrinsics.f(this.f, Boolean.TRUE));
                }
            }
        }
        m0.Companion.getClass();
        float fC = jq0.a.c(f, 0.75f);
        Integer num = this.d;
        if (num != null) {
            int iIntValue = num.intValue();
            Intrinsics.h(context);
            Color.SolidInt color = new Color.SolidInt(io0.a.b(fC, iIntValue));
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(color, "color");
            dx0.e.a(context, io0.a.c(context, color), true);
        }
        Integer num2 = this.e;
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            Intrinsics.h(context);
            Color.SolidInt color2 = new Color.SolidInt(io0.a.b(fC, iIntValue2));
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(color2, "color");
            Activity activityM = kli.a.m(context);
            if (activityM == null) {
                return;
            }
            Window window3 = activityM.getWindow();
            Intrinsics.checkNotNullExpressionValue(window3, "getWindow(...)");
            Intrinsics.checkNotNullParameter(window3, "window");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(color2, "color");
            window3.setNavigationBarDividerColor(io0.a.c(context, color2));
        }
    }

    @Override // dy0.m0
    public final i0 getConfig() {
        return this.f121028a;
    }
}
