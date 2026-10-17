package c55;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements m35.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b45.h f21440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f21441b;

    public g(b45.h loanAutopayInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(loanAutopayInteractor, "loanAutopayInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f21440a = loanAutopayInteractor;
        this.f21441b = userInteractor;
    }

    public final Serializable a(String str, gim.c cVar) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.f21440a.f(str, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f8, code lost:
    
        if (r1 == r3) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.credit.loan.api.models.rev10.LoanDetails r21, gim.c r22) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c55.g.b(com.revolut.feature.credit.loan.api.models.rev10.LoanDetails, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(q35.e0 r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof c55.f
            if (r0 == 0) goto L13
            r0 = r12
            c55.f r0 = (c55.f) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            c55.f r0 = new c55.f
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f21437x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r12)
            return r12
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            com.revolut.feature.credit.loan.api.models.rev10.LoanRepaymentAccountDetails r11 = r0.v
            yhm.o.b(r12)
            goto La1
        L3d:
            java.lang.String r11 = r0.f21436w
            com.revolut.feature.credit.loan.api.models.rev10.LoanRepaymentAccountDetails r2 = r0.v
            q35.e0 r5 = r0.u
            yhm.o.b(r12)
            r9 = r2
            r2 = r12
            r12 = r9
            goto L6e
        L4a:
            yhm.o.b(r12)
            com.revolut.feature.credit.loan.api.models.rev10.LoanRepaymentAccountDetails r12 = r11.f241811m
            if (r12 != 0) goto L52
            return r6
        L52:
            java.lang.String r2 = r11.f
            ang.f r7 = r10.f21441b
            r8 = 0
            efm.d0 r7 = r7.f(r8)
            r0.u = r11
            r0.v = r12
            r0.f21436w = r2
            r0.z = r5
            java.lang.Object r5 = nim.a.b(r7, r0)
            if (r5 != r1) goto L6a
            goto Lc5
        L6a:
            r9 = r5
            r5 = r11
            r11 = r2
            r2 = r9
        L6e:
            do3.n r2 = (do3.n) r2
            if (r11 == 0) goto L8d
            java.lang.String r2 = r2.f116408a
            boolean r2 = r11.equals(r2)
            if (r2 != 0) goto L8d
            java.lang.String r12 = r5.f241807g
            java.lang.String r0 = ""
            if (r12 != 0) goto L81
            r12 = r0
        L81:
            java.lang.String r1 = r5.f241808h
            if (r1 != 0) goto L86
            goto L87
        L86:
            r0 = r1
        L87:
            x35.a r1 = new x35.a
            r1.<init>(r11, r12, r0)
            return r1
        L8d:
            java.lang.String r11 = r12.f70176b
            r0.u = r6
            r0.v = r12
            r0.f21436w = r6
            r0.z = r4
            java.io.Serializable r11 = r10.a(r11, r0)
            if (r11 != r1) goto L9e
            goto Lc5
        L9e:
            r9 = r12
            r12 = r11
            r11 = r9
        La1:
            x35.e r12 = (x35.e) r12
            if (r12 != 0) goto Lc7
            java.lang.String r11 = r11.f70175a
            r0.u = r6
            r0.v = r6
            r0.f21436w = r6
            r0.z = r3
            if (r11 == 0) goto Lc3
            int r12 = r11.length()
            if (r12 != 0) goto Lb8
            goto Lc3
        Lb8:
            x35.h r12 = new x35.h
            r12.<init>(r11)
            b45.h r11 = r10.f21440a
            java.io.Serializable r6 = r11.b(r12, r0)
        Lc3:
            if (r6 != r1) goto Lc6
        Lc5:
            return r1
        Lc6:
            return r6
        Lc7:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: c55.g.c(q35.e0, gim.c):java.lang.Object");
    }
}
