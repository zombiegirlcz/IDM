package com.revolut.core.ui_kit.delegates.widgets;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView;
import com.revolut.recyclerkit.UIKitRecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p4 extends op0.p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final UIKitRecyclerView f55468j;
    public final ScrollingPagerIndicatorView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final UIKitTextView f55469l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fp0.p f55470m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z4l.j f55471n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ood.k f55472p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o4 f55473q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(View itemView, UIKitRecyclerView recyclerView, ScrollingPagerIndicatorView indicator, UIKitTextView titleView, fp0.p titleClickHandler, z4l.j innerAdapter, ok7.c itemDelegateEvents, int i, RecyclerView recyclerView2, bs0.c snapHelper, ok7.c onHintPlayed) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        Intrinsics.checkNotNullParameter(titleView, "titleView");
        Intrinsics.checkNotNullParameter(titleClickHandler, "titleClickHandler");
        Intrinsics.checkNotNullParameter(innerAdapter, "innerAdapter");
        Intrinsics.checkNotNullParameter(itemDelegateEvents, "itemDelegateEvents");
        Intrinsics.checkNotNullParameter(snapHelper, "snapHelper");
        Intrinsics.checkNotNullParameter(onHintPlayed, "onHintPlayed");
        this.f55468j = recyclerView;
        this.k = indicator;
        this.f55469l = titleView;
        this.f55470m = titleClickHandler;
        this.f55471n = innerAdapter;
        this.o = i;
        ifm.b bVar = new ifm.b();
        this.f55473q = new o4(recyclerView, itemView, recyclerView2, snapHelper, onHintPlayed);
        bVar.a(((efm.r) itemDelegateEvents.invoke(this)).filter(new op0.o3(10, new op0.o4(this, 1))).subscribe(new op0.o3(11, new op0.o4(this, 2))));
    }
}
