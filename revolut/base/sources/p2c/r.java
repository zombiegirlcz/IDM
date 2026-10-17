package p2c;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a f232219w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f232219w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(0, this.f232219w, continuation);
            case 1:
                return new r(1, this.f232219w, continuation);
            default:
                return new r(2, this.f232219w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a aVar2 = this.f232219w;
                mtd.e eVar = new mtd.e(aVar2, null, 29);
                this.v = 1;
                Object objB = pu7.a.B(aVar2.k, "SPARE_CHANGE_REQUEST_TASK", eVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
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
                com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a aVar4 = this.f232219w;
                u uVar = new u(aVar4, null);
                this.v = 1;
                Object objP2 = aVar4.p2(this, uVar);
                return objP2 == aVar3 ? aVar3 : objP2;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a aVar6 = this.f232219w;
                ol8.e eVar2 = new ol8.e(12, (Continuation) null, aVar6);
                this.v = 1;
                Object objB2 = pu7.a.B(aVar6.k, "TERMS_LOADING_TASK", eVar2, this);
                return objB2 == aVar5 ? aVar5 : objB2;
        }
    }
}
