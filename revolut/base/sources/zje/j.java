package zje;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f322796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f322797b;

    public j(List accountsStates, String selectedAccountId) {
        Intrinsics.checkNotNullParameter(accountsStates, "accountsStates");
        Intrinsics.checkNotNullParameter(selectedAccountId, "selectedAccountId");
        this.f322796a = accountsStates;
        this.f322797b = selectedAccountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f322796a, jVar.f322796a) && Intrinsics.f(this.f322797b, jVar.f322797b);
    }

    public final int hashCode() {
        return this.f322797b.hashCode() + (this.f322796a.hashCode() * 31);
    }
}
