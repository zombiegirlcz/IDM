package l2c;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a f191753w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f191753w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(0, this.f191753w, continuation);
            default:
                return new p(1, this.f191753w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a aVar2 = this.f191753w;
                iyi.j jVar = new iyi.j(aVar2, null, 29);
                this.v = 1;
                Object objB = pu7.a.B(aVar2.k, "SPARE_CHANGE_FM_REQUEST_TASK", jVar, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a aVar4 = this.f191753w;
                k49.f fVar = new k49.f(aVar4, (Continuation) null, 26);
                this.v = 1;
                Object objB2 = pu7.a.B(aVar4.k, "SPARE_CHANGE_FM_TERMS_LOADING_TASK", fVar, this);
                return objB2 == aVar3 ? aVar3 : objB2;
        }
    }
}
