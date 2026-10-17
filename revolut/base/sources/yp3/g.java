package yp3;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NaviCommand f315772a;

    public g(NaviCommand naviCommand) {
        this.f315772a = naviCommand;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f315772a, ((g) obj2).f315772a);
    }

    public final int hashCode() {
        NaviCommand naviCommand = this.f315772a;
        if (naviCommand == null) {
            return 0;
        }
        return naviCommand.hashCode();
    }
}
