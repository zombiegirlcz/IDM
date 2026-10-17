package x82;

import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.WithdrawalCodeDetailsScreen;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ WithdrawalCodeDetailsScreen f303266w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(WithdrawalCodeDetailsScreen withdrawalCodeDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f303266w = withdrawalCodeDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f303266w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            default:
                i iVar2 = new i(this.f303266w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((x62.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        WithdrawalCodeDetailsScreen withdrawalCodeDetailsScreen = this.f303266w;
        switch (i) {
            case 0:
                y yVar = (y) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a) withdrawalCodeDetailsScreen.e3()).I2(new x62.b(yVar.f167225a, yVar.f167227c));
                break;
            default:
                x62.b bVar = (x62.b) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d dVarE3 = withdrawalCodeDetailsScreen.e3();
                Intrinsics.h(bVar);
                ((com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a) dVarE3).I2(bVar);
                break;
        }
        return Unit.f186387a;
    }
}
