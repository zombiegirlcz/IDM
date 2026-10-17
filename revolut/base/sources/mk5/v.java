package mk5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a f206203w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f206203w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                v vVar = new v(this.f206203w, continuation, 0);
                vVar.v = ((Boolean) obj2).booleanValue();
                return vVar;
            default:
                v vVar2 = new v(this.f206203w, continuation, 1);
                vVar2.v = ((Boolean) obj2).booleanValue();
                return vVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.u;
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        Continuation continuation = (Continuation) obj3;
        switch (i) {
        }
        return ((v) create(bool, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a aVar = this.f206203w;
        switch (i) {
            case 0:
                boolean z = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.F, new lph.c(z, 10));
                break;
            default:
                boolean z3 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (z3) {
                    aVar.I2(((m) ((j2) aVar.F.f22677a).getValue()).f206190b);
                }
                break;
        }
        return Unit.f186387a;
    }
}
