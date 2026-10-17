package ip0;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.RatingCell;
import com.revolut.core.ui_kit.internal.views.navbar.ImageDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.views.DoubleTagView;
import com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class pu extends koi.b {
    public final View A;
    public final TextView B;
    public final TextView C;
    public final View D;
    public final View E;
    public final fp0.p F;
    public final fp0.p G;
    public final ColorDrawable H;
    public final Lazy I;
    public final Lazy J;
    public final Lazy K;
    public final z4l.j L;
    public boolean M;
    public ju N;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f165868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f165869h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f165870j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f165871l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f165872m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fp0.p f165873n;
    public final TextView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DoubleTagView f165874p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final View f165875q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f165876r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f165877s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f165878t;
    public final ViewPager2 u;
    public final ScrollingPagerIndicatorView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TagView f165879w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TagView f165880x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final RatingCell f165881y;
    public final TextView z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.listingCard_titleText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.listingCard_subtitleText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165868g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.listingCard_subtitleImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f165869h = (ImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.cellDetailsPrice_price);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.cellDetailsPrice_strikethroughPrice);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f165870j = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.cellDetailsPrice_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById6;
        this.k = textView;
        View viewFindViewById7 = itemView.findViewById(R$id.listingCard_descriptionText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f165871l = (TextView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.listingCard_topRightImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById8;
        this.f165872m = imageView;
        fp0.m mVar = fp0.p.Companion;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        hp0.c cVar = new hp0.c(null, dr0.l.c(context, new Color.Solid(R$attr.uikit_colorForeground)), 1);
        gp0.c cVar2 = gp0.c.FOREGROUND;
        gp0.h hVar = new gp0.h(cVar, new gp0.f(cVar2, 2), new fp0.g(new Color.Solid(R$attr.uikit_colorWhite)));
        mVar.getClass();
        this.f165873n = fp0.m.a(imageView, hVar);
        View viewFindViewById9 = itemView.findViewById(R$id.cellDetailsBadge_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.o = (TextView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.cellDetailsBadge_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.f165874p = (DoubleTagView) viewFindViewById10;
        View viewFindViewById11 = itemView.findViewById(R$id.listingCard_revPoints);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f165875q = viewFindViewById11;
        View viewFindViewById12 = itemView.findViewById(R$id.listingCardRevPoints_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f165876r = (TextView) viewFindViewById12;
        View viewFindViewById13 = itemView.findViewById(R$id.listingCardRevPoints_price);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.f165877s = (TextView) viewFindViewById13;
        View viewFindViewById14 = itemView.findViewById(R$id.listingCardRevPoints_points);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        this.f165878t = (TextView) viewFindViewById14;
        View viewFindViewById15 = itemView.findViewById(R$id.listingCard_viewPager);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        ViewPager2 viewPager2 = (ViewPager2) viewFindViewById15;
        this.u = viewPager2;
        View viewFindViewById16 = itemView.findViewById(R$id.listingCard_paginationDots);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        this.v = (ScrollingPagerIndicatorView) viewFindViewById16;
        View viewFindViewById17 = itemView.findViewById(R$id.listingCard_badge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "findViewById(...)");
        this.f165879w = (TagView) viewFindViewById17;
        View viewFindViewById18 = itemView.findViewById(R$id.listingCard_secondBadge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById18, "findViewById(...)");
        this.f165880x = (TagView) viewFindViewById18;
        View viewFindViewById19 = itemView.findViewById(R$id.listingCard_ratingView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById19, "findViewById(...)");
        RatingCell ratingCell = (RatingCell) viewFindViewById19;
        this.f165881y = ratingCell;
        View viewFindViewById20 = itemView.findViewById(R$id.listingCard_additionalInfoText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById20, "findViewById(...)");
        this.z = (TextView) viewFindViewById20;
        View viewFindViewById21 = itemView.findViewById(R$id.listingCard_textDetails);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById21, "findViewById(...)");
        this.A = viewFindViewById21;
        View viewFindViewById22 = itemView.findViewById(R$id.listingCard_detailsTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById22, "findViewById(...)");
        this.B = (TextView) viewFindViewById22;
        View viewFindViewById23 = itemView.findViewById(R$id.listingCard_detailsEndText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById23, "findViewById(...)");
        this.C = (TextView) viewFindViewById23;
        View viewFindViewById24 = itemView.findViewById(R$id.listingCard_backgroundImageOverlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById24, "findViewById(...)");
        this.D = viewFindViewById24;
        View viewFindViewById25 = itemView.findViewById(R$id.listingCard_blurOverlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById25, "findViewById(...)");
        this.E = viewFindViewById25;
        this.F = fp0.m.a(itemView, new gp0.h(new gp0.f(cVar2, 2), new fp0.g(new Color.Solid(R$attr.uikit_colorWhite))));
        this.G = fp0.m.a(textView, gp0.b.f145198a);
        this.H = new ColorDrawable();
        this.I = yhm.j.b(new ie7.a(this, 12));
        this.J = yhm.j.b(new il9.p(20));
        this.K = yhm.j.b(new md(this, itemView, 2));
        ImageDelegate imageDelegate = new ImageDelegate();
        koi.c cVar3 = new koi.c(0);
        cVar3.a(imageDelegate);
        z4l.j jVar = new z4l.j(cVar3, false, 14);
        this.L = jVar;
        this.N = ju.NO_BLUR;
        viewPager2.setAdapter(jVar);
        RecyclerView recyclerViewA = yp0.j0.a(viewPager2);
        recyclerViewA.setNestedScrollingEnabled(false);
        recyclerViewA.setOverScrollMode(2);
        Intrinsics.checkNotNullParameter(viewPager2, "<this>");
        yp0.j0.a(viewPager2).addOnItemTouchListener(new yp0.i0(viewPager2));
        viewPager2.registerOnPageChangeCallback(new nu(this));
        ratingCell.setEditable$ui_kit_components_release(false);
    }

    public final void F(int i, int i2, int i3) {
        this.f.setTextColor(i);
        this.f165868g.setTextColor(i2);
        rd0.e.q(this.f165869h, Integer.valueOf(i));
        this.z.setTextColor(i2);
        this.f165871l.setTextColor(i2);
        this.i.setTextColor(i);
        this.f165870j.setTextColor(i3);
        this.k.setTextColor(i2);
        this.f165876r.setTextColor(i2);
        this.f165877s.setTextColor(i);
        this.f165878t.setTextColor(i3);
        this.o.setTextColor(i2);
        this.B.setTextColor(i2);
        this.C.setTextColor(i);
        this.f165881y.setColors$ui_kit_components_release(i, i, i3);
    }

    public final void H(ku data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ju juVar = data.v;
        this.N = juVar;
        int i = ou.f165729a[juVar.ordinal()];
        View view = this.D;
        ViewPager2 viewPager2 = this.u;
        View view2 = this.E;
        if (i == 1) {
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iS = kli.a.s(R$attr.uikit_colorForeground, context);
            Context context2 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iS2 = kli.a.s(R$attr.uikit_colorGreyTone50, context2);
            F(iS, iS2, iS2);
            view2.setBackground(null);
            viewPager2.setForeground(null);
            view.setVisibility(0);
            view2.setVisibility(8);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Context context3 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int iS3 = kli.a.s(R$attr.uikit_colorWhite, context3);
        F(iS3, io0.a.d(0.7f, iS3), io0.a.d(0.5f, iS3));
        view2.setBackground((LayerDrawable) this.I.getValue());
        viewPager2.setForeground((LayerDrawable) this.K.getValue());
        view.setVisibility(8);
        view2.setVisibility(0);
        I(viewPager2.getCurrentItem());
    }

    public final void I(int i) {
        Image image;
        z4l.j jVar = this.L;
        if (i >= jVar.f319395l.size()) {
            return;
        }
        koi.j jVarA = jVar.a(i);
        au0.c2 c2Var = jVarA instanceof au0.c2 ? (au0.c2) jVarA : null;
        if (c2Var == null || (image = c2Var.f9155a) == null) {
            return;
        }
        yy0.f fVarQ = or0.u.k(this.E).Q();
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ad adVar = new ad(this, 21);
        yy0.e eVar = yy0.f.Companion;
        fVarQ.c(image, context, 0, 0, adVar, null);
    }

    public final void J(List imagesList) {
        Intrinsics.checkNotNullParameter(imagesList, "imagesList");
        List<Image> list = imagesList;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (Image image : list) {
            arrayList.add(new au0.c2(image, image.toString(), 12));
        }
        this.L.c(arrayList);
        boolean zIsEmpty = imagesList.isEmpty();
        ScrollingPagerIndicatorView scrollingPagerIndicatorView = this.v;
        if (!zIsEmpty && !this.M) {
            scrollingPagerIndicatorView.P(this.u);
            Context context = scrollingPagerIndicatorView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            scrollingPagerIndicatorView.setDotColor(kli.a.s(R$attr.uikit_colorWhite_70, context));
            Context context2 = scrollingPagerIndicatorView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            scrollingPagerIndicatorView.setSelectedDotColor(kli.a.s(R$attr.uikit_colorWhite, context2));
            this.M = true;
        }
        scrollingPagerIndicatorView.setVisibility(!zIsEmpty ? 0 : 8);
    }
}
