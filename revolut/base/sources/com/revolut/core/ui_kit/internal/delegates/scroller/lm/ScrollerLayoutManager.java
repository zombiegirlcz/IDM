package com.revolut.core.ui_kit.internal.delegates.scroller.lm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aw0.x4;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import xq0.l;
import y99.c;
import yhm.j;
import yq0.b;
import yq0.d;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/internal/delegates/scroller/lm/ScrollerLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScrollerLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x4 f55871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55872c;
    public final l d;
    public final int e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f55873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f55874h;
    public final Lazy i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollerLayoutManager(Context context, int i, x4 heightMode, int i2, l spaceType, int i3, List itemHeightCalculators, List items) {
        super(context, 0, false);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        Intrinsics.checkNotNullParameter(spaceType, "spaceType");
        Intrinsics.checkNotNullParameter(itemHeightCalculators, "itemHeightCalculators");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f55870a = i;
        this.f55871b = heightMode;
        this.f55872c = i2;
        this.d = spaceType;
        this.e = i3;
        this.f = itemHeightCalculators;
        this.f55873g = items;
        this.f55874h = new b(0);
        if (Intrinsics.f(heightMode, x4.c.f10604a)) {
            throw new IllegalStateException(heightMode.getClass().getSimpleName().concat(" is only supported by scroller that uses SnapStyle.Pager").toString());
        }
        this.i = j.b(new c(this, 29));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void measureChild(View child, int i, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        ((d) this.i.getValue()).b(child, this.f55870a, i, i2, 0, 0, this.f55874h, this.e, this.f55873g);
        b bVar = this.f55874h;
        child.measure(bVar.f315956a, bVar.f315957b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void measureChildWithMargins(View child, int i, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        ((d) this.i.getValue()).b(child, this.f55870a, i, i2, ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, this.f55874h, this.e, this.f55873g);
        b bVar = this.f55874h;
        child.measure(bVar.f315956a, bVar.f315957b);
    }
}
