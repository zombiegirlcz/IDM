package com.revolut.core.ui_kit.delegates.widgets;

import android.view.View;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l extends koi.b implements op0.y {
    public final ShimmerFrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f55409g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.rowsWidgetBigHeaderLoading_shimmeringView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerFrameLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.rowsWidgetBigHeaderLoading_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f55409g = (TextView) viewFindViewById2;
    }

    @Override // op0.y
    public final int r() {
        return this.itemView.getHeight();
    }
}
