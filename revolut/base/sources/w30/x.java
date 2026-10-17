package w30;

import com.revolut.chat.data.repository.chat.MessageAuthor;
import com.revolut.chat.domain.model.LastMessage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x extends y implements p, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LastMessage f294128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f294129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MessageAuthor f294130c;

    public x(int i, MessageAuthor agent, LastMessage lastMessage) {
        Intrinsics.checkNotNullParameter(lastMessage, "lastMessage");
        Intrinsics.checkNotNullParameter(agent, "agent");
        this.f294128a = lastMessage;
        this.f294129b = i;
        this.f294130c = agent;
    }

    @Override // w30.q
    public final LastMessage a() {
        return this.f294128a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f294128a, xVar.f294128a) && this.f294129b == xVar.f294129b && Intrinsics.f(this.f294130c, xVar.f294130c);
    }

    public final int hashCode() {
        return this.f294130c.hashCode() + j6.a.b(this.f294129b, this.f294128a.hashCode() * 31, 31);
    }
}
