package esa;

import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import do3.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.push_to_card.impl.ui.card_recipient_details.a f128923w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ iy9.b f128924x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(com.revolut.feature.push_to_card.impl.ui.card_recipient_details.a aVar, iy9.b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f128923w = aVar;
        this.f128924x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f128923w, this.f128924x, continuation, 0);
            case 1:
                return new h(this.f128923w, this.f128924x, continuation, 1);
            default:
                return new h(this.f128923w, this.f128924x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((h) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.push_to_card.impl.ui.card_recipient_details.a aVar = this.f128923w;
                    osa.b bVar = aVar.f81605p;
                    String cardOwnerId = aVar.I2().f81490a;
                    iy9.b bVar2 = this.f128924x;
                    iy9.a aVar2 = bVar2.f169640a;
                    this.v = 1;
                    bVar.getClass();
                    if (osa.a.f229288a[aVar2.ordinal()] != 1) {
                        throw new IllegalArgumentException("Payment setting " + aVar2 + " is not allowed here");
                    }
                    iy9.b setting = iy9.b.a(bVar2, true ^ bVar2.f169641b);
                    lra.a aVar3 = (lra.a) bVar.f229290b;
                    Intrinsics.checkNotNullParameter(cardOwnerId, "cardOwnerId");
                    Intrinsics.checkNotNullParameter(setting, "setting");
                    iy9.a aVar4 = setting.f169640a;
                    boolean z = setting.f169641b;
                    if (aVar4 != iy9.a.TWO_FA_REQUIRED) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    z zVarD = ((by9.j) aVar3.f199471a).b(new com.revolut.feature.payments.recipients.settings.models.a(cardOwnerId, iy9.d.CARD_OWNER, jy9.b.b(setting).f79675a, new RecipientPaymentsSettings.Setting.Value.Binary(z))).D(Boolean.valueOf(z));
                    Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
                    Object objB = nim.a.b(zVarD, this);
                    if (objB != obj3) {
                        objB = Unit.f186387a;
                    }
                    if (objB == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.push_to_card.impl.ui.card_recipient_details.a aVar6 = this.f128923w;
                    h hVar = new h(aVar6, this.f128924x, null, 0);
                    this.v = 1;
                    if (aVar6.p2(this, hVar) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.push_to_card.impl.ui.card_recipient_details.a aVar8 = this.f128923w;
                    h hVar2 = new h(aVar8, this.f128924x, null, 1);
                    this.v = 1;
                    if (q.t(aVar8, hVar2, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
