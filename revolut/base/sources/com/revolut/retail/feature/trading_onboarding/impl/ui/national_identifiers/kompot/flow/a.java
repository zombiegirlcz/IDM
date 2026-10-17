package com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow;

import bw4.t;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.NationalIdentifiersFlowContract$Step;
import gim.i;
import hyk.l;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kye.e;
import oki.h;
import rd0.c;
import rd0.d;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
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
            e eVar = bVar.o;
            jhi.b bVarG = mo3.a.g(rd0.e.b(pd.b.r(((l) eVar.f190729b).e.f(Unit.f186387a, true), new lu5.o(eVar, 19))), null, new t(23), 1);
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
        List list = (List) obj2;
        if (list.isEmpty()) {
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.b(c.VERBOSE, "NationalIdentifiersFlowModel", "documents list is empty", null, null, 16);
            bVar.C2(new c0l.c(true));
        } else {
            bVar.H2(bVar.f104218s, new bke.t(list, 5));
            h.u2(bVar, bVar.f104217r, new NationalIdentifiersFlowContract$Step.DocumentStep(0), null, 6);
        }
        return Unit.f186387a;
    }
}
