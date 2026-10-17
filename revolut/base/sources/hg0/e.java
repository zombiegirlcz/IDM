package hg0;

import com.revolut.core.model.faq.FaqNode;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nel.y;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f152046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f152047c;

    public /* synthetic */ e(com.revolut.feature.security_hub.impl.ui.security_hub.c cVar, List list, boolean z) {
        this.f152045a = 1;
        this.f152046b = list;
        this.f152047c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        FaqNode faqNode;
        Object next;
        Object next2;
        ?? arrayList;
        int i = this.f152045a;
        boolean z = this.f152047c;
        ?? arrayList2 = this.f152046b;
        switch (i) {
            case 0:
                List list = (List) obj2;
                ArrayList arrayListY = com.google.android.gms.internal.mlkit_vision_face.a.y("tree", list);
                Iterator it8 = arrayList2.iterator();
                while (it8.hasNext()) {
                    List listF = m.f((String) it8.next(), list);
                    if (listF != null && (faqNode = (FaqNode) d0.d0(listF)) != null) {
                        arrayListY.add(m.a(faqNode, z));
                    }
                }
                return arrayListY;
            case 1:
                jvc.i iVar = (jvc.i) obj2;
                od0.a aVar = od0.a.f224253a;
                String str = od0.a.g() ? "6c073c35-8fcc-4265-9cf3-44d532fe71d5" : "d3c5ab10-b20d-49ac-a365-a6caa0234a1a";
                if (!z) {
                    ArrayList arrayListF1 = d0.f1((Collection) arrayList2);
                    arrayList2 = new ArrayList();
                    for (Object obj3 : arrayListF1) {
                        if (!kotlin.text.d0.J(((koi.j) obj3).getF52302a(), str, false)) {
                            arrayList2.add(obj3);
                        }
                    }
                }
                return jvc.i.a(iVar, false, null, null, null, arrayList2, null, false, null, Boolean.valueOf(!((Collection) r14).isEmpty()), false, null, 64447);
            case 2:
                List instruments = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                Iterable iterable = (Iterable) arrayList2;
                int iB = q0.b(w.t(iterable, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj4 : iterable) {
                    String str2 = (String) obj4;
                    List list2 = instruments;
                    Iterator it9 = list2.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next = it9.next();
                            if (Intrinsics.f(((nel.n) next).f214596b, str2)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    nel.n nVar = (nel.n) next;
                    TradingAccountType.Margin margin = TradingAccountType.Margin.f105271a;
                    if (nVar == null || !io3.h.j(nVar.f214597c)) {
                        TradingAccountType.Gia gia = TradingAccountType.Gia.f105270a;
                        if (nVar != null && io3.h.l(nVar.f214597c)) {
                            arrayList = u.c(new y(nVar, gia));
                        } else if (nVar != null) {
                            aim.e eVarB = u.b();
                            eVarB.add(new y(nVar, gia));
                            eVarB.add(new y(nVar, TradingAccountType.Taa.f105275a));
                            Iterator it10 = list2.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    next2 = it10.next();
                                    nel.n nVar2 = (nel.n) next2;
                                    if (io3.h.j(nVar2.f214597c)) {
                                        xi0.b bVar = nVar2.f214605q;
                                        if (Intrinsics.f(bVar != null ? bVar.f306286a : null, nVar.f214596b)) {
                                        }
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            nel.n nVar3 = (nel.n) next2;
                            if (nVar3 != null) {
                                eVarB.add(new y(nVar3, margin));
                            }
                            arrayList = u.a(eVarB);
                        } else {
                            hx7.e.n(new IllegalStateException(p.a.p("Instrument ", str2, " not found")));
                            arrayList = f0.f322471a;
                        }
                    } else {
                        arrayList = u.c(new y(nVar, margin));
                    }
                    if (z) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : (Iterable) arrayList) {
                            TradingAccountType tradingAccountType = ((y) obj5).f214638b;
                            if ((tradingAccountType instanceof TradingAccountType.Gia) || (tradingAccountType instanceof TradingAccountType.Taa)) {
                                arrayList3.add(obj5);
                            }
                        }
                        arrayList = new ArrayList();
                        for (Object obj6 : arrayList3) {
                            if (!io3.h.l(((y) obj6).f214637a.f214597c)) {
                                arrayList.add(obj6);
                            }
                        }
                    }
                    linkedHashMap.put(obj4, arrayList);
                }
                return linkedHashMap;
            default:
                r40.a aVar2 = (r40.a) obj2;
                return r40.a.a(aVar2, r40.h.a(aVar2.f251319a, zi0.c.P(arrayList2, false, null, 3), null, z, 6), false, null, null, null, null, 62);
        }
    }

    public /* synthetic */ e(List list, m mVar, boolean z) {
        this.f152045a = 0;
        this.f152046b = list;
        this.f152047c = z;
    }

    public /* synthetic */ e(List list, boolean z, int i) {
        this.f152045a = i;
        this.f152046b = list;
        this.f152047c = z;
    }
}
