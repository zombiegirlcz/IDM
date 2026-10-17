package mka;

import bka.b1;
import bka.c1;
import bka.x0;
import kotlin.jvm.internal.Intrinsics;
import pka.f0;
import pka.m0;
import pka.p0;
import pka.s0;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements f {
    @Override // mka.f
    public final f0 a(bka.a aVar) {
        c1 item = (c1) aVar;
        Intrinsics.checkNotNullParameter(item, "item");
        b1 b1Var = item.f16304a;
        String str = b1Var.f16299a;
        String str2 = b1Var.f16300b;
        String str3 = b1Var.f16301c;
        x0 x0Var = b1Var.d;
        return new m0(new s0(str, str2, str3, x0Var != null ? new p0(x0Var.f16346a, x0Var.f16347b) : null));
    }

    @Override // mka.f
    public final bka.a b(f0 f0Var) {
        m0 item = (m0) f0Var;
        Intrinsics.checkNotNullParameter(item, "item");
        s0 s0Var = item.f236975a;
        String str = s0Var.f236990a;
        String str2 = s0Var.f236991b;
        String str3 = s0Var.f236992c;
        p0 p0Var = s0Var.d;
        return new c1(new b1(str, str2, str3, p0Var != null ? new x0(p0Var.f236983a, p0Var.f236984b) : null));
    }
}
