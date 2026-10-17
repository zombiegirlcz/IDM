package ya4;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NaviCommand f311918a;

    public b(NaviCommand naviCommand) {
        this.f311918a = naviCommand;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f311918a, ((b) obj2).f311918a);
    }

    public final int hashCode() {
        NaviCommand naviCommand = this.f311918a;
        if (naviCommand == null) {
            return 0;
        }
        return naviCommand.hashCode();
    }
}
