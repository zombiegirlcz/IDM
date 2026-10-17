package a72;

import com.revolut.feature.apm.multibanco.impl.data.network.MultibancoService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f1757w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f1757w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f1757w, continuation, 0);
            case 1:
                return new g(this.f1757w, continuation, 1);
            default:
                return new g(this.f1757w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    MultibancoService multibancoService = this.f1757w.f1758a;
                    this.v = 1;
                    obj2 = multibancoService.getMultibancoUserRegistrationData(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                e72.f fVar = (e72.f) obj2;
                Intrinsics.checkNotNullParameter(fVar, "<this>");
                String strF = fVar.getPin();
                String strD = fVar.getIds();
                String strE = fVar.getParticipantCode();
                String strA = fVar.getApplicationCode();
                String strB = fVar.getBankHash();
                String strC = fVar.getCodAct();
                if (strC != null) {
                    return new h02.d(strF, strD, strE, strA, strB, strC);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    MultibancoService multibancoService2 = this.f1757w.f1758a;
                    this.v = 1;
                    obj2 = multibancoService2.getMultibancoUserRegistrationStatus(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return d72.a.a((e72.g) obj2);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    MultibancoService multibancoService3 = this.f1757w.f1758a;
                    this.v = 1;
                    if (multibancoService3.postMultibancoRenewService(this) == aVar3) {
                        return aVar3;
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
