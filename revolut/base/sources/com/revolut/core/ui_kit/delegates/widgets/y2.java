package com.revolut.core.ui_kit.delegates.widgets;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.PhotoBannerLargeDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y2 extends op0.p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RecyclerView f55556j;
    public final z4l.j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ood.k f55557l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PhotoBannerLargeDelegate.Model f55558m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(View itemView, ScrollerDelegate scrollerDelegate, ok7.c itemDelegateEvents) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(scrollerDelegate, "scrollerDelegate");
        Intrinsics.checkNotNullParameter(itemDelegateEvents, "itemDelegateEvents");
        View viewFindViewById = itemView.findViewById(R$id.horizontalScrollerWidget_recycler);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f55556j = recyclerView;
        z4l.j jVar = new z4l.j(7, zhm.u.c(scrollerDelegate), false);
        this.k = jVar;
        recyclerView.setAdapter(jVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(itemView.getContext()));
        recyclerView.setNestedScrollingEnabled(false);
        ((efm.r) itemDelegateEvents.invoke(this)).filter(new op0.x(28, new op0.j3(this, 2))).subscribe(new op0.x(29, new op0.j3(this, 3)));
        scrollerDelegate.q().subscribe(new op0.o3(0, new op0.j3(this, 4)));
    }
}
