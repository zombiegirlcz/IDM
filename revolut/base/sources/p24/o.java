package p24;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import ft3.h1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f232052w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h1 f232053x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ iv3.b f232054y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, h1 h1Var, iv3.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f232052w = pVar;
        this.f232053x = h1Var;
        this.f232054y = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.f232052w, this.f232053x, this.f232054y, continuation, 0);
            default:
                return new o(this.f232052w, this.f232053x, this.f232054y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        iv3.b bVar = this.f232054y;
        h1 h1Var = this.f232053x;
        p pVar = this.f232052w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    CreditPluginsService creditPluginsService = pVar.f232057c;
                    String str = h1Var.f137835a;
                    Object obj3 = n14.f.f211239a;
                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                    j14.b bVar2 = new j14.b(bVar.f168707a, bVar.f168708b);
                    this.v = 1;
                    obj2 = creditPluginsService.submitAssessmentIncome(str, bVar2, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return pVar.f232055a.p((tt3.a) obj2);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    CreditPluginsService creditPluginsService2 = pVar.f232057c;
                    String str2 = h1Var.f137835a;
                    Object obj4 = n14.f.f211239a;
                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                    j14.b bVar3 = new j14.b(bVar.f168707a, bVar.f168708b);
                    this.v = 1;
                    obj2 = creditPluginsService2.submitAssessmentV2Income(str2, bVar3, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return pVar.f232055a.p((tt3.a) obj2);
        }
    }
}
