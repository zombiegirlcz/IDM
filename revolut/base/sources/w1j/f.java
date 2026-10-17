package w1j;

import aah.m;
import kotlin.jvm.internal.Intrinsics;
import ybl.l;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f293880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f293881b;

    public f(l tradingConfigInteractor, m wealthDisclaimerFactory) {
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(wealthDisclaimerFactory, "wealthDisclaimerFactory");
        this.f293880a = tradingConfigInteractor;
        this.f293881b = wealthDisclaimerFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum a(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof w1j.d
            if (r0 == 0) goto L13
            r0 = r8
            w1j.d r0 = (w1j.d) r0
            int r1 = r0.f293878w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f293878w = r1
            goto L18
        L13:
            w1j.d r0 = new w1j.d
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f293878w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L5b
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            yhm.o.b(r8)
            ybl.l r8 = r7.f293880a
            akg.n r8 = ybl.l.d(r8)
            vv7.l r2 = new vv7.l
            r4 = 24
            r2.<init>(r4)
            r4 = 0
            jhi.b r8 = mo3.a.g(r8, r4, r2, r3)
            vge.f1 r2 = new vge.f1
            r5 = 3
            r6 = 13
            r2.<init>(r5, r6, r4)
            zhm.h0 r4 = zhm.h0.f322473a
            vkm.y r8 = rd0.e.e(r8, r4, r2)
            r0.f293878w = r3
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation r8 = (com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation) r8
            hel.b r8 = r8.f105106a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w1j.f.a(gim.c):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof w1j.e
            if (r0 == 0) goto L13
            r0 = r5
            w1j.e r0 = (w1j.e) r0
            int r1 = r0.f293879w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f293879w = r1
            goto L18
        L13:
            w1j.e r0 = new w1j.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f293879w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f293879w = r3
            java.lang.Enum r5 = r4.a(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            hel.b r5 = (hel.b) r5
            if (r5 != 0) goto L41
            r5 = 0
            return r5
        L41:
            com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment$TransferBalancePickerFooter r0 = new com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment$TransferBalancePickerFooter
            r0.<init>(r5)
            java.util.List r0 = zhm.u.c(r0)
            aah.m r1 = r4.f293881b
            com.revolut.core.ui_kit.models.CompositeClause r5 = z0h.q1.a(r1, r0, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w1j.f.b(gim.c):java.lang.Object");
    }
}
