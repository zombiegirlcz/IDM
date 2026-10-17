package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0006\u0002\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ComparisonCellHeadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/g4;", "Lcom/revolut/core/ui_kit/delegates/h4;", "<init>", "()V", "a", "ip0/mb", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ComparisonCellHeadingDelegate extends BaseRecyclerViewDelegate<g4, h4> {

    public static abstract class a {
        private a() {
        }
    }

    public ComparisonCellHeadingDelegate() {
        super(R$layout.internal_delegate_comparison_cell_heading, new ip0.lb(0));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new h4(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(h4 holder, g4 data, int i, List payloads) {
        boolean z;
        g4 g4Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View view = holder.f54231j;
        ArrayList arrayListN = zhm.c0.N(payloads, ip0.mb.class);
        boolean z3 = true;
        if (arrayListN.isEmpty()) {
            z = true;
            break;
        }
        if (!arrayListN.isEmpty()) {
            Iterator it8 = arrayListN.iterator();
            while (it8.hasNext()) {
                if (((ip0.mb) it8.next()).f165350a) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!arrayListN.isEmpty()) {
            if (arrayListN.isEmpty()) {
                z3 = false;
            } else {
                Iterator it9 = arrayListN.iterator();
                while (it9.hasNext()) {
                    if (((ip0.mb) it9.next()).f165351b) {
                        break;
                    }
                }
                z3 = false;
            }
        }
        if (z) {
            f4 content = data.f54178a;
            Intrinsics.checkNotNullParameter(content, "content");
            holder.i.setVisibility(0);
            holder.f54230h.setVisibility(8);
            kli.a.b(holder.f, content.f54141a, ty0.f.f275450a);
            kli.a.b(holder.f54229g, content.f54142b, ty0.f.f275450a);
        }
        if (z3) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            g4Var = data;
            or0.b.c(this, g4Var, itemView, false, null, 28);
        } else {
            g4Var = data;
        }
        qv0.c cVar = g4Var.f54179b;
        if ((cVar instanceof c.b) || (cVar instanceof c.f)) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }
}
