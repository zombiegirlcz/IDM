package com.revolut.core.ui_kit.delegates.widgets;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/SwitcherWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/SwitcherWidgetDelegate$Model;", "Lop0/k4;", "<init>", "()V", "Model", "op0/j4", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwitcherWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.k4> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \b2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\tJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/SwitcherWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lkoi/j;", "Lqv0/p;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p {
    }

    public SwitcherWidgetDelegate() {
        super(R$layout.internal_delegate_widget_switcher, new op0.v3(8));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.k4 k4Var = new op0.k4(kotlin.jvm.internal.s.r(parent, this.f54986c));
        p(k4Var, true);
        return k4Var;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate, com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ void p(RecyclerView.ViewHolder viewHolder, koi.j jVar, int i, List list) {
        s((op0.k4) viewHolder, i, list);
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate, com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ void p(koi.b bVar, koi.j jVar, int i, List list) {
        s((op0.k4) bVar, i, list);
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void p(op0.p pVar, BaseDraggableWidgetDelegate.Model model, int i, List list) {
        op0.k4 k4Var = (op0.k4) pVar;
        if (model != null) {
            throw new ClassCastException();
        }
        s(k4Var, i, list);
    }

    public final void s(op0.k4 holder, int i, List list) {
        boolean z;
        boolean z3;
        boolean z4;
        boolean z6;
        boolean z11;
        boolean z12;
        boolean z29;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(null, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, null, i, payloads);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof op0.j4)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        op0.j4 j4Var = new op0.j4(payloads.isEmpty(), payloads.isEmpty(), payloads.isEmpty(), payloads.isEmpty(), payloads.isEmpty(), payloads.isEmpty());
        Iterator it8 = payloads.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            z = j4Var.f;
            z3 = j4Var.e;
            z4 = j4Var.d;
            z6 = j4Var.f227323c;
            z11 = j4Var.f227322b;
            z12 = j4Var.f227321a;
            if (!zHasNext) {
                break;
            }
            op0.j4 j4Var2 = (op0.j4) it8.next();
            boolean z31 = true;
            if (z12 || j4Var2.f227321a) {
                z29 = true;
            } else {
                z29 = true;
                z31 = false;
            }
            j4Var = new op0.j4(z31, (z11 || j4Var2.f227322b) ? z29 : false, (z6 || j4Var2.f227323c) ? z29 : false, (z4 || j4Var2.d) ? z29 : false, (z3 || j4Var2.e) ? z29 : false, (z || j4Var2.f) ? z29 : false);
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        wy0.a aVarK = or0.u.k(itemView);
        if (z) {
            throw null;
        }
        if (z12) {
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            or0.u.k(itemView2).Q();
            throw null;
        }
        if (z11) {
            aVarK.b0();
            throw null;
        }
        if (z6) {
            aVarK.b0();
            throw null;
        }
        if (z4 || z3) {
            throw null;
        }
        holder.f227332j.setOnTouchListener(new com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn.b(3));
    }
}
