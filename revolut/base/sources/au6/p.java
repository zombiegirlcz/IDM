package au6;

import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrder$Id;
import ip0.v7;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f9592b;

    public /* synthetic */ p(v vVar, int i) {
        this.f9591a = i;
        this.f9592b = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f9591a) {
            case 0:
                String str = ((AcquiringOrder$Id) obj2).f73342a;
                Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_order-AcquiringOrder-Id$-id$0");
                return (List) v7.r("FreelancerAcquiringOrderRepositoryImpl:LineItems:Memory", str, this.f9592b.d);
            case 1:
                String str2 = ((AcquiringOrder$Id) obj2).f73342a;
                Intrinsics.checkNotNullParameter(str2, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_order-AcquiringOrder-Id$-id$0");
                List list = (List) this.f9592b.f9639j.getValue();
                if (list == null) {
                    return null;
                }
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((nr6.b) next).f218537a, str2)) {
                        }
                    } else {
                        next = null;
                    }
                }
                nr6.b bVar = (nr6.b) next;
                if (bVar == null) {
                    return null;
                }
                od0.i.Companion.getClass();
                return od0.h.a(bVar);
            default:
                String str3 = ((AcquiringOrder$Id) obj2).f73342a;
                Intrinsics.checkNotNullParameter(str3, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_order-AcquiringOrder-Id$-id$0");
                return (nr6.w) v7.r("FreelancerAcquiringOrderRepositoryImpl:OrderPayments:Memory", str3, this.f9592b.d);
        }
    }
}
