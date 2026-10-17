package ip0;

import com.revolut.core.ui_kit.delegates.TransactionsCountPreviewDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class nl0 implements vn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f165533a;

    public nl0(int i) {
        Intrinsics.checkNotNullParameter("displayCurrencyPreviewDelegate_transactionsCount", "listId");
        this.f165533a = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new TransactionsCountPreviewDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52127a() {
        return "displayCurrencyPreviewDelegate_transactionsCount";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof nl0) && this.f165533a == ((nl0) obj2).f165533a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f165533a) - 334410517;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof nl0 ? (nl0) oldItem : null) != null) {
            return new ol0(((nl0) oldItem).f165533a != this.f165533a);
        }
        return null;
    }
}
