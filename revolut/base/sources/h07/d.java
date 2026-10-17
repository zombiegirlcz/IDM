package h07;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.feature.freelancer.impl.ui.profile.email_flow.check_email.FreelancerCheckEmailScreen;
import gvc.m;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ FreelancerCheckEmailScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FreelancerCheckEmailScreen freelancerCheckEmailScreen, Continuation continuation) {
        super(2, continuation);
        this.u = freelancerCheckEmailScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((PromptContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVar = (j) ((f) this.u.O.getValue());
        jVar.getClass();
        jVar.n2(new m(jVar, null, 2), new whi.b(6));
        return Unit.f186387a;
    }
}
