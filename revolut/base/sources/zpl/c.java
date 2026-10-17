package zpl;

import akl.l;
import akl.r;
import gim.i;
import gkl.d0;
import gkl.e0;
import gkl.f0;
import gkl.g0;
import gkl.h0;
import gkl.n;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import z8k.p0;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f324318w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f324319x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f324320y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(g gVar, String str, String str2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f324318w = gVar;
        this.f324319x = str;
        this.f324320y = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f324318w, this.f324319x, this.f324320y, continuation, 0);
            default:
                return new c(this.f324318w, this.f324319x, this.f324320y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        String str = this.f324320y;
        String str2 = this.f324319x;
        g gVar = this.f324318w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    gu2.e eVar = gVar.f324330l;
                    p0 p0Var = new p0(gVar, str2, str, null);
                    this.v = 1;
                    obj2 = fkl.c.b(eVar, p0Var, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                h0 h0Var = (h0) obj2;
                if (h0Var instanceof e0) {
                    return (e0) h0Var;
                }
                if (!(h0Var instanceof d0) && !(h0Var instanceof f0) && !(h0Var instanceof g0)) {
                    throw new NoWhenBranchMatchedException();
                }
                zhm.h0 h0Var2 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "SignatureControllerModelExtensionImpl", p.a.p("Failed to obtain PoP challenge for key registration, because received ", h0Var.getClass().getName(), " result"), null, h0Var2);
                return null;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                try {
                    if (i3 == 0) {
                        o.b(obj2);
                        l lVar = gVar.f324332n;
                        n nVar = n.PUBLIC_KEY;
                        this.v = 1;
                        if (((r) lVar).d(str2, nVar, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    gVar.f324333p.b(new jn0.b(str));
                    break;
                } catch (Exception e) {
                    zhm.h0 h0Var3 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "SignatureControllerModelExtensionImpl", "Failed to invalidate claim", e, h0Var3);
                }
                return Unit.f186387a;
        }
    }
}
