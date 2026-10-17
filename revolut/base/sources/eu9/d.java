package eu9;

import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MessageItem f129535b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MessageItem message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f129535b = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f129535b, ((d) obj2).f129535b);
    }

    public final int hashCode() {
        return this.f129535b.hashCode();
    }
}
