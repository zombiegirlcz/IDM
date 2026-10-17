package xr3;

import com.revolut.feature.credit.application.impl.network.CreditOnboardingService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f308208w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f308209x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f308208w = eVar;
        this.f308209x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f308208w, this.f308209x, continuation, 0);
            default:
                return new d(this.f308208w, this.f308209x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    CreditOnboardingService creditOnboardingService = this.f308208w.f308210a;
                    this.v = 1;
                    if (creditOnboardingService.declineInvitation(this.f308209x, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    CreditOnboardingService creditOnboardingService2 = this.f308208w.f308210a;
                    this.v = 1;
                    obj2 = creditOnboardingService2.getDeclineInvitationConfiguration(this.f308209x, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                hr3.a aVar3 = (hr3.a) obj2;
                Intrinsics.checkNotNullParameter(aVar3, "<this>");
                return new ds3.c(aVar3.getTitle(), aVar3.getDescription(), hr3.b.a(aVar3.getPrimaryButton()), hr3.b.a(aVar3.getSecondaryButton()));
        }
    }
}
