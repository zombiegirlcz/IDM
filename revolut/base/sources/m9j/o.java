package m9j;

import cli.y;
import efm.d0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import m9d.l0;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.a f203820w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f203820w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.f203820w, continuation, 0);
            case 1:
                return new o(this.f203820w, continuation, 1);
            default:
                return new o(this.f203820w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        l0 l0Var;
        l0 l0Var2;
        do3.n nVar;
        int i = this.u;
        com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.a aVar = this.f203820w;
        switch (i) {
            case 0:
                dd5.a aVar2 = aVar.f100015w;
                y yVar = aVar.C;
                Object objX1 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                try {
                    try {
                    } catch (Exception unused) {
                        objX1 = aVar.X1(aVar2.a(false));
                        l0Var = new l0(22);
                    }
                    if (i2 == 0) {
                        yhm.o.b(obj2);
                        zud.a aVar3 = aVar.u;
                        xi0.b bVar = ((h) ((j2) yVar.f22677a).getValue()).f203801a;
                        this.v = 1;
                        if (aVar3.b(bVar, false, this) == objX1) {
                        }
                        return objX1;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objX1 = aVar.X1(aVar2.b(false));
                        l0Var = new l0(22);
                        aVar.H2(yVar, l0Var);
                        return objX1;
                    }
                    yhm.o.b(obj2);
                    yud.g gVar = aVar.f100014t;
                    this.v = 2;
                    if (gVar.f(this) == objX1) {
                        return objX1;
                    }
                    objX1 = aVar.X1(aVar2.b(false));
                    l0Var = new l0(22);
                    aVar.H2(yVar, l0Var);
                    return objX1;
                } catch (Throwable th10) {
                    aVar.H2(yVar, new l0(22));
                    throw th10;
                }
            case 1:
                dd5.a aVar4 = aVar.f100015w;
                y yVar2 = aVar.C;
                Object objX12 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                try {
                    try {
                    } catch (Throwable th11) {
                        aVar.H2(yVar2, new l0(24));
                        throw th11;
                    }
                } catch (Exception unused2) {
                    objX12 = aVar.X1(aVar4.a(true));
                    l0Var2 = new l0(24);
                }
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    aVar.H2(yVar2, new l0(23));
                    zud.a aVar5 = aVar.u;
                    xi0.b bVar2 = ((h) ((j2) yVar2.f22677a).getValue()).f203801a;
                    this.v = 1;
                    if (aVar5.b(bVar2, true, this) == objX12) {
                    }
                    return objX12;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objX12 = aVar.X1(aVar4.b(true));
                    l0Var2 = new l0(24);
                    aVar.H2(yVar2, l0Var2);
                    return objX12;
                }
                yhm.o.b(obj2);
                yud.g gVar2 = aVar.f100014t;
                this.v = 2;
                if (gVar2.f(this) == objX12) {
                    return objX12;
                }
                objX12 = aVar.X1(aVar4.b(true));
                l0Var2 = new l0(24);
                aVar.H2(yVar2, l0Var2);
                return objX12;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                try {
                    if (i5 == 0) {
                        yhm.o.b(obj2);
                        d0 d0VarF = aVar.f100017y.f(false);
                        this.v = 1;
                        obj2 = nim.a.b(d0VarF, this);
                        if (obj2 == aVar6) {
                            return aVar6;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    nVar = (do3.n) obj2;
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var);
                    nVar = null;
                }
                aVar.H2(aVar.C, new a2f.j(nVar, 14));
                return Unit.f186387a;
        }
    }
}
