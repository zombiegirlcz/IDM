package rqd;

import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import do3.n;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import tof.ac;
import tof.cc;
import tof.d8;
import tof.fc;
import tof.i7;
import tof.l2;
import tof.l3;
import tof.na;
import tof.s9;
import tof.v6;
import tof.w6;
import tof.wa;
import tof.y6;
import yhm.o;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.i implements Function2 {
    public n u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f256534w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ prl.e f256535x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f256536y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(prl.e eVar, List list, Continuation continuation) {
        super(2, continuation);
        this.f256535x = eVar;
        this.f256536y = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.f256535x, this.f256536y, continuation);
        lVar.f256534w = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((Set) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objH;
        Object objH2;
        n nVar;
        Set set = (Set) this.f256534w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        prl.e eVar = this.f256535x;
        if (i == 0) {
            o.b(obj2);
            efm.k kVarC = ((ang.f) eVar.f239325b).d.c();
            this.f256534w = set;
            this.v = 1;
            objH = nim.a.h(kVarC, this);
            if (objH != aVar) {
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = this.u;
            o.b(obj2);
            objH2 = obj2;
            Interval interval = new Interval(new DateTime(0L), ((l80.f) ((l80.e) eVar.f239326c)).g());
            i7.c cVar = i7.Companion;
            na naVarB = fc.b(new d8(l3.b(l2.CASHBACK)));
            na naVarB2 = fc.b(i7.y.f272830a);
            na naVarB3 = fc.b(new cc(u.c(y6.REFUND)));
            na naVarB4 = fc.b(new s9(d0.i1((List) objH2)));
            na naVarB5 = fc.b(i7.z.f272831a);
            i7[] i7VarArr = {new ac(null), new ac(w6.CASH_DEPOSIT), new ac(w6.CHEQUE_DEPOSIT), new ac(w6.DIRECT_DEBIT), new ac(w6.EXTERNAL_CARD), new ac(w6.EXTERNAL_ACCOUNT), new ac(w6.OPEN_BANKING)};
            cVar.getClass();
            return new CategorisationFilter(he3.d.INCOME, new CategorisationFilter.Scope.PocketsIdSet(set), interval, u.c(v6.COMPLETED), i7.c.a(naVarB, naVarB2, naVarB3, naVarB4, naVarB5, i7.c.b(i7VarArr), fc.b(new wa(io3.i.EXTERNAL))), null, null, null, knd.f.b(this.f256536y, nVar.f116408a), null, 736);
        }
        o.b(obj2);
        objH = obj2;
        n nVar2 = (n) objH;
        wzi.a aVar2 = (wzi.a) eVar.d;
        this.f256534w = set;
        this.u = nVar2;
        this.v = 2;
        objH2 = ((etj.o) aVar2).h(this);
        if (objH2 != aVar) {
            nVar = nVar2;
            Interval interval2 = new Interval(new DateTime(0L), ((l80.f) ((l80.e) eVar.f239326c)).g());
            i7.c cVar2 = i7.Companion;
            na naVarB6 = fc.b(new d8(l3.b(l2.CASHBACK)));
            na naVarB22 = fc.b(i7.y.f272830a);
            na naVarB32 = fc.b(new cc(u.c(y6.REFUND)));
            na naVarB42 = fc.b(new s9(d0.i1((List) objH2)));
            na naVarB52 = fc.b(i7.z.f272831a);
            i7[] i7VarArr2 = {new ac(null), new ac(w6.CASH_DEPOSIT), new ac(w6.CHEQUE_DEPOSIT), new ac(w6.DIRECT_DEBIT), new ac(w6.EXTERNAL_CARD), new ac(w6.EXTERNAL_ACCOUNT), new ac(w6.OPEN_BANKING)};
            cVar2.getClass();
            return new CategorisationFilter(he3.d.INCOME, new CategorisationFilter.Scope.PocketsIdSet(set), interval2, u.c(v6.COMPLETED), i7.c.a(naVarB6, naVarB22, naVarB32, naVarB42, naVarB52, i7.c.b(i7VarArr2), fc.b(new wa(io3.i.EXTERNAL))), null, null, null, knd.f.b(this.f256536y, nVar.f116408a), null, 736);
        }
        return aVar;
    }
}
