package gie;

import com.revolut.feature.user.checklist.api.UserChecklistContentType;
import com.revolut.feature.user.checklist.api.UserChecklistDestination;
import com.revolut.feature.user.checklist.api.UserChecklistSource;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends gim.i implements Function2 {
    public /* synthetic */ boolean u;
    public final /* synthetic */ s v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, Continuation continuation) {
        super(2, continuation);
        this.v = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r rVar = new r(this.v, continuation);
        rVar.u = ((Boolean) obj2).booleanValue();
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        return ((r) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (z) {
            s sVar = this.v;
            ((eie.b) sVar.f144151n).a();
            sVar.f144155s.c(new FeatureCommand(new KompotOverlayFeatureConfig(new UserChecklistDestination(UserChecklistSource.Other.f94600a, UserChecklistContentType.FincrimeChecklist.f94596a, !w4l.j.f294644c.equals(w4l.i.f294643c)), yhi.b.SOLID, (Integer) null, 12)));
        }
        return Unit.f186387a;
    }
}
