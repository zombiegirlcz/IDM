package aem;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.slf4j.Logger;
import skm.c2;

/* JADX INFO: loaded from: classes23.dex */
public final class c0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f3701w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f3702x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f3703y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.z = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                c0 c0Var = new c0((List) this.z, (Continuation) obj4, 0);
                c0Var.f3702x = (bem.i) obj2;
                c0Var.f3703y = (fem.d) obj3;
                return c0Var.invokeSuspend(Unit.f186387a);
            case 1:
                c0 c0Var2 = new c0((bem.b) this.z, (Continuation) obj4, 1);
                c0Var2.f3701w = (fem.d) obj2;
                c0Var2.f3703y = (Function1) obj3;
                return c0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                c0 c0Var3 = new c0((y0) this.f3703y, (vdm.b) this.z, (Continuation) obj4, 2);
                c0Var3.f3701w = (sem.f) obj2;
                c0Var3.f3702x = obj3;
                return c0Var3.invokeSuspend(Unit.f186387a);
            default:
                c0 c0Var4 = new c0((Function3) this.f3703y, (vdm.b) this.z, (Continuation) obj4, 3);
                c0Var4.f3701w = (h1) obj2;
                c0Var4.f3702x = (fem.d) obj3;
                return c0Var4.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        c2 c2Var;
        int i = this.u;
        int i2 = 2;
        Object obj3 = this.z;
        int i3 = 1;
        switch (i) {
            case 0:
                bem.i iVar = (bem.i) this.f3702x;
                fem.d dVar = (fem.d) this.f3703y;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    this.f3702x = null;
                    this.f3703y = null;
                    this.v = 1;
                    obj2 = iVar.f14889a.a(dVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wdm.f fVar = (wdm.f) this.f3701w;
                        yhm.o.b(obj2);
                        return fVar;
                    }
                    yhm.o.b(obj2);
                }
                wdm.f fVar2 = (wdm.f) obj2;
                hem.c cVarD = fVar2.d();
                this.f3702x = null;
                this.f3703y = null;
                this.f3701w = fVar2;
                this.v = 2;
                return h0.b((List) obj3, cVarD, this) == aVar ? aVar : fVar2;
            case 1:
                fem.d dVar2 = (fem.d) this.f3701w;
                Function1 function1 = (Function1) this.f3703y;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2Var = (c2) this.f3702x;
                    try {
                        yhm.o.b(obj2);
                        c2Var.h0();
                        return Unit.f186387a;
                    } catch (Throwable th10) {
                        th = th10;
                        try {
                            c2Var.getClass();
                            c2Var.U(new skm.u(th, false));
                            throw th;
                        } catch (Throwable th11) {
                            c2Var.h0();
                            throw th11;
                        }
                    }
                }
                yhm.o.b(obj2);
                c2 c2Var2 = new c2(dVar2.e);
                CoroutineContext.Element element = ((bem.b) obj3).f14873a.f288080c.get(skm.g1.f263979a);
                Intrinsics.h(element);
                Logger logger = u0.f3783a;
                c2Var2.k(new q(((Job) element).k(new q(c2Var2, i3)), i2));
                try {
                    Intrinsics.checkNotNullParameter(c2Var2, "<set-?>");
                    dVar2.e = c2Var2;
                    this.f3701w = null;
                    this.f3703y = null;
                    this.f3702x = c2Var2;
                    this.v = 1;
                    if (function1.invoke(this) == aVar2) {
                        return aVar2;
                    }
                    c2Var = c2Var2;
                    c2Var.h0();
                    return Unit.f186387a;
                } catch (Throwable th12) {
                    th = th12;
                    c2Var = c2Var2;
                    c2Var.getClass();
                    c2Var.U(new skm.u(th, false));
                    throw th;
                }
            case 2:
                y0 y0Var = (y0) this.f3703y;
                sem.f fVar3 = (sem.f) this.f3701w;
                Object obj4 = this.f3702x;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    if (!(obj4 instanceof nem.c)) {
                        throw new IllegalStateException(kotlin.text.t.f("\n|Fail to prepare request body for sending. \n|The body type is: " + kotlin.jvm.internal.o0.f186429a.b(obj4.getClass()) + ", with Content-Type: " + a1m.e.l((kem.w) fVar3.f262233a) + ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header.").toString());
                    }
                    fem.d dVar3 = (fem.d) fVar3.f262233a;
                    dVar3.getClass();
                    Intrinsics.checkNotNullParameter(obj4, "<set-?>");
                    dVar3.d = obj4;
                    dVar3.a(null);
                    y0Var.getClass();
                    h1 w0Var = new w0((vdm.b) obj3);
                    Iterator it8 = zhm.d0.I0(y0Var.f3800a).iterator();
                    while (it8.hasNext()) {
                        w0Var = new x0((Function3) it8.next(), w0Var);
                    }
                    fem.d dVar4 = (fem.d) fVar3.f262233a;
                    this.f3701w = fVar3;
                    this.f3702x = null;
                    this.v = 1;
                    obj2 = w0Var.a(dVar4, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i21 != 1) {
                        if (i21 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.f3701w = null;
                this.f3702x = null;
                this.v = 2;
                if (fVar3.d((wdm.f) obj2, this) == aVar3) {
                    return aVar3;
                }
                return Unit.f186387a;
            default:
                h1 h1Var = (h1) this.f3701w;
                fem.d dVar5 = (fem.d) this.f3702x;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                Function3 function3 = (Function3) this.f3703y;
                bem.i iVar2 = new bem.i(h1Var, ((vdm.b) obj3).f288080c);
                this.f3701w = null;
                this.f3702x = null;
                this.v = 1;
                Object objInvoke = function3.invoke(iVar2, dVar5, this);
                return objInvoke == aVar4 ? aVar4 : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj2, vdm.b bVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f3703y = obj2;
        this.z = bVar;
    }
}
