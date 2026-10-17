package com.revolut.feature.permissions.flow;

import com.revolut.kompot.common.ExternalDestination;
import d67.p;
import d67.r;
import d67.s;
import d67.t;
import d67.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import oki.h;
import r7a.g;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        u p0 = (u) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        b bVar = (b) this.receiver;
        bVar.getClass();
        if (p0 instanceof d67.q) {
            h.D2(bVar.f80342t);
        } else if ((p0 instanceof p) || (p0 instanceof r) || (p0 instanceof s)) {
            bVar.C1(new ExternalDestination.ByIntent(((s70.b) bVar.f80339q).b(), null));
        } else {
            if (!(p0 instanceof t)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar.C2(g.f252056a);
        }
        return Unit.f186387a;
    }
}
