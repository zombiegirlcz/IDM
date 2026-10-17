package ull;

import aii.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f281052a;

    public d(List chosenAccounts) {
        Intrinsics.checkNotNullParameter(chosenAccounts, "chosenAccounts");
        this.f281052a = chosenAccounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f281052a, ((d) obj2).f281052a);
    }

    public final int hashCode() {
        return this.f281052a.hashCode();
    }
}
