package com.revolut.feature.retail.salary_account.impl.switch_assistant.flow;

import bv4.h;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.SwitchAssistantFlowContract$Step;
import com.revolut.shared.feature.selfserve.entity.config.api.navigation.EntityConfigDestination;
import elm.f;
import fnc.s;
import ghb.g;
import ghb.j;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r10.w;
import skm.e0;
import skm.p0;
import uf0.d;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
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
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            s sVar = bVar.f83052r;
            this.u = 1;
            h hVar = new h((w) sVar.f136657b, null, 21);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(f.f127540b, hVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        j jVar = (j) obj2;
        if (jVar instanceof g) {
            bVar.C1(new aii.e0(new EntityConfigDestination(new EntityConfigDestination.InputData.ScreenContent(((g) jVar).f143898a.d, true)), null, false, 2));
        } else if (Intrinsics.f(jVar, ghb.i.f143900a)) {
            oki.h.t2(bVar, bVar.f83056x, SwitchAssistantFlowContract$Step.Entry.f83042a, false, null, false, 12);
        } else {
            if (!(jVar instanceof ghb.h)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar.v.getClass();
            l.a1(bVar, bVar.X1(bhb.a.a()), null, null, new d(bVar, continuation, 3), 3);
        }
        return Unit.f186387a;
    }
}
