package et6;

import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.freelancer.common.models.FreelancerOrderTransaction;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final au6.b2 f129191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jr6.u f129192b;

    public a3(au6.b2 freelancerRepository, jr6.u saleStateMapper) {
        Intrinsics.checkNotNullParameter(freelancerRepository, "freelancerRepository");
        Intrinsics.checkNotNullParameter(saleStateMapper, "saleStateMapper");
        this.f129191a = freelancerRepository;
        this.f129192b = saleStateMapper;
    }

    public static List b(FreelancerOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        List list = order.f73299q;
        if (list == null) {
            return zhm.f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            FreelancerOrderTransaction freelancerOrderTransaction = (FreelancerOrderTransaction) obj2;
            if (freelancerOrderTransaction.f73314c == lr6.l0.PAYMENT && kotlin.collections.d.I(new lr6.a[]{lr6.a.COMPLETED, lr6.a.CAPTURED}, freelancerOrderTransaction.f73315g)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dj0.d a(com.revolut.feature.freelancer.common.models.FreelancerOrder r8) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.a3.a(com.revolut.feature.freelancer.common.models.FreelancerOrder):dj0.d");
    }
}
