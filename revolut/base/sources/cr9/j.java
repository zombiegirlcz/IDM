package cr9;

import cr9.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class j {
    public static final boolean a(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        if (iVar instanceof i.a) {
            i.a aVar = (i.a) iVar;
            if (aVar.getOweAmount() == null || aVar.getOweAmount().longValue() <= 0) {
                return aVar.getOwedAmount() != null && aVar.getOwedAmount().longValue() > 0;
            }
            return true;
        }
        if (iVar instanceof i.b) {
            i.b bVar = (i.b) iVar;
            if (bVar.getOweAmount() == null || bVar.getOweAmount().longValue() <= 0) {
                return bVar.getOwedAmount() != null && bVar.getOwedAmount().longValue() > 0;
            }
            return true;
        }
        if (!(iVar instanceof i.c)) {
            throw new NoWhenBranchMatchedException();
        }
        i.c cVar = (i.c) iVar;
        if (cVar.getOweAmount() == null || cVar.getOweAmount().longValue() <= 0) {
            return cVar.getOwedAmount() != null && cVar.getOwedAmount().longValue() > 0;
        }
        return true;
    }
}
