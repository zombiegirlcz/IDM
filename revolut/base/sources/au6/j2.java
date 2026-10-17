package au6;

import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class j2 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Long.valueOf(((FreelancerOrder) obj3).v.getMillis()), Long.valueOf(((FreelancerOrder) obj2).v.getMillis()));
    }
}
