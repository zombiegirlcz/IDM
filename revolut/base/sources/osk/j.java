package osk;

import com.revolut.core.ui_kit.delegates.LogosTileDelegate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ k v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Continuation continuation) {
        super(2, continuation);
        this.v = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((LogosTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ruk.h hVar;
        LogosTileDelegate.Model model = (LogosTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.f52754a;
        f fVar = obj3 instanceof f ? (f) obj3 : null;
        if (fVar == null) {
            return Unit.f186387a;
        }
        b bVar = this.v.f229347c;
        int i = g.f229346a[fVar.ordinal()];
        if (i == 1) {
            hVar = ruk.h.ANALYST_TARGETS;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            hVar = ruk.h.ANALYST_RATINGS;
        }
        bVar.Z2(hVar);
        return Unit.f186387a;
    }
}
