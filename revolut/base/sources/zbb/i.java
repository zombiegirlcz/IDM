package zbb;

import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f320876a;

    public i(fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f320876a = configurationInteractor;
    }

    public final xi0.b a(g result) {
        Intent intent;
        Bundle extras;
        String string;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.f320871b != -1 || result.f320870a != 9999 || (intent = result.f320872c) == null || (extras = intent.getExtras()) == null || (string = extras.getString("argCurrency")) == null) {
            return null;
        }
        xi0.b.Companion.getClass();
        return xi0.a.a(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(xi0.b r19, zbb.f r20, gim.c r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            boolean r2 = r1 instanceof zbb.h
            if (r2 == 0) goto L17
            r2 = r1
            zbb.h r2 = (zbb.h) r2
            int r3 = r2.f320875y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f320875y = r3
            goto L1c
        L17:
            zbb.h r2 = new zbb.h
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f320873w
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f320875y
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L39
            if (r4 != r6) goto L31
            zbb.f r3 = r2.v
            xi0.b r2 = r2.u
            yhm.o.b(r1)
            r8 = r2
            goto L77
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            yhm.o.b(r1)
            e7l.g$b r1 = e7l.g.b.f123407a
            fk3.a r4 = r0.f320876a
            ik3.c r4 = (ik3.c) r4
            efm.r r1 = r4.k(r1)
            z8h.b r4 = new z8h.b
            r7 = 27
            r4.<init>(r7)
            efm.r r1 = nim.a.w(r1, r4)
            z8d.h r4 = new z8d.h
            r7 = 7
            r4.<init>(r7)
            efm.r r1 = m70.a.g(r1, r5, r4, r6)
            efm.d0 r1 = r1.firstOrError()
            java.lang.String r4 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            r4 = r19
            r2.u = r4
            r7 = r20
            r2.v = r7
            r2.f320875y = r6
            java.lang.Object r1 = nim.a.b(r1, r2)
            if (r1 != r3) goto L75
            return r3
        L75:
            r8 = r4
            r3 = r7
        L77:
            r10 = r1
            java.util.Set r10 = (java.util.Set) r10
            io3.l r9 = io3.l.CURRENT
            java.util.Set r12 = r3.f320869a
            com.revolut.core.ui_kit.models.TextLocalisedClause r13 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.retail.savings.api.R$string.savings_account_picker_add_money_title
            r2 = 14
            r13.<init>(r1, r5, r5, r2)
            com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination$StartType$BalancePicker r6 = new com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination$StartType$BalancePicker
            java.lang.Integer r15 = new java.lang.Integer
            r1 = 9999(0x270f, float:1.4012E-41)
            r15.<init>(r1)
            r16 = 0
            r17 = 1065(0x429, float:1.492E-42)
            r7 = 0
            r11 = 0
            r14 = 1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zbb.i.b(xi0.b, zbb.f, gim.c):java.lang.Object");
    }
}
