package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.LabelView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z5 extends koi.b {
    public final LabelView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f55674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f55675h;
    public final TextView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.expandableCell_titleLabel);
        LabelView labelView = (LabelView) viewFindViewById;
        ExpandableCellDelegate.Companion.getClass();
        labelView.setEndIcon(ExpandableCellDelegate.f);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "apply(...)");
        this.f = labelView;
        View viewFindViewById2 = itemView.findViewById(R$id.expandableCell_txtDescription);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f55674g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.expandableCell_valueImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f55675h = (ImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.expandableCell_txtValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
    }
}
