package noc;

import com.revolut.core.ui_kit.delegates.HorizontalBarGroupDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListSubheaderDelegate f217978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButtonDelegate f217979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RowLoadingDelegate f217980c;
    public final HorizontalBarGroupDelegate d;

    public e(ListSubheaderDelegate listSubheaderDelegate, LargeActionButtonDelegate dialogLargeActionButtonDelegate, RowLoadingDelegate rowLoadingDelegate, HorizontalBarGroupDelegate horizontalBarGroupDelegate) {
        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
        Intrinsics.checkNotNullParameter(dialogLargeActionButtonDelegate, "dialogLargeActionButtonDelegate");
        Intrinsics.checkNotNullParameter(rowLoadingDelegate, "rowLoadingDelegate");
        Intrinsics.checkNotNullParameter(horizontalBarGroupDelegate, "horizontalBarGroupDelegate");
        this.f217978a = listSubheaderDelegate;
        this.f217979b = dialogLargeActionButtonDelegate;
        this.f217980c = rowLoadingDelegate;
        this.d = horizontalBarGroupDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f217978a, eVar.f217978a) && Intrinsics.f(this.f217979b, eVar.f217979b) && Intrinsics.f(this.f217980c, eVar.f217980c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f217980c.hashCode() + ((this.f217979b.hashCode() + (this.f217978a.hashCode() * 31)) * 31)) * 31);
    }
}
