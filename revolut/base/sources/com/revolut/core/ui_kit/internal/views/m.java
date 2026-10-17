package com.revolut.core.ui_kit.internal.views;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends koi.b {
    public final TextView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ViewGroup parent) {
        super(s.r(parent, R$layout.internal_tooltip_view_header));
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewFindViewById = this.itemView.findViewById(R$id.tooltipHeader_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
    }
}
