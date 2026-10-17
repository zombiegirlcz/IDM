package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004:\u0003\u0003\u0002\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ErrorChartDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/ag;", "Lip0/cg;", "", "<init>", "()V", "ip0/bg", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ErrorChartDelegate extends BaseRecyclerViewDelegate<ip0.ag, ip0.cg> {
    public ErrorChartDelegate() {
        super(R$layout.internal_delegate_errorchart, new ip0.zf(0));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.cg(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.cg holder, ip0.ag data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ImageView imageView = holder.f;
        TextView textView = holder.f163731g;
        if (payloads.isEmpty()) {
            or0.b.e(this, data.f163438b, textView, null, 12);
            or0.b.f(this, data.f163439c, imageView);
        } else {
            ArrayList<ip0.bg> arrayList = new ArrayList();
            for (Object obj2 : payloads) {
                if (obj2 instanceof ip0.bg) {
                    arrayList.add(obj2);
                }
            }
            for (ip0.bg bgVar : arrayList) {
                if (bgVar.f163603a) {
                    or0.b.e(this, data.f163438b, textView, null, 12);
                }
                if (bgVar.f163604b) {
                    or0.b.f(this, data.f163439c, imageView);
                }
            }
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }
}
