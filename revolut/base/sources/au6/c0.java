package au6;

import androidx.room.util.DBUtil;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPayment$Id;
import ip0.wk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d0 f9501w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(d0 d0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f9501w = d0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c0 c0Var = new c0(this.f9501w, continuation, 0);
                c0Var.v = ((AcquiringPayment$Id) obj2).f73363a;
                return c0Var;
            case 1:
                c0 c0Var2 = new c0(this.f9501w, continuation, 1);
                c0Var2.v = ((AcquiringPayment$Id) obj2).f73363a;
                return c0Var2;
            default:
                c0 c0Var3 = new c0(this.f9501w, continuation, 2);
                c0Var3.v = ((AcquiringPayment$Id) obj2).f73363a;
                return c0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        AcquiringPayment$Id acquiringPayment$Id = (AcquiringPayment$Id) obj2;
        switch (this.u) {
            case 0:
                return ((c0) create(new AcquiringPayment$Id(acquiringPayment$Id.f73363a), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c0) create(new AcquiringPayment$Id(acquiringPayment$Id.f73363a), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c0) create(new AcquiringPayment$Id(acquiringPayment$Id.f73363a), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ArrayList arrayList = null;
        d0 d0Var = this.f9501w;
        switch (i) {
            case 0:
                String str = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                is6.c cVar = d0Var.f9511c;
                ks6.q qVar = (ks6.q) DBUtil.performBlocking(cVar.f168123a, true, false, new wk(cVar, str, 26));
                if (qVar == null) {
                    return null;
                }
                pr6.e eVarA = bu6.b.a(qVar);
                od0.i.Companion.getClass();
                return od0.h.a(eVarA);
            case 1:
                String str2 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0Var.f9510b.remove(d0.b(d0Var, str2));
                d0Var.d.I0(d0.c(d0Var, str2));
                return Unit.f186387a;
            default:
                String str3 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) p.a.j(mt6.a.class, KTypeProjection.INSTANCE, List.class, d0Var.d, d0.c(d0Var, str3));
                if (list != null) {
                    arrayList = new ArrayList();
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        qr6.c cVarC = bu6.b.c((mt6.a) it8.next());
                        if (cVarC != null) {
                            arrayList.add(cVarC);
                        }
                    }
                }
                return arrayList;
        }
    }
}
