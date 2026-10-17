package j8d;

import java.util.List;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f172168a;

    public c(List formActions) {
        Intrinsics.checkNotNullParameter(formActions, "formActions");
        this.f172168a = formActions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f172168a, ((c) obj2).f172168a);
    }

    public final int hashCode() {
        return this.f172168a.hashCode();
    }
}
