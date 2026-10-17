package im2;

import b9.w2;
import bn2.p;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.models.RetailBackgroundKey;
import gim.i;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import yhm.r;
import zhm.f0;
import zhm.z0;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ w2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(w2 w2Var, Continuation continuation) {
        super(2, continuation);
        this.v = w2Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        r rVar = (r) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ike.b bVar = (ike.b) rVar.f314201a;
        boolean zBooleanValue = ((Boolean) rVar.f314202b).booleanValue();
        u19.b bVar2 = (u19.b) rVar.f314203c;
        RetailBackgroundKey.InvestHome investHome = RetailBackgroundKey.InvestHome.f63830b;
        if (!bVar.f161941a) {
            investHome = null;
        }
        RetailBackgroundKey.CryptoHome cryptoHome = RetailBackgroundKey.CryptoHome.f63825b;
        if (!zBooleanValue) {
            cryptoHome = null;
        }
        Set setI = z0.i(investHome, cryptoHome, zBooleanValue ? RetailBackgroundKey.DeFiHome.f63827a : null, bVar2 == u19.b.POINTS ? RetailBackgroundKey.RevPointsHome.f63848b : null);
        if (setI.isEmpty()) {
            return new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
        }
        w2 w2Var = this.v;
        return nim.a.v(((p) w2Var.f13500c).h(setI), new ijg.c(w2Var, bVar, 8));
    }
}
