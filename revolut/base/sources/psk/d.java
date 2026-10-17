package psk;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListSubheaderLoadingDelegate f239497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListSubheaderDelegate f239498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f239499c;

    public d(ListSubheaderLoadingDelegate listSubheaderLoadingDelegate, ListSubheaderDelegate listSubheaderDelegate, c gridBoxDelegates) {
        Intrinsics.checkNotNullParameter(listSubheaderLoadingDelegate, "listSubheaderLoadingDelegate");
        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
        Intrinsics.checkNotNullParameter(gridBoxDelegates, "gridBoxDelegates");
        this.f239497a = listSubheaderLoadingDelegate;
        this.f239498b = listSubheaderDelegate;
        this.f239499c = gridBoxDelegates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f239497a, dVar.f239497a) && Intrinsics.f(this.f239498b, dVar.f239498b) && Intrinsics.f(this.f239499c, dVar.f239499c);
    }

    public final int hashCode() {
        return this.f239499c.hashCode() + ((this.f239498b.hashCode() + (this.f239497a.hashCode() * 31)) * 31);
    }
}
