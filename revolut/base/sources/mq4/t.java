package mq4;

import cli.y;
import dce.s0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import om4.n4;
import skm.e0;
import skm.p0;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f207874w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(x xVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f207874w = xVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.f207874w, continuation, 0);
            default:
                return new t(this.f207874w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((t) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objI2;
        io3.d dVar;
        int i = this.u;
        String str = null;
        x xVar = this.f207874w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                n4 n4Var = xVar.f207878q;
                String str2 = xVar.v.f69166a;
                this.v = 1;
                s0 s0Var = new s0(n4Var.f226650a, str2, null, 20);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, s0Var, this);
                return objJ == aVar ? aVar : objJ;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    y yVar = xVar.f207882w;
                    j2 j2Var = (j2) yVar.f22677a;
                    j2 j2Var2 = (j2) yVar.f22677a;
                    dj0.d dVar2 = ((g) j2Var.getValue()).d;
                    dj0.d dVar3 = ((g) j2Var2.getValue()).e;
                    h hVar = (h) ((g) j2Var2.getValue()).f207858b.getContent();
                    if (hVar != null && (dVar = hVar.f207861b) != null) {
                        str = dVar.f163145a;
                    }
                    if (dVar2 == null || str == null || dVar3 == null) {
                        objI2 = Unit.f186387a;
                    } else {
                        int i5 = q.f207871a[xVar.v.f69168c.ordinal()];
                        if (i5 == 1 || i5 == 2) {
                            objI2 = xVar.I2(dVar2, str, dVar3, this);
                            if (objI2 != aVar2) {
                                objI2 = Unit.f186387a;
                            }
                        } else {
                            if (i5 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            objI2 = xVar.J2(dVar2, str, dVar3, this);
                            if (objI2 != aVar2) {
                                objI2 = Unit.f186387a;
                            }
                        }
                    }
                    if (objI2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
