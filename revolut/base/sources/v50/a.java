package v50;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lv50/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "messages", "Ljava/util/UUID;", "Ljava/util/UUID;", "()Ljava/util/UUID;", "authorId", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("messages")
    @NotNull
    private final List<String> messages;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("authorId")
    private final UUID authorId;

    public a(UUID uuid, List messages) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.messages = messages;
        this.authorId = uuid;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final UUID getAuthorId() {
        return this.authorId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getMessages() {
        return this.messages;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.messages, aVar.messages) && Intrinsics.f(this.authorId, aVar.authorId);
    }

    public final int hashCode() {
        int iHashCode = this.messages.hashCode() * 31;
        UUID uuid = this.authorId;
        return iHashCode + (uuid == null ? 0 : uuid.hashCode());
    }
}
