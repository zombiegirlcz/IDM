package xyb;

import com.revolut.feature.rev_points.impl.ui.benefits.unlock.RevPointsUnlockBenefitsScreen;
import gub.c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ RevPointsUnlockBenefitsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(RevPointsUnlockBenefitsScreen revPointsUnlockBenefitsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = revPointsUnlockBenefitsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            case 2:
                return new c(this.v, continuation, 2);
            default:
                return new c(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RevPointsUnlockBenefitsScreen revPointsUnlockBenefitsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                revPointsUnlockBenefitsScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((h) ((e) revPointsUnlockBenefitsScreen.Q.getValue())).C2(c.a.f146899a);
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((h) ((e) revPointsUnlockBenefitsScreen.Q.getValue())).C2(c.C0848c.f146901a);
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((h) ((e) revPointsUnlockBenefitsScreen.Q.getValue())).C2(c.b.f146900a);
                break;
        }
        return Unit.f186387a;
    }
}
