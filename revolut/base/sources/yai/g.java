package yai;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.referrals.code.api.ReferralCodeApiContract$InputData;
import com.revolut.feature.referrals.code.api.ScreenSource;
import com.revolut.feature_retail_user_declarations.email.screen.EmailScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ EmailScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(EmailScreen emailScreen, Continuation continuation) {
        super(2, continuation);
        this.u = emailScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature_retail_user_declarations.email.screen.a aVar2 = (com.revolut.feature_retail_user_declarations.email.screen.a) this.u.R2();
        aVar2.getClass();
        yji.l.j2(aVar2, aVar2.e1(new xva.a(new ReferralCodeApiContract$InputData(ScreenSource.Email.f81674a))), null, new y8a.h(aVar2, 10), 1);
        return Unit.f186387a;
    }
}
