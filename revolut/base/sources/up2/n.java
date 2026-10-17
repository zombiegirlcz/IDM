package up2;

import cli.y;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.SwitchOutReview;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a f281828w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f281828w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f281828w, continuation, 0);
            default:
                return new n(this.f281828w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a aVar = this.f281828w;
                y yVar = aVar.f64058s;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    su9.c cVar = aVar.o;
                    String str = ((e) ((j2) yVar.f22677a).getValue()).f281816a;
                    this.v = 1;
                    obj2 = cVar.f(str, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar.H2(yVar, new um7.d((SwitchOutReview) obj2, 13));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a aVar4 = this.f281828w;
                    uk9.h hVar = new uk9.h(aVar4, null, 4);
                    this.v = 1;
                    if (aVar4.p2(this, hVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
