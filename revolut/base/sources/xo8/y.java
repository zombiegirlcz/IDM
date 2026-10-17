package xo8;

import com.revolut.feature.blocked_merchants.api.model.BlockMerchantsTabConfig;
import com.revolut.feature.blocked_merchants.api.navigation.BlockedMerchantsListFlowDestination;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ h0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(h0 h0Var, Continuation continuation) {
        super(2, continuation);
        this.u = h0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new y(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h0 h0Var = this.u;
        cli.y yVar = h0Var.E;
        JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) ((j) ((j2) yVar.f22677a).getValue()).f307708a.getContent();
        String str = juniorBankingProfile != null ? juniorBankingProfile.f77099b : null;
        if (str == null) {
            throw new IllegalArgumentException("Block payments visible while junior profile is null");
        }
        psg.a aVar2 = ((j) ((j2) yVar.f22677a).getValue()).f307709b;
        String str2 = aVar2 != null ? aVar2.f239484a : null;
        if (str2 != null) {
            return h0Var.C1(new BlockedMerchantsListFlowDestination(new BlockMerchantsTabConfig.OnlyJunior(h0Var.o.f77340a, str, str2)));
        }
        throw new IllegalArgumentException("Block payments visible while wallet profile is null");
    }
}
