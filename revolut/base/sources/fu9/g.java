package fu9;

import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatItem f138154a;

    public g(ChatItem chatItem) {
        Intrinsics.checkNotNullParameter(chatItem, "chatItem");
        this.f138154a = chatItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f138154a, ((g) obj2).f138154a);
    }

    public final int hashCode() {
        return this.f138154a.hashCode();
    }
}
