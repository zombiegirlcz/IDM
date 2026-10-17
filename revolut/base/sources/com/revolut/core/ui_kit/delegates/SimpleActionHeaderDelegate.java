package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.e30;
import ip0.ie0;
import ip0.t90;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SimpleActionHeaderDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/SimpleActionHeaderDelegate$Model;", "Lip0/ie0;", "<init>", "()V", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SimpleActionHeaderDelegate extends BaseRecyclerViewDelegate<Model, ie0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f53321c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SimpleActionHeaderDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lqv0/q;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, qv0.q, TrackableItem {
    }

    public SimpleActionHeaderDelegate() {
        super(R$layout.internal_delegate_simple_action_header, new t90(29));
        this.f53321c = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ie0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_simple_action_header));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ void p(RecyclerView.ViewHolder viewHolder, koi.j jVar, int i, List list) {
        p((ie0) viewHolder, i, list);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ void p(koi.b bVar, koi.j jVar, int i, List list) {
        p((ie0) bVar, i, list);
    }

    public final void p(ie0 holder, int i, List payloads) {
        SimpleActionHeaderDelegate simpleActionHeaderDelegate;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(null, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, null, i, payloads);
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        Iterator it8 = payloads.iterator();
        while (it8.hasNext()) {
            it8.next();
        }
        if (zN) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            simpleActionHeaderDelegate = this;
            or0.b.c(simpleActionHeaderDelegate, null, itemView, false, null, 28);
        } else {
            simpleActionHeaderDelegate = this;
        }
        if (zN2) {
            throw null;
        }
        efm.r map = holder.f.f56386h.map(new e30(new ip0.za(21), 25));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        simpleActionHeaderDelegate.f53321c.a(map, holder);
    }
}
