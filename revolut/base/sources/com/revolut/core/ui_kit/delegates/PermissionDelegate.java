package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ix;
import ip0.m00;
import ip0.n00;
import ip0.tz;
import ip0.ws;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PermissionDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/m00;", "Lip0/n00;", "<init>", "()V", "ip0/l00", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PermissionDelegate extends BaseRecyclerViewDelegate<m00, n00> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52893c;
    public final e01.a d;
    public final ihm.f e;

    public PermissionDelegate() {
        super(R$layout.internal_delegate_permission, new tz(5));
        this.f52893c = v0.a.d("create(...)");
        this.d = new e01.a();
        this.e = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new n00(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_permission));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(n00 holder, m00 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        or0.b.e(this, data.f165288b, holder.f, null, 12);
        Clause clause = data.f165289c;
        TextView textView = holder.f165435g;
        or0.b.e(this, clause, textView, new i4g.g(1, this.e, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 23), 8);
        or0.b.f(this, data.d, holder.f165436h);
        ActionsView actionsView = holder.i;
        Clause clause2 = data.e;
        List list = data.f;
        actionsView.setVisibility((clause2 == null && list.isEmpty()) ? 8 : 0);
        if (clause2 != null) {
            List listC = zhm.u.c(new ActionsView.Item(data.f165287a, mx0.d.SEMIACCENT, false, null, null, clause2, null, null, null, null, false, null, null, null, null, 32668));
            if (listC != null) {
                list = listC;
            }
        }
        actionsView.k(list, mx0.t.f210002a);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        holder.itemView.setOnClickListener(new ws(this, data, 5));
        efm.r map = actionsView.f58296a.f121375b.map(new ix(17, new ip0.ad(data, 28)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.d.a(map, holder);
        textView.setMovementMethod(ix0.c0.f169220a);
    }
}
