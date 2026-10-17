package aem;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class l1 extends gim.i implements oim.n {
    public /* synthetic */ Object u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(String str, Continuation continuation) {
        super(4, continuation);
        this.v = str;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        l1 l1Var = new l1(this.v, (Continuation) obj5);
        l1Var.u = (fem.d) obj3;
        return l1Var.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fem.d dVar = (fem.d) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m1.f3750a.trace("Adding User-Agent header: agent for " + dVar.f134657a);
        List list = kem.u.f183239a;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter("User-Agent", "key");
        String str = this.v;
        if (str != null) {
            dVar.f134659c.d("User-Agent", str.toString());
        }
        return Unit.f186387a;
    }
}
