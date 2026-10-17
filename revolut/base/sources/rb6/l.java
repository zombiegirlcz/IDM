package rb6;

import com.revolut.data.model.Data;
import com.revolut.feature.donations.api.interactor.DonationsInteractor$CharityNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import m9d.w0;
import rb6.g;
import yhm.r;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ m v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        Object arrayList;
        r rVar = (r) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Data data2 = (Data) rVar.f314201a;
        Data data3 = (Data) rVar.f314202b;
        xi0.b bVar = (xi0.b) rVar.f314203c;
        boolean z = data2.getError() instanceof DonationsInteractor$CharityNotFoundException;
        m mVar = this.v;
        if (z) {
            mVar.v2(g.a.f252964a);
        }
        try {
            Object content = data3.getContent();
            if (content != null) {
                List list = (List) ((Map) content).get(bVar.f306286a);
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(new dj0.d(((Number) it8.next()).longValue(), bVar));
                    }
                } else {
                    arrayList = f0.f322471a;
                }
            } else {
                arrayList = 0;
            }
            data = new Data(arrayList, data3.getError(), data3.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, data3.getLoading());
        }
        mVar.x2(new w0(data2, data, 12));
        return Unit.f186387a;
    }
}
