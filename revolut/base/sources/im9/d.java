package im9;

import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jq9.p;
import jq9.v;
import jq9.y;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f162321w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f162321w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f162321w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f162321w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d(this.f162321w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            default:
                d dVar4 = new d(this.f162321w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Pair pair = (Pair) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(pair, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        i iVar = this.f162321w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Map map = (Map) pair.f186385a;
                List list = (List) pair.f186386b;
                Iterable iterable = (List) map.get(d3a.a.REVOLUT);
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : iterable) {
                    zm3.a aVar2 = ((y) obj3).f177526a;
                    Intrinsics.i(aVar2, "null cannot be cast to non-null type com.revolut.feature.contacts.models.RevolutContact.Remote");
                    String str = ((zm3.j) aVar2).f;
                    iVar.getClass();
                    RecipientPaymentsSettings.Setting settingC = i.c(list, str, iy9.c.BLOCK_USER);
                    if (settingC != null ? Intrinsics.f(settingC.c(), Boolean.TRUE) : false) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 1:
                Pair pair2 = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Map map2 = (Map) pair2.f186385a;
                List list2 = (List) pair2.f186386b;
                Iterable iterable2 = (List) map2.get(d3a.a.REVOLUT);
                if (iterable2 == null) {
                    iterable2 = f0.f322471a;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : iterable2) {
                    zm3.a aVar4 = ((y) obj4).f177526a;
                    Intrinsics.i(aVar4, "null cannot be cast to non-null type com.revolut.feature.contacts.models.RevolutContact.Remote");
                    String str2 = ((zm3.j) aVar4).f;
                    iVar.getClass();
                    RecipientPaymentsSettings.Setting settingC2 = i.c(list2, str2, iy9.c.BLOCK_USER);
                    Boolean boolC = settingC2 != null ? settingC2.c() : null;
                    if (boolC == null || !boolC.booleanValue()) {
                        arrayList2.add(obj4);
                    }
                }
                return new b(arrayList2, arrayList2.size(), 0, 0);
            case 2:
                Pair pair3 = (Pair) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List list3 = (List) pair3.f186385a;
                List list4 = (List) pair3.f186386b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : list3) {
                    jq9.k kVar = (jq9.k) obj5;
                    if ((kVar instanceof p) && (((p) kVar).f177514b instanceof zm3.j)) {
                        arrayList3.add(obj5);
                    }
                }
                ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                Iterator it8 = arrayList3.iterator();
                while (it8.hasNext()) {
                    arrayList4.add(new y(((p) it8.next()).f177514b));
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj6 : arrayList4) {
                    zm3.a aVar6 = ((y) obj6).f177526a;
                    Intrinsics.i(aVar6, "null cannot be cast to non-null type com.revolut.feature.contacts.models.RevolutContact.Remote");
                    String str3 = ((zm3.j) aVar6).f;
                    iVar.getClass();
                    RecipientPaymentsSettings.Setting settingC3 = i.c(list4, str3, iy9.c.BLOCK_USER);
                    Boolean boolC2 = settingC3 != null ? settingC3.c() : null;
                    if (boolC2 == null || !boolC2.booleanValue()) {
                        arrayList5.add(obj6);
                    }
                }
                return arrayList5;
            default:
                Pair pair4 = (Pair) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Map map3 = (Map) pair4.f186385a;
                List list5 = (List) pair4.f186386b;
                Iterable iterable3 = (List) map3.get(d3a.a.REVOLUT);
                if (iterable3 == null) {
                    iterable3 = f0.f322471a;
                }
                Iterable iterable4 = (List) map3.get(d3a.a.ACCOUNTS);
                if (iterable4 == null) {
                    iterable4 = f0.f322471a;
                }
                Iterable iterable5 = (List) map3.get(d3a.a.CARDS);
                if (iterable5 == null) {
                    iterable5 = f0.f322471a;
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj7 : iterable3) {
                    zm3.a aVar8 = ((y) obj7).f177526a;
                    Intrinsics.i(aVar8, "null cannot be cast to non-null type com.revolut.feature.contacts.models.RevolutContact.Remote");
                    if (i.b(iVar, list5, ((zm3.j) aVar8).f)) {
                        arrayList6.add(obj7);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj8 : iterable4) {
                    if (i.b(iVar, list5, ((v) obj8).f177523a.f132329a)) {
                        arrayList7.add(obj8);
                    }
                }
                ArrayList arrayListE0 = d0.E0(arrayList7, arrayList6);
                ArrayList arrayList8 = new ArrayList();
                for (Object obj9 : iterable5) {
                    if (i.b(iVar, list5, ((jq9.w) obj9).f177524a.f81495a.f81490a)) {
                        arrayList8.add(obj9);
                    }
                }
                return d0.E0(arrayList8, arrayListE0);
        }
    }
}
