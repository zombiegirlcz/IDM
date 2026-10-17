package g2a;

import com.revolut.feature.payments.transfers.personalisation.models.P2pPersonalisation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P2pPersonalisation f139956a;

    public e(P2pPersonalisation personalisation) {
        Intrinsics.checkNotNullParameter(personalisation, "personalisation");
        this.f139956a = personalisation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f139956a, ((e) obj2).f139956a);
    }

    public final int hashCode() {
        return this.f139956a.hashCode();
    }
}
