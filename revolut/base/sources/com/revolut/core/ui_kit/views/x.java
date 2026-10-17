package com.revolut.core.ui_kit.views;

import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class x extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f59768g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (TextView) itemView.findViewById(R$id.text_label);
        this.f59768g = (TextView) itemView.findViewById(R$id.ticker_disabledLabel);
    }
}
