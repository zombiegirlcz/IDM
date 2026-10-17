package mka;

import bka.a0;
import bka.b0;
import bka.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pka.f0;
import pka.p;
import pka.s;
import pka.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements f {
    @Override // mka.f
    public final f0 a(bka.a aVar) {
        b0 item = (b0) aVar;
        Intrinsics.checkNotNullParameter(item, "item");
        x xVar = item.f16298a;
        String str = xVar.f16344a;
        List<a0> list = xVar.f16345b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (a0 a0Var : list) {
            arrayList.add(new v(a0Var.f16295a, a0Var.f16296b));
        }
        return new p(new s(str, arrayList));
    }

    @Override // mka.f
    public final bka.a b(f0 f0Var) {
        p item = (p) f0Var;
        Intrinsics.checkNotNullParameter(item, "item");
        s sVar = item.f236981a;
        String str = sVar.f236988a;
        List<v> list = sVar.f236989b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (v vVar : list) {
            arrayList.add(new a0(vVar.f236995a, vVar.f236996b));
        }
        return new b0(new x(str, arrayList));
    }
}
