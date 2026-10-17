package nx2;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import lhk.a0;
import nii.y0;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_design.impl.card_design.d f220112w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e93.e f220113x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(com.revolut.feature.card_design.impl.card_design.d dVar, e93.e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f220112w = dVar;
        this.f220113x = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f220112w, this.f220113x, continuation, 0);
            default:
                return new n(this.f220112w, this.f220113x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.card_design.impl.card_design.d dVar = this.f220112w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    m mVar = new m(dVar, this.f220113x, null, 0);
                    this.v = 1;
                    obj2 = dVar.p2(this, mVar);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return dVar.C1(u0.b((NaviCommand) obj2));
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                Continuation continuation = null;
                com.revolut.feature.card_design.impl.card_design.d dVar2 = this.f220112w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    m mVar2 = new m(dVar2, this.f220113x, continuation, 1);
                    this.v = 1;
                    obj2 = dVar2.p2(this, mVar2);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                n93.h hVar = (n93.h) obj2;
                return yji.l.a1(dVar2, dVar2.X1(new y0(null, com.revolut.retail.operation_status.modal_status.a.a(hVar.f213561b), false, 5)), null, null, new a0(dVar2, hVar, continuation, 23), 3);
        }
    }
}
