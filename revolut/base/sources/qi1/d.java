package qi1;

import aw0.n6;
import com.revolut.feature.address.common.impl.flow.validation_flow.bad_address.BadAddressSheetController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import qi1.a;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BadAddressSheetController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(BadAddressSheetController badAddressSheetController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = badAddressSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BadAddressSheetController badAddressSheetController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((e) ((b) badAddressSheetController.S.getValue())).C2(a.C1348a.f246621a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((e) ((b) badAddressSheetController.S.getValue())).C2(a.b.f246622a);
                break;
        }
        return Unit.f186387a;
    }
}
