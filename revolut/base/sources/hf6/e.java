package hf6;

import com.revolut.data.database.models.openbanking.AuRegionConsentEntity;
import com.revolut.data.database.models.openbanking.mapper.ConsentEntityMapperKt;
import com.revolut.domain.models.openbanking.OpenBankingConsent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KTypeProjection;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ i u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, Continuation continuation) {
        super(2, continuation);
        this.u = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        List list = (List) p.a.j(AuRegionConsentEntity.class, KTypeProjection.INSTANCE, List.class, this.u.e, "AU_CONSENTS_CACHE_KEY");
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            OpenBankingConsent.Australia domain = ConsentEntityMapperKt.toDomain((AuRegionConsentEntity) it8.next());
            if (domain != null) {
                arrayList.add(domain);
            }
        }
        return arrayList;
    }
}
