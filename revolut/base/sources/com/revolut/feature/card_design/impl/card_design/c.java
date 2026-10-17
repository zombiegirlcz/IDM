package com.revolut.feature.card_design.impl.card_design;

import c93.e;
import com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$Step;
import com.revolut.feature.card_design.impl.card_design.carousel.f;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nx2.k;
import nx2.p;
import oki.h;
import sx2.j0;
import yhm.o;
import yki.l;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ CardDesignFlowContract$Step v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f64674w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f64675x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f64676y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CardDesignFlowContract$Step cardDesignFlowContract$Step, d dVar, f fVar, l lVar, Continuation continuation) {
        super(2, continuation);
        this.v = cardDesignFlowContract$Step;
        this.f64674w = dVar;
        this.f64675x = fVar;
        this.f64676y = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f64674w, this.f64675x, this.f64676y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        d dVar;
        e eVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        f fVar = this.f64675x;
        d dVar2 = this.f64674w;
        if (i == 0) {
            o.b(obj2);
            CardDesignFlowContract$Step.Carousel carousel = (CardDesignFlowContract$Step.Carousel) this.v;
            if (carousel.f64650p) {
                e93.e eVar2 = ((j0) fVar).f266299a;
                String str = carousel.i;
                boolean z = carousel.f64651q;
                if (str == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("replaceableCardId is null when updating virtual card design");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else {
                    String str2 = eVar2.v;
                    if (str2 == null) {
                        IllegalStateException illegalStateException2 = new IllegalStateException("cardProfileId is null when updating virtual card design");
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                    } else {
                        dVar2.l2(new p(z, dVar2, str, str2, null), new yi5.b(26));
                    }
                }
                return Unit.f186387a;
            }
            dVar = dVar2;
            this.u = 1;
            obj2 = d.I2(dVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            dVar = dVar2;
        }
        if (((Boolean) obj2).booleanValue()) {
            d dVar3 = dVar;
            wi0.b.Companion.getClass();
            wi0.b bVar = wi0.b.M0;
            e93.e eVar3 = ((j0) fVar).f266299a;
            int i2 = k.f220108a[eVar3.f.ordinal()];
            if (i2 == 1) {
                eVar = e.VIRTUAL;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar = e.DISPOSABLE;
            }
            h.t2(dVar3, this.f64676y, new CardDesignFlowContract$Step.UserLegalAgreement(bVar, eVar3, eVar), true, null, false, 12);
        } else {
            dVar.N2(((j0) fVar).f266299a);
        }
        return Unit.f186387a;
    }
}
