package zo0;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.lang.ref.WeakReference;
import k50.u1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenContentRecyclerView f323845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f323846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f323847c;
    public final DateTimeZone d;
    public final u1 e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f323848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f323849h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Instant f323850j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public WeakReference f323851l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Rect f323852m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f323853n;
    public final TagView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f323854p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f323855q;

    public d(ScreenContentRecyclerView recyclerView, ControllerContainerCoordinatorLayout rootLayout, NavBarWithToolbar navBar, DateTimeZone timezone, u1 getTimeFromItem) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(rootLayout, "rootLayout");
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        Intrinsics.checkNotNullParameter(getTimeFromItem, "getTimeFromItem");
        this.f323845a = recyclerView;
        this.f323846b = rootLayout;
        this.f323847c = navBar;
        this.d = timezone;
        this.e = getTimeFromItem;
        this.i = true;
        this.f323851l = new WeakReference(null);
        this.f323852m = new Rect();
        Context context = rootLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f323853n = kli.a.l(context, 12.0f);
        Context context2 = rootLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        TagView tagView = new TagView(context2, null, 6, 0);
        CoordinatorLayout.LayoutParams layoutParams = new CoordinatorLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        tagView.setLayoutParams(layoutParams);
        tagView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        tagView.setVisibility(4);
        this.o = tagView;
        this.f323854p = new a(this, 0);
        this.f323855q = new c(this);
    }

    public final void a(View view, boolean z, boolean z3, boolean z4, float f) {
        this.i = z;
        int i = (!z3 || this.f323850j == null) ? 4 : 0;
        TagView tagView = this.o;
        tagView.setVisibility(i);
        if (view != null) {
            view.setVisibility(z4 ? 0 : 4);
        }
        tagView.setTranslationY(this.f323847c.getHeight() + f + this.f323853n);
    }

    public final void b() {
        if (this.f323848g) {
            return;
        }
        this.f323848g = true;
        if (!this.f) {
            this.f = true;
            this.f323846b.addView(this.o);
        }
        this.f323845a.addOnScrollListener(this.f323855q);
    }

    public final void c() {
        if (this.f323849h) {
            this.f323849h = false;
            TagView tagView = this.o;
            tagView.animate().cancel();
            tagView.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(200L).withEndAction(new a(this, 1)).start();
        }
    }
}
