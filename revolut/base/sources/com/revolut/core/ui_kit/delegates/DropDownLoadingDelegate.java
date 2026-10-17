package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/DropDownLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/gf;", "Lip0/jf;", "<init>", "()V", "ip0/hf", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DropDownLoadingDelegate extends BaseRecyclerViewDelegate<ip0.gf, ip0.jf> {
    public DropDownLoadingDelegate() {
        super(R$layout.internal_delegate_dropdown_loading, new ip0.lb(25));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.jf(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_dropdown_loading));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.jf holder, ip0.gf data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ifk.b.r(holder.f);
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        for (Object obj2 : payloads) {
            if (obj2 instanceof ip0.hf) {
                boolean z = true;
                zN = zN || ((ip0.hf) obj2).f164542a;
                zN2 = zN2 || ((ip0.hf) obj2).f164543b;
                if (!zN3 && !((ip0.hf) obj2).f164544c) {
                    z = false;
                }
                zN3 = z;
            }
        }
        if (zN) {
            kli.a.b(holder.f164831g, data.f164403a, ty0.f.f275450a);
        }
        if (zN2) {
            zi0.c.g(holder.f164832h, data.f164404b);
        }
        if (zN3) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
    }
}
