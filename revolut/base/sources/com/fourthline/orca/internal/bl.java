package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.nfc.NfcScannerComposableKt;
import java.util.Date;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class bl {
    public final Function0 a(final qo flowConfig, final zc0 nfcCanFlowUseCase, final lq documentSupportsNfcUseCase, final gj documentDataBundle, final yj0 personBundle, final Context context) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        Intrinsics.checkNotNullParameter(nfcCanFlowUseCase, "nfcCanFlowUseCase");
        Intrinsics.checkNotNullParameter(documentSupportsNfcUseCase, "documentSupportsNfcUseCase");
        Intrinsics.checkNotNullParameter(documentDataBundle, "documentDataBundle");
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        Intrinsics.checkNotNullParameter(context, "context");
        return new Function0() { // from class: com.fourthline.orca.internal.oj1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(bl.a(flowConfig, context, nfcCanFlowUseCase, documentDataBundle, personBundle, documentSupportsNfcUseCase));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(qo qoVar, Context context, zc0 zc0Var, gj gjVar, yj0 yj0Var, lq lqVar) {
        Date dateC;
        if (qoVar.g().getEnabled() && NfcScannerComposableKt.isNfcSupported(context)) {
            boolean zA = zc0Var.a(gjVar.g());
            di diVarO = gjVar.o();
            boolean zA2 = (diVarO == null || (dateC = gjVar.f().c()) == null) ? false : lqVar.a(diVarO, dateC);
            boolean z = new sy0().a(gjVar, yj0Var) != null;
            if (!zA && zA2 && z) {
                return true;
            }
        }
        return false;
    }

    public final lq a() {
        return new lq();
    }
}
