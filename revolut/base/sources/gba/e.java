package gba;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.feature.pix.impl.flow.portability_details.PortabilityDetailsContract$InputData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import wca.f;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pix.impl.flow.portability_details.a f142246w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f142247x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.revolut.feature.pix.impl.flow.portability_details.a aVar, f fVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f142246w = aVar;
        this.f142247x = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f142246w, this.f142247x, continuation, 0);
            case 1:
                return new e(this.f142246w, this.f142247x, continuation, 1);
            default:
                return new e(this.f142246w, this.f142247x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((e) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.feature.pix.impl.flow.portability_details.a aVar2 = this.f142246w;
                    s8a.c cVar = aVar2.f80672p;
                    PortabilityDetailsContract$InputData portabilityDetailsContract$InputData = aVar2.o;
                    AccountId accountId = portabilityDetailsContract$InputData.f80668a;
                    PixKey pixKey = portabilityDetailsContract$InputData.f80669b;
                    String str = this.f142247x.f296369a;
                    this.v = 1;
                    n8a.o oVar = cVar.f260942a;
                    oVar.getClass();
                    Object objF = oVar.f(accountId, pixKey, "finish_alias_migration", new n8a.e(oVar, accountId, pixKey, str, null, 1), this);
                    if (objF != aVar) {
                        objF = Unit.f186387a;
                    }
                    if (objF != aVar) {
                        objF = Unit.f186387a;
                    }
                    if (objF == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.pix.impl.flow.portability_details.a aVar4 = this.f142246w;
                    s8a.c cVar2 = aVar4.f80672p;
                    PortabilityDetailsContract$InputData portabilityDetailsContract$InputData2 = aVar4.o;
                    AccountId accountId2 = portabilityDetailsContract$InputData2.f80668a;
                    PixKey pixKey2 = portabilityDetailsContract$InputData2.f80669b;
                    String str2 = this.f142247x.f296369a;
                    this.v = 1;
                    if (cVar2.c(accountId2, pixKey2, str2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    com.revolut.feature.pix.impl.flow.portability_details.a aVar6 = this.f142246w;
                    s8a.c cVar3 = aVar6.f80672p;
                    PortabilityDetailsContract$InputData portabilityDetailsContract$InputData3 = aVar6.o;
                    AccountId accountId3 = portabilityDetailsContract$InputData3.f80668a;
                    PixKey pixKey3 = portabilityDetailsContract$InputData3.f80669b;
                    String str3 = this.f142247x.f296369a;
                    this.v = 1;
                    if (cVar3.c(accountId3, pixKey3, str3, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
