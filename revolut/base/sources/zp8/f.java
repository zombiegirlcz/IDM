package zp8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_tasks.actions.R$string;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mii.k;
import pfm.r;
import te0.w;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b f324190w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dp8.b f324191x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b bVar, dp8.b bVar2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f324190w = bVar;
        this.f324191x = bVar2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f324190w, this.f324191x, continuation, 0);
            default:
                return new f(this.f324190w, this.f324191x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b bVar = this.f324190w;
                dp8.b bVar2 = this.f324191x;
                if (i == 0) {
                    o.b(obj2);
                    hp8.b bVar3 = bVar.f77396p;
                    String juniorId = bVar.o.f77385a;
                    String taskId = bVar2.f116831a;
                    bVar3.getClass();
                    Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                    Intrinsics.checkNotNullParameter(taskId, "taskId");
                    lp8.e eVar = (lp8.e) bVar3.f154514a;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                    Intrinsics.checkNotNullParameter(taskId, "taskId");
                    pfm.a aVarE = eVar.f198957a.deleteTask(taskId).e(eVar.c(juniorId));
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    r rVarG0 = w.g0(aVarE);
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return bVar.X1(new k(j6.a.q("deleteTask_", bVar2.f116831a), new TextLocalisedClause(R$string.junior_challenges_common_result_challenge_deleted, u.c(bVar2.d), null, 12), null, null, null, 28));
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b bVar4 = this.f324190w;
                f fVar = new f(bVar4, this.f324191x, null, 0);
                this.v = 1;
                Object objP2 = bVar4.p2(this, fVar);
                return objP2 == aVar2 ? aVar2 : objP2;
        }
    }
}
