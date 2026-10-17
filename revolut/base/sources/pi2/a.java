package pi2;

import com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeroRegistrationStatus.NotRegistered f236379a;

    public a(WeroRegistrationStatus.NotRegistered status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f236379a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f236379a, ((a) obj2).f236379a);
    }

    public final int hashCode() {
        return this.f236379a.hashCode();
    }
}
