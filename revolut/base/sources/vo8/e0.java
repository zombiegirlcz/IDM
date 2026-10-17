package vo8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ eb8.e f290880w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar, eb8.e eVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f290880w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e0(this.v, this.f290880w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            f4h.a aVar2 = this.v.f77337w;
            String str = this.f290880w.f124299a;
            eb8.j jVar = eb8.j.ALLOWED;
            this.u = 1;
            if (aVar2.s(str, jVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
