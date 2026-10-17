package mka;

import bka.s;
import kotlin.jvm.internal.Intrinsics;
import pka.f0;
import pka.k;
import pka.n;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements f {
    @Override // mka.f
    public final f0 a(bka.a aVar) {
        s item = (s) aVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new k(new n(item.f16334a, null, null, null, item.f16335b, item.f16336c));
    }

    @Override // mka.f
    public final bka.a b(f0 f0Var) {
        k item = (k) f0Var;
        Intrinsics.checkNotNullParameter(item, "item");
        n nVar = item.f236971a;
        String str = nVar.f236977a;
        String str2 = nVar.e;
        if (str2 != null) {
            return new s(str, str2, nVar.f);
        }
        throw new IllegalArgumentException("Text field can't be null for V2 version");
    }
}
