package ch1;

import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.c;
import ha3.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import vkm.j2;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                this.v.C2(c.b.f60911a);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.b bVar = this.v;
                k7i.i iVar = bVar.o;
                String cardId = ((i) ((j2) bVar.f60908q.f22677a).getValue()).f24107b.f65544a;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                return yji.l.a1(bVar, q.q(rd0.e.b(nim.a.w(((x) ((l93.f) iVar.f182069b)).v(cardId), new kw2.a(iVar, 0)))), null, null, new cbh.g(bVar, null, 14), 3);
        }
    }
}
