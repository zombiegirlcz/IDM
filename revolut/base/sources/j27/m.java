package j27;

import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((FreelancerOrder) obj3).v, ((FreelancerOrder) obj2).v);
    }
}
