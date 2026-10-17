package ma2;

import cli.y;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasStatus;
import com.revolut.feature.apm.core.models.alias.AliasType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final class t extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new t(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3;
        Object next;
        com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.a aVar = this.v;
        y yVar = aVar.f62723r;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            aVar.H2(yVar, new m9l.d(18));
            vw1.b bVar = aVar.o;
            this.u = 1;
            obj2 = ((uy1.j) bVar).g(this);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        List list = (List) obj2;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : list) {
            if (Intrinsics.f(((Alias) obj4).f61880c, AliasStatus.AVAILABLE.f61886b)) {
                arrayList.add(obj4);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            obj3 = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((Alias) next).f61878a, AliasType.PHONE.f61895b)) {
                break;
            }
        }
        Alias alias = (Alias) next;
        if (alias == null) {
            Iterator it9 = arrayList.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                Object next2 = it9.next();
                if (Intrinsics.f(((Alias) next2).f61878a, AliasType.EMAIL.f61894b)) {
                    obj3 = next2;
                    break;
                }
            }
            alias = (Alias) obj3;
            if (alias == null) {
                alias = (Alias) d0.d0(arrayList);
            }
        }
        aVar.H2(yVar, new s(list, alias, 0));
        return Unit.f186387a;
    }
}
