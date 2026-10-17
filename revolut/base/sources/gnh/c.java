package gnh;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate f144990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListSubheaderDelegate f144991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SmallStockCardDelegate f144992c;
    public final ScrollerDelegate d;
    public final ScrollerBoxDelegate e;
    public final ReferralContactDelegate f;

    public c(RowDelegate rowDelegate, ListSubheaderDelegate listSubheaderDelegate, SmallStockCardDelegate smallStockCardDelegate, ScrollerDelegate scrollerDelegate, ScrollerBoxDelegate scrollerBoxDelegate, ReferralContactDelegate referralContactDelegate) {
        Intrinsics.checkNotNullParameter(rowDelegate, "rowDelegate");
        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
        Intrinsics.checkNotNullParameter(smallStockCardDelegate, "smallStockCardDelegate");
        Intrinsics.checkNotNullParameter(scrollerDelegate, "scrollerDelegate");
        Intrinsics.checkNotNullParameter(scrollerBoxDelegate, "scrollerBoxDelegate");
        Intrinsics.checkNotNullParameter(referralContactDelegate, "referralContactDelegate");
        this.f144990a = rowDelegate;
        this.f144991b = listSubheaderDelegate;
        this.f144992c = smallStockCardDelegate;
        this.d = scrollerDelegate;
        this.e = scrollerBoxDelegate;
        this.f = referralContactDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f144990a, cVar.f144990a) && Intrinsics.f(this.f144991b, cVar.f144991b) && Intrinsics.f(this.f144992c, cVar.f144992c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f144992c.hashCode() + ((this.f144991b.hashCode() + (this.f144990a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
