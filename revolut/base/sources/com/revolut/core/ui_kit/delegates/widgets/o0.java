package com.revolut.core.ui_kit.delegates.widgets;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.recyclerkit.UIKitRecyclerView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o0 extends op0.p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z4l.j f55445j;
    public ood.k k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(View itemView, BaseRecyclerViewDelegate tileDelegate, ood.k tileDelegateEvents) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(tileDelegate, "tileDelegate");
        Intrinsics.checkNotNullParameter(tileDelegateEvents, "tileDelegateEvents");
        View viewFindViewById = itemView.findViewById(R$id.containerWidget_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        UIKitRecyclerView uIKitRecyclerView = (UIKitRecyclerView) viewFindViewById;
        z4l.j jVar = new z4l.j(7, zhm.u.c(tileDelegate), false);
        this.f55445j = jVar;
        uIKitRecyclerView.setAdapter(jVar);
        uIKitRecyclerView.setLayoutManager(new ContainerWidgetDelegate$ViewHolder$initialiseRecyclerView$1$1(this.itemView.getContext()));
        uIKitRecyclerView.setNestedScrollingEnabled(false);
        uIKitRecyclerView.setConsumeTouchEvents(false);
        ((efm.r) tileDelegateEvents.invoke(this)).filter(new op0.x(7, new op0.f1(this, 0))).subscribe(new op0.x(8, new op0.f1(this, 1)));
    }
}
