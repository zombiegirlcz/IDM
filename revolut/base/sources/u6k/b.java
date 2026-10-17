package u6k;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import prl.k;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f277613w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MoneyRequest f277614x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, MoneyRequest moneyRequest, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f277613w = cVar;
        this.f277614x = moneyRequest;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f277613w, this.f277614x, continuation, 0);
            case 1:
                return new b(this.f277613w, this.f277614x, continuation, 1);
            default:
                return new b(this.f277613w, this.f277614x, continuation, 2);
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
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        MoneyRequest moneyRequest = this.f277614x;
        c cVar = this.f277613w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                pz1.b bVar = cVar.f277617c;
                String str = moneyRequest.f60314a;
                this.v = 1;
                pz1.a aVar2 = new pz1.a(bVar, str, null, 0);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, aVar2, this);
                return objJ == aVar ? aVar : objJ;
            case 1:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    pz1.b bVar2 = cVar.f277617c;
                    String str2 = moneyRequest.f60314a;
                    this.v = 1;
                    k kVar = new k(8, bVar2, str2, continuation);
                    p0 p0Var2 = p0.f264001a;
                    Object objJ2 = e0.J(elm.f.f127540b, kVar, this);
                    if (objJ2 != obj3) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    pz1.b bVar3 = cVar.f277617c;
                    String str3 = moneyRequest.f60314a;
                    this.v = 1;
                    pz1.a aVar4 = new pz1.a(bVar3, str3, null, 1);
                    p0 p0Var3 = p0.f264001a;
                    if (e0.J(elm.f.f127540b, aVar4, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
