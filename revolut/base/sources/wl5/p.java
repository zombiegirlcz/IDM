package wl5;

import com.revolut.feature_crypto_picker.api.CryptoPickerDestination;
import com.revolut.kompot.common.ModalDestination;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ s v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, Continuation continuation) {
        super(2, continuation);
        this.v = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        s sVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ul5.e eVar = sVar.f298431s;
            this.u = 1;
            obj2 = eVar.a(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        sVar.f2(sVar.e1(new com.revolut.feature_crypto_picker.api.a(new CryptoPickerDestination.CryptoPickerInputData(zhm.u.c(s.y2(sVar)), d0.d1((Set) obj2), new CryptoPickerDestination.CryptoPickerConfig(g0i.b.SINGLE, false, false, true), 4))), ModalDestination.Style.POPUP.f98311a, new k(sVar, 1));
        return Unit.f186387a;
    }
}
