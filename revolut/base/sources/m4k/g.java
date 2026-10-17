package m4k;

import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.models.quotes.CreditCardInterest;
import com.revolut.feature.transfer.models.quotes.CreditCardInterestPromotion;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import f2k.p;
import h2k.k;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements n5k.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Set f202755h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BankTransferFlowInputData f202756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b5k.a f202757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p4k.g f202758c;
    public final ang.f d;
    public final j9l.a e;
    public final k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gte.a f202759g;

    static {
        wi0.b.Companion.getClass();
        f202755h = y0.b(wi0.b.X0);
    }

    public g(BankTransferFlowInputData inputData, b5k.a transferDataObservable, p4k.g flowInteractor, ang.f userInteractor, j9l.a moneyCalculator, l80.e dateProvider, h transferQuoteChargesMerger, k priceComparisonDelegate, gte.a featureToggleInteractor, p upgradeEntryPointContextFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transferDataObservable, "transferDataObservable");
        Intrinsics.checkNotNullParameter(flowInteractor, "flowInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(transferQuoteChargesMerger, "transferQuoteChargesMerger");
        Intrinsics.checkNotNullParameter(priceComparisonDelegate, "priceComparisonDelegate");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(upgradeEntryPointContextFactory, "upgradeEntryPointContextFactory");
        this.f202756a = inputData;
        this.f202757b = transferDataObservable;
        this.f202758c = flowInteractor;
        this.d = userInteractor;
        this.e = moneyCalculator;
        this.f = priceComparisonDelegate;
        this.f202759g = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // n5k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof m4k.d
            if (r0 == 0) goto L13
            r0 = r5
            m4k.d r0 = (m4k.d) r0
            int r1 = r0.f202750w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f202750w = r1
            goto L18
        L13:
            m4k.d r0 = new m4k.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f202750w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            b5k.a r5 = r4.f202757b
            ihm.j r5 = r5.f255130a
            r0.f202750w = r3
            java.lang.Object r5 = nim.a.c(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r5 = (com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData) r5
            xi0.b r5 = r5.f101926c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m4k.g.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // n5k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof m4k.e
            if (r0 == 0) goto L13
            r0 = r5
            m4k.e r0 = (m4k.e) r0
            int r1 = r0.f202751w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f202751w = r1
            goto L18
        L13:
            m4k.e r0 = new m4k.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f202751w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            b5k.a r5 = r4.f202757b
            ihm.j r5 = r5.f255130a
            r0.f202751w = r3
            java.lang.Object r5 = nim.a.c(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r5 = (com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData) r5
            xi0.b r5 = r5.f101925b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m4k.g.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // n5k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r26) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4k.g.d(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    @Override // n5k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.Continuation r32) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4k.g.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean f(FundingSource fundingSource, kq2.f fVar) {
        CreditCardInterestPromotion creditCardInterestPromotion;
        CreditCardInterest creditCardInterest = fVar.o;
        boolean z = creditCardInterest != null && creditCardInterest.f92271a.k();
        Long lValueOf = (creditCardInterest == null || (creditCardInterestPromotion = creditCardInterest.d) == null) ? null : Long.valueOf(creditCardInterestPromotion.f92274a);
        return (!fundingSource.c() || z || (lValueOf != null && (lValueOf.longValue() > System.currentTimeMillis() ? 1 : (lValueOf.longValue() == System.currentTimeMillis() ? 0 : -1)) > 0)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kq2.a r5, dj0.d r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof m4k.f
            if (r0 == 0) goto L13
            r0 = r7
            m4k.f r0 = (m4k.f) r0
            int r1 = r0.f202754y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f202754y = r1
            goto L18
        L13:
            m4k.f r0 = new m4k.f
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f202752w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f202754y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            dj0.d r6 = r0.v
            kq2.a r5 = r0.u
            yhm.o.b(r7)
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r7)
            ang.f r7 = r4.d
            r2 = 0
            efm.d0 r7 = r7.f(r2)
            r0.u = r5
            r0.v = r6
            r0.f202754y = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            do3.n r7 = (do3.n) r7
            com.revolut.feature.address.models.Address r7 = r7.k
            if (r7 == 0) goto L60
            java.lang.String r7 = r7.getCountry()
            if (r7 == 0) goto L60
            wi0.a r0 = wi0.b.Companion
            r0.getClass()
            wi0.b r7 = wi0.a.a(r7)
            goto L61
        L60:
            r7 = 0
        L61:
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData r0 = r4.f202756a
            f5j.a r0 = r0.getF101940a()
            wi0.b r0 = f5j.c.e(r0)
            kq2.l r5 = r5.f188291b
            kq2.l r1 = kq2.l.LOCAL_TRANSFER
            if (r5 == r1) goto L85
            java.util.Set r5 = m4k.g.f202755h
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r5 = zhm.d0.T(r5, r7)
            if (r5 == 0) goto L82
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r7, r0)
            if (r5 == 0) goto L82
            goto L85
        L82:
            l5k.f r5 = l5k.f.f192329a
            return r5
        L85:
            l5k.g r5 = new l5k.g
            r5.<init>(r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m4k.g.g(kq2.a, dj0.d, gim.c):java.lang.Object");
    }
}
