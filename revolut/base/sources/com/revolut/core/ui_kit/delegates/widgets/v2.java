package com.revolut.core.ui_kit.delegates.widgets;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.LabelButtonView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v2 extends op0.p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f55530j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f55531l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f55532m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LabelButtonView f55533n;
    public final fp0.p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ConstraintLayout f55534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public oa2.b f55535q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.paymentLinkWidget_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        this.f55530j = imageView;
        View viewFindViewById2 = itemView.findViewById(R$id.paymentLinkWidget_imageActionText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.k = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.paymentLinkWidget_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f55531l = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.paymentLinkWidget_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f55532m = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.paymentLinkWidget_actionButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        LabelButtonView labelButtonView = (LabelButtonView) viewFindViewById5;
        this.f55533n = labelButtonView;
        fp0.m mVar = fp0.p.Companion;
        gp0.g gVar = new gp0.g(0);
        mVar.getClass();
        this.o = fp0.m.a(imageView, gVar);
        this.f55534p = (ConstraintLayout) itemView.findViewById(R$id.paymentLinkWidget_constraintLayout);
        labelButtonView.d.subscribe(new op0.x(25, new ok7.c(this, 21)));
    }
}
