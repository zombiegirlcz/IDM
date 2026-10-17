package com.revolut.core.ui_kit.internal.views.navbar;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import au0.l3;
import au0.w2;
import au0.y2;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.youTransactor.uCube.rpc.Constants;
import fp0.p;
import h30.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import or0.m;
import or0.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/revolut/core/ui_kit/internal/views/navbar/NavBarMenuImpl$NavBarPlusActionMenuItemDelegate", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/views/navbar/PlusActionNavBarMenuItem;", "Lau0/l3;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class NavBarMenuImpl$NavBarPlusActionMenuItemDelegate extends BaseRecyclerViewDelegate<PlusActionNavBarMenuItem, l3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y2 f57319c;
    public final w2 d;
    public final int e;
    public final /* synthetic */ d f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarMenuImpl$NavBarPlusActionMenuItemDelegate(d dVar, y2 collapsedStateWatcher, w2 onItemClick) {
        super(R$layout.internal_view_nav_bar_menu_item_plus_action, new akg.d(5));
        Intrinsics.checkNotNullParameter(collapsedStateWatcher, "collapsedStateWatcher");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.f = dVar;
        this.f57319c = collapsedStateWatcher;
        this.d = onItemClick;
        this.e = R$drawable.uikit_icn_16_plus;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        l3 l3Var = new l3(s.r(parent, this.f98535a));
        Context context = l3Var.itemView.getContext();
        View view = l3Var.itemView;
        Intrinsics.h(context);
        view.setBackground(this.f.c(context, Integer.valueOf(kli.a.s(R$attr.uikit_colorOnAccentNeutral, context)), Integer.valueOf(kli.a.s(R$attr.uikit_colorAccentNeutral, context))));
        l3Var.H().setImageResource(this.e);
        return l3Var;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(l3 holder, PlusActionNavBarMenuItem data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        py0.d cVar = data.getF59450b() != null ? new py0.c(data.getF59450b()) : data.getD() != null ? new py0.c(data.getD()) : new py0.b(new ResourceImage(this.e, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        d dVar = this.f;
        d.a(dVar, itemView);
        if (data.getF59450b() == null) {
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            u.B(kli.a.k(context, 44.0f), itemView2);
        } else {
            View itemView3 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
            u.B(-2, itemView3);
        }
        p pVarF = holder.F();
        p.b(pVarF, true);
        View view = pVarF.f137029a;
        m.a(view);
        view.setOnClickListener(new b(data, cVar, this, data, 4));
        SpannableStringBuilder spannableStringBuilderA = null;
        if (data.getF()) {
            holder.J().setVisibility(4);
            holder.H().setVisibility(4);
            holder.I().setVisibility(0);
            View view2 = holder.itemView;
            yy0.f.e(l.z(view2, "itemView", view2), new AnimatedResourceImage(R$drawable.uikit_icn_48_loading_anim, 8, (Clause) null, Integer.valueOf(R$attr.uikit_colorOnAccentNeutral)), holder.I(), null, null, 12);
        } else {
            holder.J().setVisibility(0);
            holder.H().setVisibility(0);
            holder.I().setVisibility(8);
            kli.a.b(holder.J(), data.getF59450b(), ty0.f.f275450a);
        }
        holder.K(this.f57319c.f9441b);
        View view3 = holder.itemView;
        Clause f60005c = data.getD();
        if (f60005c != null) {
            View view4 = holder.itemView;
            ty0.c cVarX = l.x(view4, "itemView", view4);
            Context context2 = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            spannableStringBuilderA = ty0.c.a(cVarX, f60005c, context2, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
        }
        view3.setContentDescription(spannableStringBuilderA);
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
        holder.q(dVar.f57405g);
    }
}
