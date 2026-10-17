package com.revolut.core.ui_kit.delegates;

import android.view.View;
import com.revolut.core.ui_kit.delegates.ContextualLineChartDelegate;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import ip0.oe0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l4 extends com.revolut.core.ui_kit.delegates.chat.a {
    public final ms0.f0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ms0.f0 f54417p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ihm.f f54418q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ContextualLineChartDelegate.Model f54419r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public aw0.z2 f54420s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final bt0.n f54421t;
    public Integer u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(ChatSwipeToReplyLayout itemView, ms0.f0 lineChartView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(lineChartView, "lineChartView");
        this.o = lineChartView;
        this.f54417p = lineChartView;
        this.f54421t = new bt0.n(oe0.ALWAYS, 0);
        lineChartView.getChartView$ui_kit_components_release().getObserveScrollingStateChanges().m(new ip0.a9(new ip0.ad(this, 1), 19), mfm.f.e, mfm.f.f205043c, qfm.e1.INSTANCE);
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.a
    public final View I() {
        return this.f54417p;
    }
}
