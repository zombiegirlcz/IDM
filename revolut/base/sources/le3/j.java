package le3;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.domain.interactors.transactions.Priority;
import fg8.e0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;
import tof.i7;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l5i.q f194469b;

    public /* synthetic */ j(l5i.q qVar, int i) {
        this.f194468a = i;
        this.f194469b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f194468a) {
            case 0:
                i7 transactionsFilter = (i7) obj2;
                Intrinsics.checkNotNullParameter(transactionsFilter, "transactionsFilter");
                mjf.b0 b0Var = (mjf.b0) ((com.revolut.domain.interactors.transactions.a) this.f194469b.i);
                Priority.STANDARD priority = Priority.STANDARD.f60263b;
                b0Var.h(priority);
                x71.e eVar = b0Var.f205982a;
                BreadcrumbException timeoutBreadcrumb = new BreadcrumbException();
                xif.s sVar = (xif.s) eVar;
                sVar.getClass();
                Intrinsics.checkNotNullParameter(priority, "priority");
                Intrinsics.checkNotNullParameter(timeoutBreadcrumb, "timeoutBreadcrumb");
                fif.m mVar = (fif.m) sVar.d;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(priority, "priority");
                Intrinsics.checkNotNullParameter(timeoutBreadcrumb, "timeoutBreadcrumb");
                efm.r rVarSwitchMapSingle = te0.w.w0(((tif.q) mVar.f135410a).e()).switchMapSingle(new e0(23, new fif.e(mVar, transactionsFilter, priority, timeoutBreadcrumb, 1)));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMapSingle, "switchMapSingle(...)");
                efm.r map = rVarSwitchMapSingle.map(new lak.i(new b(16), 22));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
            default:
                he3.s it8 = (he3.s) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                j9l.a moneyCalculator = (j9l.a) this.f194469b.f192301j;
                it8.getClass();
                Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
                List list = it8.f151572a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : list) {
                    LocalDate localDate = new LocalDate(((he3.h) obj3).f151559a.f272593h);
                    Object arrayList = linkedHashMap.get(localDate);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(localDate, arrayList);
                    }
                    ((List) arrayList).add(obj3);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list) {
                    if (((he3.h) obj4).f151559a.C != null) {
                        arrayList2.add(obj4);
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj5 : arrayList2) {
                    LocalDate localDate2 = new LocalDate(((he3.h) obj5).f151559a.f272593h);
                    Object arrayList3 = linkedHashMap2.get(localDate2);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap2.put(localDate2, arrayList3);
                    }
                    ((List) arrayList3).add(obj5);
                }
                return new he3.a(it8.f151573b, it8.b(linkedHashMap, moneyCalculator), it8.b(linkedHashMap2, moneyCalculator));
        }
    }
}
