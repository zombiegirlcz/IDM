package cuc;

import com.revolut.feature.security_hub.impl.network.LinkedWalletsService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f108939w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f108940x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f108939w = dVar;
        this.f108940x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f108939w, this.f108940x, continuation, 0);
            default:
                return new b(this.f108939w, this.f108940x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                d dVar = this.f108939w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    LinkedWalletsService linkedWalletsService = dVar.f108947a;
                    this.v = 1;
                    if (linkedWalletsService.deleteLinkedWallet(this.f108940x, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                x4l.c cVar = dVar.e;
                Unit unit = Unit.f186387a;
                this.v = 2;
                if (cVar.d(unit, false, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                d dVar2 = this.f108939w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    LinkedWalletsService linkedWalletsService2 = dVar2.f108947a;
                    this.v = 1;
                    if (linkedWalletsService2.enrollToClickToPay(this.f108940x, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                x4l.c cVar2 = dVar2.e;
                Unit unit2 = Unit.f186387a;
                this.v = 2;
                if (cVar2.d(unit2, true, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }
}
