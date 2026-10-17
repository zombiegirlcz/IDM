package nze;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NaviCommand f221038a;

    public n(NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
        this.f221038a = naviCommand;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f221038a, ((n) obj2).f221038a);
    }

    public final int hashCode() {
        return this.f221038a.hashCode();
    }
}
