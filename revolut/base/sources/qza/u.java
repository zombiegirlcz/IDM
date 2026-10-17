package qza;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.remote_stories.impl.ui.b f250479w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f250480x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(com.revolut.feature.remote_stories.impl.ui.b bVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f250479w = bVar;
        this.f250480x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new u(this.f250479w, this.f250480x, continuation, 0);
            case 1:
                return new u(this.f250479w, this.f250480x, continuation, 1);
            default:
                return new u(this.f250479w, this.f250480x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    wli.x xVar = this.f250479w.d;
                    lg0.a aVar2 = lg0.a.OPEN_BROWSER;
                    this.v = 1;
                    if (lg0.b.x1(xVar, this.f250480x, aVar2, null, this, 4) == aVar) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    wli.x xVar2 = this.f250479w.d;
                    lg0.a aVar4 = lg0.a.OPEN_BROWSER;
                    this.v = 1;
                    if (lg0.b.x1(xVar2, this.f250480x, aVar4, null, this, 4) == aVar3) {
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
                    wli.x xVar3 = this.f250479w.d;
                    lg0.a aVar6 = lg0.a.OPEN_BROWSER;
                    this.v = 1;
                    if (lg0.b.x1(xVar3, this.f250480x, aVar6, null, this, 4) == aVar5) {
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
