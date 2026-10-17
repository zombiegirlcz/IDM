package dcf;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Flow f112918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButtonDelegate f112919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextDelegate f112920c;
    public final RowDelegate d;
    public final ListCellDelegate e;

    public c(Flow goToButtonFlow, LargeActionButtonDelegate largeActionButtonDelegate, TextDelegate textDelegate, RowDelegate rowDelegate, ListCellDelegate listCellDelegate) {
        Intrinsics.checkNotNullParameter(goToButtonFlow, "goToButtonFlow");
        Intrinsics.checkNotNullParameter(largeActionButtonDelegate, "largeActionButtonDelegate");
        Intrinsics.checkNotNullParameter(textDelegate, "textDelegate");
        Intrinsics.checkNotNullParameter(rowDelegate, "rowDelegate");
        Intrinsics.checkNotNullParameter(listCellDelegate, "listCellDelegate");
        this.f112918a = goToButtonFlow;
        this.f112919b = largeActionButtonDelegate;
        this.f112920c = textDelegate;
        this.d = rowDelegate;
        this.e = listCellDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f112918a, cVar.f112918a) && Intrinsics.f(this.f112919b, cVar.f112919b) && Intrinsics.f(this.f112920c, cVar.f112920c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f112920c.hashCode() + ((this.f112919b.hashCode() + (this.f112918a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
