package xo8;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.payees.api.models.PayeesInputData;
import com.revolut.feature.payees.api.models.PayeesTargetUser;
import com.revolut.feature.payees.api.navigation.PayeesDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ h0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(h0 h0Var, Continuation continuation) {
        super(2, continuation);
        this.u = h0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new x(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h0 h0Var = this.u;
        JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) ((j) ((j2) h0Var.E.f22677a).getValue()).f307708a.getContent();
        String str = juniorBankingProfile != null ? juniorBankingProfile.f77099b : null;
        if (str != null) {
            return h0Var.C1(new PayeesDestination(new PayeesInputData(new PayeesTargetUser.Junior(h0Var.o.f77340a, str))));
        }
        throw new IllegalArgumentException("Block payees visible while junior profile is null");
    }
}
