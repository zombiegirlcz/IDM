package k50;

import com.revolut.chat.data.repository.chat.ChatAgent;
import com.revolut.chat.data.repository.chat.MessageAuthor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q4 implements r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageAuthor f181220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f181221b;

    public q4(ChatAgent.Bot bot, long j2) {
        this.f181220a = bot;
        this.f181221b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj2;
        return Intrinsics.f(this.f181220a, q4Var.f181220a) && this.f181221b == q4Var.f181221b;
    }

    public final int hashCode() {
        MessageAuthor messageAuthor = this.f181220a;
        return Long.hashCode(this.f181221b) + ((messageAuthor == null ? 0 : messageAuthor.hashCode()) * 31);
    }
}
