package com.revolut.core.ui_kit.internal.views;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f57237g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ViewGroup parent) {
        super(s.r(parent, R$layout.internal_tooltip_view_row));
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewFindViewById = this.itemView.findViewById(R$id.tooltipRow_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R$id.tooltipRow_value);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f57237g = (TextView) viewFindViewById2;
    }
}
