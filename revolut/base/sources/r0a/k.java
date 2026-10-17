package r0a;

import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatTransferRecipient f250739a;

    public k(ChatTransferRecipient chatTransferRecipient) {
        Intrinsics.checkNotNullParameter(chatTransferRecipient, "chatTransferRecipient");
        this.f250739a = chatTransferRecipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f250739a, ((k) obj2).f250739a);
    }

    public final int hashCode() {
        return this.f250739a.hashCode();
    }
}
