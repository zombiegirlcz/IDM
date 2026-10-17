package dn8;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.junior_savings.impl.ui.screen.saving_review.JuniorSavingReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorSavingReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(JuniorSavingReviewScreen juniorSavingReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorSavingReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = (c) this.v.P.getValue();
        Intrinsics.h(model);
        cVar.I2(model);
        return Unit.f186387a;
    }
}
