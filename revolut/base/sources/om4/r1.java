package om4;

import java.util.ArrayList;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes22.dex */
public final class r1 implements al4.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final al4.n f226678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f226679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final al4.q f226680c;
    public final dp4.c0 d;
    public final x1 e;
    public final com.revolut.domain.interactors.transactions.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wsg.b f226681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ij0.a f226682h;

    public r1(al4.n creditCardInteractor, k0 creditCardFeatureInteractor, al4.q creditCardProductInteractor, dp4.c0 creditCardInstalmentRepository, x1 reloadInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, wsg.b walletInteractor, ij0.a networkConfiguration) {
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardFeatureInteractor, "creditCardFeatureInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(creditCardInstalmentRepository, "creditCardInstalmentRepository");
        Intrinsics.checkNotNullParameter(reloadInteractor, "reloadInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
        this.f226678a = creditCardInteractor;
        this.f226679b = creditCardFeatureInteractor;
        this.f226680c = creditCardProductInteractor;
        this.d = creditCardInstalmentRepository;
        this.e = reloadInteractor;
        this.f = transactionsInteractor;
        this.f226681g = walletInteractor;
        this.f226682h = networkConfiguration;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        if (r0 == r8) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r20, java.lang.String r21, int r22, dj0.d r23, ql4.v r24, gim.c r25) throws java.lang.Throwable {
        /*
            r19 = this;
            r3 = r19
            r0 = r25
            boolean r1 = r0 instanceof om4.a1
            if (r1 == 0) goto L18
            r1 = r0
            om4.a1 r1 = (om4.a1) r1
            int r2 = r1.A
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r4
            if (r5 == 0) goto L18
            int r2 = r2 - r4
            r1.A = r2
        L16:
            r7 = r1
            goto L1e
        L18:
            om4.a1 r1 = new om4.a1
            r1.<init>(r3, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r7.f226515y
            fim.a r8 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.A
            r2 = 2
            r4 = 1
            r9 = 0
            if (r1 == 0) goto L4b
            if (r1 == r4) goto L3d
            if (r1 != r2) goto L35
            yhm.o.b(r0)     // Catch: java.lang.Throwable -> L32
            goto La8
        L32:
            r0 = move-exception
            goto Lad
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            int r1 = r7.f226514x
            ql4.v r4 = r7.f226513w
            java.lang.String r5 = r7.v
            java.lang.String r6 = r7.u
            yhm.o.b(r0)
            r0 = r4
            r4 = r6
            goto L8a
        L4b:
            yhm.o.b(r0)
            r12 = r20
            r7.u = r12
            r13 = r21
            r7.v = r13
            r0 = r24
            r7.f226513w = r0
            r14 = r22
            r7.f226514x = r14
            r7.A = r4
            dp4.c0 r11 = r3.d
            r11.getClass()
            aie.v r10 = new aie.v
            r17 = 0
            r18 = 4
            r15 = r23
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            skm.p0 r0 = skm.p0.f264001a
            elm.f r0 = elm.f.f127540b
            java.lang.Object r0 = skm.e0.J(r0, r10, r7)
            if (r0 != r8) goto L7d
            goto L7f
        L7d:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        L7f:
            if (r0 != r8) goto L82
            goto La7
        L82:
            r4 = r20
            r5 = r21
            r1 = r22
            r0 = r24
        L8a:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L32
            r7.u = r9     // Catch: java.lang.Throwable -> L32
            r7.v = r9     // Catch: java.lang.Throwable -> L32
            r7.f226513w = r9     // Catch: java.lang.Throwable -> L32
            r7.f226514x = r1     // Catch: java.lang.Throwable -> L32
            r7.A = r2     // Catch: java.lang.Throwable -> L32
            r2 = r0
            mp6.j r0 = new mp6.j     // Catch: java.lang.Throwable -> L32
            r6 = 0
            r1 = 11
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = skm.e0.G(r0, r7)     // Catch: java.lang.Throwable -> L32
            if (r0 != r8) goto La8
        La7:
            return r8
        La8:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L32
            yhm.m$a r1 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L32
            goto Lb3
        Lad:
            yhm.m$a r1 = yhm.m.INSTANCE
            yhm.n r0 = yhm.o.a(r0)
        Lb3:
            java.lang.Throwable r0 = yhm.m.a(r0)
            if (r0 == 0) goto Lc2
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r9, r9, r0, r1)
        Lc2:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.r1.b(java.lang.String, java.lang.String, int, dj0.d, ql4.v, gim.c):java.lang.Object");
    }

    public final Flow c() {
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.q(n14.k.p(vkm.q.Q(((y3) this.f226680c).h(), new okf.m((Continuation) null, this, 3)), new o0(7)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (r14 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r12, java.lang.String r13, gim.c r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof om4.b1
            if (r0 == 0) goto L13
            r0 = r14
            om4.b1 r0 = (om4.b1) r0
            int r1 = r0.f226526y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226526y = r1
            goto L18
        L13:
            om4.b1 r0 = new om4.b1
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f226524w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226526y
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r14)     // Catch: java.lang.Throwable -> L2b
            goto L7c
        L2b:
            r0 = move-exception
            r12 = r0
            goto L81
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            java.lang.String r13 = r0.v
            java.lang.String r12 = r0.u
            yhm.o.b(r14)
            goto L66
        L3e:
            yhm.o.b(r14)
            r0.u = r12
            r0.v = r13
            r0.f226526y = r4
            dp4.c0 r6 = r11.d
            r6.getClass()
            dp4.z r5 = new dp4.z
            r10 = 0
            r7 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r5, r0)
            if (r12 != r1) goto L5f
            goto L61
        L5f:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L61:
            if (r12 != r1) goto L64
            goto L7b
        L64:
            r12 = r7
            r13 = r8
        L66:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            yhm.m$a r14 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2b
            of6.d r14 = new of6.d     // Catch: java.lang.Throwable -> L2b
            r14.<init>(r11, r12, r13, r9)     // Catch: java.lang.Throwable -> L2b
            r0.u = r9     // Catch: java.lang.Throwable -> L2b
            r0.v = r9     // Catch: java.lang.Throwable -> L2b
            r0.f226526y = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r14 = skm.e0.o(r14, r0)     // Catch: java.lang.Throwable -> L2b
            if (r14 != r1) goto L7c
        L7b:
            return r1
        L7c:
            java.util.List r14 = (java.util.List) r14     // Catch: java.lang.Throwable -> L2b
            yhm.m$a r12 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2b
            goto L87
        L81:
            yhm.m$a r13 = yhm.m.INSTANCE
            yhm.n r14 = yhm.o.a(r12)
        L87:
            java.lang.Throwable r12 = yhm.m.a(r14)
            if (r12 == 0) goto L96
            zhm.h0 r13 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r14 = rd0.d.f253311a
            rd0.c r14 = rd0.c.ERROR
            rd0.d.a(r14, r9, r9, r12, r13)
        L96:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.r1.d(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        if (r0 == r8) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r19, java.lang.String r20, int r21, gim.c r22) throws java.lang.Throwable {
        /*
            r18 = this;
            r3 = r18
            r0 = r22
            boolean r1 = r0 instanceof om4.f1
            if (r1 == 0) goto L18
            r1 = r0
            om4.f1 r1 = (om4.f1) r1
            int r2 = r1.z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r4
            if (r5 == 0) goto L18
            int r2 = r2 - r4
            r1.z = r2
        L16:
            r7 = r1
            goto L1e
        L18:
            om4.f1 r1 = new om4.f1
            r1.<init>(r3, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r7.f226573x
            fim.a r8 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.z
            r2 = 2
            r4 = 1
            r9 = 0
            if (r1 == 0) goto L4c
            if (r1 == r4) goto L3d
            if (r1 != r2) goto L35
            yhm.o.b(r0)     // Catch: java.lang.Throwable -> L32
            goto L9e
        L32:
            r0 = move-exception
            goto La3
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            int r1 = r7.f226572w
            java.lang.String r4 = r7.v
            java.lang.String r5 = r7.u
            yhm.o.b(r0)
            r17 = r5
            r5 = r4
            r4 = r17
            goto L80
        L4c:
            yhm.o.b(r0)
            r12 = r19
            r7.u = r12
            r13 = r20
            r7.v = r13
            r14 = r21
            r7.f226572w = r14
            r7.z = r4
            dp4.c0 r11 = r3.d
            r11.getClass()
            cuc.c0 r10 = new cuc.c0
            r15 = 0
            r16 = 1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            skm.p0 r0 = skm.p0.f264001a
            elm.f r0 = elm.f.f127540b
            java.lang.Object r0 = skm.e0.J(r0, r10, r7)
            if (r0 != r8) goto L75
            goto L77
        L75:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        L77:
            if (r0 != r8) goto L7a
            goto L9d
        L7a:
            r4 = r19
            r5 = r20
            r1 = r21
        L80:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L32
            ql4.v r0 = ql4.v.POST_PURCHASE     // Catch: java.lang.Throwable -> L32
            r7.u = r9     // Catch: java.lang.Throwable -> L32
            r7.v = r9     // Catch: java.lang.Throwable -> L32
            r7.f226572w = r1     // Catch: java.lang.Throwable -> L32
            r7.z = r2     // Catch: java.lang.Throwable -> L32
            r2 = r0
            mp6.j r0 = new mp6.j     // Catch: java.lang.Throwable -> L32
            r6 = 0
            r1 = 11
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = skm.e0.G(r0, r7)     // Catch: java.lang.Throwable -> L32
            if (r0 != r8) goto L9e
        L9d:
            return r8
        L9e:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L32
            yhm.m$a r1 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L32
            goto La9
        La3:
            yhm.m$a r1 = yhm.m.INSTANCE
            yhm.n r0 = yhm.o.a(r0)
        La9:
            java.lang.Throwable r0 = yhm.m.a(r0)
            if (r0 == 0) goto Lb8
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r9, r9, r0, r1)
        Lb8:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.r1.e(java.lang.String, java.lang.String, int, gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(7:12|41|13|30|35|(1:37)|38)(2:17|18))(1:19))(3:21|(1:24)|28)|20|25|39|26|(5:29|30|35|(0)|38)|28) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        r2 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r17, java.util.Set r18, int r19, java.lang.String r20, gim.c r21) throws java.lang.Throwable {
        /*
            r16 = this;
            r1 = r16
            r0 = r21
            boolean r2 = r0 instanceof om4.g1
            if (r2 == 0) goto L17
            r2 = r0
            om4.g1 r2 = (om4.g1) r2
            int r3 = r2.z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.z = r3
            goto L1c
        L17:
            om4.g1 r2 = new om4.g1
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.f226583x
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.z
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L44
            if (r4 == r6) goto L3b
            if (r4 != r5) goto L33
            java.lang.Object r2 = r2.v
            yhm.o.b(r0)     // Catch: java.lang.Throwable -> L31
            goto L8c
        L31:
            r0 = move-exception
            goto L93
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3b:
            int r4 = r2.f226582w
            java.lang.String r6 = r2.u
            yhm.o.b(r0)
        L42:
            r8 = r0
            goto L71
        L44:
            yhm.o.b(r0)
            r10 = r17
            r2.u = r10
            r12 = r19
            r2.f226582w = r12
            r2.z = r6
            dp4.c0 r9 = r1.d
            r9.getClass()
            aug.c r8 = new aug.c
            r14 = 0
            r15 = 3
            r11 = r18
            r13 = r20
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            skm.p0 r0 = skm.p0.f264001a
            elm.f r0 = elm.f.f127540b
            java.lang.Object r0 = skm.e0.J(r0, r8, r2)
            if (r0 != r3) goto L6c
            goto L8a
        L6c:
            r6 = r17
            r4 = r19
            goto L42
        L71:
            r0 = r8
            ql4.f r0 = (ql4.f) r0
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L91
            om4.h1 r0 = new om4.h1     // Catch: java.lang.Throwable -> L91
            r9 = 0
            r0.<init>(r1, r6, r7, r9)     // Catch: java.lang.Throwable -> L91
            r2.u = r7     // Catch: java.lang.Throwable -> L91
            r2.v = r8     // Catch: java.lang.Throwable -> L91
            r2.f226582w = r4     // Catch: java.lang.Throwable -> L91
            r2.z = r5     // Catch: java.lang.Throwable -> L91
            java.lang.Object r0 = skm.e0.o(r0, r2)     // Catch: java.lang.Throwable -> L91
            if (r0 != r3) goto L8b
        L8a:
            return r3
        L8b:
            r2 = r8
        L8c:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L31
            yhm.m$a r3 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L31
            goto L99
        L91:
            r0 = move-exception
            r2 = r8
        L93:
            yhm.m$a r3 = yhm.m.INSTANCE
            yhm.n r0 = yhm.o.a(r0)
        L99:
            java.lang.Throwable r0 = yhm.m.a(r0)
            if (r0 == 0) goto La8
            zhm.h0 r3 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r4 = rd0.d.f253311a
            rd0.c r4 = rd0.c.ERROR
            rd0.d.a(r4, r7, r7, r0, r3)
        La8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.r1.f(java.lang.String, java.util.Set, int, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        if (r0 == r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r14, int r15, dj0.d r16, gim.c r17) throws java.lang.Throwable {
        /*
            r13 = this;
            r0 = r17
            boolean r1 = r0 instanceof om4.i1
            if (r1 == 0) goto L15
            r1 = r0
            om4.i1 r1 = (om4.i1) r1
            int r2 = r1.f226601y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f226601y = r2
            goto L1a
        L15:
            om4.i1 r1 = new om4.i1
            r1.<init>(r13, r0)
        L1a:
            java.lang.Object r0 = r1.f226599w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f226601y
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L42
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            yhm.o.b(r0)     // Catch: java.lang.Throwable -> L2d
            goto L81
        L2d:
            r0 = move-exception
            r14 = r0
            goto L86
        L30:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L38:
            int r14 = r1.v
            java.lang.String r3 = r1.u
            yhm.o.b(r0)
            r0 = r14
            r14 = r3
            goto L6b
        L42:
            yhm.o.b(r0)
            r1.u = r14
            r1.v = r15
            r1.f226601y = r5
            dp4.c0 r8 = r13.d
            r8.getClass()
            cuc.c0 r7 = new cuc.c0
            r12 = 0
            r9 = r14
            r10 = r15
            r11 = r16
            r7.<init>(r8, r9, r10, r11, r12)
            skm.p0 r0 = skm.p0.f264001a
            elm.f r0 = elm.f.f127540b
            java.lang.Object r0 = skm.e0.J(r0, r7, r1)
            if (r0 != r2) goto L65
            goto L67
        L65:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        L67:
            if (r0 != r2) goto L6a
            goto L80
        L6a:
            r0 = r15
        L6b:
            kotlin.Unit r3 = kotlin.Unit.f186387a
            yhm.m$a r3 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2d
            om4.h1 r3 = new om4.h1     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r13, r14, r6, r5)     // Catch: java.lang.Throwable -> L2d
            r1.u = r6     // Catch: java.lang.Throwable -> L2d
            r1.v = r0     // Catch: java.lang.Throwable -> L2d
            r1.f226601y = r4     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = skm.e0.G(r3, r1)     // Catch: java.lang.Throwable -> L2d
            if (r0 != r2) goto L81
        L80:
            return r2
        L81:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L2d
            yhm.m$a r14 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2d
            goto L8c
        L86:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r0 = yhm.o.a(r14)
        L8c:
            java.lang.Throwable r14 = yhm.m.a(r0)
            if (r14 == 0) goto L9b
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r6, r6, r14, r0)
        L9b:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.r1.g(java.lang.String, int, dj0.d, gim.c):java.lang.Object");
    }

    public final String h(String facilityId, int i, dj0.d totalRepayable, String quoteIdentifier, ql4.g documentType, Set set, Long l2) {
        Set transactionIds = set;
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(totalRepayable, "totalRepayable");
        Intrinsics.checkNotNullParameter(quoteIdentifier, "quoteIdentifier");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        Pair pair = new Pair("term", String.valueOf(i));
        Pair pair2 = new Pair("amount", String.valueOf(totalRepayable.f115082a));
        Pair pair3 = new Pair("currency", totalRepayable.f115083b.f306286a);
        Pair pair4 = new Pair("quoteIdentifier", quoteIdentifier);
        Pair pair5 = new Pair("type", documentType.name());
        if (transactionIds.isEmpty()) {
            transactionIds = null;
        }
        Pair[] pairArr = {pair, pair2, pair3, pair4, pair5, new Pair("transactionIds", transactionIds != null ? zhm.d0.k0(transactionIds, ",", null, null, 0, null, 62) : null), new Pair("downPayment", l2 != null ? String.valueOf(l2.longValue()) : null)};
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 7; i2++) {
            Pair pair6 = pairArr[i2];
            if (pair6.f186386b != null) {
                arrayList.add(pair6);
            }
        }
        return com.google.android.gms.internal.mlkit_vision_face.a.p(this.f226682h.getBaseUrl(), "/credit/", facilityId, "/instalments/documents?", zhm.d0.k0(arrayList, "&", null, null, 0, new o0(10), 30));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(dj0.d r9, gim.c r10, java.lang.String r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof om4.k1
            if (r0 == 0) goto L13
            r0 = r10
            om4.k1 r0 = (om4.k1) r0
            int r1 = r0.f226615w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226615w = r1
            goto L18
        L13:
            om4.k1 r0 = new om4.k1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226615w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r10)
            goto L4e
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            yhm.o.b(r10)
            r0.f226615w = r3
            dp4.c0 r3 = r8.d
            r3.getClass()
            dce.s0 r2 = new dce.s0
            r7 = 15
            r6 = 0
            r5 = r9
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r9, r2, r0)
            if (r10 != r1) goto L4e
            return r1
        L4e:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            om4.j1 r9 = new om4.j1
            r9.<init>()
            java.util.List r9 = zhm.d0.P0(r10, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.r1.i(dj0.d, gim.c, java.lang.String):java.lang.Object");
    }

    public final Flow j(String planId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.q(n14.k.p(nim.a.v(vkm.q.q(vkm.q.Q(((y3) this.f226680c).h(), new r0(null, this, loadingStrategy, 1))), new o23.l(planId, 28)), new o0(12)));
    }

    public final vkm.d k(String facilityId, String planId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        dp4.c0 c0Var = this.d;
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return c0Var.f116608h.b(new cp4.f0(facilityId, planId), loadingStrategy);
    }

    public final Flow l(String facilityId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new h0(zhm.f0.f322471a, null, this, facilityId, loadingStrategy, 1), this.f226679b.c(facilityId, yw4.f.INSTALMENT_PLAN_VIEW, loadingStrategy));
    }

    public final Flow m(String facilityId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        akg.n nVarC = this.f226679b.c(facilityId, yw4.f.POST_PURCHASE_INSTALMENT_PLANS, w4l.j.f294644c);
        od0.i.Companion.getClass();
        return vkm.q.q(xam.a.h(new l1(null, this, facilityId, loadingStrategy, 0), nVarC));
    }

    public final Object n(String str, gim.c cVar) {
        Object objB = this.e.b(str, cVar);
        return objB == fim.a.COROUTINE_SUSPENDED ? objB : Unit.f186387a;
    }

    public final Object o(String str, gim.i iVar) {
        Object objC = this.e.c(str, iVar);
        return objC == fim.a.COROUTINE_SUSPENDED ? objC : Unit.f186387a;
    }

    public final Object p(String str, String str2, gim.i iVar) {
        Object objD = this.e.f226742a.f116609j.d(new cp4.g0(str, str2), false, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objD != aVar) {
            objD = Unit.f186387a;
        }
        if (objD != aVar) {
            objD = Unit.f186387a;
        }
        return objD == aVar ? objD : Unit.f186387a;
    }

    public final Object q(String str, String str2, gim.i iVar) {
        Object objD = this.e.f226742a.i.d(new cp4.o0(str, str2), false, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objD != aVar) {
            objD = Unit.f186387a;
        }
        if (objD != aVar) {
            objD = Unit.f186387a;
        }
        return objD == aVar ? objD : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (r0 == r8) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.String r19, java.lang.String r20, dj0.d r21, dj0.d r22, gim.c r23) throws java.lang.Throwable {
        /*
            r18 = this;
            r3 = r18
            r0 = r23
            boolean r1 = r0 instanceof om4.p1
            if (r1 == 0) goto L18
            r1 = r0
            om4.p1 r1 = (om4.p1) r1
            int r2 = r1.f226661y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r4
            if (r5 == 0) goto L18
            int r2 = r2 - r4
            r1.f226661y = r2
        L16:
            r7 = r1
            goto L1e
        L18:
            om4.p1 r1 = new om4.p1
            r1.<init>(r3, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r7.f226659w
            fim.a r8 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f226661y
            r2 = 2
            r4 = 1
            r9 = 0
            if (r1 == 0) goto L44
            if (r1 == r4) goto L3b
            if (r1 != r2) goto L33
            yhm.o.b(r0)     // Catch: java.lang.Throwable -> L31
            goto L93
        L31:
            r0 = move-exception
            goto L98
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3b:
            java.lang.String r1 = r7.v
            java.lang.String r4 = r7.u
            yhm.o.b(r0)
            r5 = r1
            goto L77
        L44:
            yhm.o.b(r0)
            r12 = r19
            r7.u = r12
            r13 = r20
            r7.v = r13
            r7.f226661y = r4
            dp4.c0 r11 = r3.d
            r11.getClass()
            a31.w r10 = new a31.w
            r16 = 0
            r17 = 19
            r14 = r21
            r15 = r22
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            skm.p0 r0 = skm.p0.f264001a
            elm.f r0 = elm.f.f127540b
            java.lang.Object r0 = skm.e0.J(r0, r10, r7)
            if (r0 != r8) goto L6e
            goto L70
        L6e:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        L70:
            if (r0 != r8) goto L73
            goto L92
        L73:
            r4 = r19
            r5 = r20
        L77:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L31
            ql4.v r0 = ql4.v.POST_PURCHASE     // Catch: java.lang.Throwable -> L31
            r7.u = r9     // Catch: java.lang.Throwable -> L31
            r7.v = r9     // Catch: java.lang.Throwable -> L31
            r7.f226661y = r2     // Catch: java.lang.Throwable -> L31
            r2 = r0
            mp6.j r0 = new mp6.j     // Catch: java.lang.Throwable -> L31
            r6 = 0
            r1 = 11
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r0 = skm.e0.G(r0, r7)     // Catch: java.lang.Throwable -> L31
            if (r0 != r8) goto L93
        L92:
            return r8
        L93:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L31
            yhm.m$a r1 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L31
            goto L9e
        L98:
            yhm.m$a r1 = yhm.m.INSTANCE
            yhm.n r0 = yhm.o.a(r0)
        L9e:
            java.lang.Throwable r0 = yhm.m.a(r0)
            if (r0 == 0) goto Lad
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r9, r9, r0, r1)
        Lad:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.r1.r(java.lang.String, java.lang.String, dj0.d, dj0.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        if (r0 == r8) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(java.lang.String r21, java.lang.String r22, int r23, dj0.d r24, dj0.d r25, gim.c r26) throws java.lang.Throwable {
        /*
            r20 = this;
            r3 = r20
            r0 = r26
            boolean r1 = r0 instanceof om4.q1
            if (r1 == 0) goto L18
            r1 = r0
            om4.q1 r1 = (om4.q1) r1
            int r2 = r1.z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r4
            if (r5 == 0) goto L18
            int r2 = r2 - r4
            r1.z = r2
        L16:
            r7 = r1
            goto L1e
        L18:
            om4.q1 r1 = new om4.q1
            r1.<init>(r3, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r7.f226668x
            fim.a r8 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.z
            r2 = 2
            r4 = 1
            r9 = 0
            if (r1 == 0) goto L4c
            if (r1 == r4) goto L3d
            if (r1 != r2) goto L35
            yhm.o.b(r0)     // Catch: java.lang.Throwable -> L32
            goto La3
        L32:
            r0 = move-exception
            goto La8
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            int r1 = r7.f226667w
            java.lang.String r4 = r7.v
            java.lang.String r5 = r7.u
            yhm.o.b(r0)
            r19 = r5
            r5 = r4
            r4 = r19
            goto L85
        L4c:
            yhm.o.b(r0)
            r12 = r21
            r7.u = r12
            r13 = r22
            r7.v = r13
            r14 = r23
            r7.f226667w = r14
            r7.z = r4
            dp4.c0 r11 = r3.d
            r11.getClass()
            aie.v r10 = new aie.v
            r17 = 0
            r18 = 5
            r15 = r24
            r16 = r25
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            skm.p0 r0 = skm.p0.f264001a
            elm.f r0 = elm.f.f127540b
            java.lang.Object r0 = skm.e0.J(r0, r10, r7)
            if (r0 != r8) goto L7a
            goto L7c
        L7a:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        L7c:
            if (r0 != r8) goto L7f
            goto La2
        L7f:
            r4 = r21
            r5 = r22
            r1 = r23
        L85:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L32
            ql4.v r0 = ql4.v.POST_PURCHASE     // Catch: java.lang.Throwable -> L32
            r7.u = r9     // Catch: java.lang.Throwable -> L32
            r7.v = r9     // Catch: java.lang.Throwable -> L32
            r7.f226667w = r1     // Catch: java.lang.Throwable -> L32
            r7.z = r2     // Catch: java.lang.Throwable -> L32
            r2 = r0
            mp6.j r0 = new mp6.j     // Catch: java.lang.Throwable -> L32
            r6 = 0
            r1 = 11
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = skm.e0.G(r0, r7)     // Catch: java.lang.Throwable -> L32
            if (r0 != r8) goto La3
        La2:
            return r8
        La3:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L32
            yhm.m$a r1 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L32
            goto Lae
        La8:
            yhm.m$a r1 = yhm.m.INSTANCE
            yhm.n r0 = yhm.o.a(r0)
        Lae:
            java.lang.Throwable r0 = yhm.m.a(r0)
            if (r0 == 0) goto Lbd
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r9, r9, r0, r1)
        Lbd:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.r1.s(java.lang.String, java.lang.String, int, dj0.d, dj0.d, gim.c):java.lang.Object");
    }

    public final cxe.u t(String facilityId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        akg.n nVarC = this.f226679b.c(facilityId, yw4.f.STATEMENT_DEFERRAL_INSTALMENT_PLANS, w4l.h.f294642c);
        od0.i.Companion.getClass();
        return n14.k.p(xam.a.h(new l1(null, this, facilityId, loadingStrategy, 1), nVarC), new o0(11));
    }

    public final vkm.d u(String facilityId, String planId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        dp4.c0 c0Var = this.d;
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return c0Var.i.b(new cp4.o0(facilityId, planId), loadingStrategy);
    }
}
