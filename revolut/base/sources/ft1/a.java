package ft1;

import com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BizumRegistrationStatus.NotRegistered f137771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f137772b;

    public a(BizumRegistrationStatus.NotRegistered status, boolean z) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f137771a = status;
        this.f137772b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f137771a, aVar.f137771a) && this.f137772b == aVar.f137772b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f137772b) + (this.f137771a.hashCode() * 31);
    }
}
