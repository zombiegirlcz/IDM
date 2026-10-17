package sh2;

import com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements d12.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeroRegistrationStatus f263390a;

    public a(WeroRegistrationStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f263390a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f263390a, ((a) obj2).f263390a);
    }

    public final int hashCode() {
        return this.f263390a.hashCode();
    }
}
