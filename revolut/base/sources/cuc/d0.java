package cuc;

import com.revolut.feature.security_hub.impl.network.StreetModeService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public e0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f108950w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e0 f108951x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f108952y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(e0 e0Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f108951x = e0Var;
        this.f108952y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d0(this.f108951x, this.f108952y, continuation, 0);
            default:
                return new d0(this.f108951x, this.f108952y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        e0 e0Var;
        e0 e0Var2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f108950w;
                e0 e0Var3 = this.f108951x;
                if (i == 0) {
                    yhm.o.b(obj2);
                    StreetModeService streetModeService = e0Var3.f108955c;
                    this.v = e0Var3;
                    this.f108950w = 1;
                    obj2 = streetModeService.deleteTrustedLocation(this.f108952y, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                    e0Var = e0Var3;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    e0Var = this.v;
                    yhm.o.b(obj2);
                }
                e0.a(e0Var, (Response) obj2);
                x4l.c cVar = e0Var3.d;
                Unit unit = Unit.f186387a;
                this.v = null;
                this.f108950w = 2;
                if (cVar.d(unit, false, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f108950w;
                e0 e0Var4 = this.f108951x;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    StreetModeService streetModeService2 = e0Var4.f108955c;
                    this.v = e0Var4;
                    this.f108950w = 1;
                    obj2 = streetModeService2.deleteTrustedWifi(this.f108952y, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                    e0Var2 = e0Var4;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    e0Var2 = this.v;
                    yhm.o.b(obj2);
                }
                e0.a(e0Var2, (Response) obj2);
                x4l.c cVar2 = e0Var4.d;
                Unit unit2 = Unit.f186387a;
                this.v = null;
                this.f108950w = 2;
                if (cVar2.d(unit2, false, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }
}
