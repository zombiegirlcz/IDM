package com.revolut.core.ui_kit.delegates;

import android.view.View;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class sc extends koi.b {
    public final ShimmerConstraintLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f54712g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.viewProgressTimelineLoadingStep_shimmerLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerConstraintLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.viewProgressTimelineLoadingStep_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f54712g = viewFindViewById2;
    }
}
