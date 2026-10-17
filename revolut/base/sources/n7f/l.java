package n7f;

import aw0.c7;
import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.trading.managed_portfolios.impl.domain.investor_update.model.InvestorUpdate;
import com.revolut.kompot.common.R$string;
import ip0.bf0;
import ip0.zj;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        Object next;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (domainState instanceof f) {
            IntRange intRange = new IntRange(1, 4, 1);
            ArrayList arrayList = new ArrayList(w.t(intRange, 10));
            vim.f it8 = intRange.iterator();
            while (it8.f289625c) {
                arrayList.add(new bf0(a0.d.n("loading_", it8.nextInt())));
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            return new i(arrayList);
        }
        if (domainState instanceof e) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("error_state", new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31684);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return new i(u.c(model));
        }
        if (!(domainState instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        d dVar = (d) domainState;
        List list = dVar.f213082a;
        String str = dVar.f213083b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            Month month = ((InvestorUpdate) obj2).f91238b.getMonth();
            Object arrayList2 = linkedHashMap.get(month);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(month, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        Collection collectionValues = linkedHashMap.values();
        ArrayList arrayList3 = new ArrayList();
        Iterator it9 = collectionValues.iterator();
        while (it9.hasNext()) {
            Iterator it10 = ((List) it9.next()).iterator();
            if (it10.hasNext()) {
                next = it10.next();
                if (it10.hasNext()) {
                    LocalDate localDate = ((InvestorUpdate) next).f91238b;
                    do {
                        Object next2 = it10.next();
                        LocalDate localDate2 = ((InvestorUpdate) next2).f91238b;
                        if (localDate.compareTo((Object) localDate2) < 0) {
                            next = next2;
                            localDate = localDate2;
                        }
                    } while (it10.hasNext());
                }
            } else {
                next = null;
            }
            InvestorUpdate investorUpdate = (InvestorUpdate) next;
            if (investorUpdate != null) {
                arrayList3.add(investorUpdate);
            }
        }
        List<InvestorUpdate> listP0 = d0.P0(arrayList3, new k());
        ArrayList arrayList4 = new ArrayList(w.t(listP0, 10));
        for (InvestorUpdate investorUpdate2 : listP0) {
            arrayList4.add(new SingleChoiceDelegate.Model(investorUpdate2.f91237a, com.revolut.core.ui_kit.models.j.b(c7.Companion, investorUpdate2.f91238b, new LocalDateClause$DateFormat.Month(0)), Intrinsics.f(investorUpdate2.f91237a, str), null, investorUpdate2, YearClass.CLASS_2008));
        }
        yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
        return new i(arrayList4);
    }
}
