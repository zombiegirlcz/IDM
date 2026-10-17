package wg2;

import com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias;
import com.revolut.feature.apm.upi.impl.screens.transfer_input_id_or_mobile.UpiTransferInputIdOrMobileScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ UpiTransferInputIdOrMobileScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(UpiTransferInputIdOrMobileScreen upiTransferInputIdOrMobileScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = upiTransferInputIdOrMobileScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        UpiTransferInputIdOrMobileScreen upiTransferInputIdOrMobileScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                upiTransferInputIdOrMobileScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar = (h) upiTransferInputIdOrMobileScreen.O.getValue();
                ResolveAlias resolveAlias = ((e) ((j2) hVar.f297229r.f22677a).getValue()).f297221b;
                if (resolveAlias != null) {
                    hVar.o.Z2(resolveAlias);
                }
                break;
        }
        return Unit.f186387a;
    }
}
