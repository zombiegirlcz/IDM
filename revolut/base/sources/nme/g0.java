package nme;

import com.revolut.data.model.Data;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;

/* JADX INFO: loaded from: classes8.dex */
public final class g0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.feature.tab.lifestyle.impl.ui.screen.f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i, com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g0(0, this.v, continuation);
            case 1:
                return new g0(1, this.v, continuation);
            case 2:
                return new g0(2, this.v, continuation);
            case 3:
                return new g0(3, this.v, continuation);
            case 4:
                return new g0(4, this.v, continuation);
            default:
                return new g0(5, this.v, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((g0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((g0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((g0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                return ((g0) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        int i2 = 1;
        com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar2 = this.v;
                if (((nyb.b) fVar2.A).f()) {
                    yji.l.a1(fVar2, rd0.e.b(fVar2.B.o()), null, null, new f0(8, fVar2, continuation), 3);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((gld.f0) fVar.v).c3(new mkd.a(new SlotContext(akd.s.LIFESTYLE_HOME)));
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return yji.l.b1(fVar, vkm.q.P(new lfg.d0(fVar.g0.B(new c0(11)), 19), 1), null, new g0(i2, fVar, continuation), 3);
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return yji.l.b1(fVar, rd0.e.e(mo3.a.g(((gld.f0) fVar.v).f144638l.h(), null, new nmb.v(i2), 1), zhm.h0.f322473a, new n28.b(3, 12, null)), null, new njj.n0(7, continuation, fVar), 3);
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jyb.c cVar = fVar.X;
                Flow tabDataReadyFlow = fVar.g0.B(new c0(12));
                cVar.getClass();
                Intrinsics.checkNotNullParameter(tabDataReadyFlow, "tabDataReadyFlow");
                return yji.l.b1(fVar, rd0.e.d(new v1(new ix6.l0((Object) cVar, (Object) tabDataReadyFlow, false, (Continuation) null, 26)), zhm.h0.f322473a), null, new com.revolut.feature.tab.lifestyle.impl.ui.screen.e(fVar, null), 3);
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.n2(new h0(i2, fVar, continuation), new whi.b(6));
                return Unit.f186387a;
        }
    }
}
