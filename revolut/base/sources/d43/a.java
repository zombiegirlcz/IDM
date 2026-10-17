package d43;

import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodInputData;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {
    public static final f0 a(SelectPaymentMethodInputData.UseCase useCase) {
        Intrinsics.checkNotNullParameter(useCase, "<this>");
        SelectPaymentMethodInputData.UseCase.UpdateExistingCardSettings updateExistingCardSettings = useCase instanceof SelectPaymentMethodInputData.UseCase.UpdateExistingCardSettings ? (SelectPaymentMethodInputData.UseCase.UpdateExistingCardSettings) useCase : null;
        if (updateExistingCardSettings != null) {
            return updateExistingCardSettings.f65248a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final x33.d b(java.util.ArrayList r6, xi0.b r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "baseCurrency"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L12
            goto L27
        L12:
            java.util.Iterator r0 = r6.iterator()
        L16:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r0.next()
            x33.a r2 = (x33.a) r2
            dj0.d r2 = r2.f302631b
            if (r2 == 0) goto L63
            goto L16
        L27:
            dj0.c r0 = dj0.d.Companion
            r0.getClass()
            dj0.d r0 = dj0.d.e
            java.util.Iterator r2 = r6.iterator()
            r3 = 0
        L33:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L5c
            java.lang.Object r4 = r2.next()
            int r5 = r3 + 1
            if (r3 < 0) goto L58
            if (r3 != 0) goto L4b
            x33.a r4 = (x33.a) r4
            dj0.d r0 = r4.f302631b
            kotlin.jvm.internal.Intrinsics.h(r0)
            goto L56
        L4b:
            x33.a r4 = (x33.a) r4
            dj0.d r3 = r4.f302631b
            kotlin.jvm.internal.Intrinsics.h(r3)
            dj0.d r0 = pyd.c.O(r0, r3)
        L56:
            r3 = r5
            goto L33
        L58:
            zhm.v.s()
            throw r1
        L5c:
            r1 = 0
            r3 = 1
            dj0.d r1 = dj0.d.c(r0, r1, r7, r3)
        L63:
            x33.d r7 = new x33.d
            r7.<init>(r6, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d43.a.b(java.util.ArrayList, xi0.b):x33.d");
    }
}
