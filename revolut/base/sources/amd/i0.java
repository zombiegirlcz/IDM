package amd;

import com.revolut.feature.subaccount.api.models.Subaccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Subaccount f6331a;

    public i0(Subaccount subAccount) {
        Intrinsics.checkNotNullParameter(subAccount, "subAccount");
        this.f6331a = subAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i0) && Intrinsics.f(this.f6331a, ((i0) obj2).f6331a);
    }

    public final int hashCode() {
        return this.f6331a.hashCode();
    }
}
