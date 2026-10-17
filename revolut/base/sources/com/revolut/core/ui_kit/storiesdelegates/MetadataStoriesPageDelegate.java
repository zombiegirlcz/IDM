package com.revolut.core.ui_kit.storiesdelegates;

import akg.d;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bx0.k;
import bx0.l;
import bx0.m;
import bx0.n;
import bx0.o;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.delegates.RowMetadataDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.List;
import koi.j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import or0.b;
import pq0.e;
import pq0.f;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/storiesdelegates/MetadataStoriesPageDelegate;", "Lcom/revolut/core/ui_kit/storiesdelegates/BaseStoriesDelegate;", "Lcom/revolut/core/ui_kit/storiesdelegates/MetadataStoriesModel;", "Lbx0/n;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MetadataStoriesPageDelegate extends BaseStoriesDelegate<MetadataStoriesModel, n> {
    public final RowMetadataDelegate i;

    public MetadataStoriesPageDelegate() {
        super(R$layout.internal_metadata_stories_card, new d(11));
        this.i = new RowMetadataDelegate();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new n(this, s.r(parent, this.f98535a));
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesDelegate
    public final void s(bx0.d dVar, j jVar, List payloads) throws Throwable {
        n holder = (n) dVar;
        MetadataStoriesModel data = (MetadataStoriesModel) jVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        b.f(this, data.getD(), holder.K());
        Throwable th10 = null;
        b.e(this, data.getF58212b(), holder.P(), null, 12);
        BaseStoriesDelegate.p(holder.P(), data.getF58206r().f58277a);
        b.e(this, data.getF58213c(), holder.J(), null, 12);
        BaseStoriesDelegate.p(holder.J(), data.getF58206r().f58278b);
        List listI = data.i();
        StoryColours f58206r = data.getF58206r();
        ArrayList arrayList = new ArrayList(w.t(listI, 10));
        int i = 0;
        for (Object obj2 : listI) {
            int i2 = i + 1;
            if (i < 0) {
                Throwable th11 = th10;
                v.s();
                throw th11;
            }
            m mVar = (m) obj2;
            arrayList.add(new f(a0.d.n("ROW_METADATA_LIST_ID_", i), new e(f58206r.k, f58206r.f, f58206r.f58282j), new RowDelegate.Model(a0.d.n("ROW_LIST_ID_", i), new RowDelegate.Model.MainImage.Image24(mVar.b(), false, false, 6), mVar.c(), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(mVar.a(), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867832)));
            th10 = th10;
            i = i2;
        }
        yp0.b.k(arrayList, R$attr.uikit_dp16, 0, 0, 0, 30);
        holder.S(arrayList);
        l lVarE = data.e();
        if (lVarE instanceof bx0.j) {
            bx0.j jVar2 = (bx0.j) lVarE;
            holder.H().setVisibility(8);
            holder.I().setVisibility(0);
            q(jVar2.a(), holder.M(), holder.O(), holder.R(), false, false, jVar2.b(), null, null, null, jVar2.c(), null, null, null, data);
            return;
        }
        if (lVarE == null) {
            throw new NoWhenBranchMatchedException();
        }
        Clause clauseA = ((k) lVarE).a();
        holder.H().setVisibility(0);
        holder.I().setVisibility(8);
        holder.H().setText(clauseA);
        holder.N().setOnTouchListener(new o(this, data, holder.itemView.getContext(), 0));
        holder.H().setOnClickListener(new ap0.f(this, data, 4));
    }
}
