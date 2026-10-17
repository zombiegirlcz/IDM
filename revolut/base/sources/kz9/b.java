package kz9;

import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatTransferRecipient f191075a;

    public b(ChatTransferRecipient recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f191075a = recipient;
    }

    public final ChatTransferRecipient b() {
        return this.f191075a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f191075a, ((b) obj2).f191075a);
    }

    public final int hashCode() {
        return this.f191075a.hashCode();
    }
}
