package com.revolut.core.ui_kit.recycler;

import android.view.View;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.Iterator;
import java.util.List;
import koi.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv0.i;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/recycler/BaseBoxRecyclerViewDelegate;", "Lqv0/i;", "T", "Lkoi/b;", "VH", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseBoxRecyclerViewDelegate<T extends i, VH extends b> extends BaseRecyclerViewDelegate<T, VH> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f58164c;
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBoxRecyclerViewDelegate(int i, boolean z, Function2 rule) {
        super(i, rule);
        Intrinsics.checkNotNullParameter(rule, "rule");
        this.f58164c = i;
        this.d = z;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF58164c() {
        return this.f58164c;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public void p(b holder, i data, int i, List payloads) {
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
            if (!(payloads.get(i2) instanceof qv0.b)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        Iterator it8 = payloads.iterator();
        while (it8.hasNext()) {
            zIsEmpty = zIsEmpty || ((qv0.b) it8.next()).a();
        }
        if (zIsEmpty) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, this.d, null, 24);
        }
    }
}
