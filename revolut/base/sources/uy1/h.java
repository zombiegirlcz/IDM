package uy1;

import com.revolut.feature.apm.core.impl.data.network.alias.AliasService;
import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f284038w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Alias f284039x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, Alias alias, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f284038w = jVar;
        this.f284039x = alias;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f284038w, this.f284039x, continuation, 0);
            default:
                return new h(this.f284038w, this.f284039x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    j jVar = this.f284038w;
                    AliasService aliasService = jVar.f284043a;
                    String str = jVar.d;
                    wy1.a aVarA = vy1.a.a(this.f284039x, null);
                    wj0.b bVar = new wj0.b("IDEMPOTENCY_TAG_FREEZE_ALIAS");
                    this.v = 1;
                    obj2 = aliasService.freezeAlias(str, bVar, aVarA, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return vy1.c.a((wy1.f) obj2);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    j jVar2 = this.f284038w;
                    AliasService aliasService2 = jVar2.f284043a;
                    String str2 = jVar2.d;
                    wy1.a aVarA2 = vy1.a.a(this.f284039x, null);
                    wj0.b bVar2 = new wj0.b("IDEMPOTENCY_TAG_UNFREEZE_ALIAS");
                    this.v = 1;
                    obj2 = aliasService2.unfreezeAlias(str2, bVar2, aVarA2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return vy1.c.a((wy1.f) obj2);
        }
    }
}
