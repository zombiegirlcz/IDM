package dtf;

import aii.r;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f117446a;

    public f(ArrayList allocations) {
        Intrinsics.checkNotNullParameter(allocations, "allocations");
        this.f117446a = allocations;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f117446a.equals(((f) obj2).f117446a);
    }

    public final int hashCode() {
        return this.f117446a.hashCode();
    }
}
