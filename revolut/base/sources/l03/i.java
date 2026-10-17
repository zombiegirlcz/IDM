package l03;

import com.revolut.feature.card_management.impl.ui.kompot.replace.expectations.CardReplaceExpectationsContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import z6l.s;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.replace.expectations.a f191153w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(com.revolut.feature.card_management.impl.ui.kompot.replace.expectations.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f191153w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f191153w, continuation, 0);
            default:
                return new i(this.f191153w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.card_management.impl.ui.kompot.replace.expectations.a aVar = this.f191153w;
        switch (i) {
            case 0:
                CardReplaceExpectationsContract$InputData cardReplaceExpectationsContract$InputData = aVar.o;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    s sVar = aVar.f64882p;
                    String str = cardReplaceExpectationsContract$InputData.f64879b;
                    this.v = 1;
                    if (sVar.E(str, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar.C1(u0.b(cardReplaceExpectationsContract$InputData.f64880c));
                return Unit.f186387a;
            default:
                s sVar2 = aVar.f64882p;
                CardReplaceExpectationsContract$InputData cardReplaceExpectationsContract$InputData2 = aVar.o;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    int i5 = j.f191154a[cardReplaceExpectationsContract$InputData2.f64878a.ordinal()];
                    if (i5 == 1) {
                        String str2 = cardReplaceExpectationsContract$InputData2.f64879b;
                        this.v = 1;
                        if (sVar2.F(str2, this) == aVar3) {
                            return aVar3;
                        }
                    } else if (i5 != 2) {
                        Unit unit = Unit.f186387a;
                    } else {
                        String str3 = cardReplaceExpectationsContract$InputData2.f64879b;
                        this.v = 2;
                        if (sVar2.D(str3, this) == aVar3) {
                            return aVar3;
                        }
                        Unit unit2 = Unit.f186387a;
                    }
                } else if (i3 == 1) {
                    o.b(obj2);
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    Unit unit22 = Unit.f186387a;
                }
                aVar.C1(u0.b(cardReplaceExpectationsContract$InputData2.f64880c));
                return Unit.f186387a;
        }
    }
}
