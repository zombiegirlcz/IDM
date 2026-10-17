package u43;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import kotlin.jvm.internal.Intrinsics;
import nkm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListSubheaderDelegate.Model f277034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f277035b;

    public c(ListSubheaderDelegate.Model header, d0 items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f277034a = header;
        this.f277035b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f277034a.equals(cVar.f277034a) && this.f277035b.equals(cVar.f277035b);
    }

    public final int hashCode() {
        return this.f277035b.hashCode() + (this.f277034a.hashCode() * 31);
    }
}
