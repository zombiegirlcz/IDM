package jt7;

import aw0.n6;
import com.revolut.feature.insurance_credit.impl.data.model.action.Button;
import com.revolut.feature.insurance_credit.impl.ui.screen.cancellation_confirmation.CancellationConfirmationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CancellationConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CancellationConfirmationScreen cancellationConfirmationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cancellationConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ps7.b bVar;
        ps7.b bVar2;
        int i = this.u;
        CancellationConfirmationScreen cancellationConfirmationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                cancellationConfirmationScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar = (h) ((f) cancellationConfirmationScreen.P.getValue());
                Button button = hVar.o.f75820a.e;
                if (button != null && (bVar = button.f75754c) != null) {
                    hVar.C2(new d(bVar));
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar2 = (h) ((f) cancellationConfirmationScreen.P.getValue());
                Button button2 = hVar2.o.f75820a.f;
                if (button2 != null && (bVar2 = button2.f75754c) != null) {
                    hVar2.C2(new d(bVar2));
                }
                break;
        }
        return Unit.f186387a;
    }
}
