package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.LabelView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsReceiptDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/b8;", "Lip0/d8;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellDetailsReceiptDelegate extends BaseRecyclerViewDelegate<ip0.b8, ip0.d8> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f51888c;
    public final ihm.f d;

    public CellDetailsReceiptDelegate() {
        super(R$layout.internal_delegate_cell_details_receipt, new ip0.g4(28));
        this.f51888c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.d8(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_details_receipt));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.d8 holder, ip0.b8 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        kli.a.b(holder.f, data.f163555b, ty0.f.f275450a);
        LabelView labelView = holder.f163854g;
        TextLocalisedClause textLocalisedClause = data.f163556c;
        LabelView.setText$default(labelView, textLocalisedClause, 0, 2, null);
        LabelView.setStartIcon$default(holder.f163854g, data.d, null, null, false, 0, 0L, 62, null);
        or0.b.f(this, data.e, holder.f163855h);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, true, null, 24);
        holder.itemView.setOnClickListener(new ap0.f(this, data, 20));
        labelView.setOnClickListener(new ip0.j5(holder, 2, this, data));
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        gq0.d[] elements = {hx7.b.f(data.f163555b), hx7.b.f(textLocalisedClause)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        hx7.b.u(kotlin.collections.d.L(elements), itemView2);
    }
}
