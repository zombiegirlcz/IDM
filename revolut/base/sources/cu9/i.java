package cu9;

import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f108924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MessageItem f108925c;

    public i(String referralId, h action, MessageItem messageItem) {
        Intrinsics.checkNotNullParameter(referralId, "referralId");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(messageItem, "messageItem");
        this.f108923a = referralId;
        this.f108924b = action;
        this.f108925c = messageItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f108923a, iVar.f108923a) && this.f108924b == iVar.f108924b && Intrinsics.f(this.f108925c, iVar.f108925c);
    }

    public final int hashCode() {
        return this.f108925c.hashCode() + ((this.f108924b.hashCode() + (this.f108923a.hashCode() * 31)) * 31);
    }
}
