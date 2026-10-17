package y10;

import com.revolut.chat.data.repository.chat.AgentInfo;
import com.revolut.chat.domain.model.call.CallAgentInfo;
import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements a {
    public final CallAgentInfo a(UUID uuid, AgentInfo agentInfo) {
        if (uuid != null) {
            return new CallAgentInfo(agentInfo != null ? agentInfo.f50998b : null, agentInfo != null ? agentInfo.e : null, uuid);
        }
        return null;
    }
}
