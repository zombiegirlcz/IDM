package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.flexbox.FlexboxLayoutManager;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ri0;
import ip0.vj0;
import ip0.wj0;
import ip0.ws;
import ip0.xj0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0002B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/TagDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/vj0;", "Lip0/xj0;", "<init>", "()V", "ip0/wj0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TagDelegate extends BaseRecyclerViewDelegate<vj0, xj0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53529c;
    public final ihm.f d;

    public TagDelegate(int i) {
        super(R$layout.internal_delegate_tag, new ri0(7));
        this.f53529c = i;
        this.d = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        xj0 xj0Var = new xj0(kotlin.jvm.internal.s.r(parent, this.f98535a));
        View itemView = xj0Var.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = this.f53529c;
        itemView.setLayoutParams(layoutParams);
        return xj0Var;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(xj0 holder, vj0 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TagView tagView = holder.f;
        boolean zIsEmpty = payloads.isEmpty();
        float f = BitmapDescriptorFactory.HUE_RED;
        if (zIsEmpty) {
            tagView.setContent(data.f166826b);
            Intrinsics.checkNotNullExpressionValue(tagView, "<get-tagView>(...)");
            ViewGroup.LayoutParams layoutParams = tagView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = data.f166827c.f164899a;
            tagView.setLayoutParams(layoutParams2);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            ViewGroup.LayoutParams layoutParams3 = itemView.getLayoutParams();
            if (layoutParams3 instanceof FlexboxLayoutManager.LayoutParams) {
                FlexboxLayoutManager.LayoutParams layoutParams4 = (FlexboxLayoutManager.LayoutParams) layoutParams3;
                if (data.d) {
                    f = 1.0f;
                }
                layoutParams4.f98225b = f;
            }
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            or0.b.c(this, data, itemView2, false, null, 28);
        } else {
            ArrayList<wj0> arrayList = new ArrayList();
            for (Object obj2 : payloads) {
                if (obj2 instanceof wj0) {
                    arrayList.add(obj2);
                }
            }
            for (wj0 wj0Var : arrayList) {
                if (wj0Var.f167037a) {
                    tagView.setContent(data.f166826b);
                }
                if (wj0Var.f167038b) {
                    Intrinsics.checkNotNullExpressionValue(tagView, "<get-tagView>(...)");
                    ViewGroup.LayoutParams layoutParams5 = tagView.getLayoutParams();
                    if (layoutParams5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                    FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                    layoutParams6.gravity = data.f166827c.f164899a;
                    tagView.setLayoutParams(layoutParams6);
                }
                if (wj0Var.f167039c) {
                    View itemView3 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
                    ViewGroup.LayoutParams layoutParams7 = itemView3.getLayoutParams();
                    if (layoutParams7 instanceof FlexboxLayoutManager.LayoutParams) {
                        ((FlexboxLayoutManager.LayoutParams) layoutParams7).f98225b = data.d ? 1.0f : 0.0f;
                    }
                }
                if (wj0Var.d) {
                    View itemView4 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
                    or0.b.c(this, data, itemView4, false, null, 28);
                }
            }
        }
        tagView.setOnClickListener(new ws(this, data, 26));
    }

    public TagDelegate() {
        this(-1);
    }
}
