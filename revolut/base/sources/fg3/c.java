package fg3;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134888a;

    public c(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f134888a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f134888a, ((c) obj2).f134888a);
    }

    public final int hashCode() {
        return this.f134888a.hashCode();
    }
}
