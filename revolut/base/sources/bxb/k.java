package bxb;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ l u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = lVar;
        this.v = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVar = this.u;
        Set setH1 = d0.h1(((e) ((j2) lVar.f19657s.f22677a).getValue()).f19648b);
        setH1.add(this.v);
        lVar.f19654p.a(setH1);
        return Unit.f186387a;
    }
}
