package o82;

import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultibancoRegistrationStatus.Registered f222907a;

    public e(MultibancoRegistrationStatus.Registered status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f222907a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f222907a, ((e) obj2).f222907a);
    }

    public final int hashCode() {
        return this.f222907a.hashCode();
    }
}
