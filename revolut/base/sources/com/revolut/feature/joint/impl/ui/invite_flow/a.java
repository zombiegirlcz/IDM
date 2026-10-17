package com.revolut.feature.joint.impl.ui.invite_flow;

import com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$Step;
import do3.q;
import efm.d0;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import t48.m;
import t48.n;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ yki.b f76571w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f76572x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, yki.b bVar, n nVar, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f76571w = bVar;
        this.f76572x = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f76571w, this.f76572x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            d0 d0VarF = this.v.f76579s.f(false);
            this.u = 1;
            obj2 = nim.a.b(d0VarF, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        h.t2(this.v, this.f76571w, new InviteFlowContract$Step.PurposesOfAccount(((m) this.f76572x).f267925a, q.y((do3.n) obj2)), true, null, false, 12);
        return Unit.f186387a;
    }
}
