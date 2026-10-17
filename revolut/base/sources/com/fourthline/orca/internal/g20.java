package com.fourthline.orca.internal;

import com.fourthline.orca.internal.l01;
import com.fourthline.orca.internal.q80;
import com.fourthline.orca.internal.z11;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class g20 extends a3 {
    @Override // com.fourthline.orca.internal.a3
    public q80 a(z11.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof z11.a.C0320a) {
            return new q80.b(null, 1, null);
        }
        if (aVar instanceof z11.a.c) {
            z11.a.c cVar = (z11.a.c) aVar;
            return cVar.c() instanceof l01.a ? new q80.w.c(null, 1, null) : new q80.k(null, ly.a(cVar.c()), 1, null);
        }
        if (aVar instanceof z11.a.d) {
            return c();
        }
        if (aVar instanceof z11.a.b) {
            throw new IllegalStateException("Not supported by KYC flow");
        }
        throw new NoWhenBranchMatchedException();
    }
}
