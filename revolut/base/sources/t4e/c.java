package t4e;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListSubheaderDelegate f267975a;

    public c(ListSubheaderDelegate listSubheaderDelegate) {
        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
        this.f267975a = listSubheaderDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f267975a, ((c) obj2).f267975a);
    }

    public final int hashCode() {
        return this.f267975a.hashCode();
    }
}
