package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.a60;
import ip0.l40;
import ip0.r50;
import ip0.s50;
import ip0.t50;
import ip0.z50;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\u0002\u0006\u0003\u0007\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ProgressTimelineDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/s50;", "Lip0/a60;", "<init>", "()V", "ip0/t50", "ip0/y50", "com/revolut/core/ui_kit/delegates/pc", "StepDelegate", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProgressTimelineDelegate extends BaseRecyclerViewDelegate<s50, a60> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StepDelegate f53032c;
    public final koi.c d;
    public final ee.b e;
    public final a61.a f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ProgressTimelineDelegate$StepDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/pc;", "Lcom/revolut/core/ui_kit/delegates/oc;", "<init>", "()V", "com/revolut/core/ui_kit/delegates/nc", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StepDelegate extends BaseRecyclerViewDelegate<pc, oc> {
        public StepDelegate() {
            super(R$id.internal_progress_timeline_step_view_delegate_type, new l40(6));
        }

        public static oc q(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new oc(new ms0.o3(context, null, 0, 14));
        }

        @Override // koi.k
        public final /* bridge */ /* synthetic */ RecyclerView.ViewHolder g(ViewGroup viewGroup) {
            return q(viewGroup);
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void p(oc holder, pc data, int i, List payloads) {
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
                if (!(payloads.get(i2) instanceof nc)) {
                    payloads = null;
                    break;
                }
                i2++;
            }
            boolean zN = ue0.e.n(payloads);
            boolean zN2 = ue0.e.n(payloads);
            boolean zN3 = ue0.e.n(payloads);
            boolean zN4 = ue0.e.n(payloads);
            if (payloads != null) {
                for (nc ncVar : payloads) {
                    zN = zN || ncVar.f54507b;
                    zN2 = zN2 || ncVar.f54506a;
                    zN3 = zN3 || ncVar.f54508c;
                    zN4 = zN4 || ncVar.d;
                }
            }
            if (zN || zN2 || zN3 || zN4) {
                holder.f.setModel(data);
            }
        }
    }

    public ProgressTimelineDelegate() {
        super(R$layout.internal_delegate_progress_timeline, new l40(5));
        StepDelegate stepDelegate = new StepDelegate();
        this.f53032c = stepDelegate;
        this.d = new koi.c(zhm.u.c(stepDelegate));
        this.e = new ee.b(new mc(this, 0));
        this.f = new a61.a(new mc(this, 1));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new a60(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_progress_timeline));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(a60 holder, s50 data, int i, List list) {
        RecyclerView recyclerView;
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
            if (!(payloads.get(i3) instanceof t50)) {
                payloads = null;
                break;
            }
            i3++;
        }
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        if (payloads != null) {
            int size2 = payloads.size();
            for (int i5 = 0; i5 < size2; i5++) {
                t50 t50Var = (t50) payloads.get(i5);
                zN = zN || t50Var.f166458a;
                zN2 = zN2 || t50Var.f166459b;
                zN3 = zN3 || t50Var.f166460c;
            }
        }
        boolean z = !Intrinsics.f(holder.f163400h, this.d.e()) || zN3;
        if (zN || z) {
            if (this.e.f125044b == null) {
                this.e.d(new ie7.a(holder, 14));
            }
            holder.f.setAdapter(new z4l.j(this.d, false, 14));
            List listD1 = zhm.d0.d1(this.d.e());
            Intrinsics.checkNotNullParameter(listD1, "<set-?>");
            holder.f163400h = listD1;
            ArrayList arrayList = data.f166299a;
            a61.a aVar = this.f;
            int size3 = arrayList.size();
            int i6 = 0;
            int i21 = 0;
            while (true) {
                if (i6 < size3) {
                    pc pcVar = (pc) arrayList.get(i6);
                    LinkedHashMap linkedHashMap = (LinkedHashMap) aVar.f1532c;
                    hr0.a aVar2 = (hr0.a) linkedHashMap.get(pcVar);
                    if (aVar2 != null) {
                        aVar2.f154749b++;
                    } else {
                        linkedHashMap.put(pcVar, new hr0.a(((mc) aVar.f1531b).invoke(pcVar)));
                    }
                    hr0.a aVar3 = (hr0.a) ((LinkedHashMap) aVar.f1532c).get(pcVar);
                    if (aVar3 == null) {
                        throw new IllegalArgumentException(("Cannot find value for a key that has not been retained: " + pcVar).toString());
                    }
                    int iIntValue = ((Number) aVar3.f154748a).intValue();
                    int i22 = holder.f163399g.f167399b;
                    if (iIntValue >= i22) {
                        aVar.a0();
                        i21 = i22;
                        break;
                    } else {
                        if (iIntValue > i21) {
                            i21 = iIntValue;
                        }
                        i6++;
                    }
                } else {
                    aVar.a0();
                    int i32 = holder.f163399g.f167398a;
                    if (i21 < i32) {
                        i21 = i32;
                    }
                }
            }
            Context context = holder.f.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            z50 z50Var = holder.f163399g;
            holder.f.setLayoutManager(new ProgressTimelineLayoutManager(context, i21, z50Var.f167400c, z50Var.d));
        }
        if (zN || z) {
            RecyclerView.Adapter adapter = holder.f.getAdapter();
            Intrinsics.i(adapter, "null cannot be cast to non-null type com.revolut.rxdiffadapter.RxDiffAdapter");
            ((z4l.j) adapter).c(data.f166299a);
            holder.f.invalidateItemDecorations();
            while (true) {
                recyclerView = holder.f;
                if (recyclerView.getItemDecorationCount() <= 0) {
                    break;
                } else {
                    recyclerView.removeItemDecorationAt(0);
                }
            }
            i2 = 0;
            z50 z50Var2 = holder.f163399g;
            recyclerView.addItemDecoration(new sq0.k(z50Var2.d, z50Var2.f167400c));
        } else {
            i2 = 0;
        }
        if (zN2) {
            r50 r50Var = data.f166300b;
            Iterator it8 = data.f166299a.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    i2 = -1;
                    break;
                } else if (Intrinsics.f(((pc) it8.next()).f54582a, r50Var.f166122a)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 >= 0) {
                if (zN || !r50Var.f166123b) {
                    holder.f.scrollToPosition(i2);
                } else {
                    holder.f.smoothScrollToPosition(i2);
                }
            }
        }
        if (zN3) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
    }
}
