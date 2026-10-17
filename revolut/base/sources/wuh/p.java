package wuh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.workflow.engine.sdk_flow.f f300160w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f300161x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ od9.e f300162y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(com.revolut.feature.workflow.engine.sdk_flow.f fVar, String str, od9.e eVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f300160w = fVar;
        this.f300161x = str;
        this.f300162y = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.f300160w, this.f300161x, this.f300162y, continuation, 0);
            case 1:
                return new p(this.f300160w, this.f300161x, this.f300162y, continuation, 1);
            case 2:
                return new p(this.f300160w, this.f300161x, this.f300162y, continuation, 2);
            case 3:
                return new p(this.f300160w, this.f300161x, this.f300162y, continuation, 3);
            case 4:
                return new p(this.f300160w, this.f300161x, this.f300162y, continuation, 4);
            default:
                return new p(this.f300160w, this.f300161x, this.f300162y, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((p) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.workflow.engine.sdk_flow.f fVar = this.f300160w;
                    String f96583a = fVar.o.getF96583a();
                    String str = ((od9.d) this.f300162y).f224333a;
                    this.v = 1;
                    if (com.revolut.feature.workflow.engine.sdk_flow.f.K2(fVar, f96583a, this.f300161x, str, null, this, 8) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.workflow.engine.sdk_flow.f fVar2 = this.f300160w;
                    String f96583a2 = fVar2.o.getF96583a();
                    String str2 = ((od9.d) this.f300162y).f224333a;
                    this.v = 1;
                    if (com.revolut.feature.workflow.engine.sdk_flow.f.K2(fVar2, f96583a2, this.f300161x, str2, null, this, 8) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.workflow.engine.sdk_flow.f fVar3 = this.f300160w;
                    String f96583a3 = fVar3.o.getF96583a();
                    String str3 = ((od9.d) this.f300162y).f224333a;
                    this.v = 1;
                    if (com.revolut.feature.workflow.engine.sdk_flow.f.K2(fVar3, f96583a3, this.f300161x, str3, null, this, 8) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.workflow.engine.sdk_flow.f fVar4 = this.f300160w;
                    String f96583a4 = fVar4.o.getF96583a();
                    String str4 = ((od9.d) this.f300162y).f224333a;
                    this.v = 1;
                    if (com.revolut.feature.workflow.engine.sdk_flow.f.K2(fVar4, f96583a4, this.f300161x, str4, null, this, 8) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.workflow.engine.sdk_flow.f fVar5 = this.f300160w;
                    String f96583a5 = fVar5.o.getF96583a();
                    String str5 = ((od9.d) this.f300162y).f224333a;
                    if (str5 == null) {
                        str5 = "";
                    }
                    sil.i iVar = new sil.i(str5);
                    this.v = 1;
                    if (com.revolut.feature.workflow.engine.sdk_flow.f.K2(fVar5, f96583a5, this.f300161x, null, iVar, this, 4) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.workflow.engine.sdk_flow.f fVar6 = this.f300160w;
                    String f96583a6 = fVar6.o.getF96583a();
                    String str6 = ((od9.d) this.f300162y).f224333a;
                    this.v = 1;
                    if (com.revolut.feature.workflow.engine.sdk_flow.f.K2(fVar6, f96583a6, this.f300161x, str6, null, this, 8) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
