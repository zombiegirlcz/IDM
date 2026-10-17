package h0l;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NaviCommand f148432a;

    public c(NaviCommand naviCommand) {
        this.f148432a = naviCommand;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f148432a, ((c) obj2).f148432a);
    }

    public final int hashCode() {
        NaviCommand naviCommand = this.f148432a;
        if (naviCommand == null) {
            return 0;
        }
        return naviCommand.hashCode();
    }
}
