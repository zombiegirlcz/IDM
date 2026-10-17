package blj;

import com.revolut.feature.masav.impl.model.DirectDebitData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import tof.cc;
import tof.g7;
import tof.i7;
import tof.ob;
import tof.qb;
import tof.v6;
import tof.y6;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f16727b;

    public /* synthetic */ s(Long l2, int i) {
        this.f16726a = i;
        this.f16727b = l2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f16726a;
        Object dVar = null;
        Long l2 = this.f16727b;
        switch (i) {
            case 0:
                h update = (h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return h.a(update, null, null, l2, 3);
            case 1:
                DirectDebitData updateDirectDebitData = (DirectDebitData) obj2;
                Intrinsics.checkNotNullParameter(updateDirectDebitData, "$this$updateDirectDebitData");
                if (l2 != null && l2.longValue() >= 0) {
                    long jLongValue = l2.longValue();
                    xi0.b.Companion.getClass();
                    xi0.b bVar = xi0.b.f306283w;
                    dVar = new dj0.d(cp5.d.k(bVar) * jLongValue, bVar);
                }
                return DirectDebitData.a(updateDirectDebitData, null, null, null, dVar, 15);
            case 2:
                Boolean enabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                if (enabled.booleanValue()) {
                    i7.c cVar = i7.Companion;
                    cc ccVar = new cc(zhm.u.c(y6.TOPUP));
                    v6[] v6VarArr = {v6.COMPLETED, v6.PENDING, v6.REVERTED, v6.DECLINED, v6.FAILED};
                    cVar.getClass();
                    qb qbVarC = i7.c.c(v6VarArr);
                    ob obVar = new ob(new DateTime(l2.longValue()), true);
                    tof.l[] elements = {tof.l.BIZUM, tof.l.BLIK_P2P, tof.l.IRIS, tof.l.MBWAY, tof.l.WERO};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    dVar = i7.c.a(ccVar, qbVarC, obVar, new g7(kotlin.collections.d.y0(elements)));
                }
                od0.i.Companion.getClass();
                return od0.h.a(dVar);
            case 3:
                mg2.d update2 = (mg2.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return mg2.d.a(update2, null, l2, 1);
            default:
                return yv2.f.a((yv2.f) obj2, (int) l2.longValue(), null, null, false, null, false, false, null, 254);
        }
    }
}
