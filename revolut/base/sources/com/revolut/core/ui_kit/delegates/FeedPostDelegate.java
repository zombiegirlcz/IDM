package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0007\u0003\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/FeedPostDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/FeedPostDelegate$Model;", "Lip0/ci;", "<init>", "()V", "Companion", "Model", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FeedPostDelegate extends BaseRecyclerViewDelegate<Model, ip0.ci> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52336c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/FeedPostDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem {
    }

    public FeedPostDelegate() {
        super(R$layout.internal_delegate_feed_post, new ip0.zf(16));
        this.f52336c = v0.a.d("create(...)");
        Intrinsics.checkNotNullExpressionValue(new ihm.f(), "create(...)");
        Intrinsics.checkNotNullExpressionValue(new ihm.f(), "create(...)");
        Intrinsics.checkNotNullExpressionValue(new ihm.f(), "create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.ci(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_feed_post));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ void p(RecyclerView.ViewHolder viewHolder, koi.j jVar, int i, List list) {
        p((ip0.ci) viewHolder, i, list);
        throw null;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ void p(koi.b bVar, koi.j jVar, int i, List list) {
        p((ip0.ci) bVar, i, list);
        throw null;
    }

    public final void p(ip0.ci holder, int i, List list) {
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(null, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, null, i, payloads);
        if (payloads.size() > 0) {
            payloads.get(0);
            payloads = null;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        boolean z31 = z29;
        boolean z41 = z31;
        boolean z49 = z41;
        int i2 = 0;
        boolean z54 = z49;
        while (i2 < size) {
            if (payloads.get(i2) != null) {
                throw new ClassCastException();
            }
            if (!zIsEmpty) {
                throw null;
            }
            if (!z54) {
                throw null;
            }
            if (!z4) {
                throw null;
            }
            if (!z) {
                throw null;
            }
            if (!z31) {
                throw null;
            }
            if (!z3) {
                throw null;
            }
            if (!z6) {
                throw null;
            }
            if (!z12) {
                throw null;
            }
            if (!z11) {
                throw null;
            }
            if (!z29) {
                throw null;
            }
            if (!z41) {
                throw null;
            }
            if (!z49) {
                throw null;
            }
            i2++;
            z49 = true;
            zIsEmpty = true;
            z54 = true;
            z = true;
            z3 = true;
            z4 = true;
            z6 = true;
            z11 = true;
            z12 = true;
            z29 = true;
            z31 = true;
            z41 = true;
        }
        if (zIsEmpty || z54 || z || z3 || z4 || z11 || z6 || z12 || z29 || z41) {
            throw null;
        }
        if (z49) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, null, itemView, false, null, 28);
        }
        Intrinsics.checkNotNullExpressionValue(holder.itemView, "itemView");
        throw null;
    }
}
