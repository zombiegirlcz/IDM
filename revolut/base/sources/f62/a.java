package f62;

import com.revolut.feature.apm.core.models.iris.IrisRegistrationStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements d12.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IrisRegistrationStatus f132373a;

    public a(IrisRegistrationStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f132373a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f132373a, ((a) obj2).f132373a);
    }

    public final int hashCode() {
        return this.f132373a.hashCode();
    }
}
