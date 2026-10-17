package njg;

import com.revolut.data.model.Data;
import com.revolut.feature.trusted_merchants.impl.ui.TrustedMerchantsFlowContract$MerchantsContent;
import com.revolut.rxdata.core.CompositeException;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import yhm.o;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function3 {
    public /* synthetic */ Data u;
    public /* synthetic */ Data v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.trusted_merchants.impl.ui.kompot.list.a f216514w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.trusted_merchants.impl.ui.kompot.list.a aVar, Continuation continuation) {
        super(3, continuation);
        this.f216514w = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        j jVar = new j(this.f216514w, (Continuation) obj4);
        jVar.u = (Data) obj2;
        jVar.v = (Data) obj3;
        return jVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = this.u;
        Data data2 = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        List list = (List) data.getContent();
        if (list == null) {
            list = f0.f322471a;
        }
        List list2 = list;
        List list3 = (List) data2.getContent();
        if (list3 == null) {
            list3 = f0.f322471a;
        }
        List list4 = list3;
        boolean loading = data.getLoading();
        boolean loading2 = data2.getLoading();
        Throwable error = data.getError();
        Throwable error2 = data2.getError();
        return new TrustedMerchantsFlowContract$MerchantsContent(list2, list4, loading, loading2, (error == null || error2 == null) ? error == null ? error2 : error : new CompositeException(v.k(error, error2)));
    }
}
