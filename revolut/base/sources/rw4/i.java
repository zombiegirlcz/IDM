package rw4;

import aii.u;
import com.revolut.feature.credit.models.CreditAccountType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import wm.b;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends gim.i implements Function2 {
    public j u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f257828w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f257829x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f257828w = jVar;
        this.f257829x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.f257828w, this.f257829x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        j jVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            j jVar2 = this.f257828w;
            jVar2.f257830b.D(new b.a());
            wie.a aVar2 = jVar2.d;
            CreditAccountType.CreditCard creditCard = new CreditAccountType.CreditCard(this.f257829x);
            this.u = jVar2;
            this.v = 1;
            rie.a aVar3 = rie.b.Companion;
            Object objC = aVar2.c(creditCard, null, this);
            if (objC == aVar) {
                return aVar;
            }
            jVar = jVar2;
            obj2 = objC;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = this.u;
            yhm.o.b(obj2);
        }
        return jVar.b((u) obj2);
    }
}
