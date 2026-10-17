package com.revolut.feature.credit.application.plugins.impl.ui.kontomatik;

import c84.t;
import elm.f;
import ft3.h1;
import gim.i;
import hw3.d0;
import it3.d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ow3.e;
import p24.g;
import p24.p;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f67808w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f67808w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f67808w, continuation, 0);
            case 1:
                return new a(this.f67808w, continuation, 1);
            case 2:
                return new a(this.f67808w, continuation, 2);
            case 3:
                return new a(this.f67808w, continuation, 3);
            default:
                return new a(this.f67808w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((a) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        d dVar;
        d dVar2;
        d dVar3;
        int i = this.u;
        Continuation continuation = null;
        int i2 = 2;
        c cVar = this.f67808w;
        int i3 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    e eVar = cVar.f67814s;
                    h1 h1VarA9 = cVar.f67811p.a9();
                    this.v = 1;
                    if (eVar.a(h1VarA9, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                cVar.K2(null);
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    d0 d0Var = cVar.f67812q;
                    KontomatikIncomeCheckFlowContract$InputData kontomatikIncomeCheckFlowContract$InputData = cVar.f67811p;
                    if (kontomatikIncomeCheckFlowContract$InputData.f67799a) {
                        h1 h1VarA92 = kontomatikIncomeCheckFlowContract$InputData.a9();
                        this.v = 1;
                        q34.d dVar4 = (q34.d) d0Var.f156059a;
                        dVar4.getClass();
                        q34.c cVar2 = new q34.c(dVar4, h1VarA92, continuation, i2);
                        p0 p0Var = p0.f264001a;
                        obj2 = e0.J(f.f127540b, cVar2, this);
                        if (obj2 == aVar2) {
                            return aVar2;
                        }
                        dVar = (d) obj2;
                    } else {
                        h1 h1VarA93 = kontomatikIncomeCheckFlowContract$InputData.a9();
                        this.v = 2;
                        q34.d dVar5 = (q34.d) d0Var.f156059a;
                        dVar5.getClass();
                        q34.c cVar3 = new q34.c(dVar5, h1VarA93, continuation, i3);
                        p0 p0Var2 = p0.f264001a;
                        obj2 = e0.J(f.f127540b, cVar3, this);
                        if (obj2 == aVar2) {
                            return aVar2;
                        }
                        dVar = (d) obj2;
                    }
                } else if (i6 == 1) {
                    o.b(obj2);
                    dVar = (d) obj2;
                } else {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                    dVar = (d) obj2;
                }
                this.v = 3;
                if (t.N2(cVar, dVar, this, 2) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    hw3.c cVar4 = cVar.f67813r;
                    KontomatikIncomeCheckFlowContract$InputData kontomatikIncomeCheckFlowContract$InputData2 = cVar.f67811p;
                    if (kontomatikIncomeCheckFlowContract$InputData2.f67799a) {
                        h1 h1VarA94 = kontomatikIncomeCheckFlowContract$InputData2.a9();
                        this.v = 1;
                        p pVar = cVar4.f156055a;
                        pVar.getClass();
                        g gVar = new g(pVar, h1VarA94, continuation, 5);
                        p0 p0Var3 = p0.f264001a;
                        obj2 = e0.J(f.f127540b, gVar, this);
                        if (obj2 == aVar3) {
                            return aVar3;
                        }
                        dVar2 = (d) obj2;
                    } else {
                        h1 h1VarA95 = kontomatikIncomeCheckFlowContract$InputData2.a9();
                        this.v = 2;
                        p pVar2 = cVar4.f156055a;
                        pVar2.getClass();
                        g gVar2 = new g(pVar2, h1VarA95, continuation, 4);
                        p0 p0Var4 = p0.f264001a;
                        obj2 = e0.J(f.f127540b, gVar2, this);
                        if (obj2 == aVar3) {
                            return aVar3;
                        }
                        dVar2 = (d) obj2;
                    }
                } else if (i21 == 1) {
                    o.b(obj2);
                    dVar2 = (d) obj2;
                } else {
                    if (i21 != 2) {
                        if (i21 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                    dVar2 = (d) obj2;
                }
                this.v = 3;
                if (t.N2(cVar, dVar2, this, 2) == aVar3) {
                    return aVar3;
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    o.b(obj2);
                    hw3.c cVar5 = cVar.f67813r;
                    KontomatikIncomeCheckFlowContract$InputData kontomatikIncomeCheckFlowContract$InputData3 = cVar.f67811p;
                    if (kontomatikIncomeCheckFlowContract$InputData3.f67799a) {
                        h1 h1VarA96 = kontomatikIncomeCheckFlowContract$InputData3.a9();
                        this.v = 1;
                        p pVar3 = cVar5.f156055a;
                        pVar3.getClass();
                        g gVar3 = new g(pVar3, h1VarA96, continuation, 7);
                        p0 p0Var5 = p0.f264001a;
                        obj2 = e0.J(f.f127540b, gVar3, this);
                        if (obj2 == aVar4) {
                            return aVar4;
                        }
                        dVar3 = (d) obj2;
                    } else {
                        h1 h1VarA97 = kontomatikIncomeCheckFlowContract$InputData3.a9();
                        this.v = 2;
                        p pVar4 = cVar5.f156055a;
                        pVar4.getClass();
                        g gVar4 = new g(pVar4, h1VarA97, continuation, 6);
                        p0 p0Var6 = p0.f264001a;
                        obj2 = e0.J(f.f127540b, gVar4, this);
                        if (obj2 == aVar4) {
                            return aVar4;
                        }
                        dVar3 = (d) obj2;
                    }
                } else if (i22 == 1) {
                    o.b(obj2);
                    dVar3 = (d) obj2;
                } else {
                    if (i22 != 2) {
                        if (i22 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                    dVar3 = (d) obj2;
                }
                this.v = 3;
                if (t.N2(cVar, dVar3, this, 2) == aVar4) {
                    return aVar4;
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    o.b(obj2);
                    d0 d0Var2 = cVar.f67812q;
                    h1 h1VarA98 = cVar.f67811p.a9();
                    this.v = 1;
                    q34.d dVar6 = (q34.d) d0Var2.f156059a;
                    dVar6.getClass();
                    q34.c cVar6 = new q34.c(dVar6, h1VarA98, continuation, i3);
                    p0 p0Var7 = p0.f264001a;
                    obj2 = e0.J(f.f127540b, cVar6, this);
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i32 != 1) {
                        if (i32 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                this.v = 2;
                if (t.N2(cVar, (d) obj2, this, 2) == aVar5) {
                    return aVar5;
                }
                return Unit.f186387a;
        }
    }
}
