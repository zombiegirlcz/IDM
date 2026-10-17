package mka;

import bka.p;
import bka.q;
import bka.r;
import kotlin.jvm.internal.Intrinsics;
import pka.f0;
import pka.k;
import pka.n;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements f {
    @Override // mka.f
    public final f0 a(bka.a aVar) {
        r item = (r) aVar;
        Intrinsics.checkNotNullParameter(item, "item");
        p pVar = item.f16333a;
        String str = pVar.f16329a;
        String str2 = pVar.f16330b;
        boolean z = pVar.d;
        String str3 = pVar.e;
        return new k(new n(str, str2, Boolean.valueOf(z), pVar.f16331c.name(), null, str3));
    }

    @Override // mka.f
    public final bka.a b(f0 f0Var) {
        k item = (k) f0Var;
        Intrinsics.checkNotNullParameter(item, "item");
        n nVar = item.f236971a;
        String str = nVar.f236977a;
        String str2 = nVar.f236978b;
        Boolean bool = nVar.d;
        if (bool == null) {
            throw new IllegalArgumentException("isTransparent field can't be null for V1 version");
        }
        boolean zBooleanValue = bool.booleanValue();
        String str3 = nVar.f;
        String str4 = nVar.f236979c;
        if (str4 != null) {
            return new r(new p(str, str2, q.valueOf(str4), zBooleanValue, str3));
        }
        throw new IllegalArgumentException("layout field can't be null for V1 version");
    }
}
