package com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement;

import com.revolut.feature.credit.application.plugins.api.models.illion_bankstatements.IllionIntroConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.IllionBankStatementFlowContract$Step;
import elm.f;
import ft3.h1;
import gim.i;
import hw3.b0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kp0.w0;
import oki.h;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
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
            b0 b0Var = bVar.f67794q;
            h1 h1VarF = w0.F(bVar.f67793p.f67790a);
            this.u = 1;
            n34.b bVar2 = b0Var.f156054a;
            bVar2.getClass();
            n34.a aVar2 = new n34.a(bVar2, h1VarF, continuation, 0);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(f.f127540b, aVar2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.u2(bVar, bVar.f67795r, new IllionBankStatementFlowContract$Step.Intro((IllionIntroConfig) obj2), null, 6);
        return Unit.f186387a;
    }
}
