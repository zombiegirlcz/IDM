package emd;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NaviCommand f127651a;

    public b(NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
        this.f127651a = naviCommand;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f127651a, ((b) obj2).f127651a);
    }

    public final int hashCode() {
        return this.f127651a.hashCode();
    }
}
