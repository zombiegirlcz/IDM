package com.revolut.core.ui_kit.delegates;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.ContextualSegmentedBarView;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n4 extends com.revolut.core.ui_kit.delegates.chat.a {
    public final ContextualSegmentedBarView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ContextualSegmentedBarView f54493p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ihm.f f54494q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public aw0.c3 f54495r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(ChatSwipeToReplyLayout itemView, ContextualSegmentedBarView segmentedBarView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(segmentedBarView, "segmentedBarView");
        this.o = segmentedBarView;
        this.f54493p = segmentedBarView;
        segmentedBarView.setSelectionListener(new ip0.ad(this, 2));
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.a
    public final View I() {
        return this.f54493p;
    }
}
