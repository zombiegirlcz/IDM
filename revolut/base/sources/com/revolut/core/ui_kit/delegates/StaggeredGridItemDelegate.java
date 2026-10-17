package com.revolut.core.ui_kit.delegates;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ah0;
import ip0.bh0;
import ip0.od0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import koi.b;
import koi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u0007*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00028\u00010\u0005:\u0003\u0006\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/StaggeredGridItemDelegate;", "Lkoi/j;", "M", "Lkoi/b;", "VH", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/ah0;", "Companion", "ip0/bh0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StaggeredGridItemDelegate<M extends koi.j, VH extends koi.b> extends BaseRecyclerViewDelegate<ah0, VH> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final koi.k f53466c;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.StaggeredGridItemDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static ArrayList a(List list) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            List list2 = list;
            List list3 = list;
            ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                arrayList.add(new StaggeredGridItemDelegate((BaseRecyclerViewDelegate) it8.next()));
            }
            return zhm.d0.E0(arrayList, list2);
        }

        public static ArrayList b(List items) {
            Intrinsics.checkNotNullParameter(items, "items");
            List<koi.j> list = items;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            for (koi.j jVar : list) {
                arrayList.add(jVar instanceof ah0 ? (ah0) jVar : new ah0(jVar.getF55132b(), jVar, true));
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaggeredGridItemDelegate(BaseRecyclerViewDelegate innerDelegate) {
        super(Arrays.hashCode(new Object[]{Integer.valueOf(R$layout.internal_delegate_staggered_grid_item), Integer.valueOf(innerDelegate.getF58164c())}), new od0(innerDelegate, 1));
        Intrinsics.checkNotNullParameter(innerDelegate, "innerDelegate");
        this.f53466c = innerDelegate;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return (koi.b) this.f53466c.g(parent);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(koi.b holder, ah0 data, int i, List payloads) {
        List list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            list = zhm.f0.f322471a;
        } else {
            ArrayList arrayList = new ArrayList();
            int size = payloads.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj2 = payloads.get(i2);
                bh0 bh0Var = obj2 instanceof bh0 ? (bh0) obj2 : null;
                Object obj3 = bh0Var != null ? bh0Var.f163612b : null;
                if (obj3 != null) {
                    arrayList.add(obj3);
                }
            }
            list = arrayList;
        }
        this.f53466c.p(holder, data.f163447b, i, list);
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        StaggeredGridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof StaggeredGridLayoutManager.LayoutParams ? (StaggeredGridLayoutManager.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.setFullSpan(data.f163448c);
        }
    }
}
