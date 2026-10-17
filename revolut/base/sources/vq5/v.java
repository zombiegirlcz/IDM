package vq5;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.CryptoSendConfirmationControllerContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a f291341w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f291341w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v(this.f291341w, continuation, 0);
            default:
                return new v(this.f291341w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((v) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a aVar = this.f291341w;
                CryptoSendConfirmationControllerContract$InputData cryptoSendConfirmationControllerContract$InputData = aVar.B;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    be5.e eVar = aVar.A;
                    cryptoSendConfirmationControllerContract$InputData.getClass();
                    cryptoSendConfirmationControllerContract$InputData.f71313a.getClass();
                    this.v = 1;
                    eVar.getClass();
                    if (aVar2 == null) {
                        return aVar2;
                    }
                    obj2 = null;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar.H2(aVar.D, new aq4.i(7, (TextLocalisedClause) obj2));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a aVar4 = this.f291341w;
                    uk9.h hVar = new uk9.h(aVar4, null, 19);
                    this.v = 1;
                    if (u0.b0(aVar4.X(), "CryptoSendConfirmation_ConfirmButton_Tag", hVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
