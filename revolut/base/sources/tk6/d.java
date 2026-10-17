package tk6;

import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import wsg.n;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oz1.j f271891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x02.b f271892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x02.a f271893c;
    public final n d;

    public d(oz1.j authorisationsInteractor, x02.b quoteInteractor, x02.a apmPocketInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(authorisationsInteractor, "authorisationsInteractor");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(apmPocketInteractor, "apmPocketInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f271891a = authorisationsInteractor;
        this.f271892b = quoteInteractor;
        this.f271893c = apmPocketInteractor;
        this.d = walletInteractor;
    }

    public final Object a(String str, fo3.d dVar, c cVar) {
        return q.z(new t38.e(mo3.a.g(nim.a.y(zi0.c.w(rd0.e.b(this.d.g0(dVar, w4l.h.f294642c, null))), new tif.g(16)), null, null, 3), str, dVar), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(dj0.d r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof tk6.b
            if (r0 == 0) goto L13
            r0 = r10
            tk6.b r0 = (tk6.b) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            tk6.b r0 = new tk6.b
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f271887x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r10)
            return r10
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection$Outgoing r9 = r0.f271886w
            x02.b r2 = r0.v
            dj0.d r4 = r0.u
            yhm.o.b(r10)
            goto L68
        L3d:
            yhm.o.b(r10)
            com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection$Outgoing r10 = new com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection$Outgoing
            com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod$PSE r2 = com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod.PSE.f62175a
            r10.<init>(r2)
            com.revolut.feature.transfer.core.models.TransferMoneyPocket r2 = new com.revolut.feature.transfer.core.models.TransferMoneyPocket
            r6 = 3
            r2.<init>(r5, r5, r6)
            xi0.b r6 = r9.f115083b
            r0.u = r9
            x02.b r7 = r8.f271892b
            r0.v = r7
            r0.f271886w = r10
            r0.z = r4
            x02.a r4 = r8.f271893c
            q12.d r4 = (q12.d) r4
            java.lang.Object r2 = r4.b(r2, r6, r0)
            if (r2 != r1) goto L64
            goto La2
        L64:
            r4 = r9
            r9 = r10
            r10 = r2
            r2 = r7
        L68:
            com.revolut.feature.transfer.core.models.FundingSource r10 = (com.revolut.feature.transfer.core.models.FundingSource) r10
            com.revolut.feature.external_accounts.impl.ui.colombia.pse.auth_request.PseTransferData r6 = new com.revolut.feature.external_accounts.impl.ui.colombia.pse.auth_request.PseTransferData
            r6.<init>(r10, r4)
            r0.u = r5
            r0.v = r5
            r0.f271886w = r5
            r0.z = r3
            q12.f r2 = (q12.f) r2
            r2.getClass()
            if (r9 == 0) goto La4
            com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod r9 = r9.f62094a
            if (r9 != 0) goto L84
            r3 = r5
            goto L95
        L84:
            com.revolut.feature.transfer.core.models.FundingSource r10 = r6.getF72728a()
            com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentSource r10 = oc.c.u(r10)
            t02.g r3 = new t02.g
            dj0.d r4 = r6.getF72729b()
            r3.<init>(r10, r9, r4, r5)
        L95:
            if (r3 != 0) goto L98
            goto La0
        L98:
            yw1.b r9 = r2.f241322a
            iz1.q r9 = (iz1.q) r9
            java.lang.Object r5 = r9.a(r3, r0)
        La0:
            if (r5 != r1) goto La3
        La2:
            return r1
        La3:
            return r5
        La4:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tk6.d.b(dj0.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof tk6.c
            if (r0 == 0) goto L13
            r0 = r7
            tk6.c r0 = (tk6.c) r0
            int r1 = r0.f271890x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f271890x = r1
            goto L18
        L13:
            tk6.c r0 = new tk6.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f271890x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L48
        L38:
            yhm.o.b(r7)
            fo3.d r7 = fo3.d.PERSONAL
            r0.u = r6
            r0.f271890x = r4
            java.lang.Object r7 = r5.a(r6, r7, r0)
            if (r7 != r1) goto L48
            goto L59
        L48:
            com.revolut.feature.external_accounts.impl.ui.colombia.pse.auth_request.PseAuthorisationRequestPaymentFrom r7 = (com.revolut.feature.external_accounts.impl.ui.colombia.pse.auth_request.PseAuthorisationRequestPaymentFrom) r7
            if (r7 != 0) goto L5b
            fo3.d r7 = fo3.d.PERSONAL_JOINT
            r2 = 0
            r0.u = r2
            r0.f271890x = r3
            java.lang.Object r6 = r5.a(r6, r7, r0)
            if (r6 != r1) goto L5a
        L59:
            return r1
        L5a:
            return r6
        L5b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tk6.d.c(java.lang.String, gim.c):java.lang.Object");
    }
}
