package n3k;

import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreenContract$InputData;
import h2k.k;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements n5k.a {

    @NotNull
    public static final a Companion = new a();
    public static final Set f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemittanceAmountScreenContract$InputData f212178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a4k.a f212179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o3k.g f212180c;
    public final ang.f d;
    public final k e;

    static {
        wi0.b.Companion.getClass();
        f = y0.b(wi0.b.X0);
    }

    public g(RemittanceAmountScreenContract$InputData inputData, a4k.a transferDataObservable, o3k.g interactor, ang.f userInteractor, k priceComparisonDelegate) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transferDataObservable, "transferDataObservable");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(priceComparisonDelegate, "priceComparisonDelegate");
        this.f212178a = inputData;
        this.f212179b = transferDataObservable;
        this.f212180c = interactor;
        this.d = userInteractor;
        this.e = priceComparisonDelegate;
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
            boolean r0 = r5 instanceof n3k.d
            if (r0 == 0) goto L13
            r0 = r5
            n3k.d r0 = (n3k.d) r0
            int r1 = r0.f212174w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212174w = r1
            goto L18
        L13:
            n3k.d r0 = new n3k.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f212174w
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
            a4k.a r5 = r4.f212179b
            ihm.j r5 = r5.f255130a
            r0.f212174w = r3
            java.lang.Object r5 = nim.a.c(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData r5 = (com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData) r5
            xi0.b r5 = r5.f102051c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n3k.g.b(gim.c):java.lang.Object");
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
            boolean r0 = r5 instanceof n3k.e
            if (r0 == 0) goto L13
            r0 = r5
            n3k.e r0 = (n3k.e) r0
            int r1 = r0.f212175w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212175w = r1
            goto L18
        L13:
            n3k.e r0 = new n3k.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f212175w
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
            a4k.a r5 = r4.f212179b
            ihm.j r5 = r5.f255130a
            r0.f212175w = r3
            java.lang.Object r5 = nim.a.c(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData r5 = (com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData) r5
            xi0.b r5 = r5.f102050b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n3k.g.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // n5k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r32) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n3k.g.d(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ff  */
    @Override // n5k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.Continuation r27) {
        /*
            Method dump skipped, instruction units count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n3k.g.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(dj0.d r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof n3k.f
            if (r0 == 0) goto L13
            r0 = r6
            n3k.f r0 = (n3k.f) r0
            int r1 = r0.f212177x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212177x = r1
            goto L18
        L13:
            n3k.f r0 = new n3k.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f212177x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dj0.d r5 = r0.u
            yhm.o.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            ang.f r6 = r4.d
            r2 = 0
            efm.d0 r6 = r6.f(r2)
            r0.u = r5
            r0.f212177x = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            do3.n r6 = (do3.n) r6
            com.revolut.feature.address.models.Address r6 = r6.k
            if (r6 == 0) goto L5c
            java.lang.String r6 = r6.getCountry()
            if (r6 == 0) goto L5c
            wi0.a r0 = wi0.b.Companion
            r0.getClass()
            wi0.b r6 = wi0.a.a(r6)
            goto L5d
        L5c:
            r6 = 0
        L5d:
            com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreenContract$InputData r0 = r4.f212178a
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittancePaymentsCountryData r0 = r0.getF102028a()
            wi0.b r0 = r0.f101977a
            java.util.Set r1 = n3k.g.f
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r1 = zhm.d0.T(r1, r6)
            if (r1 == 0) goto L7b
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r0)
            if (r6 == 0) goto L7b
            l5k.g r6 = new l5k.g
            r6.<init>(r5, r0)
            return r6
        L7b:
            l5k.f r5 = l5k.f.f192329a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n3k.g.f(dj0.d, gim.c):java.lang.Object");
    }
}
