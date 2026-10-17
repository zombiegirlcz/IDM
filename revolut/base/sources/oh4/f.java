package oh4;

import aii.r;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NaviCommand f225289a;

    public f(NaviCommand naviCommand) {
        this.f225289a = naviCommand;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f225289a, ((f) obj2).f225289a);
    }

    public final int hashCode() {
        NaviCommand naviCommand = this.f225289a;
        if (naviCommand == null) {
            return 0;
        }
        return naviCommand.hashCode();
    }
}
