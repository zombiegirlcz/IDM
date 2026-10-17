package c17;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.freelancer.impl.ui.profile.website.FreelancerWebsiteScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerWebsiteScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FreelancerWebsiteScreen freelancerWebsiteScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerWebsiteScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        Intrinsics.h(model);
        s sVar = (s) jVarE3;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52613a, "ITEM_ID_BOTTOM_DIALOG_GOT_IT")) {
            j60.a.v(sVar.f20406p, false, null, 3);
        }
        return Unit.f186387a;
    }
}
