package com.revolut.kompot.navigable.vc.pager;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/revolut/kompot/navigable/vc/pager/FixedIdPagerItem;", "Lcom/revolut/kompot/navigable/vc/pager/PagerItem;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FixedIdPagerItem extends PagerItem {
    @Override // com.revolut.kompot.navigable.vc.pager.PagerItem
    default String getId() {
        String name = getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }
}
