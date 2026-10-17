package om4;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tof.i7;
import tof.na;
import tof.q7;
import tof.q9;
import tof.s9;
import tof.xa;

/* JADX INFO: loaded from: classes22.dex */
public final class y1 extends gim.i implements Function2 {
    public /* synthetic */ boolean u;
    public final /* synthetic */ jid.z v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Set f226757w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(jid.z zVar, Set set, Continuation continuation) {
        super(2, continuation);
        this.v = zVar;
        this.f226757w = set;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        y1 y1Var = new y1(this.v, this.f226757w, continuation);
        y1Var.u = ((Boolean) obj2).booleanValue();
        return y1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        return ((y1) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        whf.b bVar = (whf.b) this.v.f174461b;
        i7.c cVar = i7.Companion;
        s9 s9Var = new s9(this.f226757w);
        xa xaVar = new xa(io3.l.CREDIT);
        i7[] i7VarArr = {new xa(io3.l.CURRENT), new na(new q9(tof.c.CREDIT))};
        cVar.getClass();
        q7 q7VarA = i7.c.a(i7VarArr);
        if (!z) {
            q7VarA = null;
        }
        return rd0.e.b(n14.k.q(whf.b.a(bVar, te0.w.h(i7.c.a(s9Var, i7.c.b(xaVar, q7VarA))), null, null, null, 14), new o0(13)));
    }
}
