package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.revpoints.RevPointsPriceView;
import com.revolut.core.ui_kit.views.DoubleTagView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.flexbox.FlexboxLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class wg extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f167008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f167009h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f167010j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f167011l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final DoubleTagView f167012m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View f167013n;
    public final TextView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RevPointsPriceView f167014p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LargeActionButton f167015q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinearLayout f167016r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final FlexboxLayout f167017s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f167018t;
    public final TextView u;
    public final TextView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final View f167019w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final View f167020x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final fp0.p f167021y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.extraLargeListingCard_headerImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.extraLargeListingCard_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f167008g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.extraLargeListingCard_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f167009h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.cellDetailsPrice_price);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.cellDetailsPrice_strikethroughPrice);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f167010j = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.cellDetailsPrice_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById6;
        this.k = textView;
        View viewFindViewById7 = itemView.findViewById(R$id.cellDetailsBadge_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f167011l = (TextView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.cellDetailsBadge_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f167012m = (DoubleTagView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.extraLargeListingCard_revPoints);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f167013n = viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.cellDetailsRevPoints_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.o = (TextView) viewFindViewById10;
        View viewFindViewById11 = itemView.findViewById(R$id.cellDetailsRevPoints_price);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f167014p = (RevPointsPriceView) viewFindViewById11;
        View viewFindViewById12 = itemView.findViewById(R$id.extraLargeListingCard_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f167015q = (LargeActionButton) viewFindViewById12;
        View viewFindViewById13 = itemView.findViewById(R$id.extraLargeListingCard_toDoItems);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.f167016r = (LinearLayout) viewFindViewById13;
        View viewFindViewById14 = itemView.findViewById(R$id.extraLargeListingCard_topBadgeContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        this.f167017s = (FlexboxLayout) viewFindViewById14;
        View viewFindViewById15 = itemView.findViewById(R$id.extraLargeListingCard_textDetails);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        this.f167018t = viewFindViewById15;
        View viewFindViewById16 = itemView.findViewById(R$id.listingCard_detailsTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        this.u = (TextView) viewFindViewById16;
        View viewFindViewById17 = itemView.findViewById(R$id.listingCard_detailsEndText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "findViewById(...)");
        this.v = (TextView) viewFindViewById17;
        View viewFindViewById18 = itemView.findViewById(R$id.extraLargeListingCard_priceDetails);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById18, "findViewById(...)");
        this.f167019w = viewFindViewById18;
        View viewFindViewById19 = itemView.findViewById(R$id.extraLargeListingCard_cashbackDetails);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById19, "findViewById(...)");
        this.f167020x = viewFindViewById19;
        fp0.m mVar = fp0.p.Companion;
        gp0.h hVar = new gp0.h(new gp0.f(gp0.c.FOREGROUND, 2), new fp0.g(new Color.Solid(R$attr.uikit_colorWhite)));
        mVar.getClass();
        this.f167021y = fp0.m.a(textView, hVar);
    }
}
