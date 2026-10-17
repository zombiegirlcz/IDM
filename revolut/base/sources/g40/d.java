package g40;

import com.revolut.chat.data.repository.chat.AgentInfo;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class d {
    private d() {
    }

    public static e a(AgentInfo agentInfo) {
        Object next;
        Intrinsics.checkNotNullParameter(agentInfo, "agentInfo");
        if (agentInfo.d) {
            return e.BOT;
        }
        Iterator<E> it8 = e.d().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (a0.z(((e) next).e(), agentInfo.f, true)) {
                break;
            }
        }
        e eVar = (e) next;
        return eVar == null ? e.SPECIALIST : eVar;
    }
}
