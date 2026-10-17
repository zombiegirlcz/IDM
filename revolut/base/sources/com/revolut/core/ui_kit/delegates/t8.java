package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.flexbox.FlexboxLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t8 extends koi.b {
    public final TextView A;
    public final fp0.p B;
    public final fp0.p C;
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ViewStub f54745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ViewStub f54746h;
    public ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f54747j;
    public Float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public r8 f54748l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Boolean f54749m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f54750n;
    public Boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Integer f54751p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f54752q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ImageView f54753r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ImageView f54754s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f54755t;
    public final TextView u;
    public final TextView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final FlexboxLayout f54756w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ActionsView f54757x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ConstraintLayout f54758y;
    public final TextView z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.listingCardBasic_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.listingCardBasic_addNewIconStub);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f54745g = (ViewStub) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.listingCardBasic_addNewOutlineStub);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f54746h = (ViewStub) viewFindViewById3;
        this.f54752q = yhm.j.c(yhm.k.NONE, new ie7.a(this, 11));
        View viewFindViewById4 = itemView.findViewById(R$id.listingCardBasic_topRightIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById4;
        this.f54753r = imageView;
        View viewFindViewById5 = itemView.findViewById(R$id.listingCardBasic_topInfoIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f54754s = (ImageView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.listingCardBasic_topInfoText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f54755t = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.listingCardBasic_titleText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.u = (TextView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.listingCardBasic_descriptionText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.v = (TextView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.listingCardBasic_tagsContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f54756w = (FlexboxLayout) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.listingCardBasic_actionsView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        ActionsView actionsView = (ActionsView) viewFindViewById10;
        this.f54757x = actionsView;
        View viewFindViewById11 = itemView.findViewById(R$id.listingCardBasic_priceContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f54758y = (ConstraintLayout) viewFindViewById11;
        View viewFindViewById12 = itemView.findViewById(R$id.listingCardBasic_priceText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.z = (TextView) viewFindViewById12;
        View viewFindViewById13 = itemView.findViewById(R$id.listingCardBasic_priceDescriptionText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.A = (TextView) viewFindViewById13;
        fp0.m mVar = fp0.p.Companion;
        gp0.g gVar = new gp0.g(fp0.b.f137017a);
        mVar.getClass();
        this.B = fp0.m.a(itemView, gVar);
        this.C = fp0.m.a(imageView, gp0.b.f145198a);
        actionsView.setLayoutType(mx0.l.DYNAMIC_MORE);
    }
}
