package p24;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import ft3.h1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f232049w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h1 f232050x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ iv3.f f232051y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(p pVar, h1 h1Var, iv3.f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f232049w = pVar;
        this.f232050x = h1Var;
        this.f232051y = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f232049w, this.f232050x, this.f232051y, continuation, 0);
            default:
                return new n(this.f232049w, this.f232050x, this.f232051y, continuation, 1);
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
                p pVar = this.f232049w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    CreditPluginsService creditPluginsService = pVar.f232057c;
                    String str = this.f232050x.f137835a;
                    j14.a aVarA = n14.f.a(this.f232051y);
                    this.v = 1;
                    obj2 = creditPluginsService.submitAssessmentError(str, aVarA, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return pVar.f232055a.p((tt3.a) obj2);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                p pVar2 = this.f232049w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    CreditPluginsService creditPluginsService2 = pVar2.f232057c;
                    String str2 = this.f232050x.f137835a;
                    j14.a aVarA2 = n14.f.a(this.f232051y);
                    this.v = 1;
                    obj2 = creditPluginsService2.submitAssessmentV2Error(str2, aVarA2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return pVar2.f232055a.p((tt3.a) obj2);
        }
    }
}
