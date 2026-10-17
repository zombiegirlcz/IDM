package du2;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import aw0.o9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.call_security_info.impl.R$string;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mx0.xb;
import mx0.yb;
import mx0.zb;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class j {

    @NotNull
    private static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f117542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f117543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f117544c;
    public final AtomicBoolean d;
    public final View e;
    public final ViewGroup f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f117545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f117546h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a0.a f117547j;
    public volatile g k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f117548l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zb f117549m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zb f117550n;

    public j(Activity activity, d callStatusInfoClickHandler, c callScreenOpener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callStatusInfoClickHandler, "callStatusInfoClickHandler");
        Intrinsics.checkNotNullParameter(callScreenOpener, "callScreenOpener");
        this.f117542a = activity;
        this.f117543b = callStatusInfoClickHandler;
        this.f117544c = callScreenOpener;
        final int i = 0;
        this.d = new AtomicBoolean(false);
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        this.e = decorView;
        View rootView = decorView.getRootView();
        Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) rootView;
        this.f = viewGroup;
        View view = (View) y.q(ViewGroupKt.getChildren(viewGroup));
        this.f117545g = view;
        this.f117546h = view.getPaddingTop();
        this.i = w.y0(new Function0(this) { // from class: du2.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f117539b;

            {
                this.f117539b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        j jVar = this.f117539b;
                        ViewGroup viewGroup2 = jVar.f;
                        xb xbVar = (xb) viewGroup2.findViewWithTag("CallStatusInfoHolder_StatusBarBannerView");
                        if (xbVar != null) {
                            return xbVar;
                        }
                        xb xbVar2 = new xb(jVar.f117542a, null, 6, 0);
                        xbVar2.setTag("CallStatusInfoHolder_StatusBarBannerView");
                        viewGroup2.addView(xbVar2);
                        return xbVar2;
                    default:
                        return Boolean.valueOf(this.f117539b.f117542a.getClass().isAnnotationPresent(be7.f.class));
                }
            }
        });
        this.f117547j = new a0.a(this, 23);
        final int i2 = 1;
        this.f117548l = w.y0(new Function0(this) { // from class: du2.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f117539b;

            {
                this.f117539b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        j jVar = this.f117539b;
                        ViewGroup viewGroup2 = jVar.f;
                        xb xbVar = (xb) viewGroup2.findViewWithTag("CallStatusInfoHolder_StatusBarBannerView");
                        if (xbVar != null) {
                            return xbVar;
                        }
                        xb xbVar2 = new xb(jVar.f117542a, null, 6, 0);
                        xbVar2.setTag("CallStatusInfoHolder_StatusBarBannerView");
                        viewGroup2.addView(xbVar2);
                        return xbVar2;
                    default:
                        return Boolean.valueOf(this.f117539b.f117542a.getClass().isAnnotationPresent(be7.f.class));
                }
            }
        });
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.in_app_calls_screen_call_banner_not_calling, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorWhite), false, false, 254), 10);
        int i3 = R$drawable.uikit_icn_24_chevron_right;
        Integer numValueOf = Integer.valueOf(R$attr.uikit_colorWhite_50);
        Float fValueOf = Float.valueOf(12.0f);
        this.f117549m = new zb(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textLocalisedClause, new ImageClause(i3, numValueOf, fValueOf, fValueOf, 16))), yb.Danger, Integer.valueOf(R$drawable.uikit_icn_24_warning), null, true);
        this.f117550n = new zb(new TextLocalisedClause(R$string.in_app_calls_screen_call_revolut, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorWhite), false, false, 254), 10), yb.Grey, Integer.valueOf(R$drawable.uikit_icn_24_call), null, true);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(boolean z) {
        if (this.d.compareAndSet(true, false)) {
            if (z) {
                ((xb) this.i.getValue()).postDelayed(this.f117547j, 10000L);
            } else {
                ((xb) this.i.getValue()).b();
                ViewCompat.setOnApplyWindowInsetsListener(this.f117545g, new abf.c(f.HIDE, this, 20));
                this.e.requestApplyInsets();
            }
            this.k = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(g type) {
        zb zbVar;
        Intrinsics.checkNotNullParameter(type, "type");
        if (((Boolean) this.f117548l.getValue()).booleanValue() || this.k == type) {
            return;
        }
        this.d.set(true);
        ((xb) this.i.getValue()).removeCallbacks(this.f117547j);
        this.k = type;
        xb xbVar = (xb) this.i.getValue();
        int i = i.f117540a[type.ordinal()];
        if (i == 1) {
            zbVar = this.f117550n;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            zbVar = this.f117549m;
        }
        xbVar.c(zbVar);
        ((xb) this.i.getValue()).setOnClickListener(new ap0.f(type, this, 12));
        ViewCompat.setOnApplyWindowInsetsListener(this.f117545g, new abf.c(f.SHOW, this, 20));
        this.e.requestApplyInsets();
    }
}
