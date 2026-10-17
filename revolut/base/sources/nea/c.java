package nea;

import aw0.n6;
import com.revolut.feature.pockets.impl.details_v2.pocket_details.multi_iban.virtual_iban_bottomsheet.VirtualIbanBottomSheetScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nea.e;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ VirtualIbanBottomSheetScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(VirtualIbanBottomSheetScreen virtualIbanBottomSheetScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = virtualIbanBottomSheetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        VirtualIbanBottomSheetScreen virtualIbanBottomSheetScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((g) ((f) virtualIbanBottomSheetScreen.T.getValue())).C2(e.b.f214427a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((g) ((f) virtualIbanBottomSheetScreen.T.getValue())).C2(e.a.f214426a);
                break;
        }
        return Unit.f186387a;
    }
}
