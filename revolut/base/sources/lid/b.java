package lid;

import com.revolut.feature.rev_points.models.EarningBadge;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f195474a = r0.k(new Pair("LOYALTY", m1c.j.LOYALTY), new Pair("LOYALTY_BOOSTED", m1c.j.LOYALTY_BOOSTED), new Pair("CALENDAR", m1c.j.CALENDAR), new Pair("CASHBACK", m1c.j.CASHBACK), new Pair("DISCOUNT", m1c.j.DISCOUNT));

    public static final EarningBadge a(eid.h hVar) {
        m1c.j jVar;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        String type = hVar.getType();
        m1c.j[] jVarArrValues = m1c.j.values();
        int length = jVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jVar = null;
                break;
            }
            jVar = jVarArrValues[i];
            if (a0.z(jVar.name(), type, true)) {
                break;
            }
            i++;
        }
        if (jVar != null) {
            return new EarningBadge(jVar, hVar.getText());
        }
        return null;
    }

    public static final EarningBadge b(sid.d dVar) {
        m1c.j jVar;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        String type = dVar.getType();
        m1c.j[] jVarArrValues = m1c.j.values();
        int length = jVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jVar = null;
                break;
            }
            jVar = jVarArrValues[i];
            if (a0.z(jVar.name(), type, true)) {
                break;
            }
            i++;
        }
        if (jVar != null) {
            return new EarningBadge(jVar, dVar.getText());
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public static final sid.d c(EarningBadge earningBadge) {
        Intrinsics.checkNotNullParameter(earningBadge, "<this>");
        String strH = u1.h(earningBadge.f83945a, f195474a);
        if (strH == null) {
            strH = earningBadge.f83945a.name();
        }
        return new sid.d(strH, earningBadge.f83946b);
    }
}
