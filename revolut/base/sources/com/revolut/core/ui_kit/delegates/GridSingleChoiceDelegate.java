package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.gridselector.GridSelectorView;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.cl;
import ip0.dk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0002\u0006\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/GridSingleChoiceDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/s6;", "Lip0/cl;", "<init>", "()V", "a", "ip0/bl", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GridSingleChoiceDelegate extends BaseRecyclerViewDelegate<s6, cl> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Custom f52389c;
    public final Custom d;
    public final Custom e;
    public final Custom f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e01.a f52390g;

    public static abstract class a {
        private a() {
        }

        public abstract boolean a(String str);
    }

    public GridSingleChoiceDelegate() {
        super(R$layout.internal_delegate_grid_single_choice, new dk(5));
        this.f52389c = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);
        this.d = new Custom(Integer.valueOf(R$attr.uikit_colorWhite), false, null, false, null, 254);
        this.e = new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254);
        this.f = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone20), false, null, false, null, 254);
        this.f52390g = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new cl(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_grid_single_choice));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(cl holder, s6 data, int i, List payloads) {
        boolean z;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        GridSelectorView gridSelectorView = holder.f;
        List list = data.d;
        Integer num = data.f54688c;
        int i2 = data.f54687b;
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        int i3 = 0;
        for (Object obj2 : list2) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                zhm.v.s();
                throw null;
            }
            String str = (String) obj2;
            while (true) {
                for (a aVar : data.e) {
                    z = z && aVar.a(str);
                }
            }
            arrayList.add(new tq0.a(str, new TextClause(str, (Style) (!z ? this.f : i2 == i3 ? this.d : (num != null && num.intValue() == i3) ? this.e : this.f52389c), (Integer) null, false, (aw0.o9) null, (List) null, 124), tq0.b.REGULAR, z && i2 == i3, z, num != null && num.intValue() == i3, null, null, 416));
            i3 = i5;
        }
        gridSelectorView.setModel(new tq0.k(7, 504, null, data.f54686a, arrayList));
        efm.r map = gridSelectorView.f57204a.p().map(new ip0.qh(14, new ip0.ad(data, 10)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f52390g.a(map, holder);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }
}
