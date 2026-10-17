package com.revolut.core.ui_kit.delegates.widgets;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate;
import com.revolut.recyclerkit.UIKitRecyclerView;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class m extends op0.p implements op0.o {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ListSubheaderDelegate f55421j;
    public final BaseDynamicWidgetDelegate.BigHeaderDelegate k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LargeActionButtonDelegate f55422l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f55423m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f55424n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final UIKitRecyclerView f55425p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f55426q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Function1 f55427r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f55421j = new ListSubheaderDelegate();
        this.k = new BaseDynamicWidgetDelegate.BigHeaderDelegate();
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.f55422l = largeActionButtonDelegate;
        View viewFindViewById = itemView.findViewById(R$id.dynamicWidget_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f55425p = (UIKitRecyclerView) viewFindViewById;
        this.f55426q = te0.w.y0(new o10.c(this, 24));
        largeActionButtonDelegate.d.f121375b.subscribe(new op0.x(0, new ok7.c(this, 17)));
    }

    public abstract List H();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void I() {
        z4l.j jVar = (z4l.j) this.f55426q.getValue();
        UIKitRecyclerView uIKitRecyclerView = this.f55425p;
        uIKitRecyclerView.setAdapter(jVar);
        uIKitRecyclerView.setNestedScrollingEnabled(false);
        uIKitRecyclerView.setConsumeTouchEvents(false);
        uIKitRecyclerView.addItemDecoration(new o31.b());
    }

    public void J(op0.q widgetSize) {
        Intrinsics.checkNotNullParameter(widgetSize, "widgetSize");
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.itemView.getContext());
        UIKitRecyclerView uIKitRecyclerView = this.f55425p;
        uIKitRecyclerView.setLayoutManager(linearLayoutManager);
        uIKitRecyclerView.setClipToPadding(false);
        uIKitRecyclerView.setPadding(uIKitRecyclerView.getPaddingLeft(), uIKitRecyclerView.getPaddingTop(), uIKitRecyclerView.getPaddingRight(), 0);
    }
}
