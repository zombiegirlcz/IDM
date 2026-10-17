package kr1;

import efm.d0;
import g12.l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import te0.w;
import xo9.h;
import xo9.i;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements i, l {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jr1.e f188632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final er1.b f188633b;

    public e(jr1.e interactor, er1.b postalCheckFeatureChecker) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(postalCheckFeatureChecker, "postalCheckFeatureChecker");
        this.f188632a = interactor;
        this.f188633b = postalCheckFeatureChecker;
    }

    @Override // xo9.i
    public final d0 a(h parsingResult) {
        Intrinsics.checkNotNullParameter(parsingResult, "parsingResult");
        return w.o0(p0.f264003c, new c(this, (b) parsingResult, null));
    }

    @Override // xo9.i
    public final d0 b(xq2.a code) {
        Intrinsics.checkNotNullParameter(code, "code");
        if (!this.f188633b.a()) {
            return d0.l(new IllegalArgumentException("Postal Check QR code is not supported"));
        }
        int i = 2;
        return new ufm.c(new e3j.b(this, code, i), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // g12.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(xq2.a r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kr1.d
            if (r0 == 0) goto L13
            r0 = r6
            kr1.d r0 = (kr1.d) r0
            int r1 = r0.f188631w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f188631w = r1
            goto L1a
        L13:
            kr1.d r0 = new kr1.d
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f188631w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            if (r5 == 0) goto L4d
            java.lang.String r5 = r5.f308049a
            if (r5 == 0) goto L4d
            r0.f188631w = r3
            jr1.e r6 = r4.f188632a
            java.lang.Object r6 = r6.c(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            com.revolut.feature.apm.bills.postal_check.api.domain.PostalCheckQrScanResult r6 = (com.revolut.feature.apm.bills.postal_check.api.domain.PostalCheckQrScanResult) r6
            kr1.f r5 = new kr1.f
            r5.<init>(r6)
            return r5
        L4d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Null Barcode"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kr1.e.c(xq2.a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
