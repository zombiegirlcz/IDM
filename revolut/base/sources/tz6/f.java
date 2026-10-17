package tz6;

import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.feature.freelancer.impl.ui.perks.details.FreelancerPerksDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerPerksDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(FreelancerPerksDetailsScreen freelancerPerksDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerPerksDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((PlainTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PlainTextDelegate.Model model = (PlainTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.R2();
        String listId = model.f52926a;
        o oVar = (o) iVarE3;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ITEM_ID_DESCRIPTION")) {
            oVar.H2(oVar.f275888r, new tyg.g(2));
        }
        return Unit.f186387a;
    }
}
