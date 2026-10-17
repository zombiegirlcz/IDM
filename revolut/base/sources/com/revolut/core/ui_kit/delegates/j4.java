package com.revolut.core.ui_kit.delegates;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j4 extends com.revolut.core.ui_kit.delegates.chat.a {
    public final ms0.d0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ms0.d0 f54319p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ihm.f f54320q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public aw0.x2 f54321r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(ChatSwipeToReplyLayout itemView, ms0.d0 barChartView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(barChartView, "barChartView");
        this.o = barChartView;
        this.f54319p = barChartView;
        efm.r rVarHide = barChartView.f208218b.f56682r0.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        rVarHide.subscribe(new ip0.a9(new ip0.ad(this, 0), 18));
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.a
    public final View I() {
        return this.f54319p;
    }
}
