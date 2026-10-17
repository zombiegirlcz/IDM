package yw9;

import com.revolut.feature.payments.profile.impl.ui_kompot.onboarding.ProfileController;
import ip0.u00;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ProfileController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ProfileController profileController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = profileController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            case 1:
                return new b(this.v, continuation, 1);
            default:
                return new b(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        ProfileController profileController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w wVar = (w) profileController.R2();
                wVar.getClass();
                wVar.l2(new p(wVar, continuation, 1), new yi5.b(26));
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((e60.s) ((w) profileController.R2()).f317383p).T(new e60.i(null, null, null, false, 0, 0, null, null, true, u00.FRONT, null, 15615));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w wVar2 = (w) profileController.R2();
                wVar2.getClass();
                wVar2.l2(new n(wVar2, continuation, 0), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
