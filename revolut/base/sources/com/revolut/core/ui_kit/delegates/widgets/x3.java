package com.revolut.core.ui_kit.delegates.widgets;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x3 extends koi.b {
    public final ShimmerFrameLayout f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.internalDelegateVerticalListLoadingItemSmall_shimmer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerFrameLayout) viewFindViewById;
    }
}
