package fu9;

import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import dv9.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChatItem f138156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f138157c;

    public h(ChatItem chatItem, m conversation, String emoji) {
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        Intrinsics.checkNotNullParameter(chatItem, "chatItem");
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        this.f138155a = emoji;
        this.f138156b = chatItem;
        this.f138157c = conversation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f138155a, hVar.f138155a) && Intrinsics.f(this.f138156b, hVar.f138156b) && Intrinsics.f(this.f138157c, hVar.f138157c);
    }

    public final int hashCode() {
        return this.f138157c.hashCode() + ((this.f138156b.hashCode() + (this.f138155a.hashCode() * 31)) * 31);
    }
}
