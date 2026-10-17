package w30;

import com.revolut.chat.data.repository.chat.ChatAgent;
import com.revolut.chat.domain.model.LastMessage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v extends y implements p, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LastMessage f294122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChatAgent f294123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f294124c;

    public v(LastMessage lastMessage, ChatAgent agent, boolean z) {
        Intrinsics.checkNotNullParameter(agent, "agent");
        this.f294122a = lastMessage;
        this.f294123b = agent;
        this.f294124c = z;
    }

    @Override // w30.q
    public final LastMessage a() {
        return this.f294122a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f294122a, vVar.f294122a) && this.f294123b.equals(vVar.f294123b) && this.f294124c == vVar.f294124c;
    }

    public final int hashCode() {
        LastMessage lastMessage = this.f294122a;
        return Boolean.hashCode(this.f294124c) + ((this.f294123b.hashCode() + ((lastMessage == null ? 0 : lastMessage.hashCode()) * 31)) * 31);
    }
}
