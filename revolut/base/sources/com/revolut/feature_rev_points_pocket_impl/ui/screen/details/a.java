package com.revolut.feature_rev_points_pocket_impl.ui.screen.details;

import com.revolut.feature_rev_points_pocket_impl.ui.screen.details.RevPointsPocketDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import java.util.List;
import kdi.c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ldi.f;
import ud3.f0;
import ud3.m;
import vkm.q;
import w4l.h;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            f fVar = ((c) bVar.f97817s).f182901c;
            h hVar = h.f294642c;
            jhi.b bVarG = mo3.a.g(nim.a.v(nim.a.v(u0.m(fVar.c(hVar), fVar.b(hVar)), new kcd.a(21)), new m(10)), null, new f0(8), 1);
            this.u = 1;
            obj2 = q.x(bVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        oki.h.v2(bVar.u, new RevPointsPocketDetailsScreenContract$ModalStep.ThresholdsBreakdown((List) obj2), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
