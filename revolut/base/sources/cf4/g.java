package cf4;

import com.revolut.feature.credit.application.plugins.api.models.action_button.Action;
import ff4.m;
import ff4.q;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.offer.e f23547w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f23548x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(com.revolut.feature.credit.application.plugins.impl.ui.offer.e eVar, q qVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f23547w = eVar;
        this.f23548x = qVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f23547w, this.f23548x, continuation, 0);
            default:
                return new g(this.f23547w, this.f23548x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    m mVar = (m) this.f23548x;
                    Action action = mVar.f134729a;
                    Long l2 = mVar.f134730b;
                    Long l3 = mVar.f134731c;
                    fu3.a aVar2 = mVar.d;
                    this.v = 1;
                    if (this.f23547w.Q2(action, l2, l3, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.offer.e eVar = this.f23547w;
                    g gVar = new g(eVar, this.f23548x, null, 0);
                    this.v = 1;
                    if (u0.c0(eVar, "LOADING_TAG_MAIN_BUTTON", gVar, this) == aVar3) {
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
