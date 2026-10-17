package g6j;

import aw0.o9;
import aw0.r0;
import aw0.z8;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.k0;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import ip0.e5;
import ip0.f5;
import ip0.g5;
import ip0.i5;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f140961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f140962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f140963c;

    public c(g pnlMapper, m timeMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(pnlMapper, "pnlMapper");
        Intrinsics.checkNotNullParameter(timeMapper, "timeMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f140961a = pnlMapper;
        this.f140962b = timeMapper;
        this.f140963c = dateProvider;
    }

    public final g5 a(qta.f fVar, Data chartData) {
        long millis;
        dj0.d dVar;
        dj0.d dVar2;
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        Object content = chartData.getContent();
        g5 g5Var = null;
        i5Var = null;
        i5 i5Var = null;
        if (content != null && fVar != null) {
            qta.b bVar = (qta.b) content;
            dj0.d dVar3 = bVar.f249045c;
            List list = bVar.e;
            boolean z = fVar == qta.f.DAY;
            if (z) {
                LocalDate localDatePlusDays = ((l80.f) this.f140963c).e().plusDays(1L);
                Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
                millis = oc.c.N(localDatePlusDays);
            } else {
                millis = bVar.f249044b.getMillis();
            }
            long j2 = millis;
            long millis2 = bVar.f249043a.getMillis();
            List<qta.j> list2 = list;
            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
            for (qta.j jVar : list2) {
                BigDecimal bigDecimalJ = pyd.c.j(jVar.f249059a);
                BigDecimal bigDecimalJ2 = pyd.c.j(jVar.f249060b);
                BigDecimal bigDecimalJ3 = pyd.c.j(jVar.f249061c);
                BigDecimal bigDecimalJ4 = pyd.c.j(jVar.d);
                long millis3 = jVar.e.getMillis();
                long millis4 = jVar.f.getMillis();
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                arrayList.add(new r0(millis3, millis4, bigDecimalJ, bigDecimalJ2, bigDecimalJ3, bigDecimalJ4, ZERO, dVar3.f115083b));
            }
            z8 z8Var = new z8(millis2, j2, arrayList);
            boolean z3 = !z;
            k0.c cVar = k0.c.d;
            e5 e5Var = new e5(new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), pyd.c.j(dVar3));
            Iterator it8 = list2.iterator();
            if (it8.hasNext()) {
                dj0.d dVar4 = ((qta.j) it8.next()).f249061c;
                while (it8.hasNext()) {
                    dj0.d dVar5 = ((qta.j) it8.next()).f249061c;
                    dVar4.getClass();
                    if (dVar4.compareTo(dVar5) < 0) {
                        dVar4 = dVar5;
                    }
                }
                dVar = dVar4;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                Iterator it9 = list2.iterator();
                if (it9.hasNext()) {
                    dVar2 = ((qta.j) it9.next()).d;
                    while (it9.hasNext()) {
                        dj0.d dVar6 = ((qta.j) it9.next()).d;
                        dVar2.getClass();
                        if (dVar2.compareTo(dVar6) > 0) {
                            dVar2 = dVar6;
                        }
                    }
                } else {
                    dVar2 = null;
                }
                if (dVar2 != null) {
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dVar.f115082a / cp5.d.k(dVar.f115083b));
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                    MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
                    o9 o9Var = o9.NON_SENSITIVE;
                    f5 f5Var = new f5(new MoneyClause(dVar, defaults, null, o9Var, 4), bigDecimalValueOf);
                    BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(dVar2.f115082a / cp5.d.k(dVar2.f115083b));
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                    i5Var = new i5(zhm.v.k(f5Var, new f5(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4), bigDecimalValueOf2)), ms0.v.NoBackground);
                }
            }
            g5 g5Var2 = new g5("CHART_TYPE_CANDLE_LIST_ID", z8Var, z3, cVar, e5Var, i5Var, 8064);
            int i = R$attr.uikit_dp0;
            yp0.b.p(g5Var2, i, i, i, i);
            g5Var = g5Var2;
        }
        return g5Var != null ? g5Var : new g5("CHART_TYPE_CANDLE_LIST_ID", null, true, null, null, null, 8178);
    }
}
