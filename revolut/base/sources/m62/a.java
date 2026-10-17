package m62;

import com.revolut.feature.apm.core.models.iris.IrisRegistrationStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IrisRegistrationStatus.NotRegistered f202968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f202969b;

    public a(IrisRegistrationStatus.NotRegistered status, boolean z) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f202968a = status;
        this.f202969b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f202968a, aVar.f202968a) && this.f202969b == aVar.f202969b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f202969b) + (this.f202968a.hashCode() * 31);
    }
}
