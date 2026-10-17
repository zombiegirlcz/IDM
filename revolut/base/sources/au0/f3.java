package au0;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItemBadge;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f3 extends koi.b implements o3, x2, a3, jr0.i, dr0.v {
    public final RoundedBackgroundDrawable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public tx0.p0 f9195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9196h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f9197j;
    public final ImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f9198l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f9199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fp0.p f9200n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(View itemView, RoundedBackgroundDrawable backgroundDrawable) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(backgroundDrawable, "backgroundDrawable");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = backgroundDrawable;
        this.f9195g = tx0.p0.DEFAULT;
        this.f9196h = backgroundDrawable.d;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.i = kli.a.s(R$attr.uikit_colorForeground, context);
        View viewFindViewById = itemView.findViewById(R$id.navBarMenuItem_chevron);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        this.f9197j = imageView;
        View viewFindViewById2 = itemView.findViewById(R$id.navBarMenuItem_badgeDot);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ImageView imageView2 = (ImageView) viewFindViewById2;
        this.k = imageView2;
        View viewFindViewById3 = itemView.findViewById(R$id.navBarMenuItem_badgeText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f9198l = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.navBarMenuItem_anchor);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        Context context2 = this.itemView.getContext();
        Intrinsics.h(context2);
        or0.u.w(kli.a.k(context2, 44.0f), (Space) viewFindViewById4);
        or0.u.z(imageView, 0, 0, kli.a.k(context2, 12.0f), 0, false, 27);
        ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (layoutParams2.topToTop != 0 || layoutParams2.bottomToTop != 0 || layoutParams2.startToEnd != 0 || layoutParams2.endToEnd != 0) {
            ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.topToTop = 0;
            layoutParams4.bottomToTop = 0;
            layoutParams4.startToEnd = 0;
            layoutParams4.endToEnd = 0;
            imageView2.setLayoutParams(layoutParams4);
        }
        int iK = kli.a.k(context2, 6.0f);
        if (imageView2.getPaddingStart() != 0 || imageView2.getPaddingTop() != iK || imageView2.getPaddingEnd() != iK || imageView2.getPaddingBottom() != 0) {
            imageView2.setPaddingRelative(0, iK, iK, 0);
        }
        View viewFindViewById5 = itemView.findViewById(R$id.navBarMenuItem_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f9199m = (ImageView) viewFindViewById5;
        fp0.m mVar = fp0.p.Companion;
        gp0.g gVar = new gp0.g(0);
        mVar.getClass();
        this.f9200n = fp0.m.a(itemView, gVar);
    }

    public final void F(tx0.p0 appearance) {
        int iS;
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        this.f9195g = appearance;
        int iN = N(this.i);
        Integer numA = this.f9195g.a();
        if (numA == null) {
            iS = this.f9196h;
        } else {
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iS = kli.a.s(numA.intValue(), context);
        }
        this.f9199m.setColorFilter(iN);
        this.f9197j.setColorFilter(iN);
        this.f.d(iN, iS);
    }

    public final void H(NavBarMenuItemBadge badge) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        String f59310a = badge.getF59310a();
        this.k.setVisibility(badge.a() ? 0 : 8);
        int i = f59310a != null ? 0 : 8;
        TextView textView = this.f9198l;
        textView.setVisibility(i);
        if (f59310a != null) {
            textView.setText(f59310a);
        }
    }

    public final void I(Rect outRect, View view, int i, int i2) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        outRect.right = i;
        outRect.left = i2;
    }

    public final void J(tx0.r0 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        Context context = this.itemView.getContext();
        Intrinsics.h(context);
        or0.u.z(this.f9199m, kli.a.k(context, style.c()), 0, kli.a.k(context, style.b()), 0, false, 26);
        this.f9197j.setVisibility(style.a() ? 0 : 8);
    }

    public final fp0.p K() {
        return this.f9200n;
    }

    public final ImageView M() {
        return this.f9199m;
    }

    public final int N(int i) {
        Integer numB = this.f9195g.b();
        if (numB == null) {
            return i;
        }
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return kli.a.s(numB.intValue(), context);
    }

    @Override // jr0.i
    public final jr0.g getGlowHighlightManager() {
        jr0.f fVar = jr0.g.Companion;
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        fVar.getClass();
        return jr0.f.a(itemView);
    }

    @Override // au0.o3
    public final void i(int i) {
        int iN = N(i);
        this.f9199m.setColorFilter(iN);
        ImageView imageView = this.f9197j;
        imageView.setColorFilter(iN);
        imageView.setAlpha(0.6f);
    }

    @Override // au0.x2
    public final void o(int i, Integer num) {
        Integer numA = this.f9195g.a();
        RoundedBackgroundDrawable roundedBackgroundDrawable = this.f;
        if (numA == null) {
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            uj3.b.a(roundedBackgroundDrawable, context, i, num);
        } else {
            int iN = N(num != null ? num.intValue() : this.i);
            Context context2 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            roundedBackgroundDrawable.d(iN, kli.a.s(numA.intValue(), context2));
        }
    }

    @Override // dr0.v
    public final void q(boolean z) {
        this.f.q(z);
    }

    @Override // au0.x2
    public final void s(aw0.v1 colorScheme) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.f.a(colorScheme);
    }
}
