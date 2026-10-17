package yp3;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NaviCommand f315773a;

    public h(NaviCommand naviCommand) {
        this.f315773a = naviCommand;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f315773a, ((h) obj2).f315773a);
    }

    public final int hashCode() {
        NaviCommand naviCommand = this.f315773a;
        if (naviCommand == null) {
            return 0;
        }
        return naviCommand.hashCode();
    }
}
