package e0a;

import com.revolut.feature.payments.messaging.data.api.model.MessageType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageType f121493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f121494b;

    public g0(MessageType type, String localId) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(localId, "localId");
        this.f121493a = type;
        this.f121494b = localId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f121493a, g0Var.f121493a) && Intrinsics.f(this.f121494b, g0Var.f121494b);
    }

    public final int hashCode() {
        return this.f121494b.hashCode() + (this.f121493a.hashCode() * 31);
    }
}
