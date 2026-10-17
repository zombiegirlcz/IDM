package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import ip0.e30;
import ip0.w10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ge extends koi.b {
    public final SmallActionButton f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w10 f54218g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(SmallActionButton itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "button");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
        itemView.i(ms0.h4.SEMIACCENT);
        itemView.f56386h.subscribe(new e30(new w10(this, 9), 15));
    }
}
