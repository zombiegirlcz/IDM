package ip0;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.drawables.LineOfDotsDrawable;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class om0 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final OverlappedIconsView f165679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f165680h;
    public final ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f165681j;
    public final ImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f165682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f165683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f165684n;
    public final TextView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f165685p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f165686q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f165687r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f165688s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f165689t;
    public final TextView u;
    public final TextView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f165690w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f165691x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f165692y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.triDetails_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = itemView.findViewById(R$id.triDetails_startLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.triDetails_startLabelImages);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f165679g = (OverlappedIconsView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.triDetails_endLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f165680h = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.triDetails_endLabelImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.i = (ImageView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.triDetails_startHeading);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f165681j = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.triDetails_startHeadingImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.k = (ImageView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.triDetails_endHeading);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f165682l = (TextView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.triDetails_endHeadingImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f165683m = (ImageView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.triDetails_endSuperscriptHeading);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.f165684n = (TextView) viewFindViewById10;
        View viewFindViewById11 = itemView.findViewById(R$id.triDetails_middleLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.o = (TextView) viewFindViewById11;
        View viewFindViewById12 = itemView.findViewById(R$id.triDetails_startSubHeading);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f165685p = (TextView) viewFindViewById12;
        View viewFindViewById13 = itemView.findViewById(R$id.triDetails_middleBottomLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.f165686q = (TextView) viewFindViewById13;
        View viewFindViewById14 = itemView.findViewById(R$id.triDetails_endSubHeading);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        this.f165687r = (TextView) viewFindViewById14;
        View viewFindViewById15 = itemView.findViewById(R$id.triDetails_startFooterFirstSubtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        this.f165688s = (TextView) viewFindViewById15;
        View viewFindViewById16 = itemView.findViewById(R$id.triDetails_endFooterFirstSubtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        this.f165689t = (TextView) viewFindViewById16;
        View viewFindViewById17 = itemView.findViewById(R$id.triDetails_startFooterSecondSubtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "findViewById(...)");
        this.u = (TextView) viewFindViewById17;
        View viewFindViewById18 = itemView.findViewById(R$id.triDetails_endFooterSecondSubtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById18, "findViewById(...)");
        this.v = (TextView) viewFindViewById18;
        View viewFindViewById19 = itemView.findViewById(R$id.triDetails_priceFooterStart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById19, "findViewById(...)");
        this.f165690w = (TextView) viewFindViewById19;
        View viewFindViewById20 = itemView.findViewById(R$id.triDetails_priceFooterPointsAmount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById20, "findViewById(...)");
        this.f165691x = (TextView) viewFindViewById20;
        View viewFindViewById21 = itemView.findViewById(R$id.triDetails_priceFooterFiat);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById21, "findViewById(...)");
        this.f165692y = (TextView) viewFindViewById21;
        ImageView imageView = (ImageView) itemView.findViewById(R$id.triDetails_startLineOfDots);
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        sp0.l lVar = sp0.l.LIGHT_TO_DARK;
        sp0.k kVar = sp0.k.HORIZONTAL;
        imageView.setBackground(new LineOfDotsDrawable(context, lVar, kVar));
        ImageView imageView2 = (ImageView) itemView.findViewById(R$id.triDetails_endLineOfDots);
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        imageView2.setBackground(new LineOfDotsDrawable(context2, sp0.l.DARK_TO_LIGHT, kVar));
    }
}
