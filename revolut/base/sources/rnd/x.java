package rnd;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.api.AnalyticsAccount;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends gim.i implements Function3 {
    public /* synthetic */ Data u;
    public /* synthetic */ Set v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f255645w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, Continuation continuation) {
        super(3, continuation);
        this.f255645w = yVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        x xVar = new x(this.f255645w, (Continuation) obj4);
        xVar.u = (Data) obj2;
        xVar.v = (Set) obj3;
        return xVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayList;
        io3.k kVar;
        Data data = this.u;
        Set set = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Intrinsics.h(data);
        try {
            Object content = data.getContent();
            if (content != null) {
                ArrayList<io3.d> arrayList2 = new ArrayList();
                for (Object obj3 : (List) content) {
                    io3.d dVar = (io3.d) obj3;
                    xi0.a aVar2 = xi0.b.Companion;
                    String str = dVar.f163147c;
                    aVar2.getClass();
                    if (cp5.d.A(xi0.a.a(str)) && ((kVar = dVar.f) == io3.k.ACTIVE || kVar == io3.k.INACTIVE)) {
                        if (!set.contains(dVar.f163145a)) {
                            arrayList2.add(obj3);
                        }
                    }
                }
                arrayList = new ArrayList(zhm.w.t(arrayList2, 10));
                for (io3.d dVar2 : arrayList2) {
                    arrayList.add(new AnalyticsAccount.Linked(dVar2.f163156r, dVar2.f163145a, dVar2.f163154p, dVar2.d));
                }
            } else {
                arrayList = null;
            }
            return new Data(arrayList, data.getError(), data.getLoading());
        } catch (Throwable th10) {
            return new Data(null, th10, data.getLoading());
        }
    }
}
