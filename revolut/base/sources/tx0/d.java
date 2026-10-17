package tx0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f275099a;

    public d(List grouppedActions) {
        Intrinsics.checkNotNullParameter(grouppedActions, "grouppedActions");
        this.f275099a = grouppedActions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f275099a, ((d) obj2).f275099a);
    }

    public final int hashCode() {
        return this.f275099a.hashCode();
    }
}
