package ip0;

import com.revolut.core.ui_kit.delegates.DisplayCurrencyPreviewDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ne implements vn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f165498a;

    public ne(TextClause text) {
        Intrinsics.checkNotNullParameter("displayCurrencyPreviewDelegate_currentCurrency", "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f165498a = text;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new DisplayCurrencyPreviewDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51809a() {
        return "displayCurrencyPreviewDelegate_currentCurrency";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ne) && this.f165498a.equals(((ne) obj2).f165498a);
    }

    public final int hashCode() {
        return this.f165498a.hashCode() - 495322053;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof ne ? (ne) oldItem : null) == null) {
            return null;
        }
        ((ne) oldItem).getClass();
        return new oe(!true, !r5.f165498a.equals(this.f165498a));
    }
}
