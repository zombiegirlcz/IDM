package u8e;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends ccb.j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l80.e f278192l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f278193m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xua.a f278194n;
    public final com.revolut.domain.interactors.transactions.a o;

    public j(l80.e dateProvider, n walletInteractor, xua.a recurringPaymentInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f278192l = dateProvider;
        this.f278193m = walletInteractor;
        this.f278194n = recurringPaymentInteractor;
        this.o = transactionsInteractor;
    }

    public static int b3(jli.c cVar, long j2) {
        switch (g.f278188a[cVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return 0;
            case 4:
                return oi0.d.Y(j2).getDayOfWeek().getValue();
            case 5:
                return oi0.d.Y(j2).getDayOfWeek().getValue();
            case 6:
                return oi0.d.Y(j2).getDayOfMonth();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // ccb.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(bcb.a r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof u8e.h
            if (r0 == 0) goto L14
            r0 = r10
            u8e.h r0 = (u8e.h) r0
            int r1 = r0.f278189w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f278189w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            u8e.h r0 = new u8e.h
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f278189w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r10)
            goto L54
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            yhm.o.b(r10)
            o9a.v r3 = new o9a.v
            r10 = 13
            r3.<init>(r8, r10)
            ku1.v r4 = new ku1.v
            r10 = 28
            r4.<init>(r8, r10)
            u8e.i r5 = new u8e.i
            r10 = 0
            r5.<init>(r8, r9, r10, r2)
            r6.f278189w = r2
            r2 = 0
            r7 = 1
            r1 = r8
            java.lang.Object r10 = n14.k.W(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L54
            return r0
        L54:
            nii.h r10 = (nii.h) r10
            boolean r9 = r10 instanceof nii.f
            if (r9 == 0) goto L65
            yhm.m$a r9 = yhm.m.INSTANCE
            nii.f r10 = (nii.f) r10
            java.lang.Throwable r9 = r10.f216146a
            yhm.n r9 = yhm.o.a(r9)
            return r9
        L65:
            boolean r9 = r10 instanceof nii.g
            if (r9 == 0) goto L6e
            yhm.m$a r9 = yhm.m.INSTANCE
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L6e:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u8e.j.Z2(bcb.a, gim.c):java.lang.Object");
    }
}
