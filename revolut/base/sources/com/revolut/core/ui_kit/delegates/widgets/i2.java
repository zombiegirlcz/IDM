package com.revolut.core.ui_kit.delegates.widgets;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.recyclerkit.UIKitRecyclerView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i2 extends op0.p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final UIKitRecyclerView f55379j;
    public final z4l.j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ood.k f55380l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(View itemView, List itemDelegates, ood.k itemDelegateEvents) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(itemDelegates, "itemDelegates");
        Intrinsics.checkNotNullParameter(itemDelegateEvents, "itemDelegateEvents");
        View viewFindViewById = itemView.findViewById(R$id.horizontalScrollerWidget_recycler);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        UIKitRecyclerView uIKitRecyclerView = (UIKitRecyclerView) viewFindViewById;
        this.f55379j = uIKitRecyclerView;
        z4l.j jVar = new z4l.j(7, zhm.v.k(new ListSubheaderDelegate(), new ScrollerDelegate(itemDelegates, false)), false);
        this.k = jVar;
        uIKitRecyclerView.setAdapter(jVar);
        uIKitRecyclerView.setNestedScrollingEnabled(false);
        uIKitRecyclerView.setConsumeTouchEvents(false);
        ((efm.r) itemDelegateEvents.invoke(this)).filter(new op0.x(18, new op0.m2(this, 0))).subscribe(new op0.x(19, new op0.m2(this, 1)));
    }
}
