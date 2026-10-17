package lld;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import wli.x;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.slot_manager.impl.ui.screen.checklist.a f196727w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f196728x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(com.revolut.feature.slot_manager.impl.ui.screen.checklist.a aVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f196727w = aVar;
        this.f196728x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.f196727w, this.f196728x, continuation, 0);
            case 1:
                return new o(this.f196727w, this.f196728x, continuation, 1);
            default:
                return new o(this.f196727w, this.f196728x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((o) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                String str = this.f196728x;
                com.revolut.feature.slot_manager.impl.ui.screen.checklist.a aVar2 = this.f196727w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    kkd.f fVar = aVar2.f87368s;
                    kkd.b bVar = new kkd.b(str);
                    this.v = 1;
                    obj2 = fVar.b(bVar);
                    if (obj2 == aVar) {
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
                if (((Boolean) obj2).booleanValue()) {
                    aVar2.C2(new kkd.e(new kkd.b(str)));
                } else {
                    this.v = 2;
                    Object objI2 = aVar2.I2(null, new j(aVar2, str, null), this);
                    if (objI2 != aVar) {
                        objI2 = Unit.f186387a;
                    }
                    if (objI2 == aVar) {
                        return aVar;
                    }
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    x xVar = this.f196727w.f87365p;
                    lg0.a aVar4 = lg0.a.OPEN_BROWSER;
                    Boolean bool = Boolean.FALSE;
                    this.v = 1;
                    if (xVar.L1(this.f196728x, aVar4, bool, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.slot_manager.impl.ui.screen.checklist.a aVar6 = this.f196727w;
                    o oVar = new o(aVar6, this.f196728x, null, 1);
                    this.v = 1;
                    if (aVar6.p2(this, oVar) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
