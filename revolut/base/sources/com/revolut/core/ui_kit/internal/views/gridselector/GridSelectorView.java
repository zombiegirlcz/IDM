package com.revolut.core.ui_kit.internal.views.gridselector;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.internal.delegates.gridselector.GridSelectorDelegate;
import koi.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o31.b;
import org.jetbrains.annotations.NotNull;
import tq0.k;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/gridselector/GridSelectorView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ltq0/k;", "model", "", "setModel", "(Ltq0/k;)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GridSelectorView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GridSelectorDelegate f57204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f57205b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GridSelectorView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setModel(@NotNull k model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f57205b.c(u.c(model));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GridSelectorView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridSelectorView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        RecyclerView recyclerView = new RecyclerView(context);
        GridSelectorDelegate gridSelectorDelegate = new GridSelectorDelegate();
        this.f57204a = gridSelectorDelegate;
        j jVar = new j(new c(u.c(gridSelectorDelegate)), false, 14);
        this.f57205b = jVar;
        addView(recyclerView);
        recyclerView.setAdapter(jVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setItemAnimator(null);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setOverScrollMode(2);
        recyclerView.addItemDecoration(new b());
    }

    public /* synthetic */ GridSelectorView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
