package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.revpoints.RevPointsPriceView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsRevPointsDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/e8;", "Lip0/g8;", "<init>", "()V", "ip0/f8", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellDetailsRevPointsDelegate extends BaseRecyclerViewDelegate<ip0.e8, ip0.g8> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f51889c;

    public CellDetailsRevPointsDelegate() {
        super(R$layout.internal_delegate_cell_details_rev_points, new ip0.g4(29));
        this.f51889c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.g8(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_details_rev_points));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.g8 holder, ip0.e8 data, int i, List payloads) {
        gq0.c cVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f;
        RevPointsPriceView revPointsPriceView = holder.f164369h;
        gq0.c cVar2 = null;
        if (payloads.isEmpty()) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
            or0.b.e(this, data.f164032b, textView, null, 12);
            q(data, holder);
            revPointsPriceView.setContent(data.d);
        } else {
            List list = payloads;
            ArrayList<ip0.f8> arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.CellDetailsRevPointsDelegate.Payload");
                arrayList.add((ip0.f8) obj2);
            }
            for (ip0.f8 f8Var : arrayList) {
                if (f8Var.f164213b) {
                    or0.b.e(this, data.f164032b, textView, null, 12);
                }
                if (f8Var.f164214c) {
                    q(data, holder);
                }
                if (f8Var.f164212a) {
                    revPointsPriceView.setContent(data.d);
                }
                if (f8Var.d) {
                    View itemView2 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                    or0.b.c(this, data, itemView2, false, null, 28);
                }
            }
        }
        View itemView3 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
        gq0.b bVarF = hx7.b.f(data.f164032b);
        CharSequence pointsText = revPointsPriceView.getPointsText();
        if (pointsText != null) {
            Intrinsics.checkNotNullParameter(pointsText, "<this>");
            cVar = new gq0.c(pointsText);
        } else {
            cVar = null;
        }
        CharSequence priceText = revPointsPriceView.getPriceText();
        if (priceText != null) {
            Intrinsics.checkNotNullParameter(priceText, "<this>");
            cVar2 = new gq0.c(priceText);
        }
        gq0.d[] elements = {bVarF, cVar, cVar2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        hx7.b.u(kotlin.collections.d.L(elements), itemView3);
    }

    public final void q(ip0.e8 e8Var, ip0.g8 g8Var) {
        ImageView imageView = g8Var.f164368g;
        knm.b.z(imageView, e8Var.f164033c != null, null, 14);
        View view = g8Var.itemView;
        yy0.f.e(h30.l.z(view, "itemView", view), e8Var.f164033c, g8Var.f164368g, null, null, 12);
        if (e8Var.f164033c != null) {
            imageView.setOnClickListener(new ap0.f(this, e8Var, 21));
        } else {
            imageView.setOnClickListener(null);
        }
    }
}
