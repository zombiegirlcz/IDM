package mfc;

import ang.f;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements xa1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ab1.a f204988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f204989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w39.b f204990c;
    public final n d;

    public c(ab1.a cardReaderOrderRepository, f userInteractor, w39.b locationInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(cardReaderOrderRepository, "cardReaderOrderRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f204988a = cardReaderOrderRepository;
        this.f204989b = userInteractor;
        this.f204990c = locationInteractor;
        this.d = walletInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.address.models.Address r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mfc.a
            if (r0 == 0) goto L13
            r0 = r6
            mfc.a r0 = (mfc.a) r0
            int r1 = r0.f204985w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204985w = r1
            goto L18
        L13:
            mfc.a r0 = new mfc.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204985w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            w39.b r6 = r4.f204990c
            z39.b r6 = (z39.b) r6
            rfm.w r5 = r6.d(r5)
            r0.f204985w = r3
            java.lang.Object r6 = nim.a.i(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            com.revolut.feature.location.api.domain.models.location.LocationDomain r6 = (com.revolut.feature.location.api.domain.models.location.LocationDomain) r6
            if (r6 == 0) goto L51
            ya1.l r5 = new ya1.l
            double r0 = r6.f78066a
            double r2 = r6.f78067b
            r5.<init>(r0, r2)
            return r5
        L51:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mfc.c.b(com.revolut.feature.address.models.Address, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(ya1.a r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof mfc.b
            if (r0 == 0) goto L13
            r0 = r8
            mfc.b r0 = (mfc.b) r0
            int r1 = r0.f204987x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204987x = r1
            goto L18
        L13:
            mfc.b r0 = new mfc.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204987x
            ab1.a r3 = r6.f204988a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r8)
            return r8
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            ya1.a r7 = r0.u
            yhm.o.b(r8)
            goto L4b
        L3a:
            yhm.o.b(r8)
            r0.u = r7
            r0.f204987x = r5
            r8 = r3
            jfc.h r8 = (jfc.h) r8
            java.lang.Object r8 = r8.c(r7, r0)
            if (r8 != r1) goto L4b
            goto L63
        L4b:
            ya1.b r8 = (ya1.b) r8
            ya1.e r2 = new ya1.e
            java.lang.String r8 = r8.f311889a
            java.lang.String r7 = r7.e
            r2.<init>(r8, r7)
            r7 = 0
            r0.u = r7
            r0.f204987x = r4
            jfc.h r3 = (jfc.h) r3
            java.lang.Object r7 = r3.d(r2, r0)
            if (r7 != r1) goto L64
        L63:
            return r1
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mfc.c.c(ya1.a, gim.c):java.lang.Object");
    }
}
