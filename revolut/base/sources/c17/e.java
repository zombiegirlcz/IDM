package c17;

import com.revolut.feature.freelancer.impl.ui.profile.website.FreelancerWebsiteScreen;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ FreelancerWebsiteScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(FreelancerWebsiteScreen freelancerWebsiteScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = freelancerWebsiteScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            case 2:
                return new e(this.v, continuation, 2);
            default:
                return new e(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((e) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FreelancerWebsiteScreen freelancerWebsiteScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVar = (s) freelancerWebsiteScreen.e3();
                sVar.getClass();
                sVar.n2(new r(sVar, null, 0), new whi.b(6));
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((s) freelancerWebsiteScreen.e3()).B2();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j60.a.v(((s) freelancerWebsiteScreen.e3()).f20406p, false, null, 3);
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVar2 = (s) freelancerWebsiteScreen.e3();
                j60.a.v(sVar2.f20406p, false, null, 3);
                sVar2.n2(new r(sVar2, null, 1), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
