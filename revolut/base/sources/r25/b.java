package r25;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sfe.h;
import sfe.i;
import sfe.j;
import sfe.k;
import sfe.l;
import sfe.m;
import sfe.o;
import sfe.p;
import sfe.q;
import sfe.r;
import sfe.s;
import skm.a2;
import yji.n;

/* JADX INFO: loaded from: classes22.dex */
public abstract class b extends n {
    public static ProductAccountId Z2(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        if (sVar instanceof i) {
            return null;
        }
        if (sVar instanceof q) {
            return ((q) sVar).f262427a;
        }
        if (sVar instanceof h) {
            return ((h) sVar).f262410a;
        }
        if (sVar instanceof p) {
            return ((p) sVar).f262425a;
        }
        if (sVar instanceof l) {
            return ((l) sVar).f262417a;
        }
        if (sVar instanceof m) {
            return ((m) sVar).f262420b;
        }
        if (sVar instanceof sfe.n) {
            return ((sfe.n) sVar).f262422a;
        }
        if (sVar instanceof o) {
            return ((o) sVar).f262424a;
        }
        if (sVar instanceof r) {
            return ((r) sVar).f262430b;
        }
        if (sVar instanceof k) {
            return ((k) sVar).f262416a;
        }
        if (sVar instanceof j) {
            return ((j) sVar).f262415a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static a2 c3(b bVar, String str, Function1 block, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        boolean z = (i & 2) == 0;
        r0e.i handleError = new r0e.i(26);
        bVar.getClass();
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(block, "block");
        if (z) {
            block = new a(bVar, block, (Continuation) null);
        }
        return bVar.V2(new qd8.e(str, bVar, block, (Continuation) null), handleError);
    }

    public abstract Object b3(s sVar, Continuation continuation);

    public abstract boolean d3(Object obj2);
}
