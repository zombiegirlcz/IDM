package v62;

import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultibancoRegistrationStatus f286317a;

    public e(MultibancoRegistrationStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f286317a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f286317a, ((e) obj2).f286317a);
    }

    public final int hashCode() {
        return this.f286317a.hashCode();
    }
}
