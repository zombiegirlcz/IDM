package yp3;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NaviCommand f315777a;

    public j(NaviCommand naviCommand) {
        this.f315777a = naviCommand;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f315777a, ((j) obj2).f315777a);
    }

    public final int hashCode() {
        NaviCommand naviCommand = this.f315777a;
        if (naviCommand == null) {
            return 0;
        }
        return naviCommand.hashCode();
    }
}
