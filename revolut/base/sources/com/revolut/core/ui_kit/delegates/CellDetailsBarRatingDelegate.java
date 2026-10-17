package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0006\u0002\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsBarRatingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/t6;", "Lip0/w6;", "<init>", "()V", "ip0/v6", "ip0/u6", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellDetailsBarRatingDelegate extends BaseRecyclerViewDelegate<ip0.t6, ip0.w6> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f51820c;

    public CellDetailsBarRatingDelegate() {
        super(R$layout.internal_delegate_cell_details_bar_rating, new ip0.g4(15));
        this.f51820c = v0.a.d("create(...)");
    }

    public static void p(ip0.w6 w6Var, ip0.v6 v6Var) {
        ProgressBar progressBar = w6Var.f166937g;
        Context context = progressBar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        progressBar.setProgressTintList(ColorStateList.valueOf(kli.a.s(v6Var.f166776b, context)));
        Context context2 = progressBar.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(kli.a.s(v6Var.f166775a, context2)));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.w6(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_details_bar_rating));
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(ip0.w6 holder, ip0.t6 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f166938h;
        ProgressBar progressBar = holder.f166937g;
        TextView textView2 = holder.f;
        if (payloads.isEmpty()) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
            p(holder, data.d);
            progressBar.setProgress(data.f166463c);
            kli.a.b(textView2, data.f166462b, ty0.f.f275450a);
            kli.a.b(textView, data.e, ty0.f.f275450a);
            holder.itemView.setOnClickListener(new ap0.f(this, data, 17));
            return;
        }
        List list = payloads;
        ArrayList<ip0.u6> arrayList = new ArrayList(zhm.w.t(list, 10));
        for (Object obj2 : list) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.CellDetailsBarRatingDelegate.Payload");
            arrayList.add((ip0.u6) obj2);
        }
        for (ip0.u6 u6Var : arrayList) {
            if (u6Var.f166598a) {
                kli.a.b(textView2, data.f166462b, ty0.f.f275450a);
            }
            if (u6Var.f166599b) {
                progressBar.setProgress(data.f166463c);
            }
            if (u6Var.d) {
                kli.a.b(textView, data.e, ty0.f.f275450a);
            }
            if (u6Var.e) {
                View itemView2 = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                or0.b.c(this, data, itemView2, false, null, 28);
            }
            if (u6Var.f166600c) {
                p(holder, data.d);
            }
        }
    }
}
