package com.revolut.feature.card_payment_method.impl.flows.link_card.flow;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_payment_method.impl.flows.link_card.flow.LinkCardFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import gim.i;
import h93.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function2 {
    public h u;
    public yki.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f0 f65263w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f65264x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b f65265y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.f65265y = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.f65265y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        yki.b bVar;
        h hVar;
        f0 f0Var;
        yki.b bVar2;
        h hVar2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f65264x;
        b bVar3 = this.f65265y;
        if (i == 0) {
            o.b(obj2);
            yki.i iVar = bVar3.f65268r;
            this.u = bVar3;
            this.v = iVar;
            this.f65264x = 1;
            Object objJ2 = b.J2(bVar3, this);
            if (objJ2 != aVar) {
                bVar = iVar;
                obj2 = objJ2;
                hVar = bVar3;
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f0Var = this.f65263w;
            yki.b bVar4 = this.v;
            h hVar3 = this.u;
            o.b(obj2);
            bVar2 = bVar4;
            hVar2 = hVar3;
            h.t2(hVar2, bVar2, new LinkCardFlowContract$Step.CardChooser(f0Var, (AccountId) obj2), false, TransitionAnimation.FADE.f98392a, false, 8);
            return Unit.f186387a;
        }
        bVar = this.v;
        hVar = this.u;
        o.b(obj2);
        f0 f0Var2 = (f0) obj2;
        this.u = hVar;
        this.v = bVar;
        this.f65263w = f0Var2;
        this.f65264x = 2;
        Object objI2 = b.I2(bVar3, this);
        if (objI2 != aVar) {
            f0Var = f0Var2;
            obj2 = objI2;
            bVar2 = bVar;
            hVar2 = hVar;
            h.t2(hVar2, bVar2, new LinkCardFlowContract$Step.CardChooser(f0Var, (AccountId) obj2), false, TransitionAnimation.FADE.f98392a, false, 8);
            return Unit.f186387a;
        }
        return aVar;
    }
}
