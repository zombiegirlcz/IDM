package tvc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a f274755w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f274756x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a aVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f274755w = aVar;
        this.f274756x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f274755w, this.f274756x, continuation, 0);
            default:
                return new k(this.f274755w, this.f274756x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a aVar2 = this.f274755w;
                if (i == 0) {
                    o.b(obj2);
                    ufm.d dVar = aVar2.f85678r;
                    this.v = 1;
                    if (dVar.a(this.f274756x, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar2.C2(rtc.b.f257221a);
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a aVar4 = this.f274755w;
                    k kVar = new k(aVar4, this.f274756x, null, 0);
                    this.v = 1;
                    if (aVar4.p2(this, kVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
