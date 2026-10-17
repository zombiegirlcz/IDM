package xn6;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NaviCommand f307324a;

    public i(NaviCommand command) {
        Intrinsics.checkNotNullParameter(command, "command");
        this.f307324a = command;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f307324a, ((i) obj2).f307324a);
    }

    public final int hashCode() {
        return this.f307324a.hashCode();
    }
}
