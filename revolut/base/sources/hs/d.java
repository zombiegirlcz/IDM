package hs;

import com.revolut.biometric_verification.api.models.BiometricVerificationDocument;
import es.m;
import kotlin.jvm.internal.Intrinsics;
import vr.l;

/* JADX INFO: loaded from: classes17.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lr.h f154835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f154837c;

    public d(lr.h repository, String verificationToken) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(verificationToken, "verificationToken");
        this.f154835a = repository;
        this.f154836b = verificationToken;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // hs.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof hs.b
            if (r0 == 0) goto L13
            r0 = r9
            hs.b r0 = (hs.b) r0
            int r1 = r0.f154833w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f154833w = r1
            goto L1a
        L13:
            hs.b r0 = new hs.b
            gim.c r9 = (gim.c) r9
            r0.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f154833w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r9)
            goto L52
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L31:
            yhm.o.b(r9)
            r0.f154833w = r3
            lr.h r4 = r8.f154835a
            r4.getClass()
            lb0.b0 r2 = new lb0.b0
            r6 = 0
            r7 = 28
            vr.k r3 = vr.k.f291446a
            java.lang.String r5 = r8.f154836b
            r2.<init>(r3, r4, r5, r6, r7)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r9, r2, r0)
            if (r9 != r1) goto L52
            return r1
        L52:
            r0 = r9
            vr.i r0 = (vr.i) r0
            r8.h(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: hs.d.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // hs.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(vr.l r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof hs.c
            if (r0 == 0) goto L13
            r0 = r10
            hs.c r0 = (hs.c) r0
            int r1 = r0.f154834w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f154834w = r1
            goto L1a
        L13:
            hs.c r0 = new hs.c
            gim.c r10 = (gim.c) r10
            r0.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f154834w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r10)
            goto L51
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            yhm.o.b(r10)
            r0.f154834w = r3
            lr.h r4 = r8.f154835a
            r4.getClass()
            lb0.b0 r2 = new lb0.b0
            r6 = 0
            r7 = 28
            java.lang.String r5 = r8.f154836b
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r9, r2, r0)
            if (r10 != r1) goto L51
            return r1
        L51:
            r9 = r10
            vr.i r9 = (vr.i) r9
            r8.h(r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: hs.d.b(vr.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // hs.a
    public final Object c(l lVar, m mVar) {
        return b(lVar, mVar);
    }

    @Override // hs.a
    public final boolean d() {
        return !this.f154837c;
    }

    @Override // hs.a
    public final boolean e() {
        return false;
    }

    @Override // hs.a
    public final boolean f() {
        return false;
    }

    @Override // hs.a
    public final Object g(BiometricVerificationDocument biometricVerificationDocument, eif.j jVar) {
        return new ur.h(null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(vr.i r4) {
        /*
            r3 = this;
            vr.h r0 = vr.h.f291444a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r4, r0)
            r1 = 1
            if (r0 == 0) goto La
            goto L21
        La:
            boolean r0 = r4 instanceof vr.f
            r2 = 0
            if (r0 == 0) goto L11
        Lf:
            r1 = r2
            goto L21
        L11:
            boolean r0 = r4 instanceof vr.a
            if (r0 == 0) goto L24
            vr.a r4 = (vr.a) r4
            vr.f r0 = r4.f291437c
            if (r0 != 0) goto Lf
            vr.g r4 = r4.f291436b
            vr.g r0 = vr.g.NOT_AVAILABLE
            if (r4 != r0) goto Lf
        L21:
            r3.f154837c = r1
            return
        L24:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hs.d.h(vr.i):void");
    }
}
