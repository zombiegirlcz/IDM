package com.revolut.core.ui_kit.internal.views.navbar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import aqd.h1;
import au0.e3;
import au0.w2;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.views.navbar.AvatarModelNavBarMenuItem;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import mx0.i1;
import or0.m;
import or0.u;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/revolut/core/ui_kit/internal/views/navbar/NavBarMenuImpl$NavBarAvatarModelMenuItemDelegate", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/views/navbar/AvatarModelNavBarMenuItem;", "Lau0/e3;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class NavBarMenuImpl$NavBarAvatarModelMenuItemDelegate extends BaseRecyclerViewDelegate<AvatarModelNavBarMenuItem, e3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2 f57315c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarMenuImpl$NavBarAvatarModelMenuItemDelegate(w2 onItemClick) {
        super(R$layout.internal_view_nav_bar_menu_item_avatar_model, new h1(16));
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.f57315c = onItemClick;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        e3 e3Var = new e3(s.r(parent, this.f98535a));
        Context context = e3Var.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        e3Var.f.setupAvatarViewForNewNavbarDesign(context, i1.SIZE_44_44);
        return e3Var;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(e3 holder, AvatarModelNavBarMenuItem data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        Context context = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        u.w(kli.a.k(context, 44.0f), itemView);
        py0.c cVar = new py0.c(data.f59203c);
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        m.a(itemView2);
        itemView2.setOnClickListener(new b(data, cVar, this, data, 2));
        View itemView3 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
        pd.b.p(itemView3, data.f59203c);
        holder.f.setModel(data.f59202b);
    }
}
