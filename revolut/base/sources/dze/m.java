package dze;

import blj.t;
import com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.CardTopUpThreeDsUiModel;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c f121337w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f121337w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f121337w, continuation, 0);
            case 1:
                return new m(this.f121337w, continuation, 1);
            default:
                return new m(this.f121337w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        cue.d dVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c cVar = this.f121337w;
                    nki.a aVar2 = cVar.k;
                    d dVar2 = cVar.o;
                    CardTopUpThreeDsUiModel cardTopUpThreeDsUiModel = dVar2.f121327a;
                    Continuation continuation = null;
                    if (cardTopUpThreeDsUiModel != null) {
                        String str = cardTopUpThreeDsUiModel.f90954a;
                        String str2 = cardTopUpThreeDsUiModel.d;
                        this.v = 1;
                        if (pu7.a.B(aVar2, "checkStatus", new l(cVar, str, str2, continuation, 1), this) == aVar) {
                            return aVar;
                        }
                    } else {
                        cue.d dVar3 = dVar2.f121328b;
                        if (dVar3 != null) {
                            String str3 = dVar3.f108991a;
                            String str4 = dVar3.f108992b;
                            this.v = 2;
                            if (pu7.a.B(aVar2, "checkStatus", new l(cVar, str3, str4, continuation, 1), this) == aVar) {
                                return aVar;
                            }
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c cVar2 = this.f121337w;
                d dVar4 = cVar2.o;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    if (dVar4.f121327a == null && (dVar = dVar4.f121328b) != null && dVar.d()) {
                        cue.d dVar5 = dVar4.f121328b;
                        this.v = 1;
                        if (com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c.I2(cVar2, dVar5, this) == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c cVar3 = this.f121337w;
                    j2 j2Var = cVar3.f90965t;
                    t tVar = new t(cVar3, 2);
                    this.v = 1;
                    if (j2Var.collect(tVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                throw new KotlinNothingValueException();
        }
    }
}
