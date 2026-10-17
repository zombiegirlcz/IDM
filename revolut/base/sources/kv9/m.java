package kv9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lkv9/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getReaction", "reaction", "b", "getChatId", "chatId", "Lkv9/l;", "c", "Lkv9/l;", "getChatType", "()Lkv9/l;", "chatType", "Lkv9/n;", "d", "Lkv9/n;", "getRelatedEntity", "()Lkv9/n;", "relatedEntity", "feature_payments_messaging_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("reaction")
    @NotNull
    private final String reaction;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("recipient")
    @NotNull
    private final String chatId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("recipientType")
    @NotNull
    private final l chatType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("relatedEntity")
    @NotNull
    private final n relatedEntity;

    public m(String reaction, String chatId, l chatType, n relatedEntity) {
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatType, "chatType");
        Intrinsics.checkNotNullParameter(relatedEntity, "relatedEntity");
        this.reaction = reaction;
        this.chatId = chatId;
        this.chatType = chatType;
        this.relatedEntity = relatedEntity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.reaction, mVar.reaction) && Intrinsics.f(this.chatId, mVar.chatId) && this.chatType == mVar.chatType && Intrinsics.f(this.relatedEntity, mVar.relatedEntity);
    }

    public final int hashCode() {
        return this.relatedEntity.hashCode() + ((this.chatType.hashCode() + p.a.c(this.reaction.hashCode() * 31, 31, this.chatId)) * 31);
    }
}
