package w30;

import com.revolut.chat.domain.model.AgentPresenceState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AgentPresenceState f294133a;

    public z(AgentPresenceState agentPresenceState) {
        this.f294133a = agentPresenceState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f294133a, ((z) obj2).f294133a);
    }

    public final int hashCode() {
        AgentPresenceState agentPresenceState = this.f294133a;
        if (agentPresenceState == null) {
            return 0;
        }
        return agentPresenceState.hashCode();
    }
}
