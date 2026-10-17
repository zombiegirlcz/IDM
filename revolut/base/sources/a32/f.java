package a32;

import com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmPaymentAuthorisationNavigation$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmPaymentAuthorisationNavigation$InputData f1022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g32.b f1023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x02.a f1024c;
    public final x02.b d;
    public final vo9.a e;

    public f(ApmPaymentAuthorisationNavigation$InputData inputData, g32.b validator, x02.a pocketInteractor, x02.b quoteInteractor, vo9.a pocketMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(pocketInteractor, "pocketInteractor");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        this.f1022a = inputData;
        this.f1023b = validator;
        this.f1024c = pocketInteractor;
        this.d = quoteInteractor;
        this.e = pocketMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof a32.a
            if (r0 == 0) goto L13
            r0 = r10
            a32.a r0 = (a32.a) r0
            int r1 = r0.f1007y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1007y = r1
            goto L18
        L13:
            a32.a r0 = new a32.a
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f1005w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f1007y
            com.revolut.core.model.account.AccountId$Personal r8 = com.revolut.core.model.account.AccountId.Personal.f51414a
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            long r1 = r0.v
            xi0.b r0 = r0.u
            yhm.o.b(r10)
            r7 = r0
            r5 = r1
            goto L5e
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L37:
            yhm.o.b(r10)
            com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmPaymentAuthorisationNavigation$InputData r10 = r9.f1022a
            com.revolut.feature.apm.core.models.payments_authorisations.ui.ApmPaymentAuthorisationUi r10 = r10.d
            com.revolut.feature.apm.core.models.payments_authorisations.ui.ApmPaymentAuthorisationUi$MerchantInfo r10 = r10.f62087b
            dj0.d r10 = r10.f62090c
            if (r10 != 0) goto L46
            r10 = 0
            return r10
        L46:
            long r4 = r10.f115082a
            xi0.b r10 = r10.f115083b
            r0.u = r10
            r0.v = r4
            r0.f1007y = r3
            x02.a r2 = r9.f1024c
            q12.d r2 = (q12.d) r2
            java.lang.Object r0 = r2.c(r8, r0, r10)
            if (r0 != r1) goto L5b
            return r1
        L5b:
            r7 = r10
            r10 = r0
            r5 = r4
        L5e:
            r4 = r10
            com.revolut.feature.transfer.core.models.PocketSource r4 = (com.revolut.feature.transfer.core.models.PocketSource) r4
            z22.a r3 = new z22.a
            r3.<init>(r4, r5, r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a32.f.a(gim.c):java.lang.Object");
    }
}
