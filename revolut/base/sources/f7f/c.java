package f7f;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f132603a;

    public c(List actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f132603a = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f132603a, ((c) obj2).f132603a);
    }

    public final int hashCode() {
        return this.f132603a.hashCode();
    }
}
