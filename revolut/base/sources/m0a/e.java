package m0a;

import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChatTransferRecipient f201114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ChatItem f201115c;

    public e(ChatTransferRecipient chatTransferRecipient, ChatItem chatItem) {
        Intrinsics.checkNotNullParameter(chatTransferRecipient, "chatTransferRecipient");
        this.f201114b = chatTransferRecipient;
        this.f201115c = chatItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f201114b, eVar.f201114b) && Intrinsics.f(this.f201115c, eVar.f201115c);
    }

    public final int hashCode() {
        int iHashCode = this.f201114b.hashCode() * 31;
        ChatItem chatItem = this.f201115c;
        return iHashCode + (chatItem == null ? 0 : chatItem.hashCode());
    }
}
