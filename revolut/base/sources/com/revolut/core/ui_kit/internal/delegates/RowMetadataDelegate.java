package com.revolut.core.ui_kit.internal.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.qf;
import com.revolut.core.ui_kit.delegates.rf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.uf;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.delegates.zf;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pq0.d;
import pq0.e;
import pq0.f;
import pq0.g;
import pq0.h;
import qv0.c;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/internal/delegates/RowMetadataDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lpq0/f;", "Lpq0/h;", "<init>", "()V", "pq0/g", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RowMetadataDelegate extends BaseRecyclerViewDelegate<f, h> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RowDelegate f55844c;

    public RowMetadataDelegate() {
        super(R$layout.internal_row_metadata_layout, new d(0));
        this.f55844c = new RowDelegate(null, null, 7);
    }

    public static void p(zf zfVar, f fVar) {
        TextView textViewZ;
        e eVarE = fVar.e();
        Context context = zfVar.itemView.getContext();
        RowDelegate.Model modelA = fVar.a();
        View view = zfVar.itemView;
        Intrinsics.h(context);
        view.setBackgroundColor(kli.a.s(eVarE.a(), context));
        zfVar.U().setTextColor(kli.a.s(eVarE.c(), context));
        RowDelegate.Model.c k = modelA.getK();
        if (k instanceof RowDelegate.Model.c.b) {
            textViewZ = zfVar.Z();
        } else {
            if (!(k instanceof pf) && !(k instanceof qf) && !(k instanceof rf) && !(k instanceof tf) && !(k instanceof vf) && !(k instanceof RowDelegate.Model.c.a) && !(k instanceof uf) && k != null) {
                throw new NoWhenBranchMatchedException();
            }
            textViewZ = null;
        }
        if (textViewZ != null) {
            textViewZ.setTextColor(kli.a.s(eVarE.c(), context));
        }
        rd0.e.q(zfVar.N(), Integer.valueOf(kli.a.s(eVarE.b(), context)));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewR = s.r(parent, this.f98535a);
        View viewFindViewById = viewR.findViewById(R$id.rowMetadata_rowContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f55844c.getClass();
        h hVar = new h(viewR, RowDelegate.A((ViewGroup) viewFindViewById));
        hVar.F().addView(hVar.H().itemView);
        return hVar;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(h holder, f data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        boolean zIsEmpty = payloads.isEmpty();
        RowDelegate rowDelegate = this.f55844c;
        if (zIsEmpty) {
            rowDelegate.p(holder.H(), data.a(), i, f0.f322471a);
            p(holder.H(), data);
            c f55062g = data.getF55062g();
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.j(this, f55062g, itemView);
            return;
        }
        ArrayList<g> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof g) {
                arrayList.add(obj2);
            }
        }
        for (g gVar : arrayList) {
            rowDelegate.p(holder.H(), data.a(), i, v.l(gVar.a()));
            if (gVar.b()) {
                c f55062g2 = data.getF55062g();
                View itemView2 = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                or0.b.j(this, f55062g2, itemView2);
                p(holder.H(), data);
            }
        }
    }
}
