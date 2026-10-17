package s85;

import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s35.a;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ koi.j f260894w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, koi.j jVar, Continuation continuation) {
        super(1, continuation);
        this.v = kVar;
        this.f260894w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, this.f260894w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        k kVar = this.v;
        if (i == 0) {
            o.b(obj2);
            c cVar = kVar.f260897r;
            this.u = 1;
            obj2 = cVar.Z2(this.f260894w, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        s35.a aVar2 = (s35.a) obj2;
        if (Intrinsics.f(aVar2, a.c.f259421a)) {
            kVar.v2(new g((LoanBackupCard) zi0.c.I(((f) kVar.t2()).f260890b)));
        } else if (Intrinsics.f(aVar2, a.b.f259420a)) {
            kVar.f260898s.a();
        } else {
            int i2 = jli.h.f175850a;
        }
        return Unit.f186387a;
    }
}
