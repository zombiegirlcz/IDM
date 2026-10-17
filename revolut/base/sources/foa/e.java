package foa;

import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nyb.b0;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TermsScope termsScope;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.a aVar2 = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            if (((b0) aVar2.f81472t).b()) {
                TermsScope.INSTANCE.getClass();
                termsScope = TermsScope.f90383t0;
            } else {
                TermsScope.INSTANCE.getClass();
                termsScope = TermsScope.f90365e0;
            }
            ufm.i iVarC = ((rre.d) aVar2.f81469q).c(termsScope, null);
            this.u = 1;
            obj2 = nim.a.b(iVarC, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        NaviCommand naviCommand = (NaviCommand) obj2;
        Intrinsics.h(naviCommand);
        return aVar2.C1(new BridgeDestination(naviCommand));
    }
}
