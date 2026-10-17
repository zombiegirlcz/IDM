package zsa;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cta.c f324860a;

    public d(cta.c repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f324860a = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r9, gim.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof zsa.c
            if (r0 == 0) goto L13
            r0 = r10
            zsa.c r0 = (zsa.c) r0
            int r1 = r0.f324859y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f324859y = r1
            goto L18
        L13:
            zsa.c r0 = new zsa.c
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f324857w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f324859y
            r3 = 0
            cta.c r4 = r8.f324860a
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L3e
            if (r2 == r6) goto L38
            if (r2 != r5) goto L30
            java.lang.Object r9 = r0.v
            yhm.o.b(r10)
            return r9
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.String r9 = r0.u
            yhm.o.b(r10)
            goto L5d
        L3e:
            yhm.o.b(r10)
            r0.u = r9
            r0.f324859y = r6
            r4.getClass()
            cta.b r10 = new cta.b
            r10.<init>(r4, r9, r7, r3)
            c34.d r2 = new c34.d
            r2.<init>(r10, r4, r9, r7)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r10, r2, r0)
            if (r10 != r1) goto L5d
            goto L73
        L5d:
            r2 = r10
            com.revolut.feature.raffle.impl.data.models.b r2 = (com.revolut.feature.raffle.impl.data.models.b) r2
            r0.u = r7
            r0.v = r10
            r0.f324859y = r5
            x4l.c r2 = r4.d
            java.lang.Object r9 = r2.d(r9, r3, r0)
            if (r9 != r1) goto L6f
            goto L71
        L6f:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L71:
            if (r9 != r1) goto L74
        L73:
            return r1
        L74:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: zsa.d.a(java.lang.String, gim.c):java.lang.Object");
    }
}
