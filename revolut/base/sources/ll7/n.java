package ll7;

import com.revolut.feature.insurance_car.impl.data.network.InsuranceCarService;
import hl7.j5;
import hl7.v8;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f196644w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f196645x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f196646y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, p pVar, String str2, Continuation continuation) {
        super(2, continuation);
        this.f196645x = str;
        this.f196644w = pVar;
        this.f196646y = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f196645x, this.f196644w, this.f196646y, continuation);
            default:
                return new n(this.f196644w, this.f196645x, this.f196646y, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                p pVar = this.f196644w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    hl7.x xVar = new hl7.x(this.f196645x);
                    InsuranceCarService insuranceCarService = pVar.f196649a;
                    this.v = 1;
                    obj2 = insuranceCarService.cancelMta(this.f196646y, xVar, this);
                    if (obj2 != aVar) {
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                String str = ((j5) obj2).f153161a;
                this.v = 2;
                Object objA = m.a(pVar, str, this);
                if (objA != aVar) {
                    return objA;
                }
                return aVar;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                p pVar2 = this.f196644w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    v8 v8Var = new v8(wp5.y.u(pVar2.f196650b, "toString(...)"), this.f196645x);
                    InsuranceCarService insuranceCarService2 = pVar2.f196649a;
                    this.v = 1;
                    obj2 = insuranceCarService2.createRemoveDriverMta(this.f196646y, v8Var, this);
                    if (obj2 != aVar2) {
                    }
                    return aVar2;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                String str2 = ((j5) obj2).f153161a;
                this.v = 2;
                Object objA2 = m.a(pVar2, str2, this);
                if (objA2 != aVar2) {
                    return objA2;
                }
                return aVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f196644w = pVar;
        this.f196645x = str;
        this.f196646y = str2;
    }
}
