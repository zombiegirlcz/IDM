package fjd;

import com.revolut.feature.shops.api.model.ShopsCategory;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.shops.impl.ui.home.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.revolut.feature.shops.impl.ui.home.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        com.revolut.feature.shops.impl.ui.home.a aVar = this.v;
        cli.y yVar = aVar.Q;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            aVar.H2(yVar, new fj5.e(9));
            jid.v vVar = aVar.f87197r;
            this.u = 1;
            obj2 = vVar.a(this);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        jid.t tVar = (jid.t) obj2;
        if (tVar instanceof jid.r) {
            n nVar = aVar.G;
            co3.a location = ((jid.r) tVar).f174451a;
            nVar.getClass();
            Intrinsics.checkNotNullParameter(location, "location");
            nVar.f135579c = location;
            ShopsCategory shopsCategory = ((o) ((j2) yVar.f22677a).getValue()).f135583g;
            if (shopsCategory != null && (str = shopsCategory.f87040a) != null) {
                com.revolut.feature.shops.impl.ui.home.a.K2(aVar, str, false, 6);
            }
        }
        aVar.H2(yVar, new d0(tVar, 0));
        return Unit.f186387a;
    }
}
