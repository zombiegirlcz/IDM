package com.revolut.feature.apm.wero.impl.ui.p2m;

import c12.s;
import c12.t;
import c12.u;
import c12.v;
import com.revolut.feature.apm.wero.api.navigation.WeroNavigation$StartType;
import com.revolut.feature.apm.wero.impl.ui.p2m.WeroP2MFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f63075w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, v vVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f63075w = vVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f63075w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            b bVar = this.v;
            yki.a aVar2 = bVar.f63078r;
            s sVar = s.f20349a;
            v vVar = this.f63075w;
            if (Intrinsics.f(vVar, sVar) || Intrinsics.f(vVar, t.f20351a)) {
                h.D2(aVar2);
            } else {
                if (!(vVar instanceof u)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.t2(bVar, aVar2, new WeroP2MFlowContract$Step.Pay(new WeroNavigation$StartType.Pay.URL(bVar.o.f63070a)), false, TransitionAnimation.FADE.f98392a, false, 8);
            }
            if (Unit.f186387a == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
