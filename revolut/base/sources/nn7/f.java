package nn7;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vim.d f217476a;

    public f(vim.d selectedDates) {
        Intrinsics.checkNotNullParameter(selectedDates, "selectedDates");
        this.f217476a = selectedDates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f217476a, ((f) obj2).f217476a);
    }

    public final int hashCode() {
        return this.f217476a.hashCode();
    }
}
