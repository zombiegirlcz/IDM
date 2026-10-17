package kw4;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.models.CreditCard;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f190241w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Continuation continuation, z zVar) {
        super(2, continuation);
        this.u = 2;
        this.f190241w = zVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f190241w, continuation, 0);
                pVar.v = obj2;
                return pVar;
            case 1:
                p pVar2 = new p(this.f190241w, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
            default:
                p pVar3 = new p(continuation, this.f190241w);
                pVar3.v = obj2;
                return pVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p) create((g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        g gVar;
        int i = this.u;
        z zVar = this.f190241w;
        switch (i) {
            case 0:
                g gVar2 = (g) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (gVar2.f190219b) {
                    r70.c.b(zVar.z, 3);
                }
                return Unit.f186387a;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zVar.H2(zVar.C, new ku1.y(data, 7));
                return Unit.f186387a;
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar = (yhm.r) pair.f186385a;
                Pair pair2 = (Pair) pair.f186386b;
                Object obj3 = rVar.f314201a;
                Object obj4 = rVar.f314202b;
                Object obj5 = rVar.f314203c;
                Object obj6 = pair2.f186385a;
                wi0.b bVar = (wi0.b) pair2.f186386b;
                boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                dj0.d dVar = (dj0.d) obj5;
                ll4.y yVar = (ll4.y) obj4;
                CreditCard creditCard = (CreditCard) obj3;
                h hVar = (h) ((i) ((j2) zVar.C.f22677a).getValue()).f190230b.getContent();
                if (hVar == null || (gVar = hVar.f190227l) == null) {
                    dj0.d dVarM = zVar.f190259y.f69782b;
                    if (dVarM == null) {
                        dVarM = pw5.a.m(creditCard);
                    }
                    gVar = new g(dVarM, false, f.INIT);
                }
                g gVar3 = gVar;
                String str = creditCard.f69792a;
                String str2 = creditCard.f69793b;
                dj0.d dVar2 = creditCard.e;
                dj0.d dVar3 = creditCard.f;
                dj0.d dVar4 = creditCard.f69794c;
                return new h(str, str2, dVar, yVar, dVar2, dVar3, dj0.d.c(dVar4, Math.max(0L, dVar4.f115082a - yVar.f196564n), null, 2), creditCard.i, zBooleanValue, yVar.f196564n > 0, bVar, gVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(z zVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f190241w = zVar;
    }
}
