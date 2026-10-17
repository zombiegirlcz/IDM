package k6a;

import cli.y;
import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.feature.payments_migration.impl.ui.screen.move_payment.cards.CardsPaymentController;
import h93.f0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardsPaymentController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CardsPaymentController cardsPaymentController, Continuation continuation) {
        super(2, continuation);
        this.v = cardsPaymentController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((NewRevolutCardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        NewRevolutCardDelegate.Model model = (NewRevolutCardDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarD = this.v.d();
        Object obj3 = model.k;
        s sVar = (s) kVarD;
        y yVar = sVar.v;
        if (obj3 instanceof f0) {
            String str = ((f0) obj3).f150110a;
            if (!Intrinsics.f(str, ((j) ((j2) yVar.f22677a).getValue()).f181657c)) {
                sVar.H2(yVar, new jb8.a(str, 28));
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(v0.a.h(obj3, "Unknown parcel '", "'"));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        }
        return Unit.f186387a;
    }
}
