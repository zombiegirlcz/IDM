package nv6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.impl.ui.cashback.screen.details.FreelancerCashbackDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv6.m;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerCashbackDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(FreelancerCashbackDetailsScreen freelancerCashbackDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerCashbackDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f53228a;
        boolean zF = Intrinsics.f(str, "LIST_ID_CASHBACK_DETAILS_PLAN_ITEM");
        FreelancerCashbackDetailsScreen freelancerCashbackDetailsScreen = this.v;
        if (zF) {
            ((s) freelancerCashbackDetailsScreen.d()).C2(m.d.f219525a);
        } else if (Intrinsics.f(str, "LIST_ID_CASHBACK_DETAILS_BOOSTER_ITEM")) {
            ((s) freelancerCashbackDetailsScreen.d()).C2(m.b.f219523a);
        }
        return Unit.f186387a;
    }
}
