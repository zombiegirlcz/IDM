package au0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.layout.UIKitConstraintLayout;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarNavigationButtonView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class x1 extends UIKitConstraintLayout implements h4, v2, g2, ur0.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9422h;
    public Function0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9423j;
    public final SearchView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final NavBarNavigationButtonView f9424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f9425m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f9426n;
    public final TextView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TagView f9427p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final RecyclerView f9428q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.core.ui_kit.internal.views.navbar.d f9429r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public t2 f9430s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x1(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // au0.g2
    public final efm.r b() {
        throw null;
    }

    @NotNull
    public final RecyclerView getMenuRecyclerView() {
        return this.f9428q;
    }

    @Override // au0.v2
    @NotNull
    public goi.f getNavbarMaskState() {
        return this.f9430s.getNavbarMaskState();
    }

    @NotNull
    public final NavBarNavigationButtonView getNavigationButton() {
        return this.f9424l;
    }

    @NotNull
    public final SearchView getSearchView() {
        return this.k;
    }

    @NotNull
    public final TagView getTagView() {
        return this.f9427p;
    }

    @NotNull
    public final TextView getToolbarSubtitleChained() {
        return this.o;
    }

    @NotNull
    public final TextView getToolbarTitle() {
        return this.f9425m;
    }

    @NotNull
    public final TextView getToolbarTitleChained() {
        return this.f9426n;
    }

    @Override // au0.h4
    /* JADX INFO: renamed from: getTotalScrollRange */
    public int getQ0() {
        return this.f9423j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9430s.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9430s.onDetachedFromWindow();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        if (z) {
            this.f9430s.a(this);
        }
    }

    @Override // com.revolut.core.ui_kit.internal.views.layout.UIKitConstraintLayout, androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingTop() + this.f9422h, 1073741824));
    }

    @Override // au0.h4
    public final void q() {
        Function0 function0 = this.i;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ur0.a
    public final void r(aw0.v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        if (((Boolean) jo0.g.D.getValue()).booleanValue()) {
            this.f9430s.b(colorScheme);
            foh.i.e(this.f9424l, colorScheme, i, i2, i3);
            this.f9429r.r(colorScheme, i, i2, i3);
        }
    }

    public void setMenuItems(@NotNull List<? extends NavBarMenuItem> menuItems, @NotNull yy0.f imageDisplayer) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
        com.revolut.core.ui_kit.internal.views.navbar.d dVar = this.f9429r;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
        dVar.setMenuItems(menuItems);
    }

    public final void setMenuTintColor(int i, int i2) {
        this.f9429r.f(i, i2);
    }

    @Override // au0.v2
    public void setNavbarPositionChangedCallback(Function0<Unit> function0) {
        this.i = function0;
    }

    public final void setReflectiveSurfaceEnabled(boolean z) {
        x1 x1Var;
        t2 f4Var;
        t2 t2Var = this.f9430s;
        if ((!(t2Var instanceof u3)) == z) {
            return;
        }
        t2Var.onDetachedFromWindow();
        if (z) {
            com.revolut.core.ui_kit.internal.views.navbar.d dVar = this.f9429r;
            NavBarNavigationButtonView navBarNavigationButtonView = this.f9424l;
            x1Var = this;
            f4Var = new f4(x1Var, this, new a5h.g(navBarNavigationButtonView, dVar, this), zhm.u.c(navBarNavigationButtonView), this.f9428q);
        } else {
            x1Var = this;
            f4Var = u3.f9387a;
        }
        x1Var.f9430s = f4Var;
        if (isAttachedToWindow()) {
            x1Var.f9430s.onAttachedToWindow();
        }
    }

    public final void setTotalScrollRange(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f9423j = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x1(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, kotlin.Lazy] */
    public x1(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.internal_nav_bar_height);
        this.f9422h = dimensionPixelSize;
        this.f9430s = u3.f9387a;
        setMinimumHeight(dimensionPixelSize);
        View.inflate(context, R$layout.internal_view_header_with_big_tile_toolbar, this);
        View viewFindViewById = findViewById(R$id.navBarWithBigTile_searchView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.k = (SearchView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.navBarWithBigTile_navigationButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f9424l = (NavBarNavigationButtonView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.navBarWithBigTile_toolbarTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f9425m = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.navBarWithBigTile_toolbarTitleChained);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f9426n = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.navBarWithBigTile_toolbarSubtitleChained);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.o = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R$id.navBarWithBigTile_menuRecyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById6;
        this.f9428q = recyclerView;
        View viewFindViewById7 = findViewById(R$id.navBarWithBigTile_tagView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f9427p = (TagView) viewFindViewById7;
        this.f9429r = new com.revolut.core.ui_kit.internal.views.navbar.d(recyclerView);
        if (((Boolean) jo0.g.D.getValue()).booleanValue()) {
            setReflectiveSurfaceEnabled(true);
        }
    }

    @Override // au0.g2
    public void setMenuItems(@NotNull List<? extends NavBarMenuItem> menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f9429r.setMenuItems(menuItems);
    }

    public /* synthetic */ x1(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
