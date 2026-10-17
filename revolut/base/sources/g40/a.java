package g40;

import com.revolut.chat.data.repository.chat.AgentInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AgentInfo f140311a;

    public a(AgentInfo agentInfo) {
        Intrinsics.checkNotNullParameter(agentInfo, "agentInfo");
        this.f140311a = agentInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f140311a, ((a) obj2).f140311a);
    }

    public final int hashCode() {
        return this.f140311a.hashCode();
    }
}
