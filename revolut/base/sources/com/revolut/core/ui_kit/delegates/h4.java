package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h4 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f54229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f54230h;
    public final Group i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f54231j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.comparisonCellHeadingDelegate_firstText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.comparisonCellHeadingDelegate_secondText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f54229g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.comparisonCellHeadingDelegate_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f54230h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.comparisonCellHeadingDelegate_multiGroup);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (Group) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.comparisonCellHeadingDelegate_bottomDivider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f54231j = viewFindViewById5;
    }
}
