package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class jh extends koi.b {
    public final zq0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f54338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f54339h;
    public final ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f54340j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f54341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f54342m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f54343n;
    public final ImageView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ShimmerFrameLayout f54344p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final View f54345q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f54346r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final fp0.p f54347s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fp0.p f54348t;
    public final fp0.p u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.splitColumnCell_titleValueDividerGuideline);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = new zq0.d((Guideline) viewFindViewById);
        View viewFindViewById2 = itemView.findViewById(R$id.splitColumnCell_titleText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f54338g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.splitColumnCell_subtitleText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f54339h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.splitColumnCell_titleStartIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (ImageView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.splitColumnCell_titleEndIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f54340j = (ImageView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.splitColumnCell_valueText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.splitColumnCell_valueIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f54341l = (ImageView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.splitColumnCell_valueCardImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f54342m = (ImageView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.splitColumnCell_valueActionText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById9;
        this.f54343n = textView;
        View viewFindViewById10 = itemView.findViewById(R$id.splitColumnCell_valueActionIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById10;
        this.o = imageView;
        View viewFindViewById11 = itemView.findViewById(R$id.splitColumnCell_valueShimmeringView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f54344p = (ShimmerFrameLayout) viewFindViewById11;
        View viewFindViewById12 = itemView.findViewById(R$id.splitColumnCell_titleBackgroundContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f54345q = viewFindViewById12;
        View viewFindViewById13 = itemView.findViewById(R$id.splitColumnCell_valueBackgroundContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.f54346r = viewFindViewById13;
        fp0.p.Companion.getClass();
        gp0.b bVar = gp0.b.f145198a;
        this.f54347s = fp0.m.a(textView, bVar);
        this.f54348t = fp0.m.a(imageView, bVar);
        this.u = fp0.m.a(itemView, new gp0.g(fp0.b.f137017a));
    }
}
