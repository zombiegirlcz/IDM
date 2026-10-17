package v0f;

import android.content.Intent;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class j0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.screens.card_details.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.revolut.feature.topup_screen.impl.screens.card_details.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j0 j0Var = new j0(this.v, continuation);
        j0Var.u = obj2;
        return j0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j0) create((kii.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        kii.d dVar = (kii.d) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (dVar.d) {
            com.revolut.feature.topup_screen.impl.screens.card_details.b bVar = this.v;
            ((s70.b) bVar.f91098y).getClass();
            bVar.C1(new ExternalDestination.ByIntent(new Intent("android.settings.NFC_SETTINGS"), null));
        }
        return Unit.f186387a;
    }
}
