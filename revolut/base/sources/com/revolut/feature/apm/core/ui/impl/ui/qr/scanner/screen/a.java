package com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen;

import com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.QrScanningScreenContract$ProcessingState;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends i implements Function3 {
    public /* synthetic */ xq2.a u;
    public /* synthetic */ QrScanningScreenContract$ProcessingState v;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        a aVar = new a(3, (Continuation) obj4);
        aVar.u = (xq2.a) obj2;
        aVar.v = (QrScanningScreenContract$ProcessingState) obj3;
        return aVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xq2.a aVar = this.u;
        QrScanningScreenContract$ProcessingState qrScanningScreenContract$ProcessingState = this.v;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (Intrinsics.f(qrScanningScreenContract$ProcessingState, QrScanningScreenContract$ProcessingState.Detecting.f62385a)) {
            return aVar;
        }
        return null;
    }
}
