package dbd;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends i implements Function1 {
    public final /* synthetic */ int u;
    public zt6.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f112726w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f112727x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f112728y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f112727x = gVar;
        this.f112728y = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f112727x, this.f112728y, continuation, 0);
            case 1:
                return new e(this.f112727x, this.f112728y, continuation, 1);
            default:
                return new e(this.f112727x, this.f112728y, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((e) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        zt6.g gVar;
        zt6.g gVar2;
        zt6.g gVar3;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f112726w;
                if (i == 0) {
                    o.b(obj2);
                    gVar = this.f112727x.f112730a;
                    this.v = gVar;
                    this.f112726w = 1;
                    zt6.g.a();
                    obj2 = "";
                    if ("" != aVar) {
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                gVar = this.v;
                o.b(obj2);
                this.v = null;
                this.f112726w = 2;
                Object objActivateOrderInitiationPage = gVar.f325088a.activateOrderInitiationPage(this.f112728y, this);
                if (objActivateOrderInitiationPage != aVar) {
                    return objActivateOrderInitiationPage;
                }
                return aVar;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f112726w;
                if (i2 == 0) {
                    o.b(obj2);
                    gVar2 = this.f112727x.f112730a;
                    this.v = gVar2;
                    this.f112726w = 1;
                    zt6.g.a();
                    obj2 = "";
                    if ("" != aVar2) {
                    }
                    return aVar2;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                gVar2 = this.v;
                o.b(obj2);
                this.v = null;
                this.f112726w = 2;
                Object objCompleteOrderInitiationPage = gVar2.f325088a.completeOrderInitiationPage(this.f112728y, this);
                if (objCompleteOrderInitiationPage != aVar2) {
                    return objCompleteOrderInitiationPage;
                }
                return aVar2;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.f112726w;
                if (i3 == 0) {
                    o.b(obj2);
                    gVar3 = this.f112727x.f112730a;
                    this.v = gVar3;
                    this.f112726w = 1;
                    zt6.g.a();
                    obj2 = "";
                    if ("" != aVar3) {
                    }
                    return aVar3;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                gVar3 = this.v;
                o.b(obj2);
                this.v = null;
                this.f112726w = 2;
                Object objSuspendOrderInitiationPage = gVar3.f325088a.suspendOrderInitiationPage(this.f112728y, this);
                if (objSuspendOrderInitiationPage != aVar3) {
                    return objSuspendOrderInitiationPage;
                }
                return aVar3;
        }
    }
}
