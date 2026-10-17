package hsd;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.joint.api.JointAccountsApi$Toggles$JointAccountsBereavement;
import gim.i;
import go.g;
import io3.l;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.f0;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Set setB;
        od0.i iVar = (od0.i) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        n38.a aVar2 = (n38.a) iVar.f224257a;
        if (aVar2 == null) {
            amd.e eVar = amd.e.JOINT;
            f0 f0Var = f0.f322471a;
            dj0.d.Companion.getClass();
            return new g(new Data(new amd.d(eVar, f0Var, f0Var, dj0.d.d), null, false, 6, null), 2);
        }
        AccountId.Joint jointC = l38.a.c(aVar2);
        f fVar = this.v;
        if (((jte.d) fVar.e).c(JointAccountsApi$Toggles$JointAccountsBereavement.f76457c)) {
            l[] elements = {l.CURRENT, l.INHERITANCE};
            Intrinsics.checkNotNullParameter(elements, "elements");
            setB = kotlin.collections.d.y0(elements);
        } else {
            setB = y0.b(l.CURRENT);
        }
        return rd0.e.b(nim.a.w(pd.b.r(kli.a.h(rd0.e.c(nim.a.v(fVar.d.K(jointC, setB), new hqk.a(fVar)), kotlin.coroutines.g.f186406a), osg.b.d(fVar.f155036b)), new hs4.l(fVar, 2)), new d(fVar, aVar2)));
    }
}
