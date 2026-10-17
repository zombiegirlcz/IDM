package nfc;

import com.revolut.feature.acquiring.card_reader.order.api.model.VatSelection;
import com.revolut.feature.revpro.card_reader.order.impl.ui.screen.vat.VatInputScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ VatInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(VatInputScreen vatInputScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = vatInputScreen;
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
        VatInputScreen vatInputScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                vatInputScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) ((g) ((ofc.b) vatInputScreen.Z.getValue()).f224801c.get());
                VatSelection vatSelection = ((e) iVar.t2()).f214890c;
                if (vatSelection != null) {
                    iVar.v2(new f(vatSelection));
                }
                break;
        }
        return Unit.f186387a;
    }
}
