package jc6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.balance.picker.api.R$string;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import efm.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xi0.b f172725w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, xi0.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = sVar;
        this.f172725w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q(this.v, this.f172725w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        xi0.b bVar;
        Object next;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        s sVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            d0 d0VarFirstOrError = ((sa6.j) sVar.u).a().firstOrError();
            Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
            this.u = 1;
            objB = nim.a.b(d0VarFirstOrError, this);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objB = obj2;
        }
        List list = (List) objB;
        Intrinsics.h(list);
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((io3.d) it8.next()).f163147c);
        }
        Set setI1 = zhm.d0.i1(arrayList);
        l2j.a aVar2 = sVar.z;
        Iterator it9 = list2.iterator();
        while (true) {
            boolean zHasNext = it9.hasNext();
            bVar = this.f172725w;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it9.next();
            if (Intrinsics.f(((io3.d) next).f163147c, bVar.f306286a)) {
                break;
            }
        }
        io3.d dVar = (io3.d) next;
        return yji.l.i2(sVar, aVar2.a(new CurrencyChooserFlowDestination.InputData(new CurrencyChooserFlowDestination.StartType.BalancePicker(dVar != null ? dVar.f163145a : null, bVar, io3.l.CURRENT, setI1, (Set) null, y0.b(k1j.a.POCKETS), new TextLocalisedClause(R$string.currency_picker_section_source_title, null, null, 14), false, (Integer) null, (Set) null, 1832))), null, new j87.m(sVar, 14), 1);
    }
}
