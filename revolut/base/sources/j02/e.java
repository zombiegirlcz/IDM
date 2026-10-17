package j02;

import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmPaymentSource f169916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f169917b;

    public e(ApmPaymentSource source, String authToken) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(authToken, "authToken");
        this.f169916a = source;
        this.f169917b = authToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f169916a, eVar.f169916a) && Intrinsics.f(this.f169917b, eVar.f169917b);
    }

    public final int hashCode() {
        return this.f169917b.hashCode() + (this.f169916a.hashCode() * 31);
    }
}
