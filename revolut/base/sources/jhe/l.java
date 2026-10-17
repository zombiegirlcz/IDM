package jhe;

import ch.qos.logback.core.CoreConstants;
import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    @NotNull
    private static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x79.a f174224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y79.a f174225b;

    public l(x79.a onHoldAccountInteractor, y79.a onHoldAccountMapper) {
        Intrinsics.checkNotNullParameter(onHoldAccountInteractor, "onHoldAccountInteractor");
        Intrinsics.checkNotNullParameter(onHoldAccountMapper, "onHoldAccountMapper");
        this.f174224a = onHoldAccountInteractor;
        this.f174225b = onHoldAccountMapper;
    }

    public static Clause c(z79.b bVar) {
        pie.a aVar;
        int i = k.f174223a[bVar.ordinal()];
        if (i == 1) {
            aVar = pie.a.PERSONAL;
        } else if (i == 2) {
            aVar = pie.a.JOINT;
        } else if (i == 3) {
            aVar = pie.a.PRO;
        } else if (i == 4) {
            aVar = pie.a.PERSONAL;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = pie.a.YOUTH;
        }
        return lge.m.a(aVar);
    }

    public static String d(z79.a aVar) {
        List listM0;
        String str = aVar.f319951b.d;
        if (!d0.K(str, CoreConstants.COLON_CHAR)) {
            str = null;
        }
        if (str == null || (listM0 = d0.m0(str, new char[]{CoreConstants.COLON_CHAR}, 6)) == null) {
            return null;
        }
        return (String) zhm.d0.o0(listM0);
    }

    public final Flow a(Flow itemsFlow, Set types) {
        Object next;
        Intrinsics.checkNotNullParameter(itemsFlow, "itemsFlow");
        Intrinsics.checkNotNullParameter(types, "types");
        if (types.isEmpty()) {
            return itemsFlow;
        }
        Set set = types;
        Iterator it8 = set.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((z79.b) next) != z79.b.OTHER) {
                break;
            }
        }
        z79.b bVar = (z79.b) next;
        if (bVar == null) {
            bVar = z79.b.OTHER;
        }
        Clause clauseC = c(bVar);
        ArrayList arrayList = new ArrayList(zhm.w.t(set, 10));
        Iterator it9 = set.iterator();
        while (it9.hasNext()) {
            arrayList.add(((d89.g) this.f174224a).e((z79.b) it9.next()));
        }
        Flow[] flowArr = (Flow[]) arrayList.toArray(new Flow[0]);
        return nim.a.v(u0.m(itemsFlow, nim.a.v(u0.l((Flow[]) Arrays.copyOf(flowArr, flowArr.length)), new je5.n(24))), new je2.d(this, clauseC, 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(com.revolut.core.ui_kit.models.Clause r16, java.util.List r17, java.util.List r18) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jhe.l.b(com.revolut.core.ui_kit.models.Clause, java.util.List, java.util.List):java.util.List");
    }
}
