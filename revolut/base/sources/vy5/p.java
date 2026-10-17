package vy5;

import com.revolut.feature.statements.api.navigation.AccountStatementProduct;
import com.revolut.feature.statements.api.navigation.AccountsStatementFeatureConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ w v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(w wVar, Continuation continuation) {
        super(1, continuation);
        this.v = wVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new p(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((p) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        w wVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            efm.r rVarG = m70.a.g(((p0) wVar.f293234q).a(io3.l.CURRENT), null, new vv7.l(13), 1);
            this.u = 1;
            obj2 = nim.a.c(rVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "awaitFirst(...)");
        Iterable iterable = (Iterable) obj2;
        ArrayList arrayList = new ArrayList(zhm.w.t(iterable, 10));
        Iterator it8 = iterable.iterator();
        while (it8.hasNext()) {
            arrayList.add(z92.f.l((io3.d) it8.next()));
        }
        return wVar.A2(new AccountsStatementFeatureConfig.AccountsStatementDestination(zhm.d0.i1(arrayList), AccountStatementProduct.PersonalCurrent.f88237a));
    }
}
