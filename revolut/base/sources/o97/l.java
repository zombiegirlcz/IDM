package o97;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NaviCommand f223116a;

    public l(NaviCommand command) {
        Intrinsics.checkNotNullParameter(command, "command");
        this.f223116a = command;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f223116a, ((l) obj2).f223116a);
    }

    public final int hashCode() {
        return this.f223116a.hashCode();
    }
}
