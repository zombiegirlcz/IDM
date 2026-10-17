package cu9;

import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f108920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.feature.payments.messaging.data.api.model.b f108922c;
    public final MessageItem d;

    public g(f action, String giftId, com.revolut.feature.payments.messaging.data.api.model.b planTier, MessageItem messageItem) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(giftId, "giftId");
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        Intrinsics.checkNotNullParameter(messageItem, "messageItem");
        this.f108920a = action;
        this.f108921b = giftId;
        this.f108922c = planTier;
        this.d = messageItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f108920a == gVar.f108920a && Intrinsics.f(this.f108921b, gVar.f108921b) && this.f108922c == gVar.f108922c && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f108922c.hashCode() + p.a.c(this.f108920a.hashCode() * 31, 31, this.f108921b)) * 31);
    }
}
