package com.revolut.feature.tab.lifestyle.impl.ui.screen;

import com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nme.c0;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((cub.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        cub.c cVar = (cub.c) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (cVar instanceof cub.b) {
            c0 c0Var = new c0(13);
            f fVar = this.v;
            fVar.N2(c0Var);
            h.v2(fVar.f89945h0, new TabLifestyleScreenContract$ModalStep.PersonalisationTargetingOnboarding(((cub.b) cVar).f108938a), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
        } else if (!(cVar instanceof cub.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }
}
