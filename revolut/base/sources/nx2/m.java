package nx2;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_design.impl.card_design.d f220110w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e93.e f220111x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.feature.card_design.impl.card_design.d dVar, e93.e eVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f220110w = dVar;
        this.f220111x = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f220110w, this.f220111x, continuation, 0);
            default:
                return new m(this.f220110w, this.f220111x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.card_design.impl.card_design.d dVar = this.f220110w;
                jr6.p pVar = dVar.f64723p;
                FeatureCommand featureCommandM2 = dVar.M2(this.f220111x);
                this.v = 1;
                Object objA = ((mz6.b) pVar).a(featureCommandM2, w4l.h.f294642c, this);
                return objA == aVar ? aVar : objA;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.card_design.impl.card_design.d dVar2 = this.f220110w;
                k93.b bVar = dVar2.f64724q;
                CardDesignFlowContract$InputData cardDesignFlowContract$InputData = dVar2.o;
                String str = dVar2.C;
                NaviCommand i3 = cardDesignFlowContract$InputData.getI();
                String f64621l = cardDesignFlowContract$InputData.getF64621l();
                AccountId f = cardDesignFlowContract$InputData.getF();
                String e = cardDesignFlowContract$InputData.getE();
                this.v = 1;
                Object objB3 = k93.b.b3(bVar, str, this.f220111x, i3, f64621l, f, e, this, 1648);
                return objB3 == aVar2 ? aVar2 : objB3;
        }
    }
}
