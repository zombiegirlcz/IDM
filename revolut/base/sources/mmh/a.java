package mmh;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate f207218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListSubheaderDelegate f207219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SmallActionButtonDelegate f207220c;

    public a(RowDelegate rowDelegate, ListSubheaderDelegate listSubheaderDelegate, SmallActionButtonDelegate smallActionButtonDelegate) {
        Intrinsics.checkNotNullParameter(rowDelegate, "rowDelegate");
        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
        Intrinsics.checkNotNullParameter(smallActionButtonDelegate, "smallActionButtonDelegate");
        this.f207218a = rowDelegate;
        this.f207219b = listSubheaderDelegate;
        this.f207220c = smallActionButtonDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f207218a, aVar.f207218a) && Intrinsics.f(this.f207219b, aVar.f207219b) && Intrinsics.f(this.f207220c, aVar.f207220c);
    }

    public final int hashCode() {
        return this.f207220c.hashCode() + ((this.f207219b.hashCode() + (this.f207218a.hashCode() * 31)) * 31);
    }
}
