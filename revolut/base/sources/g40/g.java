package g40;

import com.revolut.chat.data.repository.chat.AgentInfo;
import java.util.Comparator;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        Integer num = ((AgentInfo.Compliment) obj3).d;
        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 0);
        Integer num2 = ((AgentInfo.Compliment) obj2).d;
        return cim.b.b(numValueOf, Integer.valueOf(num2 != null ? num2.intValue() : 0));
    }
}
