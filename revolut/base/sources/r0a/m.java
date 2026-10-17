package r0a;

import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatTransferRecipient f250741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChatItem f250742b;

    public m(ChatTransferRecipient chatTransferRecipient, ChatItem chatItem) {
        Intrinsics.checkNotNullParameter(chatTransferRecipient, "chatTransferRecipient");
        this.f250741a = chatTransferRecipient;
        this.f250742b = chatItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f250741a, mVar.f250741a) && Intrinsics.f(this.f250742b, mVar.f250742b);
    }

    public final int hashCode() {
        int iHashCode = this.f250741a.hashCode() * 31;
        ChatItem chatItem = this.f250742b;
        return iHashCode + (chatItem == null ? 0 : chatItem.hashCode());
    }
}
