package xo9;

import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f307740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NaviCommand f307741b;

    public c(int i, CompositeCommand compositeCommand) {
        this.f307740a = i;
        this.f307741b = compositeCommand;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f307740a == cVar.f307740a && Intrinsics.f(this.f307741b, cVar.f307741b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f307740a) * 31;
        NaviCommand naviCommand = this.f307741b;
        return iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode());
    }
}
