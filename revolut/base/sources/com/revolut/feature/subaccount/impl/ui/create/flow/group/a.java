package com.revolut.feature.subaccount.impl.ui.create.flow.group;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import x7e.f;
import x7e.g;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        g p0 = (g) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        c cVar = (c) this.receiver;
        cVar.getClass();
        if (!(p0 instanceof f)) {
            throw new NoWhenBranchMatchedException();
        }
        cVar.C2(new s7e.c(((f) p0).f303182a));
        return Unit.f186387a;
    }
}
