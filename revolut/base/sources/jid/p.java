package jid;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.z1;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    @NotNull
    private static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lvb.d f174446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nyb.k f174447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f174448c;
    public final z1 d;

    public p(lvb.d exclusiveStoreAuctionsInteractor, nyb.k revPointsInteractor) {
        Intrinsics.checkNotNullParameter(exclusiveStoreAuctionsInteractor, "exclusiveStoreAuctionsInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        this.f174446a = exclusiveStoreAuctionsInteractor;
        this.f174447b = revPointsInteractor;
        z1 z1VarB = vkm.q.b(1, 5, null);
        this.f174448c = z1VarB;
        this.d = z1VarB;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, double r9, gim.c r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof jid.m
            if (r0 == 0) goto L13
            r0 = r11
            jid.m r0 = (jid.m) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            jid.m r0 = new jid.m
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.f174440x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            jid.g r8 = r0.v
            yhm.o.b(r11)
            return r8
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            double r8 = r0.f174439w
            yhm.o.b(r11)
            goto L6e
        L3e:
            double r9 = r0.f174439w
            java.lang.String r8 = r0.u
            yhm.o.b(r11)
            goto L5e
        L46:
            yhm.o.b(r11)
            com.revolut.feature.rev_points.models.RevPoints r11 = qvb.a.a(r9)
            r0.u = r8
            r0.f174439w = r9
            r0.z = r5
            lvb.d r2 = r7.f174446a
            ivb.f r2 = r2.f200356a
            java.lang.Object r11 = r2.a(r8, r11, r0)
            if (r11 != r1) goto L5e
            goto L89
        L5e:
            java.lang.String r11 = (java.lang.String) r11
            r0.u = r6
            r0.f174439w = r9
            r0.z = r4
            java.lang.Object r11 = r7.b(r8, r11, r0)
            if (r11 != r1) goto L6d
            goto L89
        L6d:
            r8 = r9
        L6e:
            jid.j r11 = (jid.j) r11
            boolean r10 = r11 instanceof jid.g
            if (r10 == 0) goto L8a
            kotlin.Unit r10 = kotlin.Unit.f186387a
            r0.u = r6
            r2 = r11
            jid.g r2 = (jid.g) r2
            r0.v = r2
            r0.f174439w = r8
            r0.z = r3
            vkm.z1 r8 = r7.f174448c
            java.lang.Object r8 = r8.emit(r10, r0)
            if (r8 != r1) goto L8a
        L89:
            return r1
        L8a:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: jid.p.a(java.lang.String, double, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00f4 -> B:48:0x00f6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r13, java.lang.String r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jid.p.b(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
