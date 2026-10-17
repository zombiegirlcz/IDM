package o34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import ft3.h1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import n14.g;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f221685w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h1 f221686x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, h1 h1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f221685w = bVar;
        this.f221686x = h1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f221685w, this.f221686x, continuation, 0);
            case 1:
                return new a(this.f221685w, this.f221686x, continuation, 1);
            case 2:
                return new a(this.f221685w, this.f221686x, continuation, 2);
            default:
                return new a(this.f221685w, this.f221686x, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                b bVar = this.f221685w;
                if (i == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService = bVar.f221689c;
                    String str = this.f221686x.f137835a;
                    this.v = 1;
                    obj2 = creditPluginsService.acceptLinkedAccountsV2(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return bVar.f221688b.p((tt3.a) obj2);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService2 = this.f221685w.f221689c;
                    String str2 = this.f221686x.f137835a;
                    this.v = 1;
                    obj2 = creditPluginsService2.getLinkedAccountsV2Configuration(str2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return g.a((k14.a) obj2);
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService3 = this.f221685w.f221689c;
                    String str3 = this.f221686x.f137835a;
                    this.v = 1;
                    obj2 = creditPluginsService3.getLinkedAccountsV2Consents(str3, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return g.b((k14.b) obj2);
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService4 = this.f221685w.f221689c;
                    String str4 = this.f221686x.f137835a;
                    this.v = 1;
                    obj2 = creditPluginsService4.getLinkedAccountsV2Permission(str4, this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return g.b((k14.b) obj2);
        }
    }
}
