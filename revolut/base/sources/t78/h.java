package t78;

import com.revolut.feature.junior_tasks.api.navigation.JuniorTasksEditDestination;
import com.revolut.feature.junior_tasks.api.navigation.JuniorTasksListDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import t73.y2;
import t73.z2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f268614w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
        this.f268614w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, this.f268614w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        String str = this.f268614w;
        i iVar = this.v;
        if (i == 0) {
            o.b(obj2);
            d0 d0VarFirstOrError = m70.a.g(iVar.f268616m.a(str, false), null, new t5e.j(7), 1).firstOrError();
            z2 z2Var = new z2(new y2(15), 10);
            d0VarFirstOrError.getClass();
            ufm.i iVar2 = new ufm.i(d0VarFirstOrError, z2Var, 1);
            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
            z zVarI = ue0.e.I(iVar2, h0.f322473a, new y2(16));
            this.u = 1;
            obj2 = nim.a.b(zVarI, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return ((Boolean) obj2).booleanValue() ? iVar.A2(new JuniorTasksListDestination(str, com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE), 4)) : iVar.A2(new JuniorTasksEditDestination(str, null, 4));
    }
}
