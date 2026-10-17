package gvc;

import com.revolut.data.model.Data;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.retail.feature.esim.api.model.EsimProfileSummary;
import h93.f0;
import ha3.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.secure_account.a f147140w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(com.revolut.feature.security_hub.impl.ui.secure_account.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f147140w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f147140w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            case 1:
                o oVar2 = new o(this.f147140w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
            default:
                o oVar3 = new o(this.f147140w, continuation, 2);
                oVar3.v = obj2;
                return oVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((o) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Map mapG;
        int i = this.u;
        com.revolut.feature.security_hub.impl.ui.secure_account.a aVar = this.f147140w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) pair.f186385a;
                List list2 = (List) pair.f186386b;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    f0 card = (f0) obj3;
                    aVar.f85633r.getClass();
                    Intrinsics.checkNotNullParameter(card, "card");
                    if (card.f == h93.r.ACTIVE && !card.d && card.R) {
                        arrayList.add(obj3);
                    }
                }
                List listH = ((x) aVar.o).H(list2, arrayList, null);
                List list3 = listH;
                int iB = q0.b(w.t(list3, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB >= 16 ? iB : 16);
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    linkedHashMap.put(((f0) it8.next()).f150110a, Boolean.TRUE);
                }
                aVar.H2(aVar.f85635t, new n(listH, linkedHashMap, 0));
                break;
            case 1:
                List list4 = (List) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list5 = list4;
                int iB2 = q0.b(w.t(list5, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
                Iterator it9 = list5.iterator();
                while (it9.hasNext()) {
                    linkedHashMap2.put(((UserDevice) it9.next()).f71914a, Boolean.valueOf(!r3.f71921m));
                }
                aVar.H2(aVar.f85635t, new n(list4, linkedHashMap2, 1));
                break;
            default:
                Data data = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list6 = (List) data.getContent();
                if (list6 != null) {
                    List list7 = list6;
                    int iB3 = q0.b(w.t(list7, 10));
                    mapG = new LinkedHashMap(iB3 >= 16 ? iB3 : 16);
                    Iterator it10 = list7.iterator();
                    while (it10.hasNext()) {
                        mapG.put(((EsimProfileSummary) it10.next()).f100455a, Boolean.valueOf(!r3.e));
                    }
                } else {
                    mapG = r0.g();
                }
                aVar.H2(aVar.f85635t, new gqd.s(data, mapG, 29));
                break;
        }
        return Unit.f186387a;
    }
}
