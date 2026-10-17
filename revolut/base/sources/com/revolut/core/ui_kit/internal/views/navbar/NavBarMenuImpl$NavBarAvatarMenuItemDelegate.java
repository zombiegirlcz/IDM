package com.revolut.core.ui_kit.internal.views.navbar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import aqd.h1;
import au0.d3;
import au0.w2;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.AvatarNavBarMenuItem;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import h30.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import or0.m;
import or0.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/revolut/core/ui_kit/internal/views/navbar/NavBarMenuImpl$NavBarAvatarMenuItemDelegate", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/views/navbar/AvatarNavBarMenuItem;", "Lau0/d3;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class NavBarMenuImpl$NavBarAvatarMenuItemDelegate extends BaseRecyclerViewDelegate<AvatarNavBarMenuItem, d3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2 f57314c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarMenuImpl$NavBarAvatarMenuItemDelegate(w2 onItemClick) {
        super(R$layout.internal_view_nav_bar_menu_item_avatar, new h1(15));
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.f57314c = onItemClick;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new d3(s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(d3 holder, AvatarNavBarMenuItem data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        Context context = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        u.w(kli.a.k(context, 44.0f), itemView);
        Clause f60005c = data.getD();
        py0.d cVar = f60005c != null ? new py0.c(f60005c) : new py0.b(data.getF59205b());
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        m.a(itemView2);
        itemView2.setOnClickListener(new b(data, cVar, this, data, 1));
        View itemView3 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
        pd.b.p(itemView3, data.getD());
        View view = holder.itemView;
        yy0.f.e(l.z(view, "itemView", view), data.getF59205b(), holder.I(), null, null, 12);
        holder.F().setBadgeAndVisibility(data.getF59206c(), holder.H());
    }
}
