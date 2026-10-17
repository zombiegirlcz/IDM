package lld;

import kkd.d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import wli.x;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.slot_manager.impl.ui.screen.checklist.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f196717w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.slot_manager.impl.ui.screen.checklist.a aVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f196717w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, this.f196717w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.slot_manager.impl.ui.screen.checklist.a aVar2 = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            x xVar = aVar2.f87365p;
            Boolean bool = Boolean.FALSE;
            this.u = 1;
            if (lg0.b.x1(xVar, this.f196717w, null, bool, this, 2) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        aVar2.C2(d.a.f184576a);
        return Unit.f186387a;
    }
}
