package wjd;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends cki.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wl0.c f298041m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f298042n;

    public d(wl0.c biometricHelper) {
        Intrinsics.checkNotNullParameter(biometricHelper, "biometricHelper");
        this.f298041m = biometricHelper;
        this.f298042n = new a(new Data(null, null, false, 7, null));
    }

    @Override // cki.a
    public final Object Z2() {
        return this.f298042n;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(gim.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof wjd.c
            if (r0 == 0) goto L13
            r0 = r8
            wjd.c r0 = (wjd.c) r0
            int r1 = r0.f298040x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f298040x = r1
            goto L18
        L13:
            wjd.c r0 = new wjd.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f298040x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            wl0.o r0 = r0.u
            yhm.o.b(r8)
            goto L7b
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            yhm.o.b(r8)
            wl0.c r8 = r7.f298041m
            wl0.o r2 = r8.d()
            wl0.o r4 = wl0.o.NONE
            if (r2 != r4) goto L49
            wgk.f r8 = new wgk.f
            r0 = 26
            r8.<init>(r0)
            r7.d3(r8)
            goto L8f
        L49:
            rm0.j r8 = r8.c()
            boolean r8 = r8 instanceof rm0.d
            if (r8 == 0) goto L5b
            wjd.b r8 = new wjd.b
            r0 = 0
            r8.<init>()
            r7.d3(r8)
            goto L8f
        L5b:
            wgk.f r8 = new wgk.f
            r4 = 27
            r8.<init>(r4)
            r7.d3(r8)
            elm.g r8 = skm.p0.f264002b
            w65.c r4 = new w65.c
            r5 = 26
            r6 = 0
            r4.<init>(r7, r6, r5)
            r0.u = r2
            r0.f298040x = r3
            java.lang.Object r8 = skm.e0.J(r8, r4, r0)
            if (r8 != r1) goto L7a
            return r1
        L7a:
            r0 = r2
        L7b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L84
            goto L86
        L84:
            wl0.o r0 = wl0.o.NONE
        L86:
            wjd.b r8 = new wjd.b
            r1 = 1
            r8.<init>()
            r7.d3(r8)
        L8f:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wjd.d.e3(gim.c):java.lang.Object");
    }
}
