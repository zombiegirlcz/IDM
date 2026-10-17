package com.revolut.core.ui_kit.internal.views.navbar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import au0.m3;
import au0.n3;
import au0.w2;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import or0.m;
import or0.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/revolut/core/ui_kit/internal/views/navbar/NavBarMenuImpl$NavBarTextMenuItemDelegate", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/views/navbar/TextNavBarMenuItem;", "Lau0/n3;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class NavBarMenuImpl$NavBarTextMenuItemDelegate extends BaseRecyclerViewDelegate<TextNavBarMenuItem, n3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2 f57320c;
    public final /* synthetic */ d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarMenuImpl$NavBarTextMenuItemDelegate(d dVar, w2 onItemClick) {
        super(R$layout.internal_view_nav_bar_menu_item_text, new akg.d(6));
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.d = dVar;
        this.f57320c = onItemClick;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new n3(s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(n3 holder, TextNavBarMenuItem data, int i, List payloads) {
        int iS;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textViewF = holder.F();
        textViewF.setOnTouchListener(new j01.e(new View[]{textViewF}));
        Clause f59489b = data.getF59489b();
        py0.c cVar = f59489b != null ? new py0.c(f59489b) : null;
        m.a(textViewF);
        textViewF.setOnClickListener(new c(data, cVar, holder, this, data));
        kli.a.b(textViewF, data.getF59489b(), ty0.f.f275450a);
        u.n(holder.F(), true);
        Context context = holder.itemView.getContext();
        Integer num = this.d.d;
        if (num != null) {
            iS = num.intValue();
        } else {
            int i2 = m3.f9274a[data.getF59490c().ordinal()];
            if (i2 == 1) {
                Intrinsics.h(context);
                iS = kli.a.s(R$attr.uikit_colorForeground, context);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.h(context);
                iS = kli.a.s(R$attr.uikit_colorAccent, context);
            }
        }
        holder.i(iS);
    }
}
