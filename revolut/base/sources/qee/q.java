package qee;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.card_order_new.api.navigation.CardOrderFlowDestination;
import com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.CardDeliveryDetailsContract$InputData;
import h93.f0;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends gim.i implements Function2 {
    public f0 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a f245139w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f245139w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q(this.f245139w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        f0 card;
        com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a aVar = this.f245139w;
        CardDeliveryDetailsContract$InputData cardDeliveryDetailsContract$InputData = aVar.o;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            this.v = 1;
            obj2 = aVar.f89437p.h(cardDeliveryDetailsContract$InputData.f89433a, this);
            if (obj2 != aVar2) {
            }
            return aVar2;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            card = this.u;
            yhm.o.b(obj2);
            Address address = (Address) obj2;
            v vVar = aVar.f89442w;
            AccountId accountId = cardDeliveryDetailsContract$InputData.d;
            vVar.getClass();
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(card, "card");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            return aVar.C1(new CardOrderFlowDestination.ChangeDeliveryAddress(card, address, accountId));
        }
        yhm.o.b(obj2);
        f0 f0Var = (f0) obj2;
        this.u = f0Var;
        this.v = 2;
        Serializable serializableI2 = com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a.I2(aVar, f0Var, this);
        if (serializableI2 != aVar2) {
            card = f0Var;
            obj2 = serializableI2;
            Address address2 = (Address) obj2;
            v vVar2 = aVar.f89442w;
            AccountId accountId2 = cardDeliveryDetailsContract$InputData.d;
            vVar2.getClass();
            Intrinsics.checkNotNullParameter(address2, "address");
            Intrinsics.checkNotNullParameter(card, "card");
            Intrinsics.checkNotNullParameter(accountId2, "accountId");
            return aVar.C1(new CardOrderFlowDestination.ChangeDeliveryAddress(card, address2, accountId2));
        }
        return aVar2;
    }
}
