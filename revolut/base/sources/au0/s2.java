package au0;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.revolut.core.ui_kit.internal.views.CircleProgressBar;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavBarWithToolbar f9350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9352c;
    public final int d;
    public final int e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f9353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public mp.p f9354h;
    public CutoutImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CircleBadgeView f9355j;
    public CircleProgressBar k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ProgressBar f9356l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AvatarView f9357m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public OverlappedIconsView f9358n;
    public final Object o;

    public s2(NavBarWithToolbar navBarWithToolbar) {
        Intrinsics.checkNotNullParameter(navBarWithToolbar, "navBarWithToolbar");
        this.f9350a = navBarWithToolbar;
        this.f9351b = kli.a.k(a(), 24.0f);
        this.f9352c = kli.a.k(a(), 56.0f);
        this.d = kli.a.k(a(), 70.0f);
        this.e = kli.a.k(a(), 28.0f);
        this.f = te0.w.y0(new q2(this, 0));
        this.f9353g = v0.a.d("create(...)");
        this.o = te0.w.y0(new q2(this, 1));
    }

    public final Context a() {
        Context context = this.f9350a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final FrameLayout b() {
        Object value = this.f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FrameLayout) value;
    }

    public final mp.p c() {
        mp.p pVar = this.f9354h;
        if (pVar != null) {
            return pVar;
        }
        LinearLayout linearLayout = new LinearLayout(a());
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 60.0f);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(iK, kli.a.k(context2, 36.0f)));
        linearLayout.setGravity(17);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int iK2 = kli.a.k(context3, 4.0f);
        linearLayout.setPadding(iK2, iK2, iK2, iK2);
        or0.m.a(linearLayout);
        linearLayout.setOnClickListener(new r2(this.f9350a, this, 0));
        ImageView imageView = new ImageView(a());
        int i = this.f9351b;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        Context context4 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int iK3 = kli.a.k(context4, 4.0f);
        imageView.setPadding(iK3, iK3, iK3, iK3);
        linearLayout.addView(imageView);
        ImageView imageView2 = new ImageView(a());
        imageView2.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        Context context5 = imageView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        int iK4 = kli.a.k(context5, 8.0f);
        imageView2.setPadding(iK4, iK4, iK4, iK4);
        imageView2.setImageResource(R$drawable.uikit_icn_16_chevron_down);
        linearLayout.addView(imageView2);
        b().addView(linearLayout);
        mp.p pVar2 = new mp.p(linearLayout, imageView, imageView2);
        this.f9354h = pVar2;
        return pVar2;
    }

    public final void d(boolean z) {
        boolean z3 = !z;
        b().setClipChildren(z3);
        b().setClipToPadding(z3);
    }
}
