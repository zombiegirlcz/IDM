package com.revolut.feature.freelancer.impl.ui.profile.terms;

import ang.b;
import com.revolut.feature.freelancer.impl.ui.profile.terms.FreelancerTermsScreenContract$OutputData;
import efm.d0;
import et6.m0;
import et6.u3;
import et6.y3;
import gim.i;
import gr6.r;
import hng.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import w07.n;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n nVar, Continuation continuation) {
        super(1, continuation);
        this.v = nVar;
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
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        n nVar = this.v;
        if (i == 0) {
            o.b(obj2);
            r rVar = nVar.o;
            this.u = 1;
            y3 y3Var = (y3) rVar;
            d0 d0VarFirstOrError = m70.a.g(g.b(((b) y3Var.f129387b).f7765a), null, new en6.a(27), 1).firstOrError();
            Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
            m0 m0Var = new m0(3, new u3(y3Var, 1));
            d0VarFirstOrError.getClass();
            pfm.a aVar = new pfm.a(new ufm.i(d0VarFirstOrError, m0Var, 0), new m0(4, new u3(y3Var, 2)), 4);
            Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
            Object objA = nim.a.a(aVar, this);
            if (objA != obj3) {
                objA = Unit.f186387a;
            }
            if (objA == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        nVar.C2(FreelancerTermsScreenContract$OutputData.TermsConfirmed.f74064a);
        return Unit.f186387a;
    }
}
