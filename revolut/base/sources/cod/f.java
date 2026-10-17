package cod;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import he3.j;
import ind.b0;
import ind.z;
import java.util.List;
import java.util.Set;
import knd.o0;
import kotlin.jvm.internal.Intrinsics;
import lnd.p0;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f25532b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zq.a f25533a;

    static {
        yld.d[] elements = {yld.d.INCOME, yld.d.CASHFLOW, yld.d.EARNINGS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f25532b = kotlin.collections.d.y0(elements);
    }

    public f(zq.a analyticsPeriodDifferenceHelper, o0 screenTypeInfoProvider, p0 categoryGroupMapper, jnd.e analyticsBudgetInfoMapper) {
        Intrinsics.checkNotNullParameter(analyticsPeriodDifferenceHelper, "analyticsPeriodDifferenceHelper");
        Intrinsics.checkNotNullParameter(screenTypeInfoProvider, "screenTypeInfoProvider");
        Intrinsics.checkNotNullParameter(categoryGroupMapper, "categoryGroupMapper");
        Intrinsics.checkNotNullParameter(analyticsBudgetInfoMapper, "analyticsBudgetInfoMapper");
        this.f25533a = analyticsPeriodDifferenceHelper;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final dj0.d a(ind.e currentAnalytics, ind.e eVar, yld.d screenType) {
        Intrinsics.checkNotNullParameter(currentAnalytics, "currentAnalytics");
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        int i = 0;
        if (screenType == yld.d.CASHFLOW) {
            ind.c cVar = currentAnalytics instanceof ind.c ? (ind.c) currentAnalytics : null;
            if (cVar != null) {
                AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = cVar.f162795g;
                dj0.d dVar = cVar.i;
                if (analyticsSpendingPeriod$Interval != null) {
                    b0 b0Var = cVar.e;
                    z zVar = b0Var instanceof z ? (z) b0Var : null;
                    if (zVar != null) {
                        List listE = p0.e(analyticsSpendingPeriod$Interval, d0.E0(zVar.f162836b, zVar.f162835a));
                        dj0.d.Companion.getClass();
                        dj0.d dVarO = dj0.d.e;
                        for (Object obj2 : listE) {
                            int i2 = i + 1;
                            if (i < 0) {
                                v.s();
                                throw null;
                            }
                            dVarO = i == 0 ? ((j) obj2).f151564b : pyd.c.O(dVarO, ((j) obj2).f151564b);
                            i = i2;
                        }
                        return dVarO;
                    }
                }
                return dVar;
            }
        } else {
            if (!o0.b(screenType)) {
                return this.f25533a.m(currentAnalytics, eVar, screenType != yld.d.NET_BALANCE);
            }
            ind.c cVar2 = currentAnalytics instanceof ind.c ? (ind.c) currentAnalytics : null;
            if (cVar2 != null) {
                return cVar2.i;
            }
        }
        return null;
    }
}
