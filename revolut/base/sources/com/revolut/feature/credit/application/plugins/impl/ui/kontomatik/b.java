package com.revolut.feature.credit.application.plugins.impl.ui.kontomatik;

import c84.t;
import elm.f;
import ft3.h1;
import gim.i;
import it3.d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import p24.n;
import p24.p;
import skm.e0;
import skm.p0;
import yc4.q;
import yc4.s;
import yc4.u;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f67809w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u f67810x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, u uVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f67809w = cVar;
        this.f67810x = uVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f67809w, this.f67810x, continuation, 0);
            default:
                return new b(this.f67809w, this.f67810x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((b) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        d dVar;
        d dVar2;
        int i = this.u;
        u uVar = this.f67810x;
        c cVar = this.f67809w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    hw3.c cVar2 = cVar.f67813r;
                    KontomatikIncomeCheckFlowContract$InputData kontomatikIncomeCheckFlowContract$InputData = cVar.f67811p;
                    Continuation continuation = null;
                    if (kontomatikIncomeCheckFlowContract$InputData.f67799a) {
                        h1 h1VarA9 = kontomatikIncomeCheckFlowContract$InputData.a9();
                        iv3.b bVar = ((s) uVar).f312529a;
                        this.v = 1;
                        p pVar = cVar2.f156055a;
                        pVar.getClass();
                        p24.o oVar = new p24.o(pVar, h1VarA9, bVar, continuation, 1);
                        p0 p0Var = p0.f264001a;
                        obj2 = e0.J(f.f127540b, oVar, this);
                        if (obj2 == aVar) {
                            return aVar;
                        }
                        dVar = (d) obj2;
                    } else {
                        h1 h1VarA92 = kontomatikIncomeCheckFlowContract$InputData.a9();
                        iv3.b bVar2 = ((s) uVar).f312529a;
                        this.v = 2;
                        p pVar2 = cVar2.f156055a;
                        pVar2.getClass();
                        p24.o oVar2 = new p24.o(pVar2, h1VarA92, bVar2, continuation, 0);
                        p0 p0Var2 = p0.f264001a;
                        obj2 = e0.J(f.f127540b, oVar2, this);
                        if (obj2 == aVar) {
                            return aVar;
                        }
                        dVar = (d) obj2;
                    }
                } else if (i2 == 1) {
                    o.b(obj2);
                    dVar = (d) obj2;
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                    dVar = (d) obj2;
                }
                this.v = 3;
                if (t.N2(cVar, dVar, this, 2) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    hw3.c cVar3 = cVar.f67813r;
                    KontomatikIncomeCheckFlowContract$InputData kontomatikIncomeCheckFlowContract$InputData2 = cVar.f67811p;
                    Continuation continuation2 = null;
                    if (kontomatikIncomeCheckFlowContract$InputData2.f67799a) {
                        h1 h1VarA93 = kontomatikIncomeCheckFlowContract$InputData2.a9();
                        iv3.f fVar = ((q) uVar).f312527a;
                        this.v = 1;
                        p pVar3 = cVar3.f156055a;
                        pVar3.getClass();
                        n nVar = new n(pVar3, h1VarA93, fVar, continuation2, 1);
                        p0 p0Var3 = p0.f264001a;
                        obj2 = e0.J(f.f127540b, nVar, this);
                        if (obj2 == aVar2) {
                            return aVar2;
                        }
                        dVar2 = (d) obj2;
                    } else {
                        h1 h1VarA94 = kontomatikIncomeCheckFlowContract$InputData2.a9();
                        iv3.f fVar2 = ((q) uVar).f312527a;
                        this.v = 2;
                        p pVar4 = cVar3.f156055a;
                        pVar4.getClass();
                        n nVar2 = new n(pVar4, h1VarA94, fVar2, continuation2, 0);
                        p0 p0Var4 = p0.f264001a;
                        obj2 = e0.J(f.f127540b, nVar2, this);
                        if (obj2 == aVar2) {
                            return aVar2;
                        }
                        dVar2 = (d) obj2;
                    }
                } else if (i3 == 1) {
                    o.b(obj2);
                    dVar2 = (d) obj2;
                } else {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                    dVar2 = (d) obj2;
                }
                this.v = 3;
                if (t.N2(cVar, dVar2, this, 2) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }
}
