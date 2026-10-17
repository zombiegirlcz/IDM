package w30;

import com.revolut.chat.data.repository.chat.MessageAuthor;
import com.revolut.chat.domain.model.LastMessage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w extends y implements p, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LastMessage f294125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MessageAuthor f294126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f294127c;

    public w(int i, MessageAuthor agent, LastMessage lastMessage) {
        Intrinsics.checkNotNullParameter(agent, "agent");
        this.f294125a = lastMessage;
        this.f294126b = agent;
        this.f294127c = i;
    }

    @Override // w30.q
    public final LastMessage a() {
        return this.f294125a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f294125a, wVar.f294125a) && Intrinsics.f(this.f294126b, wVar.f294126b) && this.f294127c == wVar.f294127c;
    }

    public final int hashCode() {
        LastMessage lastMessage = this.f294125a;
        return Integer.hashCode(this.f294127c) + v1.c.a(this.f294126b, (lastMessage == null ? 0 : lastMessage.hashCode()) * 31, 31);
    }
}
