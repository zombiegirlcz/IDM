package tij;

import aw0.ka;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TimeClause;
import dej.t1;
import java.time.Instant;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ynj.e f271541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cej.b f271542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1j.b f271543c;
    public final ynj.g d;

    public b(ynj.e commonUiBuilder, cej.b mobilePlansFeatureAvailabilityInteractor, ynj.m installationStateResolver, xjj.a connectedToDeviceClauseMapper, t1j.b bytesAllowanceFormatter, ynj.g balanceCalculator) {
        Intrinsics.checkNotNullParameter(commonUiBuilder, "commonUiBuilder");
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(installationStateResolver, "installationStateResolver");
        Intrinsics.checkNotNullParameter(connectedToDeviceClauseMapper, "connectedToDeviceClauseMapper");
        Intrinsics.checkNotNullParameter(bytesAllowanceFormatter, "bytesAllowanceFormatter");
        Intrinsics.checkNotNullParameter(balanceCalculator, "balanceCalculator");
        this.f271541a = commonUiBuilder;
        this.f271542b = mobilePlansFeatureAvailabilityInteractor;
        this.f271543c = bytesAllowanceFormatter;
        this.d = balanceCalculator;
    }

    public static Clause b(t1 t1Var) {
        Instant instant = t1Var.f113664w;
        return ebm.a.z(instant != null ? new TimeClause(instant.toEpochMilli(), new TimeClause.Format.DayAndMonth(ka.FULL), null, null, 12) : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c4, code lost:
    
        if (ynj.m.b(r2, r38, r3 == null ? zhm.f0.f322471a : r3) != false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x039c  */
    /* JADX WARN: Type inference failed for: r16v2, types: [com.revolut.core.ui_kit.delegates.EsimDelegate$Model$a] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Enum] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.EsimDelegate.Model a(java.util.List r33, pij.a r34, java.util.List r35, boolean r36, java.util.List r37, dm0.b r38) {
        /*
            Method dump skipped, instruction units count: 971
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tij.b.a(java.util.List, pij.a, java.util.List, boolean, java.util.List, dm0.b):com.revolut.core.ui_kit.delegates.EsimDelegate$Model");
    }

    public final boolean c(List list, dm0.b bVar, List list2) {
        List<t1> list3 = list;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            return false;
        }
        for (t1 t1Var : list3) {
            if (t1Var.f113653g == dej.m.MOBILE_PLAN) {
                if (ynj.m.b(t1Var, bVar, list2 == null ? f0.f322471a : list2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
