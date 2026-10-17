package kye;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class w3 implements q3 {

    @NotNull
    public static final r3 Companion = new r3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f190865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y51.a f190866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eye.g f190867c;
    public final eye.b d;
    public final wsg.n e;
    public final t21.a f;

    public w3(fk3.a configurationInteractor, y51.a externalCardsInteractor, eye.g topupMoneyUtils, eye.b moneyParser, wsg.n walletInteractor, t21.a ratesRepository) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(externalCardsInteractor, "externalCardsInteractor");
        Intrinsics.checkNotNullParameter(topupMoneyUtils, "topupMoneyUtils");
        Intrinsics.checkNotNullParameter(moneyParser, "moneyParser");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesRepository, "ratesRepository");
        this.f190865a = configurationInteractor;
        this.f190866b = externalCardsInteractor;
        this.f190867c = topupMoneyUtils;
        this.d = moneyParser;
        this.e = walletInteractor;
        this.f = ratesRepository;
    }

    public static List c(long j2, xi0.b bVar) {
        return zhm.v.k(new dj0.d(((long) 2) * j2, bVar), new dj0.d(((long) 5) * j2, bVar), new dj0.d(((long) 10) * j2, bVar), new dj0.d(j2 * ((long) 20), bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005f, B:25:0x006a, B:27:0x0070), top: B:33:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[Catch: Exception -> 0x002b, TRY_LEAVE, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005f, B:25:0x006a, B:27:0x0070), top: B:33:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r13, com.revolut.feature.topup_screen.common.TopUpTarget r14, gim.c r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof kye.s3
            if (r0 == 0) goto L13
            r0 = r15
            kye.s3 r0 = (kye.s3) r0
            int r1 = r0.f190834x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f190834x = r1
            goto L18
        L13:
            kye.s3 r0 = new kye.s3
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f190834x
            r3 = 0
            r5 = 1
            if (r2 == 0) goto L36
            if (r2 != r5) goto L2e
            xi0.b r13 = r0.u
            yhm.o.b(r15)     // Catch: java.lang.Exception -> L2b
            goto L5f
        L2b:
            r0 = move-exception
            r14 = r0
            goto L86
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            yhm.o.b(r15)
            xi0.a r15 = xi0.b.Companion
            r15.getClass()
            xi0.b r7 = xi0.a.a(r13)
            wsg.n r6 = r12.e     // Catch: java.lang.Exception -> L83
            io3.l r8 = e1f.c.b(r14)     // Catch: java.lang.Exception -> L83
            com.revolut.core.model.account.AccountId r10 = e1f.c.a(r14)     // Catch: java.lang.Exception -> L83
            r11 = 28
            r9 = 0
            efm.d0 r13 = osg.b.r(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L83
            r0.u = r7     // Catch: java.lang.Exception -> L83
            r0.f190834x = r5     // Catch: java.lang.Exception -> L83
            java.lang.Object r15 = nim.a.b(r13, r0)     // Catch: java.lang.Exception -> L83
            if (r15 != r1) goto L5e
            return r1
        L5e:
            r13 = r7
        L5f:
            io3.d r15 = (io3.d) r15     // Catch: java.lang.Exception -> L2b
            io3.c r14 = io3.d.Companion     // Catch: java.lang.Exception -> L2b
            r14.getClass()     // Catch: java.lang.Exception -> L2b
            io3.d r14 = io3.d.f163144x     // Catch: java.lang.Exception -> L2b
            if (r15 != r14) goto L70
            dj0.d r14 = new dj0.d     // Catch: java.lang.Exception -> L2b
            r14.<init>(r3, r13)     // Catch: java.lang.Exception -> L2b
            return r14
        L70:
            dj0.d r14 = new dj0.d     // Catch: java.lang.Exception -> L2b
            long r0 = r15.i     // Catch: java.lang.Exception -> L2b
            xi0.a r2 = xi0.b.Companion     // Catch: java.lang.Exception -> L2b
            java.lang.String r15 = r15.f163147c     // Catch: java.lang.Exception -> L2b
            r2.getClass()     // Catch: java.lang.Exception -> L2b
            xi0.b r15 = xi0.a.a(r15)     // Catch: java.lang.Exception -> L2b
            r14.<init>(r0, r15)     // Catch: java.lang.Exception -> L2b
            return r14
        L83:
            r0 = move-exception
            r14 = r0
            r13 = r7
        L86:
            zhm.h0 r15 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r14, r15)
            dj0.d r14 = new dj0.d
            r14.<init>(r3, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kye.w3.a(java.lang.String, com.revolut.feature.topup_screen.common.TopUpTarget, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(xi0.b r22, com.revolut.feature.topup_screen.common.TopUpTarget r23, gim.c r24) {
        /*
            Method dump skipped, instruction units count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kye.w3.b(xi0.b, com.revolut.feature.topup_screen.common.TopUpTarget, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r12, com.revolut.feature.topup_screen.common.TopUpTarget r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kye.w3.d(java.lang.String, com.revolut.feature.topup_screen.common.TopUpTarget, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(dj0.d r17, long r18, dj0.d r20, xi0.b r21, gim.c r22) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r0 = r20
            r3 = r21
            r4 = r22
            boolean r5 = r4 instanceof kye.v3
            if (r5 == 0) goto L1d
            r5 = r4
            kye.v3 r5 = (kye.v3) r5
            int r6 = r5.f190860y
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L1d
            int r6 = r6 - r7
            r5.f190860y = r6
            goto L22
        L1d:
            kye.v3 r5 = new kye.v3
            r5.<init>(r1, r4)
        L22:
            java.lang.Object r4 = r5.f190858w
            fim.a r6 = fim.a.COROUTINE_SUSPENDED
            int r7 = r5.f190860y
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r12 = 1
            r13 = 0
            if (r7 == 0) goto L49
            if (r7 != r12) goto L41
            dj0.d r0 = r5.v
            dj0.d r2 = r5.u
            yhm.o.b(r4)     // Catch: java.lang.Exception -> L3d java.util.concurrent.CancellationException -> L3f
            goto L80
        L3d:
            r0 = move-exception
            goto L91
        L3f:
            r0 = move-exception
            goto La8
        L41:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L49:
            yhm.o.b(r4)
            int r4 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            if (r4 != 0) goto L56
            kye.x3 r2 = new kye.x3
            r2.<init>(r0, r13)
            return r2
        L56:
            long r14 = r0.f115082a
            int r4 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r4 == 0) goto La9
            xi0.b r4 = r2.f115083b
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r3)
            if (r4 == 0) goto L65
            goto La9
        L65:
            t21.a r4 = r1.f     // Catch: java.lang.Exception -> L3d java.util.concurrent.CancellationException -> L3f
            java.lang.String r3 = r3.f306286a     // Catch: java.lang.Exception -> L3d java.util.concurrent.CancellationException -> L3f
            xi0.b r7 = r2.f115083b     // Catch: java.lang.Exception -> L3d java.util.concurrent.CancellationException -> L3f
            java.lang.String r7 = r7.f306286a     // Catch: java.lang.Exception -> L3d java.util.concurrent.CancellationException -> L3f
            long r14 = r0.f115082a     // Catch: java.lang.Exception -> L3d java.util.concurrent.CancellationException -> L3f
            efm.d0 r3 = t21.a.a(r4, r3, r7, r14)     // Catch: java.lang.Exception -> L3d java.util.concurrent.CancellationException -> L3f
            r5.u = r2     // Catch: java.lang.Exception -> L3d java.util.concurrent.CancellationException -> L3f
            r5.v = r0     // Catch: java.lang.Exception -> L3d java.util.concurrent.CancellationException -> L3f
            r5.f190860y = r12     // Catch: java.lang.Exception -> L3d java.util.concurrent.CancellationException -> L3f
            java.lang.Object r4 = nim.a.b(r3, r5)     // Catch: java.lang.Exception -> L3d java.util.concurrent.CancellationException -> L3f
            if (r4 != r6) goto L80
            return r6
        L80:
            lrf.a r4 = (lrf.a) r4     // Catch: java.lang.Exception -> L3d java.util.concurrent.CancellationException -> L3f
            dj0.d r3 = new dj0.d     // Catch: java.lang.Exception -> L3d java.util.concurrent.CancellationException -> L3f
            long r5 = r0.f115082a     // Catch: java.lang.Exception -> L3d java.util.concurrent.CancellationException -> L3f
            double r5 = (double) r5     // Catch: java.lang.Exception -> L3d java.util.concurrent.CancellationException -> L3f
            double r14 = r4.f199511a     // Catch: java.lang.Exception -> L3d java.util.concurrent.CancellationException -> L3f
            double r5 = r5 * r14
            long r4 = (long) r5     // Catch: java.lang.Exception -> L3d java.util.concurrent.CancellationException -> L3f
            xi0.b r0 = r2.f115083b     // Catch: java.lang.Exception -> L3d java.util.concurrent.CancellationException -> L3f
            r3.<init>(r4, r0)     // Catch: java.lang.Exception -> L3d java.util.concurrent.CancellationException -> L3f
            goto L9c
        L91:
            zhm.h0 r3 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r4 = rd0.d.f253311a
            rd0.c r4 = rd0.c.ERROR
            r5 = 0
            rd0.d.a(r4, r5, r5, r0, r3)
            r3 = r5
        L9c:
            if (r3 != 0) goto La6
            dj0.d r0 = new dj0.d
            xi0.b r3 = r2.f115083b
            r0.<init>(r8, r3)
            goto La9
        La6:
            r0 = r3
            goto La9
        La8:
            throw r0
        La9:
            long r3 = r2.f115082a
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 < 0) goto Lbc
            boolean r2 = r2.f(r0)
            if (r2 != 0) goto Lbd
            long r2 = r0.f115082a
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 != 0) goto Lbc
            goto Lbd
        Lbc:
            r12 = r13
        Lbd:
            kye.x3 r2 = new kye.x3
            r2.<init>(r0, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kye.w3.e(dj0.d, long, dj0.d, xi0.b, gim.c):java.lang.Object");
    }
}
