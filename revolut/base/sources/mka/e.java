package mka;

import bka.g0;
import bka.j0;
import bka.k0;
import bka.l0;
import kotlin.jvm.internal.Intrinsics;
import pka.a0;
import pka.d0;
import pka.f0;
import pka.x;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements f {
    @Override // mka.f
    public final f0 a(bka.a aVar) {
        l0 item = (l0) aVar;
        Intrinsics.checkNotNullParameter(item, "item");
        g0 g0Var = item.f16325a;
        String str = g0Var.f16312a;
        String str2 = g0Var.f16313b;
        String str3 = g0Var.f16314c;
        boolean z = g0Var.d;
        boolean z3 = g0Var.e;
        String str4 = g0Var.f;
        k0 k0Var = g0Var.f16315g;
        return new x(new a0(str, str2, str3, z, z3, str4, k0Var != null ? new d0(k0Var.f16323a.name()) : null));
    }

    @Override // mka.f
    public final bka.a b(f0 f0Var) {
        x item = (x) f0Var;
        Intrinsics.checkNotNullParameter(item, "item");
        a0 a0Var = item.f236997a;
        String str = a0Var.f236951a;
        String str2 = a0Var.f236952b;
        String str3 = a0Var.f236953c;
        boolean z = a0Var.d;
        boolean z3 = a0Var.e;
        String str4 = a0Var.f;
        d0 d0Var = a0Var.f236954g;
        return new l0(new g0(str, str2, str3, z, z3, str4, d0Var != null ? new k0(j0.valueOf(d0Var.f236960a)) : null));
    }
}
