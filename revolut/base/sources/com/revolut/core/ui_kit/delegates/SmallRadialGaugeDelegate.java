package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.je0;
import ip0.rf0;
import ip0.sf0;
import ip0.tf0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SmallRadialGaugeDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/rf0;", "Lip0/tf0;", "<init>", "()V", "ip0/sf0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SmallRadialGaugeDelegate extends BaseRecyclerViewDelegate<rf0, tf0> {
    public SmallRadialGaugeDelegate() {
        super(R$layout.internal_delegate_small_radial_gauge, new je0(9));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        tf0 tf0Var = new tf0(kotlin.jvm.internal.s.r(parent, this.f98535a));
        tf0Var.f.setChartSize(ms0.q3.SMALL);
        return tf0Var;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(tf0 holder, rf0 data, int i, List payloads) {
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
            if (!(payloads.get(i2) instanceof sf0)) {
                payloads = null;
                break;
            }
            i2++;
        }
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        if (payloads != null) {
            for (sf0 sf0Var : payloads) {
                zN = zN || sf0Var.f166345a;
                zN2 = zN2 || sf0Var.f166346b;
                zN3 = zN3 || sf0Var.f166347c;
                zN4 = zN4 || sf0Var.d;
            }
        }
        if (zN) {
            holder.f.setGaugeData(a.a.N(data.f166174b));
        }
        if (zN2) {
            kli.a.b(holder.f166514g, data.f166175c, ty0.f.f275450a);
        }
        if (zN3) {
            kli.a.b(holder.f166515h, data.d, ty0.f.f275450a);
        }
        if (zN4) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
    }
}
