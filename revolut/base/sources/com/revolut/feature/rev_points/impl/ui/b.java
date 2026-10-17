package com.revolut.feature.rev_points.impl.ui;

import com.revolut.feature.rev_points.impl.ui.RevPointsFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import dzb.e;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mii.n;
import mii.q;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f83773w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f83773w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, this.f83773w, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        q qVar = (q) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (qVar instanceof n) {
            h.w2(this.v.u, new RevPointsFlowContract$Step.OpenChallengeDetailsBottomSheet(((dzb.c) this.f83773w).f121301a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
