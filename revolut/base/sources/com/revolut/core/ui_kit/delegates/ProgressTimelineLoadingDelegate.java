package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.b60;
import ip0.c60;
import ip0.d60;
import ip0.e60;
import ip0.f60;
import ip0.l40;
import ip0.z50;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0002\u0006\u0003\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ProgressTimelineLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/b60;", "Lip0/e60;", "<init>", "()V", "ip0/c60", "ip0/d60", "StepDelegate", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProgressTimelineLoadingDelegate extends BaseRecyclerViewDelegate<b60, e60> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final koi.c f53036c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0003\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ProgressTimelineLoadingDelegate$StepDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/qc;", "Lcom/revolut/core/ui_kit/delegates/sc;", "<init>", "()V", "com/revolut/core/ui_kit/delegates/rc", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StepDelegate extends BaseRecyclerViewDelegate<qc, sc> {
        public StepDelegate() {
            super(R$layout.internal_view_progress_timeline_loading_step, new l40(8));
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new sc(kotlin.jvm.internal.s.r(parent, this.f98535a));
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void p(sc holder, qc data, int i, List payloads) {
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
                if (!(payloads.get(i2) instanceof rc)) {
                    payloads = null;
                    break;
                }
                i2++;
            }
            boolean zN = ue0.e.n(payloads);
            if (payloads != null) {
                int size2 = payloads.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    zN = zN || ((rc) payloads.get(i3)).f54662a;
                }
            }
            if (zN) {
                holder.f54712g.setVisibility(data.f54631b == d60.DEFAULT ? 0 : 8);
            }
            io3.h.s(holder.f);
        }
    }

    public ProgressTimelineLoadingDelegate() {
        super(R$layout.internal_delegate_progress_timeline_loading, new l40(7));
        this.f53036c = new koi.c(zhm.u.c(new StepDelegate()));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new e60(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(e60 holder, b60 data, int i, List list) {
        int i2;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        int size = payloads.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            if (!(payloads.get(i3) instanceof c60)) {
                payloads = null;
                break;
            }
            i3++;
        }
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        if (payloads != null) {
            int size2 = payloads.size();
            for (int i5 = 0; i5 < size2; i5++) {
                c60 c60Var = (c60) payloads.get(i5);
                zN = zN || c60Var.f163688a;
                zN2 = zN2 || c60Var.f163689b;
                zN3 = zN3 || c60Var.f163690c;
                zN4 = zN4 || c60Var.d;
            }
        }
        List list2 = holder.f164027h;
        z50 z50Var = holder.f164026g;
        RecyclerView recyclerView = holder.f;
        koi.c cVar = this.f53036c;
        boolean z = !Intrinsics.f(list2, cVar.e()) || zN4;
        if (z) {
            recyclerView.setAdapter(new z4l.j(cVar, false, 14));
            List listD1 = zhm.d0.d1(cVar.e());
            Intrinsics.checkNotNullParameter(listD1, "<set-?>");
            holder.f164027h = listD1;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Parcelable parcelableOnSaveInstanceState = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
            Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int i6 = f60.f164205a[data.f163540c.ordinal()];
            if (i6 == 1) {
                i2 = z50Var.f167399b;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = z50Var.f167398a;
            }
            ProgressTimelineLayoutManager progressTimelineLayoutManager = new ProgressTimelineLayoutManager(context, i2, z50Var.f167400c, z50Var.d);
            recyclerView.setLayoutManager(progressTimelineLayoutManager);
            progressTimelineLayoutManager.onRestoreInstanceState(parcelableOnSaveInstanceState);
        }
        if (zN || z) {
            int i21 = data.f163539b;
            ArrayList arrayList = new ArrayList(i21);
            for (int i22 = 0; i22 < i21; i22++) {
                arrayList.add(new qc(String.valueOf(i22), data.f163540c));
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            Intrinsics.i(adapter, "null cannot be cast to non-null type com.revolut.rxdiffadapter.RxDiffAdapter");
            ((z4l.j) adapter).c(arrayList);
            recyclerView.invalidateItemDecorations();
            while (recyclerView.getItemDecorationCount() > 0) {
                recyclerView.removeItemDecorationAt(0);
            }
            recyclerView.addItemDecoration(new sq0.k(z50Var.d, z50Var.f167400c));
        }
        if (zN2) {
            data.getClass();
        }
        if (zN4) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
    }
}
