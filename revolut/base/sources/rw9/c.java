package rw9;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NaviCommand f257855a;

    public c(NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
        this.f257855a = naviCommand;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f257855a, ((c) obj2).f257855a);
    }

    public final int hashCode() {
        return this.f257855a.hashCode();
    }
}
