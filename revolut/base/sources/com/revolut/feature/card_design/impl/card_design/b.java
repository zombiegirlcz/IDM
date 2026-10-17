package com.revolut.feature.card_design.impl.card_design;

import aii.n;
import aii.u;
import ay2.r;
import c93.e;
import com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$Step;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import l10.q;
import l10.s;
import oki.h;
import yhm.o;
import yki.l;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f64671w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f64672x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ CardDesignFlowContract$Step f64673y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, s sVar, l lVar, CardDesignFlowContract$Step cardDesignFlowContract$Step, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f64671w = sVar;
        this.f64672x = lVar;
        this.f64673y = cardDesignFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f64671w, this.f64672x, this.f64673y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        jc8.c cVar;
        n nVarC1;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        s sVar = this.f64671w;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            e eVarA = r.a(((q) sVar).f191392a);
            this.u = 1;
            CardDesignFlowContract$InputData cardDesignFlowContract$InputData = dVar.o;
            String e = cardDesignFlowContract$InputData.getE();
            if (e == null) {
                throw new IllegalArgumentException("Wallet id shouldn't be null for ordering junior card");
            }
            int i2 = nx2.i.f220106c[eVarA.ordinal()];
            if (i2 == 1) {
                cVar = jc8.c.PHYSICAL;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalArgumentException("DISPOSABLE CardDesignCatalogueType not available for ordering junior card");
                }
                cVar = jc8.c.VIRTUAL;
            }
            obj2 = dVar.f64730y.a(cVar, e, cardDesignFlowContract$InputData.getI(), this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        u uVar = (u) obj2;
        if (uVar != null && (nVarC1 = dVar.C1(uVar)) != null) {
            return nVarC1;
        }
        h.t2(dVar, this.f64672x, CardDesignFlowContract$Step.Catalogue.a((CardDesignFlowContract$Step.Catalogue) this.f64673y, r.a(((q) sVar).f191392a)), true, null, false, 12);
        return Unit.f186387a;
    }
}
