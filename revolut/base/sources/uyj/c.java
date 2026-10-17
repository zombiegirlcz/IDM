package uyj;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.retail.feature.learn.impl.ui.share_rewards.ShareRewardsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ ShareRewardsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ShareRewardsScreen shareRewardsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = shareRewardsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((PromptContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        this.u.m2().onBackPressed();
        return Unit.f186387a;
    }
}
