package bg9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements cli.n {
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List list;
        boolean z;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        xf9.b bVar = domainState.f15140b;
        if (bVar == null || (list = bVar.f305199a) == null) {
            list = f0.f322471a;
        }
        List list2 = list;
        boolean z3 = true;
        if (bVar == null || !bVar.f305200b) {
            z = true;
            z3 = false;
        } else {
            z = true;
        }
        if (bVar == null) {
            z = false;
        }
        List list3 = bVar != null ? bVar.f305201c : null;
        if (list3 == null) {
            list3 = f0.f322471a;
        }
        return new c(list2, z3, z, list3, bVar != null ? Integer.valueOf(bVar.d) : null);
    }
}
