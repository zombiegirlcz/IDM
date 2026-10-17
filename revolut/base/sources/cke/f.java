package cke;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24823a;

    public f(String selectedAccountId) {
        Intrinsics.checkNotNullParameter(selectedAccountId, "selectedAccountId");
        this.f24823a = selectedAccountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f24823a, ((f) obj2).f24823a);
    }

    public final int hashCode() {
        return this.f24823a.hashCode();
    }
}
