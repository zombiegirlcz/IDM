package x38;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements pfe.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r38.b f302706a;

    public d(r38.b interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f302706a = interactor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pfe.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Set r6, gim.c r7) {
        /*
            r5 = this;
            boolean r6 = r7 instanceof x38.b
            if (r6 == 0) goto L13
            r6 = r7
            x38.b r6 = (x38.b) r6
            int r0 = r6.f302703w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f302703w = r0
            goto L18
        L13:
            x38.b r6 = new x38.b
            r6.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f302703w
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L28
            yhm.o.b(r7)
            goto L53
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            r6.f302703w = r3
            r38.b r7 = r5.f302706a
            kotlinx.coroutines.flow.Flow r7 = r38.b.c(r7)
            wyg.s r1 = new wyg.s
            r4 = 28
            r1.<init>(r4)
            jhi.b r7 = mo3.a.g(r7, r2, r1, r3)
            vvh.e r1 = new vvh.e
            r3 = 7
            r1.<init>(r7, r3)
            java.lang.Object r7 = vkm.q.z(r1, r6)
            if (r7 != r0) goto L53
            return r0
        L53:
            v38.a r7 = (v38.a) r7
            if (r7 == 0) goto L68
            tof.hc r6 = new tof.hc
            n38.a r7 = r7.f285854a
            java.lang.String r7 = r7.f211924b
            r6.<init>(r7, r2)
            java.util.Set r6 = zhm.y0.b(r6)
            if (r6 != 0) goto L67
            goto L68
        L67:
            return r6
        L68:
            zhm.h0 r6 = zhm.h0.f322473a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x38.d.a(java.util.Set, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pfe.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.Set r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof x38.c
            if (r0 == 0) goto L13
            r0 = r10
            x38.c r0 = (x38.c) r0
            int r1 = r0.f302705x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f302705x = r1
            goto L18
        L13:
            x38.c r0 = new x38.c
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f302705x
            r38.b r3 = r8.f302706a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L41
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            java.util.Set r9 = r0.u
            java.util.Set r9 = (java.util.Set) r9
            yhm.o.b(r10)
            return r10
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            java.util.Set r9 = r0.u
            java.util.Set r9 = (java.util.Set) r9
            yhm.o.b(r10)
            goto L67
        L41:
            yhm.o.b(r10)
            r10 = r9
            java.util.Set r10 = (java.util.Set) r10
            r0.u = r10
            r0.f302705x = r5
            kotlinx.coroutines.flow.Flow r10 = r38.b.c(r3)
            wyg.s r2 = new wyg.s
            r7 = 28
            r2.<init>(r7)
            jhi.b r10 = mo3.a.g(r10, r6, r2, r5)
            vvh.e r2 = new vvh.e
            r5 = 7
            r2.<init>(r10, r5)
            java.lang.Object r10 = vkm.q.z(r2, r0)
            if (r10 != r1) goto L67
            goto L89
        L67:
            v38.a r10 = (v38.a) r10
            if (r10 == 0) goto L8b
            n38.a r10 = r10.f285854a
            if (r10 != 0) goto L70
            goto L8b
        L70:
            com.revolut.core.model.account.AccountId$Joint r10 = l38.a.c(r10)
            r38.l r3 = (r38.l) r3
            efm.r r9 = r3.g(r9, r10)
            r10 = 3
            efm.r r9 = m70.a.g(r9, r6, r6, r10)
            r0.u = r6
            r0.f302705x = r4
            java.lang.Object r9 = nim.a.e(r9, r0)
            if (r9 != r1) goto L8a
        L89:
            return r1
        L8a:
            return r9
        L8b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x38.d.b(java.util.Set, gim.c):java.lang.Object");
    }
}
