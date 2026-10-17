package kd4;

import c84.t;
import elm.f;
import ft3.h1;
import gim.i;
import it3.d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kp0.w0;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.a f182804w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f182805x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.a aVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f182804w = aVar;
        this.f182805x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f182804w, this.f182805x, continuation, 0);
            default:
                return new c(this.f182804w, this.f182805x, continuation, 1);
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
        com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.a aVar = this.f182804w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    mx3.a aVar3 = aVar.f67885q;
                    h1 h1VarF = w0.F(aVar.f67884p.f67882a);
                    this.v = 1;
                    p34.a aVar4 = aVar3.f210164a;
                    aVar4.getClass();
                    oqk.i iVar = new oqk.i(this.f182805x, aVar4, h1VarF, null, 8);
                    p0 p0Var = p0.f264001a;
                    obj2 = e0.J(f.f127540b, iVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                this.v = 2;
                if (t.N2(aVar, (d) obj2, this, 2) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    c cVar = new c(aVar, this.f182805x, null, 0);
                    this.v = 1;
                    if (aVar.p2(this, cVar) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
