package m4c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f202693a;

    public d(String selectedAccountId) {
        Intrinsics.checkNotNullParameter(selectedAccountId, "selectedAccountId");
        this.f202693a = selectedAccountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f202693a, ((d) obj2).f202693a);
    }

    public final int hashCode() {
        return this.f202693a.hashCode();
    }
}
