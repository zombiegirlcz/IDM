package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0004\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/DraggableRowDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/bf;", "Lip0/df;", "ip0/cf", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DraggableRowDelegate extends BaseRecyclerViewDelegate<ip0.bf, ip0.df> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ItemTouchHelper f52206c;
    public final ihm.f d;
    public final ihm.f e;

    public DraggableRowDelegate() {
        this(null);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.df(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_draggable_row));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.df holder, ip0.bf data, int i, List list) {
        qv0.c cVar;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.cf)) {
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
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        for (int i3 = 0; i3 < size2; i3++) {
            ip0.cf cfVar = (ip0.cf) payloads.get(i3);
            zIsEmpty = zIsEmpty || cfVar.f163727a;
            z = z || cfVar.f163728b;
            z3 = z3 || cfVar.f163729c;
            z6 = z6 || cfVar.d;
            z4 = z4 || cfVar.e;
        }
        Context context = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iW = kli.a.w(R$attr.uikit_dp16, context);
        ImageView imageView = holder.f;
        or0.u.l(imageView, iW, iW, iW, iW);
        imageView.setOnClickListener(new ap0.f(this, data, 22));
        if (zIsEmpty) {
            View view = holder.itemView;
            yy0.f.e(h30.l.z(view, "itemView", view), data.f163589b, holder.f, null, null, 12);
        }
        if (z) {
            kli.a.b(holder.f163886h, data.f163590c, ty0.f.f275450a);
        }
        if (z3) {
            ImageView imageView2 = holder.f163885g;
            imageView2.setVisibility(data.d ? 0 : 8);
            if (data.d) {
                holder.itemView.setOnLongClickListener(new ip0.af(this, holder, data, 0));
                imageView2.setOnTouchListener(new com.revolut.uicomponent.toolbar.app_bar.a(holder, 2, this, data));
            } else {
                holder.itemView.setOnLongClickListener(null);
                imageView2.setOnTouchListener(null);
            }
        }
        if (z4 || z6) {
            if (data.e) {
                qv0.c cVar2 = data.f;
                boolean z11 = cVar2 instanceof c.a;
                cVar = c.b.f249511a;
                if (!z11 && !(cVar2 instanceof c.f)) {
                    if (!Intrinsics.f(cVar2, cVar) && !Intrinsics.f(cVar2, c.C1364c.f249512a) && !(cVar2 instanceof c.e) && !Intrinsics.f(cVar2, c.d.f249513a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar = data.f;
                }
            } else {
                cVar = data.f;
            }
            qv0.c cVar3 = cVar;
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.b(this, cVar3, itemView, true, null, null, null, 56);
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            or0.b.o(this, data, itemView2);
        }
    }

    public DraggableRowDelegate(ItemTouchHelper itemTouchHelper) {
        super(R$layout.internal_delegate_draggable_row, new ip0.lb(23));
        this.f52206c = itemTouchHelper;
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
    }
}
