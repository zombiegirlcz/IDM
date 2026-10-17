package yua;

import com.revolut.data.model.Data;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import te0.w;
import tsk.t;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uc.d f316926b;

    public /* synthetic */ a(uc.d dVar, int i) {
        this.f316925a = i;
        this.f316926b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Flow flowI;
        int i = this.f316925a;
        uc.d dVar = this.f316926b;
        switch (i) {
            case 0:
                qua.p recurringPayment = (qua.p) obj2;
                Intrinsics.checkNotNullParameter(recurringPayment, "payment");
                t tVar = (t) dVar.f278952a;
                Intrinsics.checkNotNullParameter(recurringPayment, "payment");
                if (recurringPayment.f249314a.f160152c != ibd.h.YOUTH_ALLOWANCE) {
                    return t.f(recurringPayment) ? nim.a.w(tVar.q(), new e8e.t(dVar, recurringPayment, 7)) : w.h(new Data(recurringPayment, null, false, 6, null));
                }
                vfg.p pVar = (vfg.p) dVar.f278954c;
                Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
                jt0.b bVar = (jt0.b) pVar.f288633b;
                Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                String str = recurringPayment.f249318c;
                if (str == null || d0.W(str)) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("JuniorId is null or blank");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                    flowI = zi0.c.i(recurringPayment);
                } else {
                    flowI = nim.a.v(hj8.a.a((hj8.a) bVar.f178265b, str, loadingStrategy), new e8e.t(recurringPayment, 6));
                }
                return rd0.e.c(flowI, kotlin.coroutines.g.f186406a);
            default:
                List payments = (List) obj2;
                Intrinsics.checkNotNullParameter(payments, "payments");
                List list = payments;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        if (t.f((qua.p) it8.next())) {
                            return nim.a.w(((t) dVar.f278952a).q(), new x5f.m(23, dVar, payments));
                        }
                    }
                }
                return w.h(new Data(payments, null, false, 6, null));
        }
    }
}
