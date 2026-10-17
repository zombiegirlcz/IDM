package boc;

import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function1 {
    public final /* synthetic */ h u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, String str, Continuation continuation) {
        super(1, continuation);
        this.u = hVar;
        this.v = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = this.u;
        return hVar.A2(u0.b(b3f.b.b(hVar.o, new TransferSubjectId.Portfolio(this.v), WealthAccountType.ROBO, null, null, 12)));
    }
}
