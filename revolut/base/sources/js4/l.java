package js4;

import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentChangeTermQuote;
import com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.CreditCardEditPostPurchaseInstalmentTermScreenContract$InputData;
import dp4.c0;
import dp4.z;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import om4.r1;
import ql4.q;
import skm.e0;
import skm.p0;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends gim.i implements Function2 {
    public wi0.b u;
    public q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f178134w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f178135x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a f178136y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f178136y = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.f178136y, continuation);
        lVar.f178135x = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        q qVar;
        wi0.b bVar;
        CreditCardInstalmentChangeTermQuote.UpdatedInstalment updatedInstalment;
        CreditCardInstalmentChangeTermQuote.UpdatedInstalment updatedInstalment2;
        Pair pair = (Pair) this.f178135x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f178134w;
        com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a aVar2 = this.f178136y;
        if (i == 0) {
            yhm.o.b(obj2);
            wi0.b bVar2 = (wi0.b) pair.f186385a;
            qVar = (q) pair.f186386b;
            al4.m mVar = aVar2.f69430q;
            CreditCardEditPostPurchaseInstalmentTermScreenContract$InputData creditCardEditPostPurchaseInstalmentTermScreenContract$InputData = aVar2.o;
            this.f178135x = null;
            this.u = bVar2;
            this.v = qVar;
            this.f178134w = 1;
            c0 c0Var = ((r1) mVar).d;
            c0Var.getClass();
            z zVar = new z(c0Var, creditCardEditPostPurchaseInstalmentTermScreenContract$InputData.f69419a, creditCardEditPostPurchaseInstalmentTermScreenContract$InputData.f69420b, null, 2);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(elm.f.f127540b, zVar, this);
            if (objJ == aVar) {
                return aVar;
            }
            bVar = bVar2;
            obj2 = objJ;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = this.v;
            wi0.b bVar3 = this.u;
            yhm.o.b(obj2);
            bVar = bVar3;
        }
        CreditCardInstalmentChangeTermQuote creditCardInstalmentChangeTermQuote = (CreditCardInstalmentChangeTermQuote) obj2;
        int i2 = qVar.e;
        d dVar = (d) ((e) ((j2) aVar2.u.f22677a).getValue()).f178124a.getContent();
        if (dVar == null || (updatedInstalment2 = dVar.f178122b) == null) {
            for (CreditCardInstalmentChangeTermQuote.UpdatedInstalment updatedInstalment3 : creditCardInstalmentChangeTermQuote.f68792b) {
                if (updatedInstalment3.f68796a == i2) {
                    updatedInstalment = updatedInstalment3;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        updatedInstalment = updatedInstalment2;
        return new d(creditCardInstalmentChangeTermQuote, updatedInstalment, qVar.f, bVar, i2);
    }
}
