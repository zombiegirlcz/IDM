package com.revolut.feature.credit.application.plugins.impl.ui.preapplication;

import com.revolut.feature.credit.application.plugins.impl.ui.preapplication.PreApplicationChecksScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import et3.e;
import gim.i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import p40.v;
import rd0.c;
import rd0.d;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
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
        try {
            if (i == 0) {
                o.b(obj2);
                v vVar = new v(bVar, null, 29);
                this.u = 1;
                obj2 = bVar.p2(this, vVar);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            h.y2(bVar.f68234t, new PreApplicationChecksScreenContract$ModalStep.Workflow(((e) obj2).f129184a), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, null, null, e2, h0Var);
            bVar.I2();
        }
        return Unit.f186387a;
    }
}
