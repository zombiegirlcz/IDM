package c84;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NaviCommand f22100a;

    public n() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f22100a, ((n) obj2).f22100a);
    }

    public final int hashCode() {
        NaviCommand naviCommand = this.f22100a;
        if (naviCommand == null) {
            return 0;
        }
        return naviCommand.hashCode();
    }

    public n(NaviCommand naviCommand) {
        this.f22100a = naviCommand;
    }
}
