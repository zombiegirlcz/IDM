package rnj;

import com.revolut.feature.esim.instructions.domain.EsimInstructionType;
import dfj.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.a f255715w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f255715w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.f255715w, continuation);
        jVar.v = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((chj.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        chj.c cVar = (chj.c) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            boolean z = cVar instanceof chj.b;
            com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.a aVar2 = this.f255715w;
            if (z) {
                EsimInstructionType.INSTANCE.getClass();
                aVar2.K2("INSTALLATION");
            } else {
                if (!(cVar instanceof chj.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                u uVar = aVar2.o;
                this.v = null;
                this.u = 1;
                Object objE = uVar.d.e(this);
                if (objE != aVar) {
                    objE = Unit.f186387a;
                }
                if (objE == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
