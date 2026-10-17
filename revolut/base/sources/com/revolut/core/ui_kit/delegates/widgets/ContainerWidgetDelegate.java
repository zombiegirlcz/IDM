package com.revolut.core.ui_kit.delegates.widgets;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import koi.b;
import koi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\u0014\b\u0002\u0010\u0006*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007:\u0003\n\u000b\t¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/ContainerWidgetDelegate;", "Lkoi/j;", "T", "Lkoi/b;", "VH", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "D", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/ContainerWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/o0;", "op0/e1", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ContainerWidgetDelegate<T extends koi.j, VH extends koi.b, D extends BaseRecyclerViewDelegate<T, VH>> extends BaseDraggableWidgetDelegate<Model, o0> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/ContainerWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Model extends BaseDraggableWidgetDelegate.Model {
        public abstract koi.j E();

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null || !((Model) oldItem).E().getClass().equals(E().getClass())) {
                return null;
            }
            return new op0.e1(!Intrinsics.f(E(), model.E()), getE() != model.getE());
        }
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        BaseRecyclerViewDelegate baseRecyclerViewDelegateS = s();
        o0 o0Var = new o0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_container), baseRecyclerViewDelegateS, new ood.k(this, baseRecyclerViewDelegateS, 5));
        p(o0Var, true);
        return o0Var;
    }

    public abstract BaseRecyclerViewDelegate s();

    public abstract efm.r t(BaseRecyclerViewDelegate baseRecyclerViewDelegate, o10.c cVar);

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void p(o0 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        for (Object obj2 : payloads) {
            if (obj2 instanceof op0.e1) {
                boolean z = true;
                zN = zN || ((op0.e1) obj2).f227233a;
                if (!zN2 && !((op0.e1) obj2).f227234b) {
                    z = false;
                }
                zN2 = z;
            }
        }
        if (zN) {
            List items = zhm.u.c(data.E());
            Intrinsics.checkNotNullParameter(items, "items");
            holder.f55445j.c(items);
        }
        if (zN2) {
            holder.F(data.getE());
        }
        holder.k = new ood.k(this, data, 6);
    }
}
