package com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection;

import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.SolicitorSelectionFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import do3.q;
import efm.d0;
import ez3.n;
import ft3.h1;
import gim.i;
import iz1.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends i implements Function2 {
    public n u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f68400w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Continuation continuation) {
        super(2, continuation);
        this.f68400w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.f68400w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        n nVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        h hVar = this.f68400w;
        if (i == 0) {
            o.b(obj2);
            fy3.a aVar2 = hVar.f68402q;
            h1 h1VarA9 = hVar.f68401p.a9();
            this.v = 1;
            j44.a aVar3 = aVar2.f138888a;
            aVar3.getClass();
            p pVar = new p(aVar3, h1VarA9, null, 8);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(elm.f.f127540b, pVar, this);
            if (obj2 != aVar) {
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = this.u;
            o.b(obj2);
            Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
            oki.h.t2(hVar, hVar.f68404s, new SolicitorSelectionFlowContract$Step.SelectSolicitor(nVar, q.x((do3.n) obj2)), false, TransitionAnimation.NONE.f98393a, false, 8);
            return Unit.f186387a;
        }
        o.b(obj2);
        n nVar2 = (n) obj2;
        d0 d0VarF = hVar.f68403r.f(false);
        this.u = nVar2;
        this.v = 2;
        Object objB = nim.a.b(d0VarF, this);
        if (objB != aVar) {
            nVar = nVar2;
            obj2 = objB;
            Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
            oki.h.t2(hVar, hVar.f68404s, new SolicitorSelectionFlowContract$Step.SelectSolicitor(nVar, q.x((do3.n) obj2)), false, TransitionAnimation.NONE.f98393a, false, 8);
            return Unit.f186387a;
        }
        return aVar;
    }
}
