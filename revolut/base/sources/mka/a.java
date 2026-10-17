package mka;

import bka.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pka.f0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements f {
    @Override // mka.f
    public final f0 a(bka.a aVar) {
        k item = (k) aVar;
        Intrinsics.checkNotNullParameter(item, "item");
        List<bka.j> list = item.f16321a.f16311a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (bka.j jVar : list) {
            arrayList.add(new pka.i(jVar.f16318a, jVar.f16319b, jVar.f16320c));
        }
        return new pka.b(new pka.f(arrayList));
    }

    @Override // mka.f
    public final bka.a b(f0 f0Var) {
        pka.b item = (pka.b) f0Var;
        Intrinsics.checkNotNullParameter(item, "item");
        List<pka.i> list = item.f236955a.f236963a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (pka.i iVar : list) {
            arrayList.add(new bka.j(iVar.f236967a, iVar.f236968b, iVar.f236969c));
        }
        return new k(new bka.g(arrayList));
    }
}
