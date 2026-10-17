package xsh;

import com.revolut.core.ui_kit.delegates.widgets.z4;
import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements jki.p {
    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<h> list = domainState.f308493a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (h hVar : list) {
            arrayList.add(new z4(hVar.f308501b.getF51752a(), hVar.f308501b, hVar.e, hVar));
        }
        h hVar2 = (h) d0.e0(domainState.f308494b, domainState.f308493a);
        int i = domainState.f308494b;
        Clause clause = hVar2 != null ? hVar2.f308502c : null;
        Clause clause2 = hVar2 != null ? hVar2.d : null;
        boolean z = false;
        if (hVar2 != null && hVar2.f != null) {
            z = true;
        }
        return new g(arrayList, i, clause, clause2, z);
    }
}
