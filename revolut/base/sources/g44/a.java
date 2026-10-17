package g44;

import a24.c;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import ft3.h1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f140331w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h1 f140332x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f140333y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, h1 h1Var, String str, Continuation continuation) {
        super(2, continuation);
        this.f140331w = bVar;
        this.f140332x = h1Var;
        this.f140333y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f140333y, this.f140331w, this.f140332x, continuation);
            default:
                return new a(this.f140331w, this.f140332x, this.f140333y, continuation);
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
        tt3.a aVar;
        switch (this.u) {
            case 0:
                String str = this.f140332x.f137835a;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                b bVar = this.f140331w;
                if (i == 0) {
                    o.b(obj2);
                    String str2 = this.f140333y;
                    if (str2 != null) {
                        CreditPluginsService creditPluginsService = bVar.f140335b;
                        a24.b bVar2 = new a24.b(str2);
                        this.v = 1;
                        obj2 = creditPluginsService.rolleeAccountCreatedWithDataSource(str, bVar2, this);
                        if (obj2 == aVar2) {
                            return aVar2;
                        }
                        aVar = (tt3.a) obj2;
                    } else {
                        CreditPluginsService creditPluginsService2 = bVar.f140335b;
                        this.v = 2;
                        obj2 = creditPluginsService2.rolleeAccountCreated(str, this);
                        if (obj2 == aVar2) {
                            return aVar2;
                        }
                        aVar = (tt3.a) obj2;
                    }
                } else if (i == 1) {
                    o.b(obj2);
                    aVar = (tt3.a) obj2;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    aVar = (tt3.a) obj2;
                }
                return bVar.f140334a.p(aVar);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService3 = this.f140331w.f140335b;
                    String str3 = this.f140332x.f137835a;
                    this.v = 1;
                    obj2 = creditPluginsService3.refreshRolleeSession(str3, this.f140333y, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return ((c) obj2).getIb.b.Session java.lang.String();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, b bVar, h1 h1Var, Continuation continuation) {
        super(2, continuation);
        this.f140333y = str;
        this.f140331w = bVar;
        this.f140332x = h1Var;
    }
}
