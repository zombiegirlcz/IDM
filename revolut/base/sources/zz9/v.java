package zz9;

import com.revolut.feature.payments.messaging.data.api.model.P2PChatItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f326633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P2PChatItem f326634b;

    public v(String listId, P2PChatItem p2pChatItem) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(p2pChatItem, "p2pChatItem");
        this.f326633a = listId;
        this.f326634b = p2pChatItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f326633a, vVar.f326633a) && Intrinsics.f(this.f326634b, vVar.f326634b);
    }

    public final int hashCode() {
        return this.f326634b.hashCode() + (this.f326633a.hashCode() * 31);
    }
}
