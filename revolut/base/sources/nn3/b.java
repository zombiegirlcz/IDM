package nn3;

import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {
    public static boolean a(List recipients, cn3.g recipient) {
        Intrinsics.checkNotNullParameter(recipients, "recipients");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        return c(recipients, recipient) >= 0;
    }

    public static String b(zm3.a aVar) {
        if (aVar instanceof zm3.g) {
            return hx7.q.F((zm3.g) aVar);
        }
        if (aVar instanceof zm3.l) {
            return ((zm3.l) aVar).getCode();
        }
        if (aVar instanceof zm3.p) {
            return hx7.q.G((zm3.p) aVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static int c(List list, cn3.g gVar) {
        int i = 0;
        if (gVar instanceof cn3.e) {
            String strB = b(((cn3.e) gVar).f25347a);
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                cn3.g gVar2 = (cn3.g) it8.next();
                if ((gVar2 instanceof cn3.e) && Intrinsics.f(b(((cn3.e) gVar2).f25347a), strB)) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        if (!(gVar instanceof cn3.f)) {
            throw new NoWhenBranchMatchedException();
        }
        cn3.f fVar = (cn3.f) gVar;
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            cn3.g gVar3 = (cn3.g) it9.next();
            if ((gVar3 instanceof cn3.f) && Intrinsics.f(((cn3.f) gVar3).f25348a.f79285a, fVar.f25348a.f79285a)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
