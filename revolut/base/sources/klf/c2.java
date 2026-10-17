package klf;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class c2 {

    @NotNull
    private static final a2 Companion = new a2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f185459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f185460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final stc.e f185461c;
    public final Lazy d;

    public c2(CoroutineScope coroutineScope, h0 commonDataSource, stc.e securityDelayItemProvider) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(securityDelayItemProvider, "securityDelayItemProvider");
        this.f185459a = coroutineScope;
        this.f185460b = commonDataSource;
        this.f185461c = securityDelayItemProvider;
        this.d = yhm.j.b(new k98.a(this, 21));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (skm.k0.b(1000, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof klf.b2
            if (r0 == 0) goto L13
            r0 = r7
            klf.b2 r0 = (klf.b2) r0
            int r1 = r0.f185449w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f185449w = r1
            goto L18
        L13:
            klf.b2 r0 = new klf.b2
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f185449w
            klf.h0 r3 = r6.f185460b
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r7)
            goto L5e
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            yhm.o.b(r7)
            goto L53
        L38:
            yhm.o.b(r7)
            java.lang.String r7 = r3.f185494j
            r0.f185449w = r5
            stc.e r2 = r6.f185461c
            r10.r r2 = (r10.r) r2
            java.lang.Object r2 = r2.f250851a
            ufm.d r2 = (ufm.d) r2
            java.lang.Object r7 = r2.k(r7, r0)
            if (r7 != r1) goto L4e
            goto L50
        L4e:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L50:
            if (r7 != r1) goto L53
            goto L5d
        L53:
            r0.f185449w = r4
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r7 = skm.k0.b(r4, r0)
            if (r7 != r1) goto L5e
        L5d:
            return r1
        L5e:
            r3.k()
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: klf.c2.a(gim.c):java.lang.Object");
    }
}
