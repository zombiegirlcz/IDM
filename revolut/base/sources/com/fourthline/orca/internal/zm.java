package com.fourthline.orca.internal;

import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.internal.dj0;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class zm implements zq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OnProductCompleted f35637a;

    public zm(OnProductCompleted completionBlock) {
        Intrinsics.checkNotNullParameter(completionBlock, "completionBlock");
        this.f35637a = completionBlock;
    }

    @Override // com.fourthline.orca.internal.zq0
    public void a(Object obj2) {
        Object objA;
        OnProductCompleted onProductCompleted = this.f35637a;
        Throwable thA = yhm.m.a(obj2);
        if (thA == null) {
            dj0 dj0Var = (dj0) obj2;
            if (!(dj0Var instanceof dj0.a)) {
                throw new IllegalStateException(("FL developer error. Wrong result type is provided to `DocumentProductResultRepository`: " + dj0Var).toString());
            }
            objA = a(((dj0.a) dj0Var).a());
        } else {
            if (!(thA instanceof si)) {
                throw new IllegalStateException(("FL developer error. Wrong error type is provided to `DocumentProductResultRepository`: " + thA).toString());
            }
            objA = a((si) thA);
        }
        onProductCompleted.onResult(objA);
    }

    private final Object a(ym ymVar) {
        m.Companion companion = yhm.m.INSTANCE;
        return ymVar;
    }

    private final Object a(si siVar) {
        m.Companion companion = yhm.m.INSTANCE;
        return yhm.o.a(siVar);
    }
}
