package r0a;

import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import skm.a2;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f250751w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, Continuation continuation) {
        super(2, continuation);
        this.f250751w = yVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        u uVar = new u(this.f250751w, continuation);
        uVar.v = obj2;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((ChatTransferRecipient.CryptoAddressRecipient) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ChatTransferRecipient.CryptoAddressRecipient cryptoAddressRecipient = (ChatTransferRecipient.CryptoAddressRecipient) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        y yVar = this.f250751w;
        if (i == 0) {
            yhm.o.b(obj2);
            this.v = cryptoAddressRecipient;
            this.u = 1;
            if (y.I2(yVar, cryptoAddressRecipient, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        if (cryptoAddressRecipient.f79721a.f71062g != ko5.c.SCREENING) {
            a2 a2Var = yVar.D;
            if (a2Var != null) {
                a2Var.f(null);
            }
            yVar.J2();
        }
        return Unit.f186387a;
    }
}
