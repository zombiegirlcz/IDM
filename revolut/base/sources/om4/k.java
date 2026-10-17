package om4;

import com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ yw4.p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f226611w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yw4.p pVar, l lVar, Continuation continuation) {
        super(2, continuation);
        this.v = pVar;
        this.f226611w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, this.f226611w, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        od0.i iVar = (od0.i) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        el4.h hVar = (el4.h) iVar.g();
        Integer num = hVar != null ? new Integer(hVar.f127264a) : null;
        if (num == null) {
            return zi0.c.i(AdditionalCardholdersState.NotAvailable.f69812a);
        }
        int iIntValue = num.intValue();
        yw4.p pVar = this.v;
        if (iIntValue > 0) {
            return zi0.c.i(new AdditionalCardholdersState.Available(pVar.f317325a, num.intValue(), pVar.f317331l));
        }
        return nim.a.v(this.f226611w.f226626c.k(grl.r2.UNRECOGNIZED), new ofg.a(pVar, num, 21));
    }
}
