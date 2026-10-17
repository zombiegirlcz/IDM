package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.barchart.HorizontalBarView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.dk;
import ip0.go;
import ip0.ho;
import ip0.io;
import ip0.jo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0003\u0002\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/HorizontalBarGroupDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/ho;", "Lip0/jo;", "<init>", "()V", "ip0/io", "ip0/go", "ip0/fo", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HorizontalBarGroupDelegate extends BaseRecyclerViewDelegate<ho, jo> {
    public HorizontalBarGroupDelegate() {
        super(R$layout.internal_delegate_horizontal_bar_group, new dk(17));
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public static void q(jo joVar, ho hoVar) {
        HorizontalBarView horizontalBarView = joVar.f;
        hoVar.getClass();
        List<go> list = hoVar.f164577b;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (go goVar : list) {
            arrayList.add(new ps0.m(goVar.f164455a, goVar.f164456b, R$attr.uikit_colorForeground, kotlin.ranges.f.f(goVar.f164457c / 100, 0.01f, 1.0f), goVar.d));
        }
        horizontalBarView.setBars(new ps0.n(arrayList, 100, 60));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new jo(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(jo holder, ho data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof io) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            q(holder, data);
        } else {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                io ioVar = (io) arrayList.get(i2);
                if (ioVar.f164719a || ioVar.f164720b) {
                    q(holder, data);
                }
            }
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }
}
