package com.revolut.core.ui_kit.delegates.widgets;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.navbar.ConstraintHeaderLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends koi.b implements op0.y {
    public final ConstraintHeaderLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f55399g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.rowsWidgetBigHeader_headerLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ConstraintHeaderLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.rowsWidgetBigHeader_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f55399g = (TextView) viewFindViewById2;
    }

    @Override // op0.y
    public final int r() {
        int height = this.itemView.getHeight();
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return kli.a.k(context, 4.0f) + height;
    }
}
