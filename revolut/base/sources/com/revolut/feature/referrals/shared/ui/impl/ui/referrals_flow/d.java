package com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow;

import com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.ReferralsFlowContract$Step;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import rya.f;
import rya.g;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ g u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ yki.b f81946w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, e eVar, yki.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = gVar;
        this.v = eVar;
        this.f81946w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, this.v, this.f81946w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = this.u.f258273a;
        boolean z = fVar instanceof rya.d;
        e eVar = this.v;
        if (z) {
            h.t2(eVar, this.f81946w, new ReferralsFlowContract$Step.InviteDetails(((rya.d) fVar).f258271a), true, null, false, 12);
            return Unit.f186387a;
        }
        if (fVar instanceof rya.e) {
            h.t2(eVar, this.f81946w, new ReferralsFlowContract$Step.InviteDetails(((rya.e) fVar).f258272a), true, null, false, 12);
            return Unit.f186387a;
        }
        if (fVar instanceof rya.c) {
            return eVar.C1(eVar.f81950s.a(((rya.c) fVar).f258270a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
