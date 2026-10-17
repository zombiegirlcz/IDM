package ssi;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NaviCommand f265425a;

    public q(NaviCommand command) {
        Intrinsics.checkNotNullParameter(command, "command");
        this.f265425a = command;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f265425a, ((q) obj2).f265425a);
    }

    public final int hashCode() {
        return this.f265425a.hashCode();
    }
}
