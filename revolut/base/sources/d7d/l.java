package d7d;

import com.revolut.feature.shared.consent.prompt.builder.api.model.ConsentPromptData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.a2;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f111928w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f111928w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f111928w, continuation, 0);
            case 1:
                return new l(this.f111928w, continuation, 1);
            case 2:
                return new l(this.f111928w, continuation, 2);
            default:
                return new l(this.f111928w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                n nVar = this.f111928w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    a2 a2Var = nVar.f111932s;
                    if (a2Var != null) {
                        this.v = 1;
                        if (a2Var.u(this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        n.y2(nVar);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                ConsentPromptData consentPromptData = nVar.f111929p.f86101a;
                ld8.c cVar = nVar.f111930q;
                String str = consentPromptData.f86086a;
                String str2 = consentPromptData.i;
                v6d.a aVar2 = consentPromptData.f86091j;
                this.v = 2;
                if (cVar.a(str, str2, aVar2, this) == aVar) {
                    return aVar;
                }
                n.y2(nVar);
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    n nVar2 = this.f111928w;
                    l lVar = new l(nVar2, null, 0);
                    this.v = 1;
                    if (nVar2.p2(this, lVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                n nVar3 = this.f111928w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    a2 a2Var2 = nVar3.f111932s;
                    if (a2Var2 != null) {
                        this.v = 1;
                        if (a2Var2.u(this) == aVar4) {
                            return aVar4;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        n.y2(nVar3);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                ConsentPromptData consentPromptData2 = nVar3.f111929p.f86101a;
                ld8.c cVar2 = nVar3.f111930q;
                String str3 = consentPromptData2.f86086a;
                String str4 = consentPromptData2.i;
                v6d.a aVar5 = consentPromptData2.f86091j;
                this.v = 2;
                if (cVar2.b(str3, str4, aVar5, this) == aVar4) {
                    return aVar4;
                }
                n.y2(nVar3);
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    n nVar4 = this.f111928w;
                    l lVar2 = new l(nVar4, null, 2);
                    this.v = 1;
                    if (nVar4.p2(this, lVar2) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
