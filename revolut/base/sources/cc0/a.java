package cc0;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f22912a;

    public a(Set preselectedTransactionIds) {
        Intrinsics.checkNotNullParameter(preselectedTransactionIds, "preselectedTransactionIds");
        this.f22912a = preselectedTransactionIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f22912a, ((a) obj2).f22912a);
    }

    public final int hashCode() {
        return this.f22912a.hashCode();
    }
}
