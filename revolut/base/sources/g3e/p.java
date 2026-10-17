package g3e;

import com.revolut.feature.store.impl.ui.exclusives.StoreExclusivesScreen;
import ip0.y;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.a1;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StoreExclusivesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(StoreExclusivesScreen storeExclusivesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = storeExclusivesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        Set set;
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = yVar.f167226b.f58324n;
        t tVar = obj3 instanceof t ? (t) obj3 : null;
        if (tVar == null) {
            return Unit.f186387a;
        }
        b bVarR2 = this.v.R2();
        String filterId = tVar.f140290a;
        r rVar = (r) bVarR2;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(filterId, "filterId");
        g2e.e eVar = rVar.f140285q;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(filterId, "filterId");
        j2 j2Var = eVar.f139981a;
        do {
            value = j2Var.getValue();
            set = (Set) value;
        } while (!j2Var.h(value, set.contains(filterId) ? a1.j(set, filterId) : a1.m(set, filterId)));
        return Unit.f186387a;
    }
}
