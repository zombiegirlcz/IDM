package mka;

import bka.d1;
import kotlin.jvm.internal.Intrinsics;
import pka.f0;
import pka.m0;
import pka.s0;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements f {
    @Override // mka.f
    public final f0 a(bka.a aVar) {
        d1 item = (d1) aVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new m0(new s0(item.f16305a, item.f16306b, null, null));
    }

    @Override // mka.f
    public final bka.a b(f0 f0Var) {
        m0 item = (m0) f0Var;
        Intrinsics.checkNotNullParameter(item, "item");
        s0 s0Var = item.f236975a;
        return new d1(s0Var.f236990a, s0Var.f236991b);
    }
}
