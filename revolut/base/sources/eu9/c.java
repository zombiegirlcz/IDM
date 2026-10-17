package eu9;

import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MessageItem f129534b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(MessageItem message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f129534b = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f129534b, ((c) obj2).f129534b);
    }

    public final int hashCode() {
        return this.f129534b.hashCode();
    }
}
