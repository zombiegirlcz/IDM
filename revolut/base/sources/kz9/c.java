package kz9;

import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatTransferRecipient f191076a;

    public c(ChatTransferRecipient chatTransferRecipient) {
        Intrinsics.checkNotNullParameter(chatTransferRecipient, "chatTransferRecipient");
        this.f191076a = chatTransferRecipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f191076a, ((c) obj2).f191076a);
    }

    public final int hashCode() {
        return this.f191076a.hashCode();
    }
}
