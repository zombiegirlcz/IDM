package cjb;

import aii.r;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f24630a;

    public a(Set selectedStatementOptions) {
        Intrinsics.checkNotNullParameter(selectedStatementOptions, "selectedStatementOptions");
        this.f24630a = selectedStatementOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f24630a, ((a) obj2).f24630a);
    }

    public final int hashCode() {
        return this.f24630a.hashCode();
    }
}
