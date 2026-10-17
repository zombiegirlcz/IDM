package f9c;

import com.revolut.retail.core.navigation.NaviCommand;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NaviCommand f132913a;

    public b() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f132913a, ((b) obj2).f132913a);
    }

    public final int hashCode() {
        NaviCommand naviCommand = this.f132913a;
        if (naviCommand == null) {
            return 0;
        }
        return naviCommand.hashCode();
    }

    public b(NaviCommand naviCommand) {
        this.f132913a = naviCommand;
    }
}
