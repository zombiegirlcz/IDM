package yc7;

import aii.u;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.i implements Function2 {
    public uc7.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f312559w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ sf8.m f312560x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, sf8.m mVar2, Continuation continuation) {
        super(2, continuation);
        this.f312559w = mVar;
        this.f312560x = mVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.f312559w, this.f312560x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        uc7.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            m mVar = this.f312559w;
            uc7.a aVar3 = mVar.d;
            q78.e eVar = mVar.e;
            String str = this.f312560x.f262361b;
            this.u = aVar3;
            this.v = 1;
            obj2 = u68.b.c(eVar, str, null, null, this, 14);
            if (obj2 == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.u;
            o.b(obj2);
        }
        aVar.a((u) obj2);
        return Unit.f186387a;
    }
}
