package i4b;

import ael.t0;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ g0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f158326w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g0 g0Var, j jVar, Continuation continuation) {
        super(1, continuation);
        this.v = g0Var;
        this.f158326w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d0(this.v, this.f158326w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        g0 g0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ufm.i iVarF = ((t0) g0Var.f158339w).f();
            this.u = 1;
            obj2 = nim.a.b(iVarF, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        Links links = (Links) obj2;
        g gVar = g.f158333a;
        j jVar = this.f158326w;
        if (Intrinsics.f(jVar, gVar)) {
            str = links.f105099q;
            if (str == null) {
                throw new IllegalArgumentException("cfd-trading-terms link missing");
            }
        } else if (Intrinsics.f(jVar, h.f158342a)) {
            str = links.f105093h;
        } else {
            if (!Intrinsics.f(jVar, i.f158345a)) {
                throw new NoWhenBranchMatchedException();
            }
            str = links.d;
        }
        return g0Var.C1(new ExternalDestination.Browser(str, null));
    }
}
