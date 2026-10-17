package com.revolut.feature.card_label.ui.screen.card_label_screen;

import com.revolut.feature.card_label.ui.screen.card_label_screen.a;
import gim.i;
import ha3.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import skm.p0;
import te0.w;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            gwh.b bVar = dVar.f64770q;
            String id10 = dVar.f64769p.f64760a.getF64764a();
            String label = ((vy2.c) dVar.t2()).f293121b;
            this.u = 1;
            x xVar = (x) bVar.f147328a;
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            h hVar = new h(w.o0(p0.f264003c, new gsh.w(xVar, id10, label, null, 19)), 4);
            Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
            Object objA = nim.a.a(hVar, this);
            if (objA != obj3) {
                objA = Unit.f186387a;
            }
            if (objA == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        dVar.v2(a.C0462a.f64768a);
        return Unit.f186387a;
    }
}
