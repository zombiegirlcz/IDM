package au6;

import androidx.room.util.DBUtil;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrder$Id;
import ip0.wk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f9606w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(v vVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f9606w = vVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(this.f9606w, continuation, 0);
                rVar.v = ((AcquiringOrder$Id) obj2).f73342a;
                return rVar;
            case 1:
                r rVar2 = new r(this.f9606w, continuation, 1);
                rVar2.v = ((AcquiringOrder$Id) obj2).f73342a;
                return rVar2;
            case 2:
                r rVar3 = new r(this.f9606w, continuation, 2);
                rVar3.v = ((AcquiringOrder$Id) obj2).f73342a;
                return rVar3;
            default:
                r rVar4 = new r(this.f9606w, continuation, 3);
                rVar4.v = ((AcquiringOrder$Id) obj2).f73342a;
                return rVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        AcquiringOrder$Id acquiringOrder$Id = (AcquiringOrder$Id) obj2;
        switch (this.u) {
            case 0:
                return ((r) create(new AcquiringOrder$Id(acquiringOrder$Id.f73342a), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((r) create(new AcquiringOrder$Id(acquiringOrder$Id.f73342a), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((r) create(new AcquiringOrder$Id(acquiringOrder$Id.f73342a), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create(new AcquiringOrder$Id(acquiringOrder$Id.f73342a), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ArrayList arrayList = null;
        v vVar = this.f9606w;
        switch (i) {
            case 0:
                String str = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) p.a.j(jt6.i.class, KTypeProjection.INSTANCE, List.class, vVar.f9638h, j6.a.q("FreelancerAcquiringOrderRepositoryImpl:LineItems:Storage", str));
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(bu6.a.d((jt6.i) it8.next()));
                    }
                }
                return arrayList;
            case 1:
                String str2 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                is6.a aVar3 = vVar.e;
                ks6.k kVar = (ks6.k) DBUtil.performBlocking(aVar3.f168111a, true, false, new wk(aVar3, str2, 22));
                if (kVar == null) {
                    return null;
                }
                nr6.b bVarC = bu6.a.c(kVar);
                od0.i.Companion.getClass();
                return od0.h.a(bVarC);
            case 2:
                String str3 = this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = vVar.f9638h;
                cVar.I0("FreelancerAcquiringOrderRepositoryImpl:LineItems:Storage" + str3);
                cVar.I0("FreelancerAcquiringOrderRepositoryImpl:OrderPayments:Storage" + str3);
                return Unit.f186387a;
            default:
                String str4 = this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jt6.k kVar2 = (jt6.k) j6.a.k(jt6.k.class, vVar.f9638h, j6.a.q("FreelancerAcquiringOrderRepositoryImpl:OrderPayments:Storage", str4));
                if (kVar2 != null) {
                    return bu6.a.e(kVar2, str4);
                }
                return null;
        }
    }
}
