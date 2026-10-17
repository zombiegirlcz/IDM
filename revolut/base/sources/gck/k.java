package gck;

import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.intro.PlanGiftingReceiverIntroScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PlanGiftingReceiverIntroScreen f142500w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(PlanGiftingReceiverIntroScreen planGiftingReceiverIntroScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f142500w = planGiftingReceiverIntroScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f142500w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            default:
                k kVar2 = new k(this.f142500w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        kbk.j jVar = (kbk.j) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(jVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 23;
        PlanGiftingReceiverIntroScreen planGiftingReceiverIntroScreen = this.f142500w;
        switch (i) {
            case 0:
                kbk.j giftingIntro = (kbk.j) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w wVar = (w) planGiftingReceiverIntroScreen.d();
                wVar.getClass();
                Intrinsics.checkNotNullParameter(giftingIntro, "giftingIntro");
                if (wVar.o.f102501c != kbk.k.CLAIM_ONLY || giftingIntro.f182632j == null) {
                    wVar.f142524w.b3(giftingIntro.f182628b, new fx5.a(wVar, giftingIntro, i2));
                } else {
                    wVar.J2();
                }
                return Unit.f186387a;
            default:
                kbk.j giftingIntro2 = (kbk.j) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w wVar2 = (w) planGiftingReceiverIntroScreen.d();
                wVar2.getClass();
                Intrinsics.checkNotNullParameter(giftingIntro2, "giftingIntro");
                int i3 = u.f142516a[wVar2.o.f102501c.ordinal()];
                if (i3 == 1) {
                    wVar2.C2(new n(giftingIntro2.f182627a, giftingIntro2.f182628b));
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wVar2.f142524w.b3(giftingIntro2.f182628b, new fx5.a(wVar2, giftingIntro2, i2));
                }
                return Unit.f186387a;
        }
    }
}
