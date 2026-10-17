package bpd;

import a26.q;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mif.e0;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AnalyticsAccountsSelection.Savings f17599w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, AnalyticsAccountsSelection.Savings savings, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f17599w = savings;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, this.f17599w, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        List<ejb.g> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (ejb.g gVar : list2) {
            arrayList.add(mif.a.Q(e0.j(gVar.f126847a, gVar.d)));
        }
        e eVar = this.v;
        return xam.a.h(new q(arrayList, eVar, (Continuation) null, 21), eVar.f.b(this.f17599w));
    }
}
