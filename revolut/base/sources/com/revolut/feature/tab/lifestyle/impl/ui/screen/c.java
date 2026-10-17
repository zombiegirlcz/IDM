package com.revolut.feature.tab.lifestyle.impl.ui.screen;

import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import efm.d0;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nme.c0;
import nme.g0;
import nxa.v;
import nyb.l;
import oki.h;
import pfm.z;
import rfm.f0;
import rfm.j;
import rfm.m;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        f fVar = this.v;
        if (i == 0) {
            o.b(obj2);
            nyb.o oVar = (nyb.o) fVar.E;
            ufm.b bVarM = d0.m(Boolean.valueOf(((nyb.b) oVar.f).f()));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            f0 f0VarO = new m(new rfm.f(new m(new rfm.f(new m(new rfm.f(new m(new j(bVarM, new ny7.j(new v(27), 19), 0), new ny7.j(new l(oVar, 4), 20), 0), new ny7.j(new nyb.m(0), 21), 2), new ny7.j(new l(oVar, 5), 23), 0), new ny7.j(new nyb.m(1), 24), 2), new ny7.j(new l(oVar, 2), 16), 0), new ny7.j(new v(28), 17), 2), new ny7.j(new l(oVar, 3), 18), 0).e(Boolean.FALSE).o();
            Intrinsics.checkNotNullExpressionValue(f0VarO, "toSingle(...)");
            z zVarI = ue0.e.I(f0VarO, h0.f322473a, new v(29));
            this.u = 1;
            obj2 = nim.a.b(zVarI, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (((Boolean) obj2).booleanValue()) {
            h.v2(fVar.f89945h0, new TabLifestyleScreenContract$ModalStep.RevPointsFullScreenOptInModal(RevPointsOptInSource.TabAutoPrompt.f84007a), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
        } else {
            fVar.N2(new c0(10));
            fVar.n2(new g0(4, fVar, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
