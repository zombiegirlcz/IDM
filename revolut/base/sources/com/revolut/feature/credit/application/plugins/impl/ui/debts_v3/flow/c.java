package com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow;

import c84.t;
import elm.f;
import ft3.h1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f67516w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f67516w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f67516w, continuation, 0);
            case 1:
                return new c(this.f67516w, continuation, 1);
            case 2:
                return new c(this.f67516w, continuation, 2);
            case 3:
                return new c(this.f67516w, continuation, 3);
            default:
                return new c(this.f67516w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        e eVar = this.f67516w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                yw3.a aVar2 = eVar.f67519q;
                h1 h1VarA9 = eVar.f67518p.a9();
                this.v = 1;
                e34.c cVar = aVar2.f317314a;
                String str = h1VarA9.f137835a;
                cVar.getClass();
                e34.b bVar = new e34.b(cVar, str, null, 1);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(f.f127540b, bVar, this);
                return objJ == aVar ? aVar : objJ;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                yw3.a aVar4 = eVar.f67519q;
                String str2 = eVar.f67518p.f67510a.f66892b;
                this.v = 1;
                e34.c cVar2 = aVar4.f317314a;
                cVar2.getClass();
                e34.b bVar2 = new e34.b(cVar2, str2, null, 0);
                p0 p0Var2 = p0.f264001a;
                Object objJ2 = e0.J(f.f127540b, bVar2, this);
                return objJ2 == aVar3 ? aVar3 : objJ2;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    c cVar3 = new c(eVar, continuation, i2);
                    this.v = 1;
                    obj2 = eVar.p2(this, cVar3);
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                this.v = 2;
                if (t.N2(eVar, (it3.d) obj2, this, 2) == aVar5) {
                    return aVar5;
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    yw3.a aVar7 = eVar.f67519q;
                    String str3 = eVar.f67518p.f67510a.f66892b;
                    this.v = 1;
                    if (aVar7.a(str3, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    o.b(obj2);
                    yw3.a aVar9 = eVar.f67519q;
                    String str4 = eVar.f67518p.f67510a.f66892b;
                    this.v = 1;
                    if (aVar9.a(str4, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
