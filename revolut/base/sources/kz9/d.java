package kz9;

import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatTransferRecipient f191077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChatItem f191078b;

    public d(ChatTransferRecipient chatTransferRecipient, ChatItem chatItem) {
        Intrinsics.checkNotNullParameter(chatTransferRecipient, "chatTransferRecipient");
        this.f191077a = chatTransferRecipient;
        this.f191078b = chatItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f191077a, dVar.f191077a) && Intrinsics.f(this.f191078b, dVar.f191078b);
    }

    public final int hashCode() {
        int iHashCode = this.f191077a.hashCode() * 31;
        ChatItem chatItem = this.f191078b;
        return iHashCode + (chatItem == null ? 0 : chatItem.hashCode());
    }
}
