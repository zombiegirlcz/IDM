package q24;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import e04.g;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f241527w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f241528x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f241527w = cVar;
        this.f241528x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f241527w, this.f241528x, continuation, 0);
            case 1:
                return new a(this.f241527w, this.f241528x, continuation, 1);
            case 2:
                return new a(this.f241527w, this.f241528x, continuation, 2);
            default:
                return new a(this.f241527w, this.f241528x, continuation, 3);
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
                if (i == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService = this.f241527w.f241533b;
                    this.v = 1;
                    if (creditPluginsService.dropout(this.f241528x, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService2 = this.f241527w.f241533b;
                    this.v = 1;
                    obj2 = creditPluginsService2.getDropoutIntroScreen(this.f241528x, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                g gVar = (g) obj2;
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                return new gu3.a(gVar.getTitle(), gVar.getDescription(), gVar.getImage(), gVar.getPrimaryButton(), gVar.getSecondaryButton());
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                c cVar = this.f241527w;
                if (i3 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService3 = cVar.f241533b;
                    this.v = 1;
                    obj2 = creditPluginsService3.getDropoutSurvey(this.f241528x, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return cVar.f241532a.a((q90.i) obj2);
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService4 = this.f241527w.f241533b;
                    this.v = 1;
                    if (creditPluginsService4.postDropoutNoFeedbackSurvey(this.f241528x, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
