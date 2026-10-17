package ds4;

import com.revolut.data.model.Data;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ql4.n0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.instalment.hub.a f117222w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(com.revolut.feature.credit.card.impl.ui.instalment.hub.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f117222w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                x xVar = new x(this.f117222w, continuation, 0);
                xVar.v = obj2;
                return xVar;
            default:
                x xVar2 = new x(this.f117222w, continuation, 1);
                xVar2.v = obj2;
                return xVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((x) create((vf0.y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((x) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        dj0.d dVar;
        dj0.d dVarO;
        List list;
        n0 n0Var;
        List list2;
        n0 n0Var2;
        switch (this.u) {
            case 0:
                vf0.y yVar = (vf0.y) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                od0.i iVar = (od0.i) yVar.f288491a;
                ll4.u uVar = (ll4.u) yVar.f288492b;
                List list3 = (List) yVar.f288493c;
                boolean zBooleanValue = ((Boolean) yVar.d).booleanValue();
                wi0.b bVar = (wi0.b) yVar.e;
                List list4 = (List) yVar.f;
                f fVarJ2 = null;
                if (list3.isEmpty()) {
                    ql4.e eVar = (ql4.e) iVar.f224257a;
                    if (eVar != null && (n0Var2 = eVar.f) != null) {
                        f0 f0Var = f0.f322471a;
                        fVarJ2 = com.revolut.feature.credit.card.impl.ui.instalment.hub.a.J2(n0Var2, f0Var, uVar, f0Var);
                    }
                    f fVar = fVarJ2;
                    ql4.e eVar2 = (ql4.e) iVar.f224257a;
                    if (eVar2 == null || (list2 = eVar2.f247118g) == null) {
                        list2 = f0.f322471a;
                    }
                    return new e(fVar, list2, zBooleanValue, bVar, list4);
                }
                ql4.e eVar3 = (ql4.e) iVar.f224257a;
                List listP0 = d0.P0(list3, new u());
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : listP0) {
                    if (((ql4.i) obj3).f247131h == ql4.t.ACTIVE) {
                        arrayList.add(obj3);
                    } else {
                        arrayList2.add(obj3);
                    }
                }
                Iterator it8 = arrayList.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (((ql4.i) next).k != null) {
                        }
                    } else {
                        next = null;
                    }
                }
                ql4.i iVar2 = (ql4.i) next;
                LocalDate localDate = iVar2 != null ? iVar2.f247133l : null;
                dj0.d.Companion.getClass();
                dj0.d dVarO2 = dj0.d.e;
                int i = 0;
                int i2 = 0;
                for (Object obj4 : arrayList) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    dVarO2 = i2 == 0 ? ((ql4.i) obj4).f247130g : pyd.c.O(dVarO2, ((ql4.i) obj4).f247130g);
                    i2 = i3;
                }
                if (localDate == null) {
                    dVar = new dj0.d(0L, uVar.f196542m);
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj5 : arrayList) {
                        if (Intrinsics.f(((ql4.i) obj5).f247133l, localDate)) {
                            arrayList3.add(obj5);
                        }
                    }
                    dj0.d.Companion.getClass();
                    dVar = dj0.d.e;
                    for (Object obj6 : arrayList3) {
                        int i5 = i + 1;
                        if (i < 0) {
                            zhm.v.s();
                            throw null;
                        }
                        if (i == 0) {
                            dVarO = ((ql4.i) obj6).k;
                            if (dVarO == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        } else {
                            dj0.d dVar2 = ((ql4.i) obj6).k;
                            if (dVar2 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            dVarO = pyd.c.O(dVar, dVar2);
                        }
                        dVar = dVarO;
                        i = i5;
                    }
                }
                if (eVar3 == null || (list = eVar3.f247118g) == null) {
                    list = f0.f322471a;
                }
                List list5 = list;
                if (eVar3 != null && (n0Var = eVar3.f) != null) {
                    fVarJ2 = com.revolut.feature.credit.card.impl.ui.instalment.hub.a.J2(n0Var, arrayList, uVar, arrayList2);
                }
                return new d(dVar, localDate, dVarO2, arrayList, arrayList2, zBooleanValue, fVarJ2, list5, bVar, list4);
            default:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.instalment.hub.a aVar3 = this.f117222w;
                aVar3.H2(aVar3.z, new do8.t(data, 6));
                return Unit.f186387a;
        }
    }
}
