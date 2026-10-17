package o26;

import aii.u;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f221500w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f221501x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f221501x = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f221501x, continuation, 0);
            case 1:
                return new f(this.f221501x, continuation, 1);
            default:
                return new f(this.f221501x, continuation, 2);
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
        g gVar;
        g gVar2;
        g gVar3;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f221500w;
                if (i == 0) {
                    o.b(obj2);
                    wd6.e eVar = wd6.e.BUY;
                    g gVar4 = this.f221501x;
                    this.v = gVar4;
                    this.f221500w = 1;
                    obj2 = g.e3(gVar4, eVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                    gVar = gVar4;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = this.v;
                    o.b(obj2);
                }
                return gVar.A2((u) obj2);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f221500w;
                if (i2 == 0) {
                    o.b(obj2);
                    g gVar5 = this.f221501x;
                    this.v = gVar5;
                    this.f221500w = 1;
                    Object objF3 = g.f3(gVar5, this);
                    if (objF3 == aVar2) {
                        return aVar2;
                    }
                    gVar2 = gVar5;
                    obj2 = objF3;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar2 = this.v;
                    o.b(obj2);
                }
                return gVar2.A2((u) obj2);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.f221500w;
                if (i3 == 0) {
                    o.b(obj2);
                    wd6.e eVar2 = wd6.e.SELL;
                    g gVar6 = this.f221501x;
                    this.v = gVar6;
                    this.f221500w = 1;
                    obj2 = g.e3(gVar6, eVar2, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                    gVar3 = gVar6;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar3 = this.v;
                    o.b(obj2);
                }
                return gVar3.A2((u) obj2);
        }
    }
}
