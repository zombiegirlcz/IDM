package c84;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NaviCommand f22097a;

    public l() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f22097a, ((l) obj2).f22097a);
    }

    public final int hashCode() {
        NaviCommand naviCommand = this.f22097a;
        if (naviCommand == null) {
            return 0;
        }
        return naviCommand.hashCode();
    }

    public l(NaviCommand naviCommand) {
        this.f22097a = naviCommand;
    }
}
