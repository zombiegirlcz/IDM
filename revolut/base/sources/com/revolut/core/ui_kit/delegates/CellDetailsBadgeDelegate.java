package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.DoubleTagView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsBadgeDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/q6;", "Lip0/s6;", "<init>", "()V", "ip0/r6", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellDetailsBadgeDelegate extends BaseRecyclerViewDelegate<ip0.q6, ip0.s6> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f51819c;
    public final e01.a d;
    public final ihm.f e;

    public CellDetailsBadgeDelegate() {
        super(R$layout.internal_delegate_cell_details_badge, new ip0.g4(14));
        this.f51819c = new e01.a();
        this.d = new e01.a();
        this.e = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.s6(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_details_badge));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v17, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r3v12, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.s6 holder, ip0.q6 data, int i, List payloads) {
        char c2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        AppCompatTextView appCompatTextView = holder.i;
        ImageView imageView = holder.f166305g;
        TextView textView = holder.f;
        DoubleTagView doubleTagView = holder.f166306h;
        gq0.b bVarF = null;
        if (payloads.isEmpty()) {
            c2 = 0;
            ip0.p6 p6Var = data.e;
            doubleTagView.setPrimaryTag(p6Var.X());
            doubleTagView.setSecondaryTag(null);
            kli.a.b(textView, data.f165923b, ty0.f.f275450a);
            knm.b.z(imageView, data.f165924c != null, null, 14);
            View view = holder.itemView;
            yy0.f.e(h30.l.z(view, "itemView", view), data.f165924c, holder.f166305g, null, null, 12);
            ip0.m6 m6Var = p6Var instanceof ip0.m6 ? (ip0.m6) p6Var : null;
            kli.a.b(appCompatTextView, m6Var != null ? m6Var.f165322b : 0, ty0.f.f275450a);
        } else {
            List list = payloads;
            ArrayList<ip0.r6> arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.CellDetailsBadgeDelegate.Payload");
                arrayList.add((ip0.r6) obj2);
            }
            for (ip0.r6 r6Var : arrayList) {
                if (r6Var.f166124a) {
                    kli.a.b(textView, data.f165923b, ty0.f.f275450a);
                }
                if (r6Var.d) {
                    doubleTagView.setPrimaryTag(data.e.X());
                }
                if (r6Var.e) {
                    ip0.p6 p6Var2 = data.e;
                    doubleTagView.setSecondaryTag(null);
                }
                if (r6Var.f166125b) {
                    knm.b.z(imageView, data.f165924c != null, null, 14);
                    View view2 = holder.itemView;
                    yy0.f.e(h30.l.z(view2, "itemView", view2), data.f165924c, holder.f166305g, null, null, 12);
                }
                if (r6Var.f166126c) {
                    q(holder, data, data.d);
                }
                if (r6Var.f) {
                    ip0.p6 p6Var3 = data.e;
                    ip0.m6 m6Var2 = p6Var3 instanceof ip0.m6 ? (ip0.m6) p6Var3 : null;
                    kli.a.b(appCompatTextView, m6Var2 != null ? m6Var2.f165322b : 0, ty0.f.f275450a);
                }
            }
            c2 = 0;
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        this.f51819c.a(doubleTagView.f58516b, holder);
        this.d.a(doubleTagView.f, holder);
        boolean z = data.d;
        ip0.p6 p6Var4 = data.e;
        q(holder, data, z);
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        gq0.b bVarF2 = hx7.b.f(data.f165923b);
        Clause clause = p6Var4.X().f57641b;
        gq0.b bVarF3 = clause != null ? hx7.b.f(clause) : null;
        if (!(p6Var4 instanceof ip0.o6)) {
            if (p6Var4 instanceof ip0.n6) {
                throw null;
            }
            if (!(p6Var4 instanceof ip0.m6)) {
                throw new NoWhenBranchMatchedException();
            }
            bVarF = hx7.b.f(((ip0.m6) p6Var4).f165322b);
        }
        gq0.d[] elements = new gq0.d[3];
        elements[c2] = bVarF2;
        elements[1] = bVarF3;
        elements[2] = bVarF;
        Intrinsics.checkNotNullParameter(elements, "elements");
        hx7.b.u(kotlin.collections.d.L(elements), itemView2);
    }

    public final void q(ip0.s6 s6Var, ip0.q6 q6Var, boolean z) {
        TextView textView = s6Var.f;
        ImageView imageView = s6Var.f166305g;
        for (View view : zhm.v.k(textView, imageView)) {
            pd.b.q(view, z);
            pd.b.h(view, z);
            if (z) {
                view.setOnClickListener(new j01.c(new View[]{s6Var.f, imageView}, q6Var, this.e, null, 24));
            } else {
                view.setOnClickListener(null);
            }
        }
    }
}
