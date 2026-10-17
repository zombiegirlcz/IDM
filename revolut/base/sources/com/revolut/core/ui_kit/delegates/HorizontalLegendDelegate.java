package com.revolut.core.ui_kit.delegates;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate;
import ip0.dk;
import ip0.qo;
import ip0.ro;
import ip0.so;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/HorizontalLegendDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseBoxRecyclerViewDelegate;", "Lip0/qo;", "Lip0/so;", "<init>", "()V", "ip0/ro", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HorizontalLegendDelegate extends BaseBoxRecyclerViewDelegate<qo, so> {
    public HorizontalLegendDelegate() {
        super(R$layout.internal_delegate_horizontal_legend, false, new dk(20));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(this.f58164c, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new so(viewInflate);
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(so holder, qo data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ro)) {
                payloads = null;
                break;
            }
            i2++;
        }
        boolean zN = ue0.e.n(payloads);
        if (payloads != null) {
            Iterator it8 = payloads.iterator();
            while (it8.hasNext()) {
                zN = zN || ((ro) it8.next()).f166218a;
            }
        }
        if (zN) {
            holder.f.setModel(data.f166031b);
        }
    }
}
