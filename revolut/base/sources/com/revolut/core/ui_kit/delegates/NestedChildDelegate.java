package com.revolut.core.ui_kit.delegates;

import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import koi.b;
import koi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/NestedChildDelegate;", "Lkoi/j;", "T", "Lkoi/b;", "VH", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class NestedChildDelegate<T extends koi.j, VH extends koi.b> extends BaseRecyclerViewDelegate<T, VH> {
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: m */
    public final void p(koi.b holder, koi.j data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        p(holder, data, payloads, null);
    }

    public abstract void p(koi.b bVar, koi.j jVar, List list, koi.j jVar2);

    public final void q(koi.b holder, koi.j data, int i, List payloads, koi.j parentItem) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        Intrinsics.checkNotNullParameter(parentItem, "parentItem");
        super.p(holder, data, i, payloads);
        p(holder, data, payloads, parentItem);
    }
}
