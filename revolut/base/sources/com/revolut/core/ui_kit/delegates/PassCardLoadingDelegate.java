package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.drawables.PassCardPunchDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.c00;
import ip0.e00;
import ip0.f00;
import ip0.j00;
import ip0.tz;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0003\u0007\u0002\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PassCardLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/e00;", "Lip0/j00;", "<init>", "()V", "Companion", "ip0/i00", "ip0/f00", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PassCardLoadingDelegate extends BaseRecyclerViewDelegate<e00, j00> {
    public PassCardLoadingDelegate() {
        super(R$layout.internal_delegate_pass_card_loading, new tz(3));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new j00(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(j00 holder, e00 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof f00)) {
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
        for (int i3 = 0; i3 < size2; i3++) {
            f00 f00Var = (f00) payloads.get(i3);
            zIsEmpty = zIsEmpty || f00Var.f164174a;
            z = z || f00Var.f164175b;
            z3 = z3 || f00Var.f164176c;
        }
        if (zIsEmpty) {
            CdnImage logo = data.f163986b;
            Intrinsics.checkNotNullParameter(logo, "logo");
            zi0.c.g(holder.f, logo);
        }
        if (z) {
            boolean zA = data.f163987c.a();
            holder.f164771g.setVisibility(zA ? 0 : 8);
            holder.f164772h.setVisibility(zA ? 0 : 8);
            holder.i.setVisibility(zA ? 0 : 8);
            data.f163987c.getClass();
            holder.f164773j.setVisibility(0);
        }
        if (z3) {
            qv0.c cVar = data.d;
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.j(this, cVar, itemView);
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            or0.b.o(this, data, itemView2);
            float fA = r6.b.a(holder.itemView, "getContext(...)", 9.0f);
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            holder.itemView.setBackground(new PassCardPunchDrawable(kli.a.s(R$attr.uikit_colorWidgetBackground, context), fA, new c00(holder, r6.b.a(holder.itemView, "getContext(...)", 33.0f), r6.b.a(holder.itemView, "getContext(...)", 17.0f), 1)));
        }
    }
}
