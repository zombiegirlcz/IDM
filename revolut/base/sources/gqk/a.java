package gqk;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDetails;
import gal.f;
import gal.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k71.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import tof.a3;
import tof.t0;
import yhm.r;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f145761b;

    public /* synthetic */ a(e eVar, int i) {
        this.f145760a = i;
        this.f145761b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        qsi.e eVar;
        boolean zContains;
        switch (this.f145760a) {
            case 0:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                Data data = (Data) rVar.f314201a;
                q qVar = (q) rVar.f314202b;
                Data data2 = (Data) rVar.f314203c;
                this.f145761b.getClass();
                List list = (List) data.getContent();
                if (list == null) {
                    eVar = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list) {
                        if (((a3) obj3).A.f272781c == t0.SUSPICIOUS) {
                            arrayList.add(obj3);
                        } else {
                            arrayList2.add(obj3);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : arrayList2) {
                        a3 a3Var = (a3) obj4;
                        if (data2.getError() != null) {
                            zContains = Intrinsics.f(a3Var.f272611s, "suspicious_transaction_user_action_required");
                        } else {
                            Iterable iterable = (List) data2.getContent();
                            if (iterable == null) {
                                iterable = f0.f322471a;
                            }
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj5 : iterable) {
                                SuspiciousTransactionDetails suspiciousTransactionDetails = (SuspiciousTransactionDetails) obj5;
                                if (suspiciousTransactionDetails.f104931a == g.PENDING && suspiciousTransactionDetails.f104933c == f.REMEDIATION) {
                                    arrayList4.add(obj5);
                                }
                            }
                            ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
                            Iterator it8 = arrayList4.iterator();
                            while (it8.hasNext()) {
                                arrayList5.add(((SuspiciousTransactionDetails) it8.next()).f104932b);
                            }
                            zContains = arrayList5.contains(a3Var.f272581b);
                        }
                        if (zContains) {
                            arrayList3.add(obj4);
                        }
                    }
                    eVar = new qsi.e(arrayList3, arrayList);
                }
                Data data3 = new Data(eVar, data.getError(), data.getLoading());
                f0 f0Var = f0.f322471a;
                Data dataP = zi0.c.P(f0Var, false, null, 3);
                Data dataP2 = zi0.c.P(f0Var, false, null, 3);
                Data dataP3 = zi0.c.P(f0Var, false, null, 3);
                i.Companion.getClass();
                return new qsi.d(data3, dataP, dataP2, dataP3, zi0.c.P(i.f224256b, false, null, 3), qVar);
            default:
                l35.e loanApplicationAvailability = (l35.e) obj2;
                Intrinsics.checkNotNullParameter(loanApplicationAvailability, "loanApplicationAvailability");
                if (!(loanApplicationAvailability instanceof l35.c)) {
                    if (loanApplicationAvailability instanceof l35.d) {
                        return efm.r.just(new c(0));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                e eVar2 = this.f145761b;
                ar3.c cVar = eVar2.f;
                o35.e eVar3 = ((l35.c) loanApplicationAvailability).f191851a;
                return te0.w.H0(cVar.b(eVar3.f221695b), eVar2.f.b(eVar3.f221694a)).x().map(new gjg.e(new gqa.a(8), 27));
        }
    }
}
