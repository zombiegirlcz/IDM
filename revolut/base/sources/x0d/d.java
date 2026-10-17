package x0d;

import com.revolut.feature.semi_independent_onboarding.api.model.GuardianInvitationResult;
import com.revolut.feature.semi_independent_onboarding.impl.data.SemiIndependentOnboardingInvitationService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import z0d.l;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f301569w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f301570x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, e eVar, Continuation continuation) {
        super(2, continuation);
        this.f301570x = str;
        this.f301569w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f301570x, this.f301569w, continuation);
            default:
                return new d(this.f301569w, this.f301570x, continuation);
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
                    o.b(obj2);
                    l lVar = new l(this.f301570x);
                    SemiIndependentOnboardingInvitationService semiIndependentOnboardingInvitationService = this.f301569w.f301571a;
                    this.v = 1;
                    obj2 = semiIndependentOnboardingInvitationService.sendGuardianInvitation(lVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                z0d.o response = (z0d.o) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                String str = response.f318229c;
                String str2 = response.f318227a;
                if (str != null) {
                    return new GuardianInvitationResult.ExistingUser(str2, str);
                }
                String str3 = response.f318228b;
                if (str3 != null) {
                    return new GuardianInvitationResult.NotExistingUser(str2, str3);
                }
                throw new IllegalStateException("Parse error. Either guardianFirstName or invitationMessage must be provided");
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                SemiIndependentOnboardingInvitationService semiIndependentOnboardingInvitationService2 = this.f301569w.f301571a;
                this.v = 1;
                Object objSendGuardianInvitationReminder = semiIndependentOnboardingInvitationService2.sendGuardianInvitationReminder(this.f301570x, this);
                return objSendGuardianInvitationReminder == aVar2 ? aVar2 : objSendGuardianInvitationReminder;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f301569w = eVar;
        this.f301570x = str;
    }
}
