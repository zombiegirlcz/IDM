package tub;

import com.revolut.feature.rev_points.buying.impl.data.network.RevPointsBuyingService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f274564w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f274565x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b f274566y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(i iVar, b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f274565x = iVar;
        this.f274566y = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f274565x, this.f274566y, continuation, 0);
            case 1:
                return new f(this.f274565x, this.f274566y, continuation, 1);
            default:
                return new f(this.f274565x, this.f274566y, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        i iVar;
        i iVar2;
        i iVar3;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f274564w;
                if (i == 0) {
                    o.b(obj2);
                    i iVar4 = this.f274565x;
                    RevPointsBuyingService revPointsBuyingService = iVar4.f274568a;
                    b bVar = this.f274566y;
                    sub.f fVar = new sub.f(bVar.f274557a);
                    String str = bVar.f274559c;
                    if (str == null) {
                        str = "";
                    }
                    this.v = iVar4;
                    this.f274564w = 1;
                    Object objCreateRecurringPurchase = revPointsBuyingService.createRecurringPurchase(fVar, str, this);
                    if (objCreateRecurringPurchase == aVar) {
                        return aVar;
                    }
                    iVar = iVar4;
                    obj2 = objCreateRecurringPurchase;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar = this.v;
                    o.b(obj2);
                }
                return i.a(iVar, (Response) obj2);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f274564w;
                if (i2 == 0) {
                    o.b(obj2);
                    i iVar5 = this.f274565x;
                    RevPointsBuyingService revPointsBuyingService2 = iVar5.f274568a;
                    String str2 = this.f274566y.f274558b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    this.v = iVar5;
                    this.f274564w = 1;
                    Object objDeleteRecurringPurchase = revPointsBuyingService2.deleteRecurringPurchase(str2, this);
                    if (objDeleteRecurringPurchase == aVar2) {
                        return aVar2;
                    }
                    iVar2 = iVar5;
                    obj2 = objDeleteRecurringPurchase;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar2 = this.v;
                    o.b(obj2);
                }
                i.a(iVar2, (Response) obj2);
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.f274564w;
                if (i3 == 0) {
                    o.b(obj2);
                    i iVar6 = this.f274565x;
                    RevPointsBuyingService revPointsBuyingService3 = iVar6.f274568a;
                    b bVar2 = this.f274566y;
                    String str3 = bVar2.f274558b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    sub.f fVar2 = new sub.f(bVar2.f274557a);
                    this.v = iVar6;
                    this.f274564w = 1;
                    Object objModifyRecurringPurchase = revPointsBuyingService3.modifyRecurringPurchase(str3, fVar2, this);
                    if (objModifyRecurringPurchase == aVar3) {
                        return aVar3;
                    }
                    iVar3 = iVar6;
                    obj2 = objModifyRecurringPurchase;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar3 = this.v;
                    o.b(obj2);
                }
                return i.a(iVar3, (Response) obj2);
        }
    }
}
