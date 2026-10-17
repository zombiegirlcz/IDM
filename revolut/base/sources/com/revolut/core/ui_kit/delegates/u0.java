package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u0 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f54795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f54796h;
    public final AppCompatImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f54797j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.attributeSelectorSmall_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.attributeSelectorSmall_subTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f54795g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.attributeSelectorSmall_background);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f54796h = viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.attributeSelectorSmall_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (AppCompatImageView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.attributeSelectorSmall_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f54797j = (TextView) viewFindViewById5;
    }
}
