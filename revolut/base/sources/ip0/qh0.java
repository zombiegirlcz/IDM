package ip0;

import com.revolut.core.ui_kit.delegates.SummaryCardLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class qh0 implements koi.j, tw0.y {
    @Override // koi.j
    public final koi.k T1() {
        return new SummaryCardLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52256a() {
        return "portfolio_reveal_card";
    }

    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof qh0);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + 60005781;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof qh0 ? (qh0) oldItem : null) != null) {
            return new ph0(false);
        }
        return null;
    }
}
