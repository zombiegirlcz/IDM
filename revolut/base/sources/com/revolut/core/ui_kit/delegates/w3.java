package com.revolut.core.ui_kit.delegates;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.CircleActionView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w3 extends koi.b {
    public final CircleActionView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (CircleActionView) itemView;
    }
}
