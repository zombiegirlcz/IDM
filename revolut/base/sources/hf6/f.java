package hf6;

import com.revolut.data.database.models.openbanking.AuRegionConsentEntity;
import com.revolut.data.database.models.openbanking.mapper.ConsentEntityMapperKt;
import com.revolut.domain.models.openbanking.OpenBankingConsent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KTypeProjection;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function3 {
    public /* synthetic */ List u;
    public final /* synthetic */ i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, Continuation continuation) {
        super(3, continuation);
        this.v = iVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        f fVar = new f(this.v, (Continuation) obj4);
        fVar.u = (List) obj3;
        return fVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ue0.c cVar = this.v.e;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(ConsentEntityMapperKt.toEntity((OpenBankingConsent.Australia) it8.next()));
        }
        cVar.G(arrayList, "AU_CONSENTS_CACHE_KEY", kii.e.o(AuRegionConsentEntity.class, KTypeProjection.INSTANCE, List.class));
        return Unit.f186387a;
    }
}
