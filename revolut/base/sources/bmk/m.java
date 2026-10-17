package bmk;

import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import jgk.v;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import pfm.z;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.i implements Function2 {
    public q u;
    public q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f16876w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f16877x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, Continuation continuation) {
        super(2, continuation);
        this.f16877x = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.f16877x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        q qVar;
        NaviCommand naviCommand;
        q qVar2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f16876w;
        q qVar3 = this.f16877x;
        if (i == 0) {
            yhm.o.b(obj2);
            mre.c cVar = qVar3.f16886p;
            TermsScope.INSTANCE.getClass();
            z zVarF = ue0.e.F(((rre.d) cVar).c(TermsScope.f90377q, null), DummyCommand.f98635a);
            this.u = qVar3;
            this.f16876w = 1;
            obj2 = nim.a.b(zVarF, this);
            if (obj2 != aVar) {
                qVar = qVar3;
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar2 = this.v;
            yhm.o.b(obj2);
            naviCommand = (NaviCommand) obj2;
            qVar = qVar2;
            Intrinsics.h(naviCommand);
            return qVar.A2(new BridgeDestination(naviCommand));
        }
        qVar = this.u;
        yhm.o.b(obj2);
        naviCommand = (NaviCommand) obj2;
        if (naviCommand instanceof DummyCommand) {
            v vVar = qVar3.f16887q;
            this.u = null;
            this.v = qVar;
            this.f16876w = 2;
            obj2 = ((jjk.c) vVar).a(this);
            if (obj2 != aVar) {
                qVar2 = qVar;
                naviCommand = (NaviCommand) obj2;
                qVar = qVar2;
            }
            return aVar;
        }
        Intrinsics.h(naviCommand);
        return qVar.A2(new BridgeDestination(naviCommand));
    }
}
