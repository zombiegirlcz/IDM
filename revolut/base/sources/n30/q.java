package n30;

import com.revolut.chat.domain.model.ChatMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatMode f211661a;

    public q(ChatMode chatMode) {
        Intrinsics.checkNotNullParameter(chatMode, "chatMode");
        this.f211661a = chatMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f211661a, ((q) obj2).f211661a);
    }

    public final int hashCode() {
        return this.f211661a.hashCode();
    }
}
