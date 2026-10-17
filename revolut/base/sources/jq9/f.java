package jq9;

import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageItem f177500a;

    public f(MessageItem message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f177500a = message;
    }

    @Override // jq9.b
    public final long a() {
        return this.f177500a.d.getMillis();
    }

    @Override // jq9.b
    public final boolean b(String userCode) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        return this.f177500a.f79533c == dv9.n.INCOMING;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f177500a, ((f) obj2).f177500a);
    }

    public final int hashCode() {
        return this.f177500a.hashCode();
    }
}
