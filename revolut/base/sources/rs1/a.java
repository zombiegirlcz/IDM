package rs1;

import com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements d12.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BizumRegistrationStatus f256927a;

    public a(BizumRegistrationStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f256927a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f256927a, ((a) obj2).f256927a);
    }

    public final int hashCode() {
        return this.f256927a.hashCode();
    }
}
