package ip0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f167074a;

    public x(ArrayList actionsLists) {
        Intrinsics.checkNotNullParameter(actionsLists, "actionsLists");
        this.f167074a = actionsLists;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && this.f167074a.equals(((x) obj2).f167074a);
    }

    public final int hashCode() {
        return this.f167074a.hashCode();
    }
}
