package di3;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NaviCommand f114893a;

    public m(NaviCommand command) {
        Intrinsics.checkNotNullParameter(command, "command");
        this.f114893a = command;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f114893a, ((m) obj2).f114893a);
    }

    public final int hashCode() {
        return this.f114893a.hashCode();
    }
}
