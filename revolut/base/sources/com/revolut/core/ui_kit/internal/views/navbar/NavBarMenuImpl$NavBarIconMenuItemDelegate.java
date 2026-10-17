package com.revolut.core.ui_kit.internal.views.navbar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import au0.f3;
import au0.w2;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import fp0.p;
import h30.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import or0.m;
import tx0.q0;
import zhm.f0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"com/revolut/core/ui_kit/internal/views/navbar/NavBarMenuImpl$NavBarIconMenuItemDelegate", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/views/navbar/IconNavBarMenuItem;", "Lau0/f3;", "Lcom/revolut/core/ui_kit/internal/views/navbar/d;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class NavBarMenuImpl$NavBarIconMenuItemDelegate extends BaseRecyclerViewDelegate<IconNavBarMenuItem, f3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2 f57316c;
    public final /* synthetic */ d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarMenuImpl$NavBarIconMenuItemDelegate(d dVar, w2 onItemClick) {
        super(R$layout.internal_view_nav_bar_menu_item_icon, new akg.d(3));
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.d = dVar;
        this.f57316c = onItemClick;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewR = s.r(parent, this.f98535a);
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RoundedBackgroundDrawable roundedBackgroundDrawableC = this.d.c(context, null, null);
        viewR.setBackground(roundedBackgroundDrawableC);
        return new f3(viewR, roundedBackgroundDrawableC);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        f3 f3Var = holder instanceof f3 ? (f3) holder : null;
        if (f3Var != null) {
            f3Var.Q();
        }
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(f3 holder, IconNavBarMenuItem data, int i, List list) {
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
            if (!(payloads.get(i2) instanceof q0)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        for (int i3 = 0; i3 < size2; i3++) {
            q0 q0Var = (q0) payloads.get(i3);
            z3 = z3 || q0Var.e();
            z4 = z4 || q0Var.c();
            z6 = z6 || q0Var.b();
            z = z || q0Var.f();
            z12 = z12 || q0Var.d();
            z11 = z11 || q0Var.a();
        }
        if (z) {
            holder.J(data.getF());
        }
        Clause f60005c = data.getD();
        py0.d cVar = f60005c != null ? new py0.c(f60005c) : new py0.b(data.getF59237b());
        p pVarK = holder.K();
        p.b(pVarK, true);
        View view = pVarK.f137029a;
        m.a(view);
        view.setOnClickListener(new b(data, cVar, this, data, 3));
        if (z4) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            pd.b.p(itemView, data.getD());
        }
        if (z3) {
            View view2 = holder.itemView;
            yy0.f.e(l.z(view2, "itemView", view2), data.getF59237b(), holder.M(), null, null, 12);
        }
        d dVar = this.d;
        if (z3 || z11) {
            holder.F(data.getF59240h());
            Integer num = dVar.d;
            if (num != null) {
                holder.i(num.intValue());
            }
            Integer num2 = dVar.d;
            holder.s(dVar.f);
            Integer num3 = dVar.e;
            if (num3 != null) {
                holder.o(num3.intValue(), num2);
            }
        }
        if (z6) {
            holder.H(data.getE());
        }
        if (zIsEmpty) {
            holder.q(dVar.f57405g);
        }
        if (z12) {
            AnimationRequest f59239g = data.getF59239g();
            if (f59239g == null || f59239g.getF57724a()) {
                if (data.getF59239g() == null) {
                    holder.Q();
                }
            } else {
                data.getF59239g().b();
                holder.y();
            }
        }
    }
}
