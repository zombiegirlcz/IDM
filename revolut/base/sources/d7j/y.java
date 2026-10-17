package d7j;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f112078a;

    public y(List reloadCommands) {
        Intrinsics.checkNotNullParameter(reloadCommands, "reloadCommands");
        this.f112078a = reloadCommands;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f112078a, ((y) obj2).f112078a);
    }

    public final int hashCode() {
        return this.f112078a.hashCode();
    }
}
