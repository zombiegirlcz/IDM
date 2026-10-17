package com.revolut.core.ui_kit.delegates;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z0 extends koi.b {
    public final UIKitTextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UIKitTextView f55659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final UIKitTextView f55660h;
    public final UIKitTextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final UIKitTextView f55661j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.attributeWide_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (UIKitTextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.attributeWide_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f55659g = (UIKitTextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.attributeWide_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f55660h = (UIKitTextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.attributeWide_valuePrimary);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (UIKitTextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.attributeWide_valueSecondary);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f55661j = (UIKitTextView) viewFindViewById5;
    }
}
