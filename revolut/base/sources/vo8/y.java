package vo8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b f290921w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(boolean z, com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = z;
        this.f290921w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new y(this.v, this.f290921w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((y) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            in8.d dVar = new in8.d(null, null, Boolean.valueOf(!this.v));
            this.u = 1;
            if (com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b.L2(this.f290921w, dVar, this) == aVar) {
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
