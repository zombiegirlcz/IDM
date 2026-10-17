package grc;

import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f145972w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k kVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f145972w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f145972w, continuation, 0);
            default:
                return new i(this.f145972w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        k kVar = this.f145972w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    d0 d0VarA = kVar.f145977s.a();
                    this.v = 1;
                    obj2 = nim.a.b(d0VarA, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                od0.i iVar = (od0.i) obj2;
                if (iVar.d()) {
                    return kVar.C1(u0.b((NaviCommand) iVar.c()));
                }
                IllegalStateException illegalStateException = new IllegalStateException("Scanner navi command not found");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                i iVar2 = new i(kVar, continuation, 0);
                this.v = 1;
                Object objP2 = kVar.p2(this, iVar2);
                return objP2 == aVar2 ? aVar2 : objP2;
        }
    }
}
