package com.revolut.core.ui_kit.internal.views.navbar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import au0.c3;
import au0.w2;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.views.navbar.ActionNavBarMenuItem;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import fp0.p;
import h30.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import or0.m;
import or0.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/revolut/core/ui_kit/internal/views/navbar/NavBarMenuImpl$NavBarActionMenuItemDelegate", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/views/navbar/ActionNavBarMenuItem;", "Lau0/c3;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class NavBarMenuImpl$NavBarActionMenuItemDelegate extends BaseRecyclerViewDelegate<ActionNavBarMenuItem, c3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2 f57313c;
    public final /* synthetic */ d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarMenuImpl$NavBarActionMenuItemDelegate(d dVar, w2 onItemClick) {
        super(R$layout.internal_view_nav_bar_menu_item_action, new akg.d(2));
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.d = dVar;
        this.f57313c = onItemClick;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        c3 c3Var = new c3(s.r(parent, this.f98535a));
        int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(c3Var.itemView, "getContext(...)", 44.0f);
        View itemView = c3Var.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        u.A(itemView, iA, iA);
        View view = c3Var.itemView;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackground(this.d.c(context, null, null));
        Context context2 = c3Var.H().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        u.z(c3Var.H(), kli.a.k(context2, 6.0f), 0, 0, 0, false, 30);
        return c3Var;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(c3 holder, ActionNavBarMenuItem data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        py0.d cVar = data.getD() != null ? new py0.c(data.getD()) : new py0.b(data.getD());
        p pVarF = holder.F();
        p.b(pVarF, true);
        View view = pVarF.f137029a;
        m.a(view);
        view.setOnClickListener(new b(data, cVar, this, data, 0));
        View view2 = holder.itemView;
        yy0.f.e(l.z(view2, "itemView", view2), data.getD(), holder.H(), null, null, 12);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        pd.b.p(itemView, data.getD());
        boolean zBooleanValue = ((Boolean) jo0.g.j().getValue()).booleanValue();
        d dVar = this.d;
        if (zBooleanValue) {
            Integer num = dVar.d;
            if (num != null) {
                holder.i(num.intValue());
            }
            holder.s(dVar.f);
            Integer num2 = dVar.e;
            if (num2 != null) {
                holder.o(num2.intValue(), dVar.d);
            }
        }
        holder.q(dVar.f57405g);
    }
}
