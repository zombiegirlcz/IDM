package t3f;

import dfl.i0;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f267747a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e4f.b f267748b;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        long jLongValue;
        e4f.c currentState = (e4f.c) obj2;
        switch (this.f267747a) {
            case 0:
                Intrinsics.checkNotNullParameter(currentState, "currentState");
                e4f.b bVar = this.f267748b;
                boolean z = bVar.d;
                return e4f.c.a(currentState, z ? null : bVar.f122542b, z, null, 4);
            default:
                Intrinsics.checkNotNullParameter(currentState, "currentState");
                e4f.b bVar2 = this.f267748b;
                Long lValueOf = null;
                if (bVar2.d) {
                    currentState.getClass();
                    return new e4f.c(null, null, true);
                }
                Long l2 = bVar2.f122543c;
                if (l2 != null) {
                    jLongValue = l2.longValue();
                } else {
                    Iterator it8 = bVar2.f122541a.iterator();
                    if (it8.hasNext()) {
                        i0 i0Var = (i0) it8.next();
                        long jI = i0Var.i();
                        Long lQ = i0Var.q();
                        long jLongValue2 = lQ != null ? lQ.longValue() : i0Var.i();
                        Long lE = i0Var.e();
                        lValueOf = Long.valueOf(Math.max(jI, Math.max(jLongValue2, lE != null ? lE.longValue() : i0Var.i())));
                        while (it8.hasNext()) {
                            i0 i0Var2 = (i0) it8.next();
                            long jI2 = i0Var2.i();
                            Long lQ2 = i0Var2.q();
                            long jLongValue3 = lQ2 != null ? lQ2.longValue() : i0Var2.i();
                            Long lE2 = i0Var2.e();
                            Long lValueOf2 = Long.valueOf(Math.max(jI2, Math.max(jLongValue3, lE2 != null ? lE2.longValue() : i0Var2.i())));
                            if (lValueOf.compareTo(lValueOf2) < 0) {
                                lValueOf = lValueOf2;
                            }
                        }
                    }
                    if (lValueOf == null) {
                        throw new IllegalStateException("Recent trading transactions page is missing the update cursor");
                    }
                    jLongValue = lValueOf.longValue();
                }
                Long l3 = bVar2.f122542b;
                Long lValueOf3 = Long.valueOf(jLongValue);
                currentState.getClass();
                return new e4f.c(l3, lValueOf3, false);
        }
    }
}
