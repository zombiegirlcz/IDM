package com.revolut.recyclerkit.delegates;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import koi.b;
import koi.j;
import koi.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lkoi/j;", "T", "Lkoi/b;", "VH", "Lkoi/k;", "recycler_kit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseRecyclerViewDelegate<T extends j, VH extends b> implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function2 f98536b;

    public BaseRecyclerViewDelegate(int i, Function2 rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        this.f98535a = i;
        this.f98536b = rule;
    }

    @Override // koi.k
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getF98535a() {
        return this.f98535a;
    }

    @Override // koi.k
    public boolean f(int i, j data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return ((Boolean) this.f98536b.invoke(Integer.valueOf(i), data)).booleanValue();
    }

    @Override // koi.k
    /* JADX INFO: renamed from: m */
    public void p(b holder, j data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        holder.e = data;
    }

    @Override // koi.k
    public void n(b holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // koi.k
    public void o(b holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // koi.k
    public void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }
}
