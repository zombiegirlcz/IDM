package g0a;

import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageItem f139395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f139396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f139397c;
    public final i d;

    public j(MessageItem messageItem, String giftId, String contactName, i actionType) {
        Intrinsics.checkNotNullParameter(messageItem, "messageItem");
        Intrinsics.checkNotNullParameter(giftId, "giftId");
        Intrinsics.checkNotNullParameter(contactName, "contactName");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        this.f139395a = messageItem;
        this.f139396b = giftId;
        this.f139397c = contactName;
        this.d = actionType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f139395a, jVar.f139395a) && Intrinsics.f(this.f139396b, jVar.f139396b) && Intrinsics.f(this.f139397c, jVar.f139397c) && this.d == jVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f139395a.hashCode() * 31, 31, this.f139396b), 31, this.f139397c);
    }
}
