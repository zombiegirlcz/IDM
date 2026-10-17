package t0e;

import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.models.StatementUrlState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import pzd.t;
import pzd.v;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ StatementUrlState f267010w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(StatementUrlState statementUrlState, Continuation continuation) {
        super(2, continuation);
        this.f267010w = statementUrlState;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.f267010w, continuation);
        jVar.v = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object vVar;
        FlowCollector flowCollector = (FlowCollector) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            StatementUrlState statementUrlState = this.f267010w;
            if (statementUrlState instanceof StatementUrlState.InPreparation) {
                vVar = new t(((StatementUrlState.InPreparation) statementUrlState).getEmail());
            } else {
                if (!(statementUrlState instanceof StatementUrlState.Ready)) {
                    throw new NoWhenBranchMatchedException();
                }
                vVar = new v(((StatementUrlState.Ready) statementUrlState).getUrl());
            }
            Data dataP = zi0.c.P(vVar, false, null, 3);
            this.v = null;
            this.u = 1;
            if (flowCollector.emit(dataP, this) == aVar) {
                return aVar;
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
