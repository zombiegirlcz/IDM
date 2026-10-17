package of1;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NaviCommand f224680a;

    public e(NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
        this.f224680a = naviCommand;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f224680a, ((e) obj2).f224680a);
    }

    public final int hashCode() {
        return this.f224680a.hashCode();
    }
}
