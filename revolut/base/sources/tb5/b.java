package tb5;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mb5.j;
import mb5.t;
import mb5.u;
import mb5.v;
import ub5.i;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f269460a = r0.k(new Pair("active", v.ACTIVE), new Pair("disabled", v.INACTIVE));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f269461b = r0.k(new Pair("scheduled", u.SCHEDULED), new Pair("backup_card", u.BACKUP_CARD), new Pair("direct_debit", u.DIRECT_DEBIT), new Pair("ach", u.ACH));

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public static final t a(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        String sourceCurrency = iVar.getSourceCurrency();
        String sourceId = iVar.getSourceId();
        String sourceState = iVar.getSourceState();
        return new t(sourceCurrency, sourceId, sourceState != null ? (j) u1.u(sourceState, d.f269465a) : null);
    }
}
