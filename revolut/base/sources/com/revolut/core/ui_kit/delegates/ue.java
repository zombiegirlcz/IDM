package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.recyclerkit.AdaptiveGridLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ue extends koi.b {
    public final RecyclerView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z4l.j f54832g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue(RewardsGridDelegate rewardsGridDelegate, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.rewardsGrid_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f = recyclerView;
        z4l.j jVar = new z4l.j(7, zhm.u.c(rewardsGridDelegate.f53209c), false);
        this.f54832g = jVar;
        int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(itemView, "getContext(...)", 4.0f);
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        tw0.b bVar = new tw0.b(((context.getResources().getDisplayMetrics().widthPixels / 4) - kli.a.k(context, 72.0f)) / 2, iA, 12);
        recyclerView.setAdapter(jVar);
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        AdaptiveGridLayoutManager adaptiveGridLayoutManager = new AdaptiveGridLayoutManager(context2);
        adaptiveGridLayoutManager.setMeasurementCacheEnabled(false);
        recyclerView.setLayoutManager(adaptiveGridLayoutManager);
        recyclerView.addItemDecoration(bVar);
        recyclerView.setNestedScrollingEnabled(false);
    }
}
