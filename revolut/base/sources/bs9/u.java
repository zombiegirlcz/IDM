package bs9;

import com.revolut.feature.payments.messaging.data.api.model.GroupChatItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GroupChatItem f18130b;

    public u(String listId, GroupChatItem groupChatItem) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(groupChatItem, "groupChatItem");
        this.f18129a = listId;
        this.f18130b = groupChatItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f18129a, uVar.f18129a) && Intrinsics.f(this.f18130b, uVar.f18130b);
    }

    public final int hashCode() {
        return this.f18130b.hashCode() + (this.f18129a.hashCode() * 31);
    }
}
