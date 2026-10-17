package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fl0;
import ip0.gl0;
import ip0.hl0;
import ip0.ri0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/TitleDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/fl0;", "Lip0/hl0;", "<init>", "()V", "ip0/gl0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TitleDelegate extends BaseRecyclerViewDelegate<fl0, hl0> {
    public TitleDelegate() {
        super(R$layout.internal_delegate_title, new ri0(13));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new hl0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_title));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(hl0 holder, fl0 data, int i, List payloads) {
        fl0 fl0Var;
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
            if (!(payloads.get(i2) instanceof gl0)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z = zIsEmpty;
        for (int i3 = 0; i3 < size2; i3++) {
            gl0 gl0Var = (gl0) payloads.get(i3);
            zIsEmpty = zIsEmpty || gl0Var.f164443b;
            z = z || gl0Var.f164442a;
        }
        if (zIsEmpty) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            fl0Var = data;
            or0.b.c(this, fl0Var, itemView, false, null, 28);
        } else {
            fl0Var = data;
        }
        if (z) {
            holder.f.setModel(fl0Var.f164277a);
        }
    }
}
