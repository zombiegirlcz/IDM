package com.revolut.feature.junior_progression.impl.ui.prompt;

import com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage;
import com.revolut.feature.junior_progression.impl.ui.prompt.JuniorProgressionFlowContract$Step;
import elm.f;
import gim.i;
import gk8.b;
import gk8.d;
import kk8.k;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ok8.m;
import oki.h;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m mVar, Continuation continuation) {
        super(1, continuation);
        this.v = mVar;
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
        m mVar = this.v;
        if (i == 0) {
            o.b(obj2);
            k kVar = mVar.o;
            this.u = 1;
            d dVar = kVar.f184515a;
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(f.f127540b, new b(dVar, null, 1), this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        JuniorProgressionPromptStage juniorProgressionPromptStage = (JuniorProgressionPromptStage) obj2;
        if (juniorProgressionPromptStage == null) {
            juniorProgressionPromptStage = JuniorProgressionPromptStage.Initial.INSTANCE;
        }
        mVar.H2(mVar.f225947r, new ok8.d(juniorProgressionPromptStage, 1));
        h.t2(mVar, mVar.f225946q, JuniorProgressionFlowContract$Step.Prompt.f77155a, false, null, false, 12);
        return Unit.f186387a;
    }
}
