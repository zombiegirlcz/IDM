package m34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import ft3.h1;
import g14.e;
import g14.f;
import g14.h;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f202279w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h1 f202280x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f202281y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, h1 h1Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f202279w = cVar;
        this.f202280x = h1Var;
        this.f202281y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f202279w, this.f202280x, this.f202281y, continuation, 0);
            default:
                return new b(this.f202279w, this.f202280x, this.f202281y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                c cVar = this.f202279w;
                if (i == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService = cVar.f;
                    String str = this.f202280x.f137835a;
                    h hVar = new h(this.f202281y);
                    this.v = 1;
                    obj2 = creditPluginsService.submitHomeInsurancePartnerFailure(str, hVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                f fVar = cVar.d;
                return f.a((e) obj2);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                c cVar2 = this.f202279w;
                if (i2 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService2 = cVar2.f;
                    String str2 = this.f202280x.f137835a;
                    h hVar2 = new h(this.f202281y);
                    this.v = 1;
                    obj2 = creditPluginsService2.submitHomeInsurancePartnerSuccess(str2, hVar2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return cVar2.f202282a.p((tt3.a) obj2);
        }
    }
}
