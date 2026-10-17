package com.revolut.core.ui_kit.delegates;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0002\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CompactCellLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/fb;", "Lip0/gb;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CompactCellLoadingDelegate extends BaseRecyclerViewDelegate<ip0.fb, ip0.gb> {
    public CompactCellLoadingDelegate() {
        super(R$layout.internal_delegate_compact_cell_loading, new ip0.h8(28));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.gb(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_compact_cell_loading));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ void p(RecyclerView.ViewHolder viewHolder, koi.j jVar, int i, List list) {
        p((ip0.gb) viewHolder, i, list);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ void p(koi.b bVar, koi.j jVar, int i, List list) {
        p((ip0.gb) bVar, i, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(ip0.gb r8, int r9, java.util.List r10) {
        /*
            r7 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "data"
            r2 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "payloads"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            super.p(r8, r2, r9, r10)
            r9 = r10
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            boolean r0 = r9 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L25
            r0 = r9
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L25
            goto L34
        L25:
            java.util.Iterator r9 = r9.iterator()
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L34
            r9.next()
            r9 = r1
            goto L35
        L34:
            r9 = r10
        L35:
            if (r9 != 0) goto L39
            zhm.f0 r9 = zhm.f0.f322471a
        L39:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.revolut.core.ui_kit.delegates.CompactCellLoadingDelegate.Payload>"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            boolean r0 = r9.isEmpty()
            java.util.Collection r10 = (java.util.Collection) r10
            int r10 = r10.size()
            r3 = 0
            r4 = r3
            r3 = r0
        L4b:
            if (r4 >= r10) goto L64
            java.lang.Object r5 = r9.get(r4)
            if (r5 != 0) goto L5e
            if (r0 == 0) goto L5d
            if (r3 == 0) goto L5c
            int r4 = r4 + 1
            r3 = 1
            r0 = r3
            goto L4b
        L5c:
            throw r1
        L5d:
            throw r1
        L5e:
            java.lang.ClassCastException r8 = new java.lang.ClassCastException
            r8.<init>()
            throw r8
        L64:
            if (r0 != 0) goto L7d
            if (r3 == 0) goto L77
            android.view.View r3 = r8.itemView
            java.lang.String r9 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r9)
            r5 = 0
            r6 = 28
            r4 = 0
            r1 = r7
            or0.b.c(r1, r2, r3, r4, r5, r6)
        L77:
            com.facebook.shimmer.ShimmerFrameLayout r8 = r8.f
            ifk.b.r(r8)
            return
        L7d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.CompactCellLoadingDelegate.p(ip0.gb, int, java.util.List):void");
    }
}
