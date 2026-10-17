package m20;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004¨\u0006\u000f"}, d2 = {"Lm20/c;", "Lm20/k;", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "getAssistant", "()Z", "assistant", "b", "Ljava/lang/String;", "getMessageId", "messageId", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("assistant")
    private final boolean assistant;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("messageId")
    @NotNull
    private final String messageId;

    public c(String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.assistant = true;
        this.messageId = messageId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.assistant == cVar.assistant && Intrinsics.f(this.messageId, cVar.messageId);
    }

    public final int hashCode() {
        return this.messageId.hashCode() + (Boolean.hashCode(this.assistant) * 31);
    }
}
