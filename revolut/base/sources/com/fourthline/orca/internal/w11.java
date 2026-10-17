package com.fourthline.orca.internal;

import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.internal.dj0;
import com.fourthline.vision.selfie.SelfieScannerResult;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class w11 implements zq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OnProductCompleted f34492a;

    public w11(OnProductCompleted completionBlock) {
        Intrinsics.checkNotNullParameter(completionBlock, "completionBlock");
        this.f34492a = completionBlock;
    }

    @Override // com.fourthline.orca.internal.zq0
    public void a(Object obj2) {
        Object objA;
        OnProductCompleted onProductCompleted = this.f34492a;
        Throwable thA = yhm.m.a(obj2);
        if (thA == null) {
            dj0 dj0Var = (dj0) obj2;
            if (!(dj0Var instanceof dj0.b)) {
                throw new IllegalStateException(("FL developer error. Wrong result type is provided to `SelfieProductResultRepository`: " + dj0Var).toString());
            }
            objA = a(((dj0.b) dj0Var).a());
        } else {
            if (!(thA instanceof ui0)) {
                throw new IllegalStateException(("FL developer error. Wrong error type is provided to `SelfieProductResultRepository`: " + thA).toString());
            }
            objA = a((ui0) thA);
        }
        onProductCompleted.onResult(objA);
    }

    private final Object a(SelfieScannerResult selfieScannerResult) {
        m.Companion companion = yhm.m.INSTANCE;
        return selfieScannerResult;
    }

    private final Object a(ui0 ui0Var) {
        m.Companion companion = yhm.m.INSTANCE;
        return yhm.o.a(ui0Var);
    }
}
